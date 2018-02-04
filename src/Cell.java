
public class Cell {
    boolean isMine;
    boolean isOpen;
    boolean isFlagged;
    int row;
    int col;
    int neighboringMinesCount;
    Cell(int row,int col,boolean isMine){
        this.row=row;
        this.col=col;
        this.isMine=isMine;
        isOpen=false;
        isFlagged=false;
        neighboringMinesCount=0;    
    }
    
}
