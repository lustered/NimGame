import java.util.HashMap ;
import javax.swing.JOptionPane ;

public class TestNim
{
    public static void main(String[] args) 
    {
        // Number of players.
        int size = 2 ;
        
        // Var to store player option.
        int userOption ;

        // Options for JOptionPane.
        Object[] menu = { "No", "Yes" } ;
        Object[] availablePlayers = { "Human", "Smart Computer", "Dumb Computer" } ;

        // TODO : This can be refactored so much better without using hashmap.
        // Pair of Player and constructors.
        HashMap<String, Player> options = new HashMap<>() ;
        options.put("Human", new Human()) ;
        options.put("Smart Computer", new SmartComputer()) ;
        options.put("Dumb Computer", new AverageComputer()) ;

        // Array of the interface Player.
        Player[] players = new Player[size] ;

        int playAgain ; 

        do
        {
            // Ask the user the players he wants to play.
            for (int i = 0 ; i < size ; i++) 
            {
                userOption = JOptionPane.showOptionDialog(null, "Select player #: " + (i+1), 
                        "Nim Game", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE, null, availablePlayers, availablePlayers[0]) ;

                // Get the name of the player.
                String name = (JOptionPane.showInputDialog("Insert the name for player #: " + (i+1)));
                
                // Add the addecuate constructor for the chosen player.
                players[i] = options.get(availablePlayers[userOption]);
                // Setting the name of the player.
                players[i].setPlayerName(name);

            }

            // Create a Nim game with the interface array.
            Nim game = new Nim(players) ;

            // Print the results and the winner.
            System.out.println(game.play()) ;

            // Ask the user if they want to play again.
            playAgain = JOptionPane.showOptionDialog(null, "Play again?", 
                    "Nim Game", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, menu, menu[0]) ;

        }while(playAgain == 1) ;

    }

}
