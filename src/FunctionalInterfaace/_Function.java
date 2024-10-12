package FunctionalInterfaace;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int num = MultipleBy10Function.apply( IncrementByOneFunction.apply(0));
        System.out.println(num);

        int number = IncrementByOneFunction.andThen(MultipleBy10Function).andThen(IncrementByOneFunction).apply(1);
        System.out.println(number);

        int mult = MultiplyBiFunction.apply(2, 3);
        System.out.println(mult);

    }

    static Function<Integer, Integer> IncrementByOneFunction =
            num -> num + 1;

    static Function<Integer, Integer> MultipleBy10Function =
            num -> num * 10;

    static BiFunction<Integer, Integer, Integer> MultiplyBiFunction=
            (a, b) -> a * b;
    static int Increment(int num) {
        return num + 1;
    }
}
