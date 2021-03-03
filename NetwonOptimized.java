import java.util.ArrayList;

public class newton{
 

    static final double EPSILON = 0.001; 
    ArrayList<Integer> coefficients;
    int count = 0;
    
    public newton(int a, int b, int c, int d, int e)
    {
     coefficients = new ArrayList<Integer>();
     coefficients.add(0, a);
     coefficients.add(0, b);
     coefficients.add(0, c);
     coefficients.add(0, d);
     coefficients.add(0, e);
    }

    public newton(int b, int c, int d, int e)
    {
     
    }
    // An example function 
     // The function is x^3 - x^2 + 2 
    public double func(double x) 
    { 
        return coefficients.get(4)*Math.pow(x,4) + coefficients.get(3)*Math.pow(x, 3) +coefficients.get(2) * Math.pow(x,2) + 
        coefficients.get(1)*Math.pow(x,1) + coefficients.get(0)*Math.pow(x,0); 
    } 
      
    // Derivative of the above function  
    
    public double derivFunc(double x, ArrayList<Integer> cf) 
    { 
        double dd = 0;
        for(int i = cf.size()-1; i >= 0; i--)
        {
           dd += i*cf.get(i)*Math.pow(x,i-1);
        }

        return dd;
        //return 4*coefficients.get(4)*Math.pow(x,3) + 3 * coefficients.get(3) * Math.pow(x,2) + 
        //2 * coefficients.get(2) * Math.pow(x,1) + coefficients.get(1)* Math.pow(x,0)+ coefficients.get(0)*Math.pow(x,-1); 
    } 

    public double doubleDeriv(double x, ArrayList<Integer> cf)
    {
        /*double dd = 0;
        for(int i = cf.size()-1; i >= 0; i--)
        {
           dd = dd+ i*(i-1)*cf.get(i)*Math.pow(x,i-2);
        }
        System.out.println("Double d is " + dd);
        return dd;
       */
      return 4*3*coefficients.get(4)*Math.pow(x,2) + 3*2*coefficients.get(3) * Math.pow(x,1) + 
        2 * 1* coefficients.get(2) * Math.pow(x,0) + 1*0*coefficients.get(1)* Math.pow(x,0)+ coefficients.get(0)*Math.pow(x,-1);   
    }
    
    // Function to find the root 
    public void newtonRaphson(double x) 
    {    
        double h = func(x) / derivFunc(x, this.coefficients); 
        while (Math.abs(h) >= EPSILON) 
        { 
            h = func(x) / derivFunc(x, this.coefficients); 
      
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
        System.out.println("after iterations: " + count + " The value of the" + " root is : " 
            + Math.round(x * 100.0) / 100.0); 
        }
        
    } 

    public void newtonRaphsonOptimization(double x) 
    {    
        double h = derivFunc(x, this.coefficients) / doubleDeriv(x, this.coefficients); 
        while (Math.abs(h) >= EPSILON) 
        { 
            h = derivFunc(x, this.coefficients) / doubleDeriv(x, this.coefficients);  
      
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
        System.out.println("after iterations: " + count + " The value of the local min/max is " 
            + Math.round(x * 100.0) / 100.0); 
        }
        
    } 
      
    public static void main(String[] args)
    {
        newton ex1 = new newton(1, -2, -3, 1, 1);
       
        double x0 = 40;  
        ex1.newtonRaphsonOptimization(x0);
        //System.out.println(ex1.doubleDeriv(2.1, ex1.coefficients));

    }
}
