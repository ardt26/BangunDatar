package BangunDatarRuang.Lingkaran;

public class Tabung extends Lingkaran {
    private double tinggi;

    public Tabung() {
    }

    public Tabung(double diameter, double tinggi) {
        super(diameter);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        super.luas = super.keliling * tinggi + 2 * super.luas;
        return super.luas;
    }

    public double hitungVolume() {
        super.volume = super.luas * tinggi;
        return super.volume;
    }

    public void display() {
        super.hitungLuas();
        super.hitungKeliling();
        System.out.println("2. Lingkaran : ");
        System.out.println("\tLuas dari lingkaran : " + super.luas);
        System.out.println("\tKeliling dari lingkaran : " + super.keliling);
        hitungVolume();
        hitungLuas();
        System.out.println("\ta. Tabung : ");
        System.out.println("\t\tLuas permukaan dari tabung : " + super.luas);
        System.out.println("\t\tVolume dari tabung : " + super.volume);
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
