
import java.util.Random;

final class Board {
    Cell[][] cell;
    int rows;
    int cols;
    int mines;
    Board(int rows,int cols,int mines)
    {
        this.rows=rows;
        this.cols=cols;
        this.mines=mines;
        cell = new Cell[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                cell[i][j]=new Cell(i,j,false);
            }
        }
        Random rnd=new Random();
        for(int i=0;i<mines;)
        {
            //int r=rand()%this.rows;
            int r=rnd.nextInt(rows);
            //int c=rand()%this.cols;
            int c=rnd.nextInt(cols);
            if(!cell[r][c].isMine)
            {
            cell[r][c]=new Cell(r,c,true);
            i++;
            }
            updateNeighboringMinesCount();
        }
    }    
    int getNMC(int i ,int j)
    {
        int count = 0;
        for(int r=i-1;r<=i+1;r++)
        {
            for(int c=j-1;c<=j+1;c++)
            {
                
                if(r>=0 && r<rows && c<cols && c>=0)
                {    
                  if(cell[r][c].isMine)
                    count++;
            }}
        }
        return count;
    }
    void updateNeighboringMinesCount()
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(cell[i][j].isMine)
                    System.out.print("*");
                else
                {
                cell[i][j].neighboringMinesCount=getNMC(i,j);
                System.out.print(cell[i][j].neighboringMinesCount);
                }
        
            }
            System.out.println(" ");
        }
    } 
    int click(int i,int j)
    {
        
            
        return 0;
    }
    void toggleFlag(int i,int j)
    {
        
    }
    void printBoard()
    {
    }
    void printMines()
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(cell[i][j].isMine)
                    System.out.print("+");
                else
                    System.out.print("-");
            }
            System.out.println(" ");
        }
    }       
       
    private int rand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
