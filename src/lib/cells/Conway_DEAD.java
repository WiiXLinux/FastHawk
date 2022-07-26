package lib.cells;

import lib.Cell;

import java.awt.*;

public final class Conway_DEAD extends ConwayCell {
    @Override
    public String name(){
        return "0";
    }

    @Override
    public Cell clone() {
        return new Conway_DEAD();
    }

    @Override
    public Color getColor() {
        return Color.WHITE;
    }

    @Override
    public Cell rule(Cell[][] board, int y, int x) {

        //System.out.println(this.nNeighbours(board, 1, 2,c1REF));

        if(3 == this.nNeighbours(board, y, x,c1REF)){
            return new Conway_ALIVE();
        } else {
            return this;
        }
    }
}
