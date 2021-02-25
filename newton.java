public class newton{
 
    static final double EPSILON = 0.001; 
    int a;
    int b;
    int c;
    int d;
    int e;
    int count = 0;
    
    public newton(int a, int b, int c, int d, int e)
    {
     this.a = a;
     this.b = b;
     this.c = c;
     this.d = d;
     this.e = e;
    }

    public newton(int b, int c, int d, int e)
    {
     this.a = 0;
     this.b = b;
     this.c = c;
     this.d = d;
     this.e = e;
    }
    // An example function 
     // The function is x^3 - x^2 + 2 
    public double func(double x) 
    { 
        return a*Math.pow(x,4) + b*Math.pow(x, 3) + c * Math.pow(x,2) + d*Math.pow(x,1) + e*Math.pow(x,0); 
    } 
      
    // Derivative of the above function  
    
    public double derivFunc(double x) 
    { 
        return 4*a*Math.pow(x,3) + 3 * b * Math.pow(x,2) + 2 * c * Math.pow(x,1) + d; 
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
            count++;

            if(count > 100)
            {
                System.out.println("No real solutions.");
                break;
            }
        } 
        if(count<=100)
        {
        System.out.print("after iterations: " + count + " The value of the" + " root is : " 
            + Math.round(x * 100.0) / 100.0); 
        }  
    } 
      
    public static void main(String[] args)
    {
        newton ex1 = new newton(1, -2, -3, 1, 1);
       
        double x0 = -40;  
        ex1.newtonRaphson(x0);
    }
}
