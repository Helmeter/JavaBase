package interfaces;

//用接口实现多重继承,
//由于父类已经有fight()所以子类可以不用声明

interface CanFight {
  void fight();
}

interface CanSwim {
  void swim();
}

interface CanFly {
  void fly();
}

class ActionCharacter {
  public void fight() {
    System.out.println("father's fight");
  }
}	

class Hero extends ActionCharacter
    implements CanFight, CanSwim, CanFly {
  public void swim() {
    System.out.println("son's swim");
  }
  public void fly() {
    System.out.println("son's fly");
  }
}

public class Adventure {
  public static void t(CanFight x) { x.fight(); }
  public static void u(CanSwim x) { x.swim(); }
  public static void v(CanFly x) { x.fly(); }
  //public static void w(ActionCharacter x) { x.fight(); }
  public static void main(String[] args) {
    Hero h = new Hero();
    t(h); // Treat it as a CanFight
    u(h); // Treat it as a CanSwim
    v(h); // Treat it as a CanFly
  //  w(h); // Treat it as an ActionCharacter
  }
} ///:~
