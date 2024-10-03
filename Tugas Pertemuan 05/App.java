public class App {
    public static void main(String[] args) {
        //Spider
        Spider spider = new Spider(8);

        spider.eat();

        //Dog
        Dog dog = new Dog(4);

        dog.setName("Budi");
        System.out.println("Nama anjing nya adalah " + dog.getName());

        dog.play();
        dog.eat();
        dog.walk();

        //Cat
        Cat cat = new Cat(4);

        cat.setName("Si Kecil");
        System.out.println("Nama kucing nya adalah " + cat.getName());

        cat.play();
        cat.eat();
        cat.walk();
    }
}