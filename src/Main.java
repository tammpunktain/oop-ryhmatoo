import javax.swing.*;

public class Main {
    public static void main(String[] args){
        String mark = JOptionPane.showInputDialog("Sisesta auto mark: ");
        String mudel = JOptionPane.showInputDialog("Sisesta auto mudel: ");
        int aasta = Integer.parseInt(JOptionPane.showInputDialog("Sisesta auto väljalaskeaasta: "));
        int ls = Integer.parseInt(JOptionPane.showInputDialog("Sisesta oma auto läbisõit: "));

        Auto esimene = new Auto(mark, mudel, aasta, ls);
        System.out.println(esimene.getAasta());;

    }
}