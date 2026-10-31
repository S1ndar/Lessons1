package Algorithms;

import java.util.function.DoubleUnaryOperator;

public class NewtonMethod {
    public static double NewTon(DoubleUnaryOperator f, DoubleUnaryOperator df, double x0, int maxIt, double accuracy){
        double x = x0;
        for (i = 0; i < maxIt; i++){
            double fx = f.applyAsDouble(x);
            double dfx = df.applyAsDouble(x);

            double newX = x - (fx/dfx);
            if (Math.abs(newX - x) < accuracy){
                return newX;
            }
            x = newX;
        }
        return 0;
    }

    static void main() {
        DoubleUnaryOperator f = x -> x*x + 4 * x - 10;
        DoubleUnaryOperator df = x -> 2*x + 4;

        System.out.println(NewTon(f,df,3.0,100,0.0067));

    }
}


