import java.util.HashMap ;
import java.util.Map;

import javax.swing.JOptionPane ;
import javax.swing.JTable ;

public class TestNim
{
    public static void main(String[] args) 
    {
        // TODO
        // int games = 1;
        // Player[] options = new Player[] {new AverageComputer(), new Human()} ;
        int playAgain; 
        Object[] menu = { "No", "Yes" } ;

        // Options for the user.
        HashMap<String, Player> options = new HashMap<>();
        options.put("Human",new Human());
        options.put("Smart Computer",new SmartComputer());
        options.put("Below Average Computer",new AverageComputer());

        // Ask user if they want to play the game again
        JTable table = new JTable(options.size(),2);

        int row = 0 ;

        for(Map.Entry<String, Player> entry: options.entrySet())
        {
            table.setValueAt(entry.getKey(), row, 0);
            table.setValueAt(entry.getValue(), row, 0);
            row++;
        }

        int userOption ;
        do
        {
           

            playAgain = JOptionPane.showOptionDialog(null, "Play again?", 
                    "Tile Game", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, menu, menu[0]) ;

        }while(playAgain == 1) ;
        // Nim nimGame = new Nim(players) ;
        // System.out.println(nimGame.play());
    }

}
