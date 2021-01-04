
package Topic_9;

public class Monkey extends Mammal
{
    String name;
    int sociailizationMinutes;
    
    public Monkey()
    {
        super();
    }
    
    public Monkey(String n, int soc, boolean alive, String hairColor, double weight)
    {
        super(alive, hairColor, weight);
        name = n;
        sociailizationMinutes = soc;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getMinutes()
    {
        return sociailizationMinutes;
    }
    
    /*
    Override the superclass method for getLocation
    This is polymorphism
    */
    
    public String getLocation()
    {
        return "Monkeys have their own wing - all are located in Monkey Wing";
    }
}
