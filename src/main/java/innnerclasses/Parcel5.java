package innnerclasses;
//局部内部类,内部类可以实现接口,但是只能实现一个接口,内部类中不能有静态数据和字段
public class Parcel5 {
  public Destination destination(String s) {
    class PDestination implements Destination {
      private String label;
      private PDestination(String whereTo) {
        label = whereTo;
      }
      public String readLabel() { return label; }
    }
    return new PDestination(s);
  }
  public static void main(String[] args) {
    Parcel5 p = new Parcel5();
    Destination d = p.destination("Tasmania");
    System.out.println(d.readLabel());
  }
} ///:~
