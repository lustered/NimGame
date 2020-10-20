
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
        if((marbles - (marbles / 2 )) % 2 != 0)
            return marbles / 2;
        else
        {
            int min = (marbles / 2) + 1 ;

            for ( ; min < marbles ; min++) 
                if((marbles - (marbles - min)) % 2 != 0)
                    return (marbles - min) ;
                else
                    System.out.println("\n\ndidnt work: " +  (marbles -  min));
            
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
