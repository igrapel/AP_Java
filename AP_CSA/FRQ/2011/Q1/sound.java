
package FRQ2011;

public class Sound 
{
    private int[] samples;
    
    public Sound(int[] s)
    {
        samples = s;
    }
   
    public int limitAmplitude(int limit)
    {
        int numChanges=0;
        
        for(int i = 0; i < samples.length;i++)
        {
            if(samples[i] > limit)
            {
                samples[i] = limit;
                numChanges++;
            }
            
            if(samples[i] < -1 * limit)
            {
                samples[i] = -1 * limit;
                numChanges++;
            }  
        }
        return numChanges;
        
    }
    
    public void trimSilenceFromBeginning()
    {
        int zeros = 0;
        
        for(int i = 0; i < samples.length; i++)
        {
            if(this.samples[i] == 0)
            {
                zeros++;
            }
            else{
                break;
            }
        }
        
        System.out.println("Zeros" + zeros);
        int[] copy = new int[samples.length - zeros];
        for(int j = 0; j < copy.length;j++)
        {
            copy[j] = this.samples[j + zeros];
        }
        this.samples = copy;
    }
    
    
    public static void main(String[] args)
    {
//        int[] sounds = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 155, -32, 2030, 3223};
//        Sound music = new Sound(sounds);
//        int changes = music.limitAmplitude(2000);
//        System.out.println(changes);
       
        
        int[] soulCrusher = {0, 0, 0, 0, 0, 0, 12, 23, 99, -23, -40, 0, 33, 300};
        Sound music2 = new Sound(soulCrusher);
        
        music2.trimSilenceFromBeginning();
         for(int s : music2.samples)
        {
            System.out.print(s + "\t");
        }
    }
    
    
    
}
