package BangunDatarRuang.Lingkaran;

public class Bola extends Lingkaran {

    public Bola() {
    }

    public Bola(double diameter) {
        super(diameter);
    }

    @Override
    public double hitungLuas() {
        super.luas = 4 * super.luas;
        return super.luas;
    }

    public double hitungVolume() {
        super.volume = (2 * super.luas * getDiameter()) / 3;
        return super.volume;
    }

    public void display() {
        super.hitungLuas();
        hitungVolume();
        hitungLuas();
        System.out.println("\tb. Bola : ");
        System.out.println("\t\tLuas permukaan dari bola : " + super.luas);
        System.out.println("\t\tVolume dari bola : " + super.volume);
    }
}
