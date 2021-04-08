package frq2013q2;

public class TokenPass 
{
private int[] board;
private int currentPlayer;

public TokenPass(int playerCount)
{
    board = new int[playerCount];
    
    for(int i = 0; i < playerCount;i++)
    {
        board[i] = (int)(Math.random()*10 + 1);
    }
    
    currentPlayer = (int)(Math.random()*playerCount);
}

public void printBoard()
{
    int length = board.length;
    for(int i = 0; i <length; i++)
    {
        System.out.print(board[i] + " , ");
    }
    
    System.out.println();
    System.out.println("Current Player: " + currentPlayer);
}

public void distributeCurrentPlayerTokens()
{
    int currentTokens = board[currentPlayer];
    board[currentPlayer] = 0;
    
    while(currentTokens > 0)
    {
       currentPlayer++;
       if(currentPlayer < board.length)
       {
           board[currentPlayer] += 1;
           
           currentTokens--;
       }
       else
       {
           currentPlayer=0;
           board[currentPlayer] += 1;
           
           currentTokens--;
       }       
    }
}

public static void main(String[] args)
    {
    TokenPass x = new TokenPass(4);
    x.printBoard();
    
    x.distributeCurrentPlayerTokens();
    x.printBoard();
    }
    
}
