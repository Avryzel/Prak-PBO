public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Budi", 19, "Jatinegara");
        person1.displayInfo();

        // Ubah nilai atribut menggunakan setter
        person1.setName("Avryzel");
        person1.setAge(19);

        // Tampilkan kembali informasi
        System.out.println("Updated Information:");
        person1.displayInfo();
    }
}
