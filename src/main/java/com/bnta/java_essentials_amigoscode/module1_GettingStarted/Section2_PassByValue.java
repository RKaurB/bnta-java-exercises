// Important to understand the difference between passing by value vs passing by reference
// when we have a method

package com.bnta.java_essentials_amigoscode.module1_GettingStarted;

public class Section2_PassByValue {

//    public static void main(String[] args) {
//        // Create and initialise value of x variable
//        int x = 0;
//        // Call incrementValue method and pass in value of x (i.e. 0)
//        incrementValue(x);
//        // Think about what the output for the print statement will be - will it be 0 or 1?
//        System.out.println(x);
//        // Here, we actually get the print output: 0
//        // This is because, when we pass a primitive (i.e. int value), what happens is that it passes the actual primitive by value
//        // So, it passes a copy of the actual variable - it's not the actual variable
//        // It takes this copy and passes it into the function (method)
//        // So in the method below, where it says: value++, this value internally is creating a variable in memory, and then holding the actual value 0 and then ++ and then 1
//        // So internally, somewhere in the memory, we have the value of 1!
//        // But when we pass this int x = 0 (primitive) variable into the incrementValue function, the int value passed into the function is a copy
//        // It's not the actual value - it's a copy being passed
//        // So then, when we say value++ in the function, it's the same as saying:
//        // int value = value + 1;
//        // value++;
//        // So we now have a variable somewhere in the memory, that holds the actual variable called value with the value of 1 (so 0 + 1 is 1)
//    }

//    // incrementValue method (takes a primitive value, i.e. int value)
//    // (void means that the function doesn't return anything)
//    // Here, we are passing the integer value, and incrementing it by 1
//    static void incrementValue(int value) {
//        value++;        // as explained above, this is the same as saying: value = value + 1
//    }

    // SO UNDERSTAND AND REMEMBER:  For primitive values, when we pass the actual variable into a function parameter, what gets sent down is a copy of the original value
    // Which means that, we should never mutate primitives here (e.g. value = value + 1, or value++, in the function) -
    // i.e. so never mutate the actual variable that you pass inside the function, because what gets sent down is a copy and not the actual reference
    // Instead, what we should do is:

    public static void main(String[] args) {
        // Create and initialise value of x variable
        int x = 0;
        // incrementValue(x);
        int y = incrementValue(x);
        System.out.println(x);
        System.out.println(y);
    }

    static int incrementValue(int value) {
        return value + 1;
    }

    // Next:  With reference types, it's a little bit different...

}
