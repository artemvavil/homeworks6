package hm6;
public class Dog extends Animal {
    public Dog(String name, int run, int swim) {
        super(name, run, swim);
    }


    @Override
    void swiming (int swim) {
        if (swim<=10 & swim>0) {
            System.out.println("Dog run distance"+swim+ "м." );
        } else {
            System.out.println(" Dog's max distance swim 10m ");
        }
    }

    @Override
    void runing (int run) {
        if ( run <= 500 & run >0) {
            System.out.println( "Dog run distance"+ run+ "м." );
        }else {
            System.out.println( "Dog's max distance swim 500m" );
        }
    }

    @Override
    void names (String name) {
        System.out.println( name);

    }
}



