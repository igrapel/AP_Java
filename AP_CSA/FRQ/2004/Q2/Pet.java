package Y2004.Q2;

public abstract class Pet
{
    private String myName;

    public Pet(String Name) {
        myName = Name;
    }

    public String getName()
    {
        return myName;
    }

    public abstract String speak();
}
