package JAVA.Programmers;
import java.util.*;
public class Ex_120822 {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<my_string.length();i++)
        {
            result.append(my_string.charAt(my_string.length()-1-i));
        }
        return result.toString();
//      return new StringBuilder(myString).reverse().toString();
    }
}
