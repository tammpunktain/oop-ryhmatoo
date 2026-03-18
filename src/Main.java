import javax.swing.*;

public class Main {
    public static void main(String[] args){
        String mark = JOptionPane.showInputDialog("Sisesta auto mark: ");
        String mudel = JOptionPane.showInputDialog("Sisesta auto mudel: ");
        int aasta = Integer.parseInt(JOptionPane.showInputDialog("Sisesta auto väljalaskeaasta: "));
        int ls = Integer.parseInt(JOptionPane.showInputDialog("Sisesta oma auto läbisõit: "));
        double kytust = Double.parseDouble(JOptionPane.showInputDialog("Sisesta oma kütusekogus liitrites: "));
        double kytusekulu = Double.parseDouble(JOptionPane.showInputDialog("Sisesta oma kytusekulu 100 km kohta liitrites: "));

        Auto esimene = new Auto(mark, mudel, aasta, ls, kytust, kytusekulu);

        System.out.println("Labisoit enne sõitu on: " + esimene.getLabiSoit());
        System.out.println("kütusekogus enne sõitu on: " + esimene.getKytust());

        Object[] variandid = new String[]{"Sõida", "Tangi", "remondi"};
        Object valitud = JOptionPane.showInputDialog(null,
                "Vali tegevus", "Sisestus",
                JOptionPane.INFORMATION_MESSAGE, null,
                variandid, variandid[0]);

        if (valitud == "Sõida"){
            int soidetud = Integer.parseInt(JOptionPane.showInputDialog("Kui palju sõita soovid?"));
            esimene.soida(soidetud);
        } else System.out.println("vale valik");

        System.out.println("Labisoit parast sõitu on: " + esimene.getLabiSoit());
        System.out.println("Kütusekogus parast sõitu on: " + esimene.getKytust());
    }
}