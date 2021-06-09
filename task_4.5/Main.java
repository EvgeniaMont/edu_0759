/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать
метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать
метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args) {
      Horse horse1 = new Horse("Игого", true, "brown");
      horse1.run();
      Pegasus pegasus1 = new Pegasus("Игого", false, "silver");
      pegasus1.fly();
    }
}
abstract class Animal {
String speak;
boolean real;
String colour;
public Animal (String speak, boolean real, String colour) {
    this.speak = speak;
    this.real = real;
    this.colour = colour;
}
}
class Horse extends Animal {
    public Horse(String speak, boolean real, String colour) {
        super(speak, real, colour);
    }
    public void run() {
        System.out.println("Игого, я поскакал(а)");
    }
}
class Pegasus extends Animal {
    public Pegasus(String speak, boolean real, String colour) {
        super(speak, real, colour);
    }
    public void fly() {
        System.out.println("Игого, я полетел(а)");
    }
}