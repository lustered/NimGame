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
        
        // Constructors for the concrete classes.
        Player[] builders = { new Human(), new SmartComputer(), new AverageComputer() };


        // Array of the interface Player.
        Player[] players = new Player[size] ;

        int playAgain ; 

        do
        {
            // For n player that wants to play.
            for (int i = 0 ; i < size ; i++) 
            {
                // Ask the user the players he wants to play.
                userOption = JOptionPane.showOptionDialog(null, "Select player #: " + (i+1), 
                        "Nim Game", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE, null, availablePlayers, availablePlayers[0]) ;

                // Get the name of the player.
                String userName = (JOptionPane.showInputDialog("Insert the name for player #: " + (i+1)));
                
                // Add the addecuate constructor for the chosen player.
                players[i] = builders[userOption];
                // Setting the name of the player.
                players[i].setPlayerName(userName);

            }

            // Create a Nim game with the interface array.
            Nim game = new Nim(players) ;

            // Print the results and the winner.
            System.out.println(game.play()) ;

            // Ask the user if they want to play again.
            playAgain = JOptionPane.showOptionDialog(null, "Do you want to play again?", 
                    "Nim Game", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, menu, menu[0]) ;

        }while(playAgain == 1) ;

    }

}
