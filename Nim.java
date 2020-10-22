/**
 * Nim game class.
 */
public class Nim
{
    private String winner ;
    private static Player[] players ;
    private static int gamesPlayed = 1 ;

    /**
     * Create an interface array using concrete classes.
     *
     * @param players Concrete classes that implement {@link Player}.
     */
    public Nim(Player[] players)
    {
        Nim.players = players ;
    }

    /**
     * Conduct the Nim game.
     */
    public String play()
    {
        // Create a pile instance.
        Pile pile = new Pile() ;

        // Print the number of played games and increase the static counter.
        System.out.println("\t Game Number: " + gamesPlayed++) ;

        // Let the user know how many marbles there are at the start.
        System.out.format("\tStarting the game! Currently there are %s marbles!", pile.getMarbles()) ;

        // Iterate while there are marbles.
        while(pile.hasMarbles())
        {
            for (int i = 0 ; i < players.length ; i++) 
            {
               // Call the move method for the concrete classes
               // polymorphically.
               int playerAmount = players[i].move(pile.getMarbles()) ;

               // Remove the amount of marbles.
               pile.removeMarbles(playerAmount) ;

               // Tell the user the amount of marbles removed, by who, and left amount.
               System.out.format("\n\n\t%s removed: %2s marbles!\n\tNow there are %2s left.\n", 
                       players[i].getPlayerName() , pile.getLastPlay() , pile.getMarbles()) ;

               // If there is one marble left, set the winner.
               if(pile.getMarbles() == 1)
               {
                    winner = "\n\n\tDrrrrrrrrrum-roll, please.\n\tThe winner is " + players[i].getPlayerName() + "!!!!\n" ;
                    return winner ;
               }
            }
        }

        return winner ;
    }
}
