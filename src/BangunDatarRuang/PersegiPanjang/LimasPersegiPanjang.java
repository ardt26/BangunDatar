package BangunDatarRuang.PersegiPanjang;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class LimasPersegiPanjang extends PersegiPanjang {
    private static double sisiMiringPanjang, sisiMiringLebar, tinggi;

    public LimasPersegiPanjang() {
    }

    public LimasPersegiPanjang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public void hitungSisiMiringLebar() {
        sisiMiringLebar = sqrt(pow((getLebar() / 2), 2) + pow(tinggi, 2));
    }

    public void hitungSisiMiringPanjang() {
        sisiMiringPanjang = sqrt(pow((getPanjang() / 2), 2) + pow(tinggi, 2));
    }

    @Override
    public double hitungLuas() {
        super.hitungLuas();
        hitungSisiMiringLebar();
        hitungSisiMiringPanjang();
        super.luas = super.luas + ((getLebar() * sisiMiringLebar) + (getPanjang() * sisiMiringPanjang));
        return super.luas;
    }

    public double hitungVolume() {
        super.volume = (super.luas * tinggi) / 3;
        return super.volume;
    }

    public void display() {
        super.hitungLuas();
        hitungVolume();
        hitungLuas();
        System.out.println("\tb. Limas Persegi Panjang : ");
        System.out.println("\t\tLuas permukaan dari limas persegi panjang : " + super.luas);
        System.out.println("\t\tVolume dari limas persegi panjang : " + super.volume);
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }
}
