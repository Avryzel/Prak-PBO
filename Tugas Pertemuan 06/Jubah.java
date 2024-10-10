public class Jubah {
    private String nama;
    private int strength;
    private int health;

    public Jubah(String nama, int strength, int health) {
        this.nama = nama;
        this.strength = strength;
        this.health = health;
    }

    public String getJubah() {
        return this.nama;
    }

    public int getStrength() {
        return  this.strength;
    }

    public int getAddHealth() {
        return this.strength * 10 + this.health;
    }
}
