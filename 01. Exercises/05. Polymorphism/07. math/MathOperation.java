package math;

public class MathOperation {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int add(int... elements){
        if(elements.length<2){
            throw new IllegalArgumentException();
        }
        int sum=0;
        for (int i : elements) {
            sum+=i;
        }

        return sum;
    }

}
