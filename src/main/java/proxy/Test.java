package proxy;

/**
 * Created by helmeter on 4/16/16.
 */
public class Test {

    public static void main(String[] args) {
        // 绑定代理，这种方式会在所有的方法都加上切面方法
      //ITalk iTalk = (ITalk) new DynamicProxy().bind(new PeopleTalk("ww","ww"));
     //iTalk.talk("业务说明");

       PeopleTalk peopleTalk = (PeopleTalk) new CglibProxy().getInstance(new PeopleTalk("ww","www").getClass());
       peopleTalk.talk("业务方法");
       // peopleTalk.spreak("业务方法");
    }
}