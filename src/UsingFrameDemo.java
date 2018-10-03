import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Класс для реализации окна ввода текста
class TextInputFrame implements ActionListener{
    //Cсылка на обьект окна
    private JFrame frame;
    //ccылка на текстовую метку
    JLabel enter;
    JTextField tf;
    JButton btYes, btNo;
    private String name;

    //Конструктор класса

    TextInputFrame(String msg){
        int height=300, width=150;
        //Создание окна
        frame=new JFrame("Окно для ввода текста(имени): ");
        frame.setBounds(400,300,width,height);

    }

public class UsingFrameDemo {
    public static void main(String[] args) {
        TextInputFrame.show("Как Ваше имя? Введите имя : ");
    }
}
}
