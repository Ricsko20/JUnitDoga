import java.lang.reflect.Array;
import java.util.ArrayList;

public class Functions {
    public int dividersNumber(int num) {
        int count = 0;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public int maxOfThree(int a, int b, int c) {
        if(a > b && a > c) {
            return a;
        }
        if(b > a && b > c) {
            return b;
        }
        if(c > a && c > b) {
            return c;
        }
        return 0;
    }

    public Object fizzBuzz(int n) {
        if(n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        if(n % 3 == 0 && n % 5 != 0) {
            return "Fizz";
        }
        if(n % 3 != 0 && n % 5 == 0) {
            return "Buzz";
        }
        return 0;
    }

    public boolean isVowel(char d) {
        char lowerD = Character.toLowerCase(d);
        return lowerD == 'a' || lowerD == 'e' || lowerD == 'i' || lowerD == 'o' || lowerD == 'u';
    }
}
