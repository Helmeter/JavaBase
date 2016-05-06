package Exception;

import java.io.IOException;

/**
 * Created by helmeter on 4/6/16.
 */
public class exxeption {

    static int quotient(int x, int y) throws MyException { // 定义方法抛出异常
        if (y < 0) { // 判断参数是否小于0
            throw new MyException("除数不能是负数"); // 异常信息
        }
        return x/y; // 返回值
    }
    public static void main(String args[]) { // 主方法
        int  a =3;
        int  b =-1;

        try {
            int result = quotient(a, b); // 调用方法quotient()
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

}
class MyException extends Exception { // 创建自定义异常类
    String message; // 定义String类型变量
    public MyException(String ErrorMessagr) { // 父类方法
        message = ErrorMessagr;
    }

    public String getMessage() { // 覆盖getMessage()方法
        return message;
    }
}
