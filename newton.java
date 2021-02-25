public class poly 
{
    static final double EPSILON = .00001;
    //instance variables are my coefficients
    private int fourth;
    private int third;
    private int second;
    private int first;
    private int constant;
    
public poly(int fourth, int third, int second, int first, int c)
{
    this.fourth = fourth;
    this.third = third;
    this.second = second;
    this.first = first;
    constant = c;
}

public poly(int third, int second, int first, int c)
{
    this.fourth = 0;
    this.third = third;
    this.second = second;
    this.first = first;
    constant = c;
}

       
public double funcValue(double x)
{
    return fourth * Math.pow(x, 4) + third * Math.pow(x,3) + second * Math.pow(x,2) + first * Math.pow(x, 1) + constant;
}
   
public double derivFunction(double x)
{
    return 4*fourth * Math.pow(x,3)+ 3*third*Math.pow(x, 2) + 2*second*Math.pow(x, 1) + first;
}

//give random input to get back the zero
public void newtonRaphson(double x)
{
    int counter = 0;
    double ratio = funcValue(x) / derivFunction(x);
    while(Math.abs(ratio) >= EPSILON)
    {
        counter++;
        ratio = funcValue(x) / derivFunction(x);
        x = x - ratio;
        
        
        if(counter > 100)
        {
            System.out.println("There are no real roots");
            return;
        }
    }
    
    System.out.println("The value of the root is: " + Math.round(x*100.0) / 100.0);
    System.out.println("Iterations were: " + counter);
}

public static void main(String[] args)
{
    poly ex1 = new poly(0, 0, 1, 0, 0);
    System.out.println(ex1.funcValue(1));
    System.out.println(ex1.derivFunction(1));
    ex1.newtonRaphson(1);
}
}
