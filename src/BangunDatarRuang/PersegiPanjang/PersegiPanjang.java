package BangunDatarRuang.PersegiPanjang;

import BangunDatarRuang.BangunDatar;

public class PersegiPanjang extends BangunDatar {
    private static double panjang, lebar;

    public PersegiPanjang() {
    }

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        super.luas = panjang * lebar;
        return super.luas;
    }

    @Override
    public double hitungKeliling() {
        super.keliling = 2 * (panjang + lebar);
        return super.keliling;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setPanjang(double panjang) {
        PersegiPanjang.panjang = panjang;
    }

    public void setLebar(double lebar) {
        PersegiPanjang.lebar = lebar;
    }
}
