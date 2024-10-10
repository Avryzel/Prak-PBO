public class Senjata {
    private String nama;
    private int attack;

    public Senjata(String nama, int attack) {
        this.nama = nama;
        this.attack = attack;
    }

    public String getSenjata() {
        return this.nama;
    }

    public int getAttack() {
        return this.attack;
    }
}