package hm6;

public class Cat extends Animal {
    public Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    void swiming (int swim) {
        System.out.println( "Cats is not swim");
    }

    @Override
    void runing (int run) {
        if ( run <=200 & run > 0){
            System.out.println ("Cat run distance"+ run+ "м.");
        } else {
            System.out.println(" Cat's max distance run 200m ");
        }
    }
    @Override
    void names (String name) {
        System.out.println(name);

    }

}

