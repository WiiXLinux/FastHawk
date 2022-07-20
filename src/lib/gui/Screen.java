package lib.gui;

import core.Core;
import lib.Cell;
import lib.cells.Conway_ALIVE;
import lib.cells.Conway_DEAD;
import lib.utils.RandomCellGenerator;

import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {
    private Cell[][] board = RandomCellGenerator.randomArray(new Cell[]{new Conway_ALIVE(),new Conway_DEAD()},100,100);
    private Core core = new Core(board);

    public Screen(int width, int height){
        this.setBounds( Toolkit.getDefaultToolkit().getScreenSize().width/2-width/2,Toolkit.getDefaultToolkit().getScreenSize().height/2-height/2,width,height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setVisible(true);
        this.startThread();
    }



    private void startThread(){
        new Thread(() -> {
            while(true)
            try {
                core.turn();
                Thread.sleep(100);
                this.repaint();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    int gridSize = 10;

    @Override
    public void paint(Graphics g){

        // Test
        //g.fillRect((int)(100*Math.random()),(int)(100*Math.random()),(int)(100*Math.random()),(int)(100*Math.random()));


        for(int i = 0; i < core.getBoard().length; i++){
            for(int j = 0; j < core.getBoard()[0].length; j++){
                g.setColor(core.getBoard()[i][j].getColor());
                g.fillRect(i*gridSize,j*gridSize,gridSize,gridSize);
            }
        }


    }

    public static void main(String[]args){
        Screen screen = new Screen(1000,1000);

    }
}
