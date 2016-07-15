import java.util.ArrayList;
import java.util.List;

/**
 * Created by helmeter on 6/8/16.
 */
public class JVM {
    public static void main(String[] args) {
        String  str1 = new StringBuilder("计算机").append("eeeee").toString();
        System.out.println(str1.intern() == str1);
    }
}
