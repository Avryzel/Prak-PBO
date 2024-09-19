public class App {
    public static void main(String[] args) {
        //Membuat objek dari class Karyawan
        Karyawan ridho = new Karyawan("12345", "Ridho");
        Karyawan melan = new Karyawan("123456", "Melan");

        //Membuat objek dari class Dosen
        Dosen andiani = new Dosen("234555", "332211", "Andiani");
        Dosen ionia = new Dosen("23456", "332212", "Ionia");

        ridho.absenPagi();
        ridho.kerja();
        melan.absenPagi();
        melan.kerja();
        ridho.absenPulang();
        melan.absenPulang();

        andiani.absenPagi();
        andiani.ngajar();
        ionia.absenPagi();
        ionia.ngajar();
        ionia.absenPulang();
        andiani.absenPulang();



    }
}