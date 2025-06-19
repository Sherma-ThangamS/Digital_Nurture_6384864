public class FinancialForecast {

    public static double futureValueRecursive(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + rate) * futureValueRecursive(presentValue, rate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000.0;
        double annualRate = 0.05;
        int years = 10;

        double result = futureValueRecursive(presentValue, annualRate, years);
        System.out.printf("Future Value after %d years: %.2f%n", years, result);
    }
}

/*
    Recursion is a programming technique where a method calls itself to solve smaller subproblems of a larger problem.

    When to use? : When the problem can be broken down into similar subproblems

    Time Complexity = O(n) n=> No of years
    Optimization – Using Memoization(Store the results)

 */