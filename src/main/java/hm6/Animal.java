package hm6;

public abstract class Animal {
    protected String name;
    protected int run;
    protected int swim;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }
    abstract void swiming (int swim);
    abstract void runing (int run);
    abstract void names (String name);

    public String getName() {
        return name;
    }
    public int getRun() {
        return run;
    }
    public int getSwim() {
        return swim;
    }

}

