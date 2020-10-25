
/** 
 * Models a smart computer implementing {@link Player}.
 */
class SmartComputer implements Player
{
    // Var to set the user/player name.
    private String playerName ;

    /**
     * Constructor for {@link SmartComputer}.
     */
    public SmartComputer()
    {
        playerName = "SmartComputer" ;
    }

    /**
     * Constructor for {@link SmartComputer}.
     *
     * @param playerName to create a player with a name.
     */
    public SmartComputer(String playerName)
    {
        this.playerName = playerName ;
    }

    /**
     * Set the player's name.
     *
     * @param playerName {@link String} set the player's name.
     */
    public SmartComputer setPlayerName(String playerName)
    {
        this.playerName = playerName ;
        return this;
    }

    /**
     * Method to handle user input and check proper range.
     *
     * @param marbles amount of marbles left in the pile class.
     * @return amount of marbles to remove.
     */
    public int move(int marbles)
    {
        // If the value at half the range is is odd, we can use it.
        if((marbles - (marbles / 2 )) % 2 != 0)
            return marbles / 2;
        else
        {
            // variable to backtrack-check.
            int min = (marbles / 2) + 1 ;

            // Iterate to get the greatest possible value 
            for ( ; min < marbles ; min++) 
                // If the end result is odd, return the appropiate amount.
                if((marbles - (marbles - min)) % 2 != 0)
                    return (marbles - min) ;
            
        }
        
        // This patches the edge case of 3 remaining marbles.
        // Eg: 3/2 = 1 (only possible play)
        //     3-1 = 2 - NOT ODD
        // So we return 1. 
        return 1;
    }

    /**
     * Get the player's name.
     * 
     * @return Player's name.
     */
    public String getPlayerName()
    {
        return playerName;
    }
}
