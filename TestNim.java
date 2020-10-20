public class TestNim
{
    public static void main(String[] args) 
    {
        Player[] players = new Player[] {new SmartComputer(), new AverageComputer()} ;

        Nim nimGame = new Nim(players) ;

        System.out.println(nimGame.play());
    }

}
