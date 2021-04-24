package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String display = "";

        String size = JOptionPane.showInputDialog("Введите желаемы размер массива");
        int newsize = Integer.parseInt(size);
        JOptionPane.showMessageDialog(null, "Вы ввели " + newsize + ".");

        String array[] = new String[newsize];


        for (int a = 0; a < array.length; a++) {
            array[a] = JOptionPane.showInputDialog("Введите занчение индекса[" + a + "].");
            if (array[a] != null && !array[a].equals("")) {
                int n1 = Integer.parseInt(array[a]);
                if (n1 % 3 == 0) JOptionPane.showMessageDialog(null, "Данное число кратно 3.");
                else JOptionPane.showMessageDialog(null, "Данное число не кратно 3.");

            }

        }

    }
}