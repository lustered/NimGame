import java.util.Random ;

class BelowAverageComputer implements Player
{
    // Var to set the user/player name.
    private String playerName ;
    private final Random rnd = new Random() ;

    /** 
     * Constructor for {@link BelowAverageComputer}.
     */
    public BelowAverageComputer()
    {
        playerName = "AverageComputer";
    }

    /** 
     * Constructor for {@link BelowAverageComputer}.
     */
    public BelowAverageComputer(String playerName)
    {
        this.playerName = playerName ;
    }

    /**
     * Method to handle user input and check proper range.
     *
     * @param marbles amount of marbles left in the pile class.
     * @return amount of marbles to remove.
     */
    public int move(int marbles)
    {
       return rnd.nextInt(marbles / 2) + 1 ;
    }


    /**
     * Set the player's name.
     *
     * @param playerName {@link String} set the player's name.
     */
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    /**
     * Get the player's name.
     * 
     * @return Player's name.
     */
    public String getPlayerName()
    {
        return playerName ;
    }
}
