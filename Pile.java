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

    public void removeMarbles(int amount)
    {
       lastPlay = amount ;
       Pile.marbles -= amount; 
    }

    public boolean hasMarbles()
    {
        return Pile.marbles > 0 ;
    }

}
