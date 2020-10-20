import java.util.Random ;

class AverageComputer implements Player
{
    private static String playerName ;
    private final Random rnd = new Random() ;

    public AverageComputer()
    {
        playerName = "AverageComputer";
    }

    public AverageComputer(String playerName)
    {
        AverageComputer.playerName = playerName ;
    }

    public int move(int marbles)
    {
       return rnd.nextInt(marbles / 2) + 1 ;
    }

    public String getPlayerName()
    {
        return AverageComputer.playerName ;
    }
}
