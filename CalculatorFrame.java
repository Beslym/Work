package geekbrains.lesson_Guess_HomeWork.lesson8;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
    CalculatorFrame() {
        int w = 470, h = 670;
        setTitle("Calculator v.1.0");
        setBounds(100, 100, w, h);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        CalculatorPanel panel = new CalculatorPanel(w,h);
        add(panel);
        setResizable(false);
        setVisible(true);
    }

}