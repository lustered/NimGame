import java.util.Scanner ;

public class Human implements Player
{
    private String playerName ;
    private final Scanner sc = new Scanner(System.in);

    public Human()
    {
        playerName = "Human" ;
    }

    public Human(String playerName)
    {
        this.playerName = playerName ;
    }

    public void setPlayerName(String playerName) 
    {
        this.playerName = playerName;
    }

    @Override
    public int move(int marbles)
    {
        // Iterate forever, broken when a valid input is found.
        while(true)
        {
            System.out.format("\n::Please enter a number in range of 1 and %d\n::Amount: ", marbles / 2);

            // Avoid InputMismatchException
            if(sc.hasNextInt())
            {
                // Get the value.
                int val = sc.nextInt();

                // Check if the value is within range.
                if(val > 0 && val <= (marbles / 2))
                    // If it is, return it.
                    return val;
                else
                    // If not, let the user know, a new iteration will repeat.
                    System.out.println("++Please make sure the amount is correct.\n");
            }
            // If the input is not an int.
            else
            {
                // Let the user know they aren't the brightest and move on.
                System.out.println("++Dumbo, numbers please.");
                sc.next();
            }
        }
    }

    @Override
    public String getPlayerName()
    {
        return playerName ;
    }
}
