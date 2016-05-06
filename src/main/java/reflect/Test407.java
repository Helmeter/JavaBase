package reflect;

import java.util.Random;

/**
 * Created by helmeter on 4/7/16.
 */
public class Test407 {


    public static void main(String[] args) {
        Random   r = new Random();
        Integer j = new Integer(0);
        Integer i = new Integer(0);
        //false 比较的是对象的引用
        System.out.println(i==j);
        //true
        /* public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    }*/

    System.out.println(i.equals(j));
        i++;
        ++j;

        //true 比较的是拆箱后的值
        System.out.println(i==j);


        System.out.println( r.nextInt(10));

        long l = 010L;
        System.out.println(l);
        long jj = 0X123;
        System.out.println(Long.toBinaryString(l));


       // float dd = 1.89e-17f;
        /*
        实现同步
         private static Random randomNumberGenerator;

    private static synchronized Random initRNG() {
        Random rnd = randomNumberGenerator;
        return (rnd == null) ? (randomNumberGenerator = new Random()) : rnd;
    }
         */
        Double dd = Math.pow(10,2);
        System.out.println(dd);

        Integer oo = Integer.MAX_VALUE;
        byte a = 'c';
        System.out.println(Integer.toBinaryString(a>>5));

        System.out.println(Math.round(10.9));
    }
}
