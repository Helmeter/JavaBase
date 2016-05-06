package proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by helmeter on 4/16/16.
 */
public class CglibProxy implements MethodInterceptor {

    //private Object target;

    /**
     * 创建代理对象
     *
     * @param target
     * @return
     */
    private Enhancer enhancer = new Enhancer();
    public Object getInstance(Class target) {
       // this.target = target;

        enhancer.setSuperclass(target);
        // 回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        System.out.println("事物开始");
        result = methodProxy.invokeSuper(o, objects);
        System.out.println("事物结束");
        return result;
    }
}
