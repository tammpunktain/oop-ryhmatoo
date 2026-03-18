public class Auto {
    private String mark;
    private String mudel;
    private int aasta;
    private int labiSoit;
    private double kytust; //liitrites
    private double kytusekulu; // L/100km

    public Auto(String mark, String mudel, int aasta, int labiSoit, double kytust, double kytusekulu) {
        this.mark = mark;
        this.mudel = mudel;
        this.aasta = aasta;
        this.labiSoit = labiSoit;
        this.kytust = kytust;
        this.kytusekulu = kytusekulu;
    }

    public void soida(int km){
        labiSoit+=km;
        kytust -= kytusekulu * (km/100.0);
    }


    @Override
    public String toString() {
        return "Auto{" +
                "mark='" + mark + '\'' +
                ", mudel='" + mudel + '\'' +
                ", aasta=" + aasta +
                ", labiSoit=" + labiSoit +
                '}';
    }

    public void setKytust(double kytust) {
        this.kytust = kytust;
    }

    public void setKytusekulu(double kytusekulu) {
        this.kytusekulu = kytusekulu;
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

    public int getAasta() {
        return aasta;
    }

    public int getLabiSoit() {
        return labiSoit;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setMudel(String mudel) {
        this.mudel = mudel;
    }

    public void setAasta(int aasta) {
        this.aasta = aasta;
    }

    public void setLabiSoit(int labiSoit) {
        this.labiSoit = labiSoit;
    }
}
