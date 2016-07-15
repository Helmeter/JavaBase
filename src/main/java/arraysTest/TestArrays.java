package arraysTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by helmeter on 7/2/16.
 */
public class TestArrays {

    public static void main(String[] args) {
        int[] testString = {3, 4, 1, 2, 5, 10};
        //1,2,3,4,5,10
        Arrays.sort(testString);
        int k = Arrays.binarySearch(testString, 0, 5, 3);

        System.out.println(k);
        String[] names = {"Liz", "John", "Eric", "Alan"};
//只排序前两个
//[John, Liz, Eric, Alan]
        Arrays.sort(names, 0, 2);
//全部排序
//[Alan, Eric, John, Liz]
        Arrays.sort(names,
//                String.CASE_INSENSITIVE_ORDER
                Collections.reverseOrder()
//                new Comparator<String>() {
//            public int compare(String o1, String o2) {
//             return   o1.compareTo(o2);
//
//            }
//        }
        );
        String[] copy = Arrays.copyOfRange(names, 1, 3);

        System.out.println(Arrays.toString(names));

        int[][] stuGrades = {{80, 81, 82}, {84, 85, 86}, {87, 88, 89}};

        System.out.println(Arrays.deepToString(stuGrades));


        String[] names1 = { "Eric", "John", "Alan", "Liz" };

        String[] names2 = { "Eric", "John","Liz","Alan" };

        System.out.println(Arrays.equals(names1, names2));

    }
}
