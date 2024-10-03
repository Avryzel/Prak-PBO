public class Dog extends Animal implements Pet {
    private String name;

    public Dog(int legs) {
        super(4);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void play(){
        System.out.println("Bermain tangkap stik kayu");
    }

    @Override
    public void eat() {
        System.out.println("makan daging");
    }

    @Override
    public void walk() {
        System.out.println("jalan bersama tuannya");
    }
}
