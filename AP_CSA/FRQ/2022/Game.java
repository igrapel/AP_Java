package Y2022.Q1;

public class Game
{
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    Game g;

    public Game()
    {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }

    public void play()
    {
        g = new Game();
    }

    public boolean isBonus()
    {
        double randomNum = Math.random(); //gives a random number between 0 and 1
        //create bonus game 20 percent of time
        System.out.println("Bonus: " + (randomNum < .2));
        return randomNum < .2;
    }

    public int getScore()
    {
        int totalPoints = 0;
        if(levelOne.goalReached())
        {
            totalPoints += levelOne.getPoints();
        }
        if(levelOne.goalReached() && levelTwo.goalReached())
        {
            totalPoints += levelTwo.getPoints();
        }
        if(levelOne.goalReached() && levelTwo.goalReached() && levelThree.goalReached())
        {
            totalPoints += levelThree.getPoints();
        }
        if(isBonus())
        {
            totalPoints *=3;
        }
        return totalPoints;
    }

    public int playManyTimes(int num)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num; i++)
        {
            play();
            int score = g.getScore();
            if(score > max)
            {
                max = score;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Play a GAme");

        Game test = new Game();
        System.out.println(test.getScore());
        int m = test.playManyTimes(4);
        System.out.println("Max: " + m);

    }

}
