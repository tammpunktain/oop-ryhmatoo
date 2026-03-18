import javax.swing.*;

public class Main {
    public static void main(String[] args){
        String mark = JOptionPane.showInputDialog("Sisesta auto mark: ");
        String mudel = JOptionPane.showInputDialog("Sisesta auto mudel: ");
        int aasta = Integer.parseInt(JOptionPane.showInputDialog("Sisesta auto väljalaskeaasta: "));
        int ls = Integer.parseInt(JOptionPane.showInputDialog("Sisesta oma auto läbisõit: "));

        Auto esimene = new Auto(mark, mudel, aasta, ls);


        Object[] variandid = new String[]{"Sõida", "Tangi", "remondi"};
        Object valitud = JOptionPane.showInputDialog(null,
                "Vali tegevus", "Sisestus",
                JOptionPane.INFORMATION_MESSAGE, null,
                variandid, variandid[0]);
        System.out.println("Labisoit enne soitu" + esimene.getLabiSoit());;
        if (valitud == "Sõida"){
            esimene.soida(10000);
        } else System.out.println("vale valik");
        System.out.println("Labisoit parast soitu" + esimene.getLabiSoit());
    }
}