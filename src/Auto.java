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
        if(onKatki){
            System.out.println("Auto on katki, ei saa sõita");
            return false;
        }
        double kulub=kytusekulu * (km / 100.0);
        if(kulub>kytust){
            System.out.println("Pole piisavalt kütust");
            return false;
        }
        labiSoit += km;
        kytust-=kulub;
        double risk=(km/100.0*0.15);
        if(Math.random()<risk){
            onKatki=true;
            System.out.println("Auto läks katki");
        }
        return true;
    }
    public void tangi(double liitrid){
        if(liitrid<=0){
            System.out.println("Kogus peab olema positiivne arv");
            return;
        }
        kytust+=liitrid;
        System.out.println("Tangitud "+liitrid+"L.");
    }
    public void remondi(){
        if(!onKatki){
            System.out.println("Auto on juba terve.");
            return;
        }
        onKatki=false;
        System.out.println("Auto on parandatud.");
    }

    @Override
    public String toString() {
        return mark+", mudel= '" + mudel +
                "', aasta=" + aasta +
                ", labisoit=" + labiSoit +" km"+
                ", kytust paagis=" + kytust +" L"+
                ", kytusekulu= " + kytusekulu +" L/100km";
    }

    public void setKytust(double kytust) {
        this.kytust = kytust;
    }

    public boolean isOnKatki(){
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