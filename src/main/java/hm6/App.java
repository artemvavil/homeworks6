package hm6;

public class App {
    public static void main (String [] args ) {
        Animal cat = new Cat("Vaska", 100, 200);
        cat.names("Vaska");
        cat.runing(25);
        cat.swiming(500);

        Animal dog = new Dog("Bobik", 50, 20);
        dog.names("Rob");
        dog.swiming(200);
        dog.runing(300);
    }
}
