import base.Bse;
import base.Son;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by helmeter on 5/5/16.
 */
public class tt {



    private Son son = new Son("44");
    private Bse bse= new Bse("44");
    String qq;
    @Test
    public void getName(){


        Assert.assertEquals("44",son.GetName(1,"333"));
        System.out.println(qq);
    }

}
