public class ComplexNumber {
    private int a;
    private int b;

    public ComplexNumber(int a, int b){
        this.a = a;
        this.b = b;
    }

    public ComplexNumber add(ComplexNumber cNum){
        return new ComplexNumber(cNum.getA() + a, cNum.getB() + b);
    }

    public ComplexNumber multiply(ComplexNumber cNum){
        return new ComplexNumber(cNum.getA() * a + -cNum.getB() * b, cNum.getA() * b + cNum.getB() * a);
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }
}
