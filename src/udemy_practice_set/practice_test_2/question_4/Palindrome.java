package udemy_practice_set.practice_test_2.question_4;

// Given the code:

public class Palindrome {

    static void main(String[] args) {
        System.out.println(args[1]);
    }
}

// And the commands:
//  javac Palindrome.java
//  java Palindrome Wow Mom


// What is the result?
// A. The code compiles, but does not execute ✔
// B. Compilation fails
// C. Palindrome
// D. Mom

// Explanation:
// because wrong declaration for 'main' method
// in 'main' method, keyword 'public' is missing
// if 'main' method is correctly declared, 'Mom' will be the result
// because args[0] is 'Wow' and args[1] is 'Mom'