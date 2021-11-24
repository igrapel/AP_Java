public class Parabola{
    private int a;
    private int b;
    private int c;

    public Parabola(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getAxis(){
        return (double) -b / (2 * a);
    }

    public boolean isOnGraph(int x, int y){
        return y == (a * x * x + b * x + c);
    }
}
