package com.company;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        String number1;

        number1 = JOptionPane.showInputDialog(null, "Введите число");
        if (number1 != null && !number1.equals("")) {
            double n1 = Double.parseDouble(number1);
            if (n1 > 7) JOptionPane.showMessageDialog(null,"Привет!");
            else JOptionPane.showMessageDialog(null,"Не могу говорить...");
        }
        else JOptionPane.showMessageDialog(null,"Ошибка!");
    }
}