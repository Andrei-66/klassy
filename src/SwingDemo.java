import javax.swing.*;

public class SwingDemo {

    SwingDemo(){
    JFrame jfrm=new JFrame("A simple swing application");
    jfrm.setSize(275,100);
    jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JLabel jlab=new JLabel("Swing define the moden JAVA GUI.");
    //Добавить метку в панекль содрежимого
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }

}
