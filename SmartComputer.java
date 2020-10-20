
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
        /*
        Get range. NOTE: The range IS NOT the amount of marbles
        to take.
        
        Proof of concept:
        We NEED the +1 to compensate:
        (n)37/2 = 18.5
        n/2+1 = 19 ... 36
        first even number from 19...36: 19 (First Element in range)
        37 - 19 = 18 (Highest amount of marbles allowed to take)

        */

        int min = (marbles % 2 == 0) ? (marbles / 2 ) : (marbles / 2) + 1;
        // int min = (marbles / 2) + 1;
        // int min = ((marbles / 2) % 2 == 1)  ? marbles / 2
        

        /*  Iterate from min to max, return marbles - min if it's prime.
         *  Eg: If we had 37 marbles left,
         * .iterate from 19(min) until 36(max).
         * .increase min by 1 each iteration
         *
         * .the first even number 
        */ 
        
        // if((marbles / 2) % 2 == 1){
        //     System.out.println("\n**********got here**********");
        //     // return marbles - (marbles / 2) ;
        //     return marbles / 2; 
        // }

        return ((marbles - (marbles / 2)) % 2 == 1) ? marbles / 2: (marbles / 2) - 1;

        // for ( ; min < marbles ; min++) 
        //     // if(isPrime(min))
        //     //     return marbles - min;
        //     if(marbles / (marbles - min) % 2 == 0)
        //         // return marbles - (min + 1) ;
        //         return (marbles - min);
                
        // System.out.println("please don't tell me it got here.");
        // return marbles - 1;
    }

    public String getPlayerName()
    {
        return SmartComputer.playerName;
    }

    private static boolean isPrime(int num)
    {
        // For the sake of this assignment and proper naming
        // Let's assume 1 is prime, since it is the winning condition.

        if(num == 1)
            return true;

        for (int i = 2; i < num; i++) 
            if(num % i == 0)
                return false;

        return true;
    }
}
