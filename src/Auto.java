import javax.swing.*;

public class Auto {
    private String mark;
    private String mudel;
    private int aasta;
    private int labiSoit;
    private double kytust; //liitrites
    private double kytusekulu; // L/100km
    private boolean onKatki = false;

    public Auto(String mark, String mudel, int aasta, int labiSoit, double kytust, double kytusekulu) {
        this.mark = mark;
        this.mudel = mudel;
        this.aasta = aasta;
        this.labiSoit = labiSoit;
        this.kytust = kytust;
        this.kytusekulu = kytusekulu;
    }

    public boolean soida(int km) {
        /*if (onKatki) {
            JOptionPane.showMessageDialog(null, "Auto on katki, ei saa sõita");
            return false;
        }*/
        double kulub = kytusekulu * (km / 100.0);
        if (kulub > kytust) {
            JOptionPane.showMessageDialog(null, "Pole piisavalt kütust!");
            return false;
        }
        labiSoit += km;
        kytust -= kulub;
        double risk = Math.min(0.5, km / 100.0 * 0.15);
        if (Math.random() < risk) {
            onKatki = true;
            JOptionPane.showMessageDialog(null, "Auto läks katki!");
        }
        return true;
    }

    public void tangi(double liitrid) {
        /*if(onKatki) {
            JOptionPane.showMessageDialog(null, "Auto on katki, ei saa tankida");
            return;
        }*/
        if (liitrid <= 0) {
            JOptionPane.showMessageDialog(null,"Kogus peab olema positiivne arv");
            return;
        }
        kytust += liitrid;
        JOptionPane.showMessageDialog(null,"Tangitud " + liitrid + "L.");
    }

    public void remondi() {
        if (!onKatki) {
            JOptionPane.showMessageDialog(null,"Auto on juba terve.");
            return;
        }
        onKatki = false;
        JOptionPane.showMessageDialog(null,"Auto on parandatud.");
    }

    @Override
    public String toString() {
        return "Mark: " + mark +
                ", mudel: " + mudel +
                ", aasta: " + aasta +
                ", läbisõit: " + labiSoit + " km" +
                ", kütust paagis: " + String.format("%.2f", kytust) + " L" +
                ", kütusekulu: " + String.format("%.2f", kytusekulu) + " L/100 km";
    }


    public boolean isOnKatki() {
        return onKatki;
    }

    public double getKytust() {
        return kytust;
    }

    public double getKytusekulu() {
        return kytusekulu;
    }

    public String getMark() {
        return mark;
    }

    public String getMudel() {
        return mudel;
    }

    public int getLabiSoit() {
        return labiSoit;
    }


}