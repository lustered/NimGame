public class Nim
{
    private String winner ;
    private static Player[] players ;

    public Nim(Player[] players)
    {
        Nim.players = players ;
    }

    public String play()
    {
        Pile pile = new Pile() ;

        System.out.format("Starting the game! Currently there are %s marbles!", pile.getMarbles()) ;

        while(pile.hasMarbles())
        {
            for (int i = 0 ; i < players.length ; i++) 
            {
               int playerAmount = players[i].move(pile.getMarbles()) ;

               pile.removeMarbles(playerAmount) ;

               System.out.format("\n\n%s removed: %2s marbles!\nNow there are %2s left.\n", 
                       players[i].getPlayerName() , pile.getLastPlay() , pile.getMarbles()) ;

               if(pile.getMarbles() == 1)
               {
                    winner = "\n\nDrrrrrrrrrum-roll, please.\nThe winner is " + players[i].getPlayerName() + "!!!!" ;
                    return winner ;
               }
                   
            }
        }

        return winner ;
    }
}
