import BangunDatarRuang.Lingkaran.Bola;
import BangunDatarRuang.Lingkaran.Tabung;
import BangunDatarRuang.PersegiPanjang.Balok;
import BangunDatarRuang.PersegiPanjang.LimasPersegiPanjang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double panjang, lebar, tinggi;
        char pilih, ulang;
        Scanner cin = new Scanner(System.in);

        do {
            System.out.print("Masukkan Panjang : ");
            panjang = cin.nextDouble();
            System.out.print("Masukkan Lebar : ");
            lebar = cin.nextDouble(); // Menjadi diameter di Class Lingkaran dan anak-anaknya
            System.out.print("Masukkan Tinggi : ");
            tinggi = cin.nextDouble();
            System.out.print("Penggunaan Overloading (y/n) : ");
            pilih = cin.next().charAt(0);

            if (pilih == 'y') {
                Balok balok = new Balok(panjang, lebar, tinggi);
                balok.display();
                LimasPersegiPanjang limasPersegiPanjang = new LimasPersegiPanjang(panjang, lebar, tinggi);
                limasPersegiPanjang.display();
                Tabung tabung = new Tabung(lebar, tinggi);
                tabung.display();
                Bola bola = new Bola(lebar);
                bola.display();
            } else if (pilih == 'n') {
                Balok balok = new Balok();
                balok.setPanjang(panjang);
                balok.setLebar(lebar);
                balok.setTinggi(tinggi);
                balok.display();
                LimasPersegiPanjang limasPersegiPanjang = new LimasPersegiPanjang();
                limasPersegiPanjang.display();
                Tabung tabung = new Tabung();
                tabung.setDiameter(lebar);
                tabung.setTinggi(tinggi);
                tabung.display();
                Bola bola = new Bola();
                bola.display();
            } else {
                System.out.println("Maaf, Anda salah input...");
            }
            System.out.print("Ulang lagi (y/n)? ");
            ulang = cin.next().charAt(0);
            System.out.println();
            if (ulang == 'y'){
                System.out.flush();
            }
        } while (ulang == 'y');
    }
}
