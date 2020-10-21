import java.util.Random ;

public class Pile
{
    private final Random rnd = new Random() ;
    private int marbles ; 
    private int lastPlay ;

    public Pile()
    {
        marbles = rnd.nextInt(91)+10;
    }

    public int getMarbles()
    {
        return marbles ;
    }

    public int getLastPlay()
    {
        return lastPlay ;
    }

    public void removeMarbles(int amount) throws ArithmeticException
    {
        if(isLegal(amount))
        {
           lastPlay = amount ;
           marbles -= amount; 
        }
        else
            throw new ArithmeticException("To dev. The amount of marbles returned by the 'move' method is not legal: " + amount );
    }

    public boolean hasMarbles()
    {
        return marbles > 0 ;
    }

    private boolean isLegal(int amount)
    {
        return (amount > 0 && amount <= (marbles / 2));
    }
}
