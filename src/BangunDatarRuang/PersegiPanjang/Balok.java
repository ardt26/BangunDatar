package BangunDatarRuang.PersegiPanjang;

public class Balok extends PersegiPanjang {
    private double tinggi;

    public Balok() {
    }

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        super.luas = (2 * super.luas + super.keliling * tinggi);
        return super.luas;
    }

    public double hitungVolume() {
        super.volume = super.luas * tinggi;
        return super.volume;
    }

    public void display() {
        super.hitungLuas();
        super.hitungKeliling();
        System.out.println("1. Persegi Panjang : ");
        System.out.println("\tLuas dari persegi panjang : " + super.luas);
        System.out.println("\tKeliling dari persegi panjang : " + super.keliling);
        hitungVolume();
        hitungLuas();
        System.out.println("\ta. Balok : ");
        System.out.println("\t\tLuas permukaan dari balok : " + super.luas);
        System.out.println("\t\tVolume dari balok : " + super.volume);
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
