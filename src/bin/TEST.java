package bin;

import lib.Cell;

import lib.cells.Conway_ALIVE;
import lib.cells.Conway_DEAD;
import lib.utils.RandomCellGenerator;

import static lib.cells.ConwayCell.c1REF;
import static lib.cells.ConwayCell.c2REF;

@Deprecated
public class TEST {



    private static void printCellArrArr(Cell[][] array){
        for (int i = 0; i < array[0].length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j].name()+" ");
            } System.out.print("\n");
        }
        System.out.print("\n");
    }

    static Cell[][] test1 = RandomCellGenerator.randomArray(new Cell[]{new Conway_ALIVE(),new Conway_DEAD()},10,10);


    private static void nTurns(int n){
        for(int i = 0; i < n; i++) {
            turn();
        }
    }
    private static void turn(){
        Cell[][] temp = Cell.copy(test1);

        for (int y = 0; y < test1.length; y++){
            for (int x = 0; x < test1[0].length; x++){



                temp[y][x] = test1[y][x].rule(test1,y,x);
            }
        }
        test1 = temp;
    }

    public static void main(String[]args){

        //printCellArrArr(test1);

        //System.out.println(test1[1][2].name());


        printCellArrArr(test1);
        //System.out.println(ConwayCell.nNeighbours(test1,1,1,ConwayCell.c1REF));


        turn();


        printCellArrArr(test1);

        turn();


        printCellArrArr(test1);

    }
}
