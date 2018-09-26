import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Vivod_pokazanyi extends JFrame implements ActionListener  {
    Container contantPane=getContentPane();
    JPanel pnl=new JPanel();
    JPanel grid=new JPanel(new GridLayout(2,2));
    JButton btn1=new JButton("Внести покзания");
    JButton btn2=new JButton("Вывести показания");
    JLabel lbl1=new JLabel();

    String[] month={"январь","февраль","март","апрель","май","июнь","июль",
            "август","сентябрь","октябрь","ноябрь","декабрь"};
    String[] years={"2011","2012","2013","2014","2015", "2016", "2017"};
    JCheckBox mchk1=new JCheckBox(month[0]);
    JCheckBox mchk2=new JCheckBox(month[1]);
    JCheckBox mchk3=new JCheckBox(month[2]);
    JCheckBox mchk4=new JCheckBox(month[3]);
    JCheckBox mchk5=new JCheckBox(month[4]);
    JCheckBox mchk6=new JCheckBox(month[5]);
    JCheckBox mchk7=new JCheckBox(month[6]);
    JCheckBox mchk8=new JCheckBox(month[7]);
    JCheckBox mchk9=new JCheckBox(month[8]);
    JCheckBox mchk10=new JCheckBox(month[9]);
    JCheckBox mchk11=new JCheckBox(month[10]);
    JCheckBox mchk12=new JCheckBox(month[11]);

    JCheckBox ychk1=new JCheckBox(years[0]);
    JCheckBox ychk2=new JCheckBox(years[0]);
    JCheckBox ychk3=new JCheckBox(years[2]);
    JCheckBox ychk4=new JCheckBox(years[3]);

    JComboBox<String> box1=new JComboBox<String>(month);
    JComboBox<String> box2=new JComboBox<String>(years);




    Vivod_pokazanyi(){
        super("Окно Swing");
        setSize(700,200);
        pnl.add(new Label(" Показания счетчика"));

        grid.add( btn1);
        grid.add(box1);
        grid.add(btn1);
        grid.add(box2);
        grid.add(btn2);

        contantPane.add("North",pnl);
        contantPane.add("Center", grid);
        contantPane.add("South",lbl1 );

        setVisible(true);



    }

    public void actionPerformed(ActionEvent event){

        String file="E:\\data\\data.txt";

        if(event.getSource()==btn1){
            try{
                String line="";
                FileReader data=new FileReader(file);
                BufferedReader buffer=new BufferedReader(data);

                while ((line=buffer.readLine())!=null){

                }
                buffer.close();
            }

            catch (IOException e){
                System.out.println("Ошибка чтения.");

            }

        }

        if(event.getSource()==btn1){
            String   line2=(String)box1.getSelectedItem();
            String line3=(String)box2.getSelectedItem();
            String line_sum=line2+" "+line3;
            System.out.println(line_sum);

            try{
                String line="";
                FileReader data=new FileReader(file);
                BufferedReader buffer=new BufferedReader(data);

                while ((line=buffer.readLine())!=null){
                    String substr_line="";
                    if(line.startsWith(line_sum)==true){

                        lbl1.setText("Показания за "+line);
                        System.out.println(line);
                    }

                }
                buffer.close();
            }

            catch (IOException e){
                System.out.println("Ошибка чтения.");

            }


        }
    }

    public static void main(String[] args) {

        Vivod_pokazanyi gui=new Vivod_pokazanyi();



    }
}
