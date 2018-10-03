import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Vivod_pokazanyi extends JFrame implements ActionListener
{


    Container contantPane=getContentPane();

    JPanel pnl=new JPanel();

    JPanel grid=new JPanel(new GridLayout(6,3));
    JTextField field=new JTextField(12);
    JButton btn1=new JButton("Сохранить показания");
    JButton btn2=new JButton("Вывести показания");
    JLabel lbl=new JLabel("Выберете дату для  внесения показаний");
    JLabel lbl_1=new JLabel(" Выберете дату показаний для вывода");
    JLabel lbl1=new JLabel();
    JLabel lbl_2=new JLabel("Введите показания счетчика");
    JLabel lbl_3=new JLabel(" Нажмите \"вывести\" для просмотра ");
    Font font=new Font("Serif",Font.BOLD,24);
    Font font1=new Font("Serif",Font.ITALIC,22);


    String[] month={"январь","февраль","март","апрель","май","июнь","июль",
            "август","сентябрь","октябрь","ноябрь","декабрь"};
    String[] years={"2011","2012","2013","2014","2015", "2016", "2017"};

    String[] month1={"январь","февраль","март","апрель","май","июнь","июль",
            "август","сентябрь","октябрь","ноябрь","декабрь"};
    String[] years1={"2011","2012","2013","2014","2015", "2016", "2017"};


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
    JCheckBox ychk2=new JCheckBox(years[1]);
    JCheckBox ychk3=new JCheckBox(years[2]);
    JCheckBox ychk4=new JCheckBox(years[3]);

    JComboBox<String> box1=new JComboBox<String>(month);
    JComboBox<String> box2=new JComboBox<String>(years);

    JCheckBox mchk13=new JCheckBox(month1[0]);
    JCheckBox mchk14=new JCheckBox(month1[1]);
    JCheckBox mchk15=new JCheckBox(month1[2]);
    JCheckBox mchk16=new JCheckBox(month1[3]);
    JCheckBox mchk17=new JCheckBox(month1[4]);
    JCheckBox mchk18=new JCheckBox(month1[5]);
    JCheckBox mchk19=new JCheckBox(month1[6]);
    JCheckBox mchk20=new JCheckBox(month1[7]);
    JCheckBox mchk21=new JCheckBox(month1[8]);
    JCheckBox mchk22=new JCheckBox(month1[9]);
    JCheckBox mchk23=new JCheckBox(month1[10]);
    JCheckBox mchk24=new JCheckBox(month1[11]);

    JCheckBox ychk5=new JCheckBox(years1[0]);
    JCheckBox ychk6=new JCheckBox(years1[1]);
    JCheckBox ychk7=new JCheckBox(years1[2]);
    JCheckBox ychk8=new JCheckBox(years1[3]);

    JComboBox<String> box3=new JComboBox<String>(month1);
    JComboBox<String> box4=new JComboBox<String>(years1);


    Vivod_pokazanyi(){
        super("Окно Swing");
        setSize(1000,500);

        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setFont(font);

        lbl_1.setHorizontalAlignment(JLabel.CENTER);
        lbl_1.setFont(font1);

        lbl1.setHorizontalAlignment(JLabel.CENTER);
        lbl1.setFont(font1);

        lbl_2.setHorizontalAlignment(JLabel.CENTER);
        lbl_2.setFont(font);

        lbl_3.setHorizontalAlignment(JLabel.CENTER);
        lbl_3.setFont(font1);

        box1.setAlignmentX(CENTER_ALIGNMENT);
        lbl.setOpaque(true);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);

        pnl.add(lbl);
        pnl.add(lbl_1);
        pnl.add(lbl_2);
        pnl.add(lbl_3);

        pnl.add(lbl1);
        pnl.add(field);

        pnl.add(btn1);
        pnl.add(btn2);

        pnl.add(box2);
        pnl.add(box3);
        pnl.add(box4);

        grid.add(lbl);
        grid.add(lbl_2);

        grid.add(box1);
        grid.add(field);
        grid.add(box2);
        grid.add(btn1);

        grid.add(lbl_1);
        grid.add(lbl_3);
        grid.add(box3);
        grid.add(btn2);


        grid.add(box4);

        grid.add(lbl1);


        contantPane.add(grid);




        setVisible(true);

    }

    public void actionPerformed(ActionEvent event){

        String file="E:\\data\\data.txt";
        String   line2=(String)box1.getSelectedItem();//Выбор месяца
        String line3=(String)box2.getSelectedItem();//Выбор года
        String line1=(String)field.getText();       //строка вводимая пользователем
        String line_sum=(String)"\n"+line2+" "+line3+" "+" - "+line1;//строка месяц, год, показания


        if(event.getSource()==btn1){
            int dlina_stroki=field.getText().length();

            if(dlina_stroki<1)
            {JOptionPane.showMessageDialog(null,"Введите показания счетчика!"); }

            else{

                try {
                    FileWriter fileW = new FileWriter(file, true);
                    BufferedWriter bufferW = new BufferedWriter(fileW);
                    bufferW.write(line_sum);
                    bufferW.close();
                }
                catch (IOException e) {
                    System.out.println("ошибка записи файла!");

                }

            }

        }

        if(event.getSource()==btn2){

        System.out.println(line_sum);}

        try {
            String line = "";
            FileReader data = new FileReader(file);
            BufferedReader buffer = new BufferedReader(data);

            while ((line = buffer.readLine()) != null) {
                String substr_line = "";
                String line4 = (String) box3.getSelectedItem();
                String line5 = (String) box4.getSelectedItem();
                String line_sum1 = line4 + " " + line5;

                if (line.startsWith(line_sum1) == true) {

                    lbl1.setText("Показания за : " + " " + line);
                    System.out.println(line);
                }

            }
            buffer.close();
        }
        catch (IOException e) {
            System.out.println("Ошибка чтения.");

        }
    }





    public static void main(String[] args) {

        Vivod_pokazanyi gui=new Vivod_pokazanyi();

    }
}
