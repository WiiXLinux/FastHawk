package lib.cells;

import lib.Cell;

import java.awt.*;

public final class Conway_ALIVE extends ConwayCell {

    @Override
    public String name(){
        return "1";
    }

    @Override
    public Cell clone() {
        return new Conway_ALIVE();
    }

    @Override
    public Color getColor() {
        return Color.BLACK;
    }

    @Override
    public Cell rule(Cell[][] board, int y, int x) {
        if((2 > this.nNeighbours(board, y, x,c1REF)) || (this.nNeighbours(board, y, x,c1REF) > 3)){
            return new Conway_DEAD();
        } else {
            return this;
        }
    }
}
