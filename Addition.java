class Addition {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        Addition addition = new Addition(); // Creating an object of the class
        int result = addition.add(10, 20); // Calling the add method
        System.out.println("Sum: " + result); // Printing the result
    }
}

