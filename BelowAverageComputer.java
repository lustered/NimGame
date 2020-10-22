import java.util.Random ;

class BelowAverageComputer implements Player
{
    private String playerName ;
    private final Random rnd = new Random() ;

    public BelowAverageComputer()
    {
        playerName = "AverageComputer";
    }

    public BelowAverageComputer(String playerName)
    {
        this.playerName = playerName ;
    }

    public int move(int marbles)
    {
       return rnd.nextInt(marbles / 2) + 1 ;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    public String getPlayerName()
    {
        return playerName ;
    }
}
