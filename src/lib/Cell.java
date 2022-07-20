package lib;

import java.awt.*;

public abstract class Cell {

    public abstract Cell rule(Cell[][] board, int y, int x);

    public String name(){
        return "Cell";
    }

    public static Cell[][] copy(Cell[][]in){
        Cell[][] temp = new Cell[in.length][in[0].length];
        for (int i = 0; i < temp.length; i++)
            for (int j = 0; j < temp[0].length; j++)
                temp[i][j] = in[i][j];

        return temp;
    }
    @Override
    public abstract Cell clone();

    private static final Cell[][] NULL_CellARR = new Cell[][]{};

    public abstract Color getColor();
}
