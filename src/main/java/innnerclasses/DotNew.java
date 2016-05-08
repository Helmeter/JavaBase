package innnerclasses;
//告知某些其他类,去某个内部类对象,用 .new

public class DotNew {
  public class Inner {
    private int x=10;

    public int getX() {
      return x;
    }
  }
  public static void main(String[] args) {
    DotNew dn = new DotNew();
    Inner dni = dn.new Inner();

    System.out.println(dni.getX());
  }
} ///:~
