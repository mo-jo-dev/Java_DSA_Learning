import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args){
        System.out.println(Arrays.toString(args)); //CMD line args
        Scanner in = new Scanner(System.in);
        String name = "Mohit";
        System.out.println(name);

        String a = "name";
        String b = "name";
        // a and b are equal but they are actually pointing to same value in heap pool;
        System.out.println(a==b);  // Will give true as a and b are pointing to same value in pool;
        String a1 = new String("name");
        String b1 = new String("name");
        System.out.println(a1==b1);  // Will give false as a and b are not pointing to same value in pool rather pointing to two different values in heap;

        // For checking the value only irrespective of the fact whether it's in the pool or not, we use
        String a2 = "name";
        String b2 = "name";
        System.out.println(a1.equals(b1));

        // for getting the value at a index, we use:
        System.out.println(b2.charAt(0));

    }
}

/*
🧵 Strings in Java are sequences of characters, representing text or data, stored in a string data type.
🏭 Strings are stored internally in a separate memory structure called the "string pool" for optimization.
🧠 Every string in Java is an object of the String class, and strings are immutable for security reasons.
🔄 Use the == operator to check if two string reference variables point to the same object; use the .equals method to compare their values.
🚀 Explicitly using the new keyword creates new string objects outside the string pool, allowing for different objects with the same value.
🖨️ When printing different objects in Java using println, the method internally calls toString to obtain a string representation. Understanding the hierarchy and method overriding allows customization of this behavior.
🔄 The toString method in Java is crucial for obtaining string representations of objects. For instance, for a null object, it prints "null," and for other types, it utilizes their toString implementations.
🔄 In Java, you can override the toString method to customize the string representation of an object. This is useful for pretty-printing and providing meaningful information when using println.
🎭 The printf function in Java allows formatted printing, making it convenient for outputting values with specific decimal precision or other formatting requirements.
⚠️ The + operator in Java is defined for primitives and strings. When dealing with complex objects, at least one of them needs to be of type string to use the + operator in an expression.
🧠 String concatenation using the plus operator in Java is overloaded for string types, allowing the combination of multiple strings.
🚫 Java does not support operator overloading for custom objects, except for the plus operator on strings for string concatenation.
🔄 Strings in Java are immutable, and concatenating strings using the plus operator creates new string objects, leading to memory inefficiency.
🛠️ The StringBuilder class in Java provides a mutable alternative for string manipulation, avoiding the creation of multiple objects and improving efficiency.
🔄 Checking if a string is a palindrome can be efficiently done by comparing the characters from the start and end pointers towards
🔄 Palindrome check using start and end pointers in a loop.
🔄 For loop can be used for palindrome check, iterating till half of the array.
⚠️ Early return if a violation is found, indicating non-palindrome.
📄 Implementing palindrome check method using start and end pointers.
🔄 Handling edge cases for empty or null strings in the palindrome check method.

 */