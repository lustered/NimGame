/**
 * Blueprint for every player to implement.
 * 
 * .move method takes the leftover marbles in the pile and returns the 
 * addecuate amount of marbles to remove.
 * 
 * .getPlayerName returns the player's name.
 *
 * .setPlayerName sets the player's name and returns a reference to itself
 * enabling method chaining.
 *
 */
public interface Player
{
    int move(int marbles) ;
    String getPlayerName() ;
    Player setPlayerName(String playerName) ;
}
