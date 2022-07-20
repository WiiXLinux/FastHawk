package lib.cells;

import lib.Cell;

public abstract class ConwayCell extends Cell {

    public static final Conway_ALIVE c1REF = new Conway_ALIVE();
    public static final Conway_DEAD c2REF = new Conway_DEAD();

    @Override
    public String name(){
        return "ConwayCell";
    }

    public static int nNeighbours(Cell[][] board, int y, int x, Cell target){
        int temp = 0;

        for (int j = y-1; j < y+2; j++){
        for (int i = x-1; i < x+2; i++){


                try{
                     // System.out.print(board[j][i].name()+" ");
                if(board[j][i].name().equals(target.name())){
                    temp++;

                }} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                    continue;
                }
            } //System.out.println();
        }

            if(board[y][x].name().equals(target.name()))
                temp--;

            return temp;
    }



}
