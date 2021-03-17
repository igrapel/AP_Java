
package FRQ2012.Q1;


public class GrayImage 
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;
    
    private int[][] pixelValues;
    
    public GrayImage(int[][] a)
    {
        pixelValues = a;
    }
    /** @return the number of white pixels
    
    */
    public int countWhitePixels()
    {
        int count = 0;
        for(int i = 0; i < pixelValues.length; i++)
        {
            for(int j = 0; j < pixelValues[0].length; j++)
            {
                if(pixelValues[i][j] == 255)
                {
                    count++;
                }
            }
        }
        return count;
    }
    
    public void processImage()
    {
        for(int i = 0; i < pixelValues.length-2; i++)
        {
            for(int j = 0; j < pixelValues[0].length-2; j++)
            {
                int newValue = this.pixelValues[i][j] - this.pixelValues[i + 2][j + 2];
                if(newValue < 0)
                {
                    newValue = 0;
                }
                this.pixelValues[i][j] = newValue;
            }
        }
    }
    
    public void printArray()
    {
        for(int[] r : pixelValues)
        {
            for(int c : r)
            {
                System.out.print(c + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] testArray = {{221, 184, 178, 84, 135},
                {84, 255, 255, 130, 84},
                {78, 255, 0, 0, 78},
                {84, 130, 255, 130, 84}};
        
        GrayImage test = new GrayImage(testArray);
        
        System.out.println(test.countWhitePixels());
        test.printArray();
        test.processImage();
        test.printArray();
    }
}
