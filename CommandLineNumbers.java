class CommandLineNumbers {
    public static void main(String[] args) {
        // Check if exactly 2 arguments are provided
        if (args.length < 2) {
            System.out.println("Usage: java CommandLineNumbers <num1> <num2>");
            return;
        }

        // Parse the command-line arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Perform operations
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int quotient = (num2 != 0) ? num1 / num2 : 0; // Prevent division by zero

        // Display results
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
    }
}

