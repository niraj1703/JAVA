public class datatypes {

    public static void main(String[] args) {
        // byte b = 100;
        // short s = 32000;
        // int i = 500000;
        // long l = 1000000000L; // 'L' denotes long

        // float f = 5.75f; // 'f' denotes float
        // double d = 19.99; // Default decimal type

        // char c = 'A';
        // boolean isJavaFun = true;

        // System.out.println("Byte: " + b);
        // System.out.println("Short: " + s);
        // System.out.println("Int: " + i);
        // System.out.println("Long: " + l);
        // System.out.println("Float: " + f);
        // System.out.println("Double: " + d);
        // System.out.println("Char: " + c);
        // System.out.println("Boolean: " + isJavaFun);
        
// Numbers


// byte myNum = 100;
// System.out.println(myNum);

//         short myNum = 5000;
// System.out.println(myNum);

// int myNum = 100000;
// System.out.println(myNum);

// long myNum = 15000000000L;
// System.out.println(myNum);

// float myNum = 5.75f;
// System.out.println(myNum);

// double myNum = 19.99d;
// System.out.println(myNum);


// boolean isJavaFun = true;
// boolean isFishTasty = false;
// System.out.println(isJavaFun);     // Outputs true
// System.out.println(isFishTasty);   // Outputs false

// char myVar1 = 65, myVar2 = 66, myVar3 = 67;
// System.out.println(myVar1);
// System.out.println(myVar2);
// System.out.println(myVar3);


// String greeting = "Hello World";
// System.out.println(greeting);


// Create variables of different data types
// int items = 50;
// float costPerItem = 9.99f;
// float totalCost = items * costPerItem;
// char currency = '$';

// // Print variables
// System.out.println("Number of items: " + items);
// System.out.println("Cost per item: " + costPerItem + currency);
// System.out.println("Total cost = " + totalCost + currency);


// Widening Casting
// Widening casting is done automatically when passing a smaller size type to a larger size type:
byte b = 100;
short num = b;
System.out.println(b);
System.out.println(num);



byte myByte = 100;  // 8-bit
short myShort = myByte; // Automatic widening to 16-bit
System.out.println("Byte value: " + myByte);
System.out.println("Short value: " + myShort);


double myDouble = 9.78d;
int myInt = (int) myDouble; // Manual casting: double to int

System.out.println(myDouble);   // Outputs 9.78
System.out.println(myInt); 

// short s = 3200;

// Set the maximum possible score in the game to 500
int maxScore = 500;

// The actual score of the user
int userScore = 423;

/* Calculate the percantage of the user's score in relation to the maximum available score.
Convert userScore to float to make sure that the division is accurate */
float percentage = (float) userScore / maxScore * 100.0f;

System.out.println("User's percentage is " + percentage);



// char c = 'c';

// int myInt = 9;
// double myDouble = myInt; // Automatic casting: int to double
// System.out.println(myInt);      // Outputs 9
// System.out.println(myDouble);   // Outputs 9.0


// long l = 1000000000000L;


// float f = 7.99f;


    }
}
