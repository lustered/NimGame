import java.util.Scanner ;

/**
 * Pesky Human implementation class of {@link Player}.
 */
public class Human implements Player
{
    // Var to set the user/player name.
    private String playerName ;
    private final Scanner sc = new Scanner(System.in);

    /**
     * Constructor for {@link Human}
     */
    public Human()
    {
        playerName = "Human" ;
    }

    /**
     * Constructor for {@link Human}
     *
     * @param playerName {@link String} to create player with a name.
     */
    public Human(String playerName)
    {
        this.playerName = playerName ;
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
     * Method to handle user input and check proper range.
     *
     * @param marbles amount of marbles left in the pile class.
     * @return amount of marbles to remove.
     */
    public int move(int marbles)
    {
        // Iterate forever, broken when a valid input is found.
        while(true)
        {
            System.out.format("\n\n\t::Please enter a number in range of 1 and %d\n\t::Amount: ", marbles / 2);

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
                    System.out.println("\t++Please make sure the amount is correct.\n");
            }
            // If the input is not an int.
            else
            {
                // Let the user know they aren't the brightest and move on.
                System.out.println("\t++Dumbo, numbers please.");
                sc.next();
            }
        }
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
