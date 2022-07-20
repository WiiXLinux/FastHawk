package lib;

public abstract class Cell {

    public abstract Cell rule(Cell[][] board, int y, int x);

    public String name(){
        return "Cell";
    }

    private static final Cell[][] NULL_CellARR = new Cell[][]{};
}
