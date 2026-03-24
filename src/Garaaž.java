import java.util.ArrayList;

public class Garaaž {
    private ArrayList<Auto> autod;
    private String nimi;

    public Garaaž(String nimi) {
        this.nimi = nimi;
        this.autod = new ArrayList<>();
    }

    public void lisaAuto(Auto auto) {
        autod.add(auto);
        System.out.println("Auto " + auto.getMark() + " " + auto.getMudel() + " lisati garaaži: "+nimi+" .");
    }

    public void kuvaNimekiri() {
        if (autod.isEmpty()) {
            System.out.println("Garaaz on tühi.");
            return;
        }
        for (int i = 0; i < autod.size(); i++) {
            System.out.println((i + 1) + ". " + autod.get(i));
        }
    }

    public Auto valiAuto(int indeks) {
        if (indeks >= 1 && indeks <= autod.size()) {
            return autod.get(indeks - 1);
        }
        System.out.println("Vale indeks");
        return null;
    }

    public int getAutodeArv() {
        return autod.size();
    }

    public String getNimi() {
        return nimi;
    }
}