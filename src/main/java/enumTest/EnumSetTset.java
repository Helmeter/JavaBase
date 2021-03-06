package enumTest;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/**
 * Created by helmeter on 4/16/16.
 */
public class EnumSetTset {

    enum MyEnum {
        BLACK, WHITE, RED, BLUR, GREEN, YELLOW
    }
    public static void main(String[] args) {
        // 创建一个指定类型的空的集合
        EnumSet<MyEnum> set = EnumSet.noneOf(MyEnum.class);
        set.add(MyEnum.RED);
        set.add(MyEnum.GREEN);
        set.add(MyEnum.BLUR);
        showSet(set);


        // 创建指定类型的所有数据的集合
        EnumSet<MyEnum> set2 = EnumSet.allOf(MyEnum.class);
        showSet(set2);
        // 创建指定类型指定初始数据的集合
        EnumSet<MyEnum> set3 = EnumSet.of(MyEnum.GREEN, MyEnum.RED,
                MyEnum.WHITE);
        showSet(set3);
        // 创建指定类型，指定范围的集合
        // 包含边界数据
        EnumSet<MyEnum> set4 = EnumSet.range(MyEnum.RED, MyEnum.YELLOW);
        showSet(set4);
        // 集合的用法和普通的没有区别
    }

    /**
     *显示Set里面的数据。
     *
     *@paramset
     */
    private static void showSet(Set set) {
        System.out.println(Arrays.toString(set.toArray()));
    }
}



