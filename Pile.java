import java.util.Random ;

public class Pile
{
    // Random to get random pile size.
    private final Random rnd = new Random() ;
    // Marbles in the pile.
    private int marbles ; 
    // Last amount of marbles removed.
    private int lastPlay ;

    /**
     * Constructor for {@link Pile}.
     */
    public Pile()
    {
        marbles = rnd.nextInt(91)+10;
    }

    /**
     * Get current number of marbles in the pile.
     * 
     * @return marbles in the pile.
     * */
    public int getMarbles()
    {
        return marbles ;
    }

    /**
     * Get last amount removed.
     *
     * @return last amount of marbles removed from the pile.
     */
    public int getLastPlay()
    {
        return lastPlay ;
    }

    /**
     * Remove specified amount of marbles from the pile.
     *
     * @param amount specified amount to remove. 
     */
    public void removeMarbles(int amount) throws ArithmeticException
    {
        // Check if amount to substract from the pile is legal.
        if(amount > 0 && amount <= (marbles / 2))
        {
           lastPlay = amount ;
           marbles -= amount; 
        }
        else
            // Let's say it's an ArithmeticException since the program didn't count very well. 
            throw new ArithmeticException("To dev. The amount of marbles returned by the 'move' method is not legal: " + amount );
    }

    /**
     * Check if there are marbles in the pile.
     * @return true if there are marbles, else false.
     */
    public boolean hasMarbles()
    {
        return marbles > 0 ;
    }
}
