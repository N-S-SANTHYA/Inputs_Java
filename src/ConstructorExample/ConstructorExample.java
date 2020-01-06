package ConstructorExample;

/**
 * Example program for constructor and this keyword
 */
public class ConstructorExample {
    private int number1;
    private int number2;

    public ConstructorExample() {
        System.out.println("Hi! I'm a default constructor and I'm called by the JVM on every object creation");
        number1 = 5;
        number2 = 5;
    }

    public ConstructorExample(final int number1,
                              final int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void printAssignedNumbers() {
        System.out.println("Value of Number1 is " + this.number1 + " and value of number2 is " + this.number2);
    }

    public static void main(String args[]) {

        // Create an instance of ConstructorExample class
        ConstructorExample constructorExample = new ConstructorExample();
        constructorExample.printAssignedNumbers();

        System.out.println("\n");

        // Create an instance of ConstructorExample using parameterized constructor
        ConstructorExample constructorExample1 = new ConstructorExample(10, 15);
        constructorExample1.printAssignedNumbers();
    }

}
