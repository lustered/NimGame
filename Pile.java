import java.util.Random ;

public class Pile
{
    private final Random rnd = new Random() ;
    private static int marbles ; 
    private int lastPlay ;

    public Pile()
    {
        Pile.marbles = rnd.nextInt(91)+10;
    }

    public int getMarbles()
    {
        return Pile.marbles ;
    }

    public int getLastPlay()
    {
        return lastPlay ;
    }

    public void removeMarbles(int amount) throws ArithmeticException
    {

       // lastPlay = amount ;
       // Pile.marbles -= amount; 

        if(isLegal(amount))
        {
           lastPlay = amount ;
           Pile.marbles -= amount; 
        }
        else
            throw new ArithmeticException("To dev. The amount of marbles returned by the 'move' method is not legal. " + amount );
    }

    public boolean hasMarbles()
    {
        return Pile.marbles > 0 ;
    }

    private boolean isLegal(int amount)
    {
        return (amount > 0 && amount <= (Pile.marbles / 2));
    }
}
