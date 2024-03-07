package udemy_practice_set.practice_test_2.question_24;

// Given the following code fragment:

public class Test {
    public static void main(String[] args) {
        int a =10, b = 15;
        boolean result = false;
        // line n1
        System.out.println(result);
    }
}

// Which two statements, when inserted at 'line n1' independently, enable the code to print 'true'?

// A. result = a > b;
// B. result = (a !> b)
// C. result = !(a > b) ✔
// D. result = a == b;
// E. result = a != b ✔

// Explanation:

// A. result = a > b;
// a(10) is not greater than b(15), so result = false

// B. result = (a !> b)
// syntax error, !> operator not valid
// might saying that it's 'not greater than', but using wrong way

// C. result = !(a > b) ✔
// a is not greater than b, so result = true

// D. result = a == b;
// it is checking if a is equal to b
// a is not equal to b, so result = false

// E. result = a != b ✔
// a is not equal to b, so result = true