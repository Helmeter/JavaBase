package base;

/**
 * Created by helmeter on 5/5/16.
 */
public class Son extends Bse {
    public Son(String name) {
        super(name);
    }

    @Override
    public String GetName(int i, String m) {
        return super.GetName(1,"444");
    }
}
