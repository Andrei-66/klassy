import javax.swing.*;
import java.awt.event.ActionListener;

class TextInputFrame implements ActionListener {
    private JFrame frame;
    JLabel enter;
    JTextField tf;
    JButton btYes,btNo;
    private String name;
    TextInputFrame(String msg){
        int width=300,height=150;
        frame newJFrame("Окно ввода текста (имени)...");
        frame.setBounds(400,300,width,height);
        frame.setLayout(null);

        enter=new JLabel(msg,JLabel.LEFT);
        enter.setBounds(10,10,width-20,height/6);

        tf=new JTextField(frame.getWidth()-20);
        tf.setBounds(10,enter.getHeight()+5,enter.getWidth(),height/6);

        btYes new JButton("Подтверждаю");
        btYes.setFocusPainted(false);

        btNo new JButton("Завершить");
        btNo.setBounds(width-30/2+18,height/2+10,(width-30)/2,height/6);

        btNo.setFocusPainted(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(enter);
        frame.add(enter);

        frame.add(btYes);



    }
}
