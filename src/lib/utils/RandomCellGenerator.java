package lib.utils;

import lib.Cell;

import java.util.Random;
public class RandomCellGenerator {

    public static int randomInt(int max){
        return (int)(Math.random()*(max+1));
    }

    public static Cell[][] randomArray(Cell[] types, int x, int y){
        Cell[][] temp = new Cell[x][y];

        for (int i = 0; i < y; i++){
            for (int j = 0; j < x; j++){
                temp[j][i] = types[randomInt(types.length - 1)].clone();
            }
        }

        return temp;
    }

}
