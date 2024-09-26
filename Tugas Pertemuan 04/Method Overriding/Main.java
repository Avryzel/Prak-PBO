public class Main {
    public static void main(String[] args) {
        //Membuat objek
        Persegi p = new Persegi(3);
        Segitiga s = new Segitiga(4, 4);
        Lingkaran el = new Lingkaran(7);

       System.out.println("Luas Persegi adalah " + p.luas());
       System.out.println("Keliling Persegi adalah " + p.keliling());
       System.out.println();

       System.out.println("Luas Segitiga adalah " + s.luas());
       System.out.println();

       System.out.println("Luas Lingkaran adalah " + el.luas());
       System.out.println("Keliling Lingkaran adalah " + el.keliling());
       System.out.println();
    }
    
}