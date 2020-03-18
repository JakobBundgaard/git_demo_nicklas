public class Parent {
    private int age;
    private String name;

    public Parent(){};

    @Override
    public String toString(){
        return this.age + " " + this.name;
    }
}
