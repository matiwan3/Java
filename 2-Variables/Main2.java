public class Main2 {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);

        int myNum1 = 15;
        System.out.println(myNum1);

        int myNum2;
        myNum2 = 15;
        System.out.println(myNum2);

        int myNum3 = 15;
        myNum3 = 20;  // myNum3 is now 20
        System.out.println(myNum3);

        final int myNum = 15;
        // myNum = 20; // will generate an error: cannot assign a value to a final variable

        int myNum4 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello"; 
    }
}

//     Java Variables
// Variables are containers for storing data values.

// In Java, there are different types of variables, for example:

// String - stores text, such as "Hello". String values are surrounded by double quotes
// int - stores integers (whole numbers), without decimals, such as 123 or -123
// float - stores floating point numbers, with decimals, such as 19.99 or -19.99
// char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
// boolean - stores values with two states: true or false