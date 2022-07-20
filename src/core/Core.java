package core;

import lib.Cell;

public class Core {

    private Cell[][] board;

    public Core(Cell[][] board) {
        this.board = board;
    }

    public void printCellArrArr(){
        for (int i = 0; i < board[0].length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j].name()+" ");
            } System.out.print("\n");
        }
        System.out.print("\n");
    }

    public void nTurns(int n){
        for(int i = 0; i < n; i++) {
            turn();
        }
    }
    public void turn(){
        Cell[][] temp = Cell.copy(board);

        for (int y = 0; y < board.length; y++){
            for (int x = 0; x < board[0].length; x++){
                temp[y][x] = board[y][x].rule(board,y,x);
            }
        }
        board = temp;
    }

    public Cell[][] getBoard(){
        return board;
    }
}
