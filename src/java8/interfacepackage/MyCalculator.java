package java8.interfacepackage;

public class MyCalculator implements AdvancedArithmetic {

    public MyCalculator(int sum) {
        this.sum = sum;
    }

    int sum=0;
    @Override
    public int divisor_sum(int n) {

        for(int i=1; i<n+1;i++){
            if(n%i==0) sum = sum+i;
        }

        return sum;
    }
}
