public class newton{
 
    static final double EPSILON = 0.001; 
    int a;
    int b;
    int c;
    int d;
    
    public newton(int a, int b, int c, int d)
    {
     this.a = a;
     this.b = b;
     this.c = c;
     this.d = d;
    }
    // An example function 
     // The function is x^3 - x^2 + 2 
    public double func(double x) 
    { 
        return a*Math.pow(x, 3) + b * Math.pow(x,2) + c*Math.pow(x,1) + d*Math.pow(x,0); 
    } 
      
    // Derivative of the above function  
    
    public double derivFunc(double x) 
    { 
        return 3 * a * Math.pow(x,2) + 2 * b * Math.pow(x,1) + c; 
    } 
      
    // Function to find the root 
    public void newtonRaphson(double x) 
    { 
        double h = func(x) / derivFunc(x); 
        while (Math.abs(h) >= EPSILON) 
        { 
            h = func(x) / derivFunc(x); 
      
            // x(i+1) = x(i) - f(x) / f'(x)  
            x = x - h; 
        } 
      
        System.out.print("The value of the"
                + " root is : " 
                + Math.round(x * 100.0) / 100.0); 
    } 
      
    public static void main(String[] args)
    {
        newton ex1 = new newton(2, -3, 1, -3);
       
        double x0 = -4;  
        ex1.newtonRaphson(x0);
    }
}
