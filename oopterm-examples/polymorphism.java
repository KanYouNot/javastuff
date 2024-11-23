class Animal {
  public void sound() {
    System.out.println("The animal makes a sound");
  }
}

class Cat extends Animal {
  public void sound() {
    System.out.println("MEOW!");
  }
}

class Dog extends Animal {
  public void sound() {
    System.out.println("WOOF!");
  }
}

public class polymorphism {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
	Animal snoop = new Dog();
    Animal mittens = new Cat();
    myAnimal.sound();
    snoop.sound();
    mittens.sound();
  }
}
