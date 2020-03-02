public class SkyViewRunner 
{
public static void main(String[] args)
{
    double scanned[] = {.3, .7, .8, .4, 1.4, 
                        1.1, .2, .5, .1, 1.6, .6, 0.9};
    
    SkyView s1 = new SkyView(4, 3, scanned);
    
    for(int i = 0; i <4; i++)
    {
        for(int j=0; j < 3; j++)
        {
            System.out.print(s1.view[i][j] + " ");
        }
        System.out.println();
    }
    
    System.out.println(s1.getAverage(1, 2, 0, 1));
}
}
