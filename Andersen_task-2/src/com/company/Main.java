package com.company;
import javax.swing.JOptionPane;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String name1;

        name1 = JOptionPane.showInputDialog(null, "Введите имя");
        if (name1 != null && !name1.equals("")) {
            if (Objects.equals(name1, "Вячеслав")) JOptionPane.showMessageDialog(null, "Привет, Вячеслав!");
            else JOptionPane.showMessageDialog(null, "Нет такого имени");
        }
        else JOptionPane.showMessageDialog(null,"Ошибка");
    }
}
