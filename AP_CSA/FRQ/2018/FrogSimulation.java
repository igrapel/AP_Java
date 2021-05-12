public class FrogSimulation
{
    private int goalDistance;

    private int maxHops;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance()
    {
        return (int)(Math.random()*18) - 3;
    }

    public boolean simulate()
    {
        int distance = 0;

        for(int i = 0; i < maxHops; i++)
        {
            int hop = hopDistance();
            distance += hop;
            if(distance >= goalDistance)
            {
                return true;
            }
            else if(distance <0)
            {
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num)
    {
        int positives = 0;
        for(int i = 0; i < num; i++)
        {
            if(simulate())
            {
                positives++;
            }
        }
        return (double) positives / num;
    }

    public static void main(String[] args)
    {
        FrogSimulation test = new FrogSimulation(14, 21);
        System.out.println(test.simulate());
        System.out.println(test.runSimulations(100));
    }
}
