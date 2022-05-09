package Y2022.Q1;

public class Level
{
    private int points;
    private boolean reached;

    public Level()
    {
        //give me a random integer between 0 and 200
        points = (int) (Math.random()*201);
        System.out.println("Earned: " + points);
    }


    public boolean goalReached()
    {
        double randomNum = Math.random(); //gives a random number between 0 and 1
        reached = randomNum < .7;
        System.out.println(reached);
        return reached;
    }

    public int getPoints()
    {

        return points;
    }

}
