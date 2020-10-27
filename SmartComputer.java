
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
        // TODO: explanation
                    
        // General Concept:
        // Power of 2s : 1,2,4,8,16,32,64,128 ...

        int min = (marbles / 2) + 1 ;
        
        // Check if the amount of marbles at exactly half is
        // a power of 2 - 1. 
        // This can be an edge case the for loop misses.
        if(Integer.bitCount(marbles - (marbles - min)) == 1)
            return marbles / 2;

        for( ; min < marbles ; min++)
        {
            // This is the amount of marbles that would be left after
            // substracting the amount we return.
            int val = marbles - (marbles - min) ;

            // Check if the bitwise twos complement returns 1.
            // n = 2 | 4^n = 16
            // 3
            // Eg. Integer.bitCount(16) == 1 -> True
            if(Integer.bitCount(val) == 1)
                // return the value - 1  
                return (marbles - (min - 1)) ;

        }

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
