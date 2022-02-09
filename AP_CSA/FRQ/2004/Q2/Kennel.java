package Y2004.Q2;

import java.util.ArrayList;

public class Kennel
{
    private ArrayList<Pet> petList;

    public Kennel() {
        this.petList = new ArrayList<Pet>();
    }

    public void allSpeak()
    {
        for(Pet p : petList)
        {
            System.out.println(p.getName() +" " + p.speak());
        }
    }

    public static void main(String[] args) {
        Kennel k = new Kennel();
        Dog d = new Dog("Tille");
        Cat c = new Cat("Sammy");
        LoudDog ld = new LoudDog("Harry");

        k.petList.add(d);
        k.petList.add(c);
        k.petList.add(ld);
        k.allSpeak();
    }
}
