package udemy_practice_set.practice_test_2.question_25;

// What is the result of compiling and running the following program?

public class Test {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String str3 = str1.concat(str2);
        str1.concat(str2);
        System.out.println(str1);
    }
}

// A. abcdef
// B. def
// C. defabc
// D. abcabc
// E. abc ✔
// F. abcdefdef

// Explanation:
// 'concat' method is called on 'str1' and 'str2', but result is assigned back to 'str1'
// so it will print 'abc'
// if 'System.out.println(str1.concat(str2))', then it will print abcdef