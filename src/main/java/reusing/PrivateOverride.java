//: polymorphism/PrivateOverride.java
// Trying to override a private method.
package reusing;
import static net.mindview.util.Print.*;
//private 方法默认是final类型的,所以向上转型时,不可覆盖
public class PrivateOverride {
  private void f() { print("private f()"); }
  public static void main(String[] args) {
    PrivateOverride po = new Derived();
    po.f();
  }
}

class Derived extends PrivateOverride {
  public void f() { print("public f()"); }

  public void d(){}
} /* Output:
private f()
*///:~
