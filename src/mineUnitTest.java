
public class mineUnitTest {
    
    public static void main(String[] args) {
        Board b= new Board(4,4,5);
        b.printMines();
        b.updateNeighboringMinesCount();
    }
}
