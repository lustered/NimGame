import java.util.Scanner ;

public class Human implements Player
{
    // Scanner s = new Scanner(System.in) ;

    private static String playerName ;

    public Human()
    {
        Human.playerName = "Human" ;
    }

    public Human(String playerName)
    {
        Human.playerName = playerName ;
    }

    @Override
    public int move(int marbles)
    {
        // TODO: stupid humans always piss me off
        // int amount;
        // do
        // {
        //     amount = isValid(marbles);
        //     if(amount == -1)
        //         System.out.format("Please enter a valid num within %2s and %2d", 1,marbles - (marbles/2));
        // }while(amount != -1);
            
        int amount = 1;

        System.out.println("\n\nPlease enter a valid range of marbles to remove.");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int tmp = scan.nextInt();
            if(scan.hasNext()){
                if(tmp > 0 && tmp < (marbles / 2) + 1){
                    scan.close();
                    return tmp;
                    // break;
                }
            }else
            {
               System.out.println("\nThe value is not correct. Try again please.");
            }
        }
        scan.close();

        

        return amount ;
    }

    @Override
    public String getPlayerName()
    {
        return Human.playerName ;
    }

    // private int isValid(int marbles)
    // {
    //     System.out.println("Enter the amount of marbles to remove.") ;
    //     while(s.hasNext())
    //         if(s.hasNextInt())
    //         {
    //             int val = s.nextInt() ;
    //             if(val > 0 && val < (marbles / 2) + 1)
    //                 return val ;

    //         }else
    //              s.hasNext() ;

    //     return -1 ;
    // }
        

}
