package reusing;//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.

/*初始化的实际过程是:
1.经分配给对象的存储空间初始化成二进制的零
2.调用基类的构造器
3.按照子类声明调用成员的初始化方法
4.调用子类的构造方法


 */
import static net.mindview.util.Print.*;

class Glyph {
  void draw() { print("Glyph.draw()"); }
  Glyph() {
    print("Glyph() before draw()");
    draw();
    print("Glyph() after draw()");
  }
}	

class RoundGlyph extends Glyph {
  private int radius = 1;
  RoundGlyph(int r) {
    radius = r;
    print("RoundGlyph.RoundGlyph(), radius = " + radius);
  }
  void draw() {
    print("RoundGlyph.draw(), radius = " + radius);
  }
}	

public class PolyConstructors {
  public static void main(String[] args) {
    new RoundGlyph(5);
  }
} /* Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
*///:~
