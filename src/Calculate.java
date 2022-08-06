
public class Calculate {
    public static void main(String[] args){

        // This case treats the scenario where "*" is provided as a command line argument
        // it returns the list of files instead of serving as an operator

        if(args.length == 6) {
            args[1] = "*";
            args[2] = args[5];
        }else {
            if(args.length != 3){
                System.out.println("Usage: Calculate [int] [operator] [int]");
            }
        }

        Calculator calculator = new Calculator();
        // Register the four "basic" binary operators: +, -, *, /
        // That is where we use our Lambdas
        calculator.registerOperation("+", (a, b) -> a + b);
        calculator.registerOperation("-", (a, b) -> a - b);
        calculator.registerOperation("*", (a, b) -> a * b);
        calculator.registerOperation("/", (a, b) -> a / b);

        int a = Integer.parseInt(args[0]);
        String operator = args[1];
        int b = Integer.parseInt(args[2]);

        System.out.println(calculator.calculate(a, operator, b));
    }
}
