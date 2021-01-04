
package Topic_9;

public class Animal 
{
    /*
    This is encapsculation - subclasses do not have access to 
    private variables from the super class
    */
    private boolean alive;
    private String hairColor;
    private double weight;
    private String location;
    
    public Mammal()
    {
        alive = true;
        location = "North Wing";
    }
    
    public Mammal(boolean alive, String hairColor, double weight)
    {
        this.alive = alive;
        this.hairColor = hairColor;
        this.weight = weight;  
    }
    
    public void setAlive(boolean status)
    {
        alive = status;
    }
    
    public void setWeight(double w)
    {
        weight = w;
    }
    
    public boolean getAlive()
    {
        return alive;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public String getHairColor()
    {
        return hairColor;
    }
    
    public String getLocation()
    {
        return "Located at North West Campus with other mammals";
    }
}
