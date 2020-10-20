
class SmartComputer implements Player
{
    private static String playerName ;

    public SmartComputer()
    {
        playerName = "SmartComputer";
    }

    public SmartComputer(String playerName)
    {
        SmartComputer.playerName = playerName;
    }

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

    public String getPlayerName()
    {
        return SmartComputer.playerName;
    }
}
