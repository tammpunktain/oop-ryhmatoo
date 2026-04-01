import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //Garaazi loomine
        String nimi = JOptionPane.showInputDialog("Sisesta oma garaazi nimi: ");
        Garaaž garaaz = new Garaaž(nimi);


        while (true) {

            //Uldvalikud
            Object[] variandid = new String[]{"Lisa garaaži auto","Kuva garaažis olevad autod", "Vali garaažist auto"};
            Object valitud = JOptionPane.showInputDialog(null,
                    "Vali tegevus", "Sisestus",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    variandid, variandid[0]);
            if (valitud == null) break;

            //tegevused
            if (valitud.equals("Lisa garaaži auto")){
                String mark = JOptionPane.showInputDialog("Sisesta auto mark: ");
                String mudel = JOptionPane.showInputDialog("Sisesta auto mudel: ");
                int aasta = Integer.parseInt(JOptionPane.showInputDialog("Sisesta auto väljalaskeaasta: "));
                int ls = Integer.parseInt(JOptionPane.showInputDialog("Sisesta oma auto läbisõit: "));
                double kytust = Double.parseDouble(JOptionPane.showInputDialog("Sisesta, kui palju on sul kütust paagis liitrites: "));
                double kytusekulu = Double.parseDouble(JOptionPane.showInputDialog("Sisesta oma kytusekulu 100 km kohta liitrites: "));
                Auto auto = new Auto(mark, mudel, aasta, ls, kytust, kytusekulu);
                garaaz.lisaAuto(auto);
            } else if (valitud.equals("Vali garaažist auto")) {
                int indeks = Integer.parseInt(JOptionPane.showInputDialog("Sisesta auto järjekorranumber"));
                Auto valitudAuto = garaaz.valiAuto(indeks);
                tegevusedAutoga(valitudAuto);
            } else {
                garaaz.kuvaNimekiri();
            }

        }
    }



    public static void tegevusedAutoga(Auto auto){
        if(auto==null) return;
        Object[] variandid = new String[]{"Sõida", "Tangi", "Remondi","Tagasi"};

        while(true){
            String olek=auto.isOnKatki() ? "KATKI!!!": "Korras";//Kas autoga saab sõita, või vajab parandust
            Object valitud = JOptionPane.showInputDialog(null,
                    "Mark: "+auto.getMark()+
                            "\nMudel "+auto.getMudel()+
                            "\nOlek: " + olek +
                            "\nLäbisõit: " + auto.getLabiSoit() + " km" + "" +
                            "\nKütust: " + String.format("%.2f", auto.getKytust()) + " L",
                    "Auto tegevused",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    variandid, variandid[0]);

            if (valitud == null || "Tagasi".equals(valitud)) return;

            if (valitud.equals("Sõida")) {
                int soidetud = Integer.parseInt(JOptionPane.showInputDialog("Kui palju sõita soovid?"));
                auto.soida(soidetud);
            }else if (valitud.equals("Tangi")){
                double liitrid = Double.parseDouble(JOptionPane.showInputDialog("Mitu liitrit?"));
                auto.tangi(liitrid);
            } else if (valitud.equals("Remondi")) {
                auto.remondi();
        }
    }
}
}