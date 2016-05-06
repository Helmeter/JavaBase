package random;

import java.util.Random;

/**
 * Created by helmeter on 4/18/16.
 */
public class MathTest {
    public static void main(String[] args) {
        Random r2 = new Random(1);
        Random r = new Random(1);
        for(int i=0;i<10;i++) {
            System.out.println(r.nextInt());
        } for(int i=0;i<10;i++) {
            System.out.println(r2.nextInt());
        }
    }



}
