package udemy_practice_set.practice_test_2.question_22;

// Given the following code:

public class Boot {
    
    static String s;

    static {
        s = "";
    }

    {
        System.out.print("shinier ");
    }

    static {
        System.out.print(s.concat("better "));
    }

    Boot() {
        System.out.print(s.concat("bigger "));
    }

    public static void main(String[] args) {
        new Boot();
        System.out.println("boot");
    }

}

// What is the result?
// A. better bigger boot
// B. bigger shinier better boot
// C. better shinier bigger boot ✔
// D. An ExceptionInitializationError is thrown at runtime
// E. shinier better bigger boot
// F. better bigger shinier boot
// G. A NullPointerException is thrown at runtime

// Explanation:

// static variable s is initialize to empty string 