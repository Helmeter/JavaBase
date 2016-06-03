package classLoad;

/**
 * Created by helmeter on 6/3/16.
 */
public class TestClassLoader {


    public static void main(String[] args) {

        ClassLoader loader = TestClassLoader.class.getClassLoader();
        while (loader!=null){
            System.out.println(loader);
            loader = loader.getParent();
        }
    }
}
