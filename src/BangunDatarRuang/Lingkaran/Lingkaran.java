package BangunDatarRuang.Lingkaran;

import BangunDatarRuang.BangunDatar;

import static java.lang.Math.*;

public class Lingkaran extends BangunDatar {
    private static double diameter;

    public Lingkaran() {
    }

    public Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double hitungLuas() {
        super.luas = pi * pow(diameter / 2, 2);
        return super.luas;
    }

    @Override
    public double hitungKeliling() {
        super.keliling = pi * diameter;
        return super.keliling;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        Lingkaran.diameter = diameter;
    }
}
