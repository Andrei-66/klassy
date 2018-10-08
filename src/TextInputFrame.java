import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class TextInputFrame implements ActionListener {
    private JFrame frame;
    JLabel enter;
    JTextField tf;
    JButton btYes,btNo;
    private String name;
    TextInputFrame(String msg){
        int width=300,height=150;
        frame=new JFrame("Окно ввода текста (имени)...");
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
        frame.add(btNo);

        frame.setResizable(false);

        btYes.addActionListener(this);
        btNo.addActionListener(this);

        frame.setVisible(true);

        public void ActionPerformed(ActionEvent ae){
            String btName=ae.getActionCommand();
            if(btName.equalsIgnoreCase(btYes.getText())){
                //Заполнение текствого поля класса
                name=tf.getText();
                //Окно с текстовым полем убирается с экрана
                frame.setVisible(false);
                IntInputFrame.show("сколько вам лет?");
            }

            else System.exit();
        }

        static void show(String txt){
            new TextInputFrame(txt);
        }


        //Класс  реализации окна для ввода целого числа
        class IntInputFrame implements ActionListener,KeyListener{
            //Ссылка на обьект окна
            private JFrame frame;
            private JLabel enter;
            private JTextField tf;
            private String name;
            private int age;
            //Конструктор класса
            IntInputFrame(String msg,String name){
                //значение текствого поля
                this.name=new String(name);
                int width=300,height=150;
                frame=new JFrame("Окно для ввода возраста");
                frame.setBounds(400,300,width,height);
                frame.setLayout(null);
                enter=new JLabel(msg,JLabel.LEFT);
                enter.setBounds(10,10,width-20,height/6);
                tf=new JTextField(frame.getWidth()-20);
                //Положение и разьер текстового поля ввода
                tf.setBounds(10,enter.getHeight()+5,enter.getWidth(),height/6);

                //ПОЛОЖЕНИЕ И РАЗМЕР КНОПКИ
                btYes=new JButton("Подтвеждаю");
                btYes.setBounds(10,height/2+10,(width-30)/2,height/6);
                //Отмена режима отображения рамки фокуса в кнопке
                btYes.setFocusPainted(false);
                btNo=new JButton("Завершить");
                btNo.setBounds((width-30)/2+18,height/2+10,(width-30)/2,height/6);
                btNo.setFocusPainted(false);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                //Добавление в окно текстовой метки
                frame.add(enter);
                frame.add(tf);
                frame.add(btYes);
                frame.add(btNo);
                frame.setResizable(false);
                //Регистрация щелчка в кнопке отметы
                btYes.addActionListener(this);
                btNo.addActionListener(this);

                //Отображение окна
                frame.setVisible(true);




            }

            public void ActionPerformed(ActionEvent ae){
                //Считывание текста нажатой кнщпки
                String btName=ae.getActionCommand();
                if(btName.equalsIgnoreCase(btYes.getText())){
                    name=tf.getText();
                    //Окно с текстовым полем убирается с экрана
                    frame.setVisible(false);
                    IntInputFrame.show("Сколько Вам лет?");
                }
                else System.exit(0);
            }

            //Метод отображения окна
            static void show(String txt){
                //Создание анонимного обьекта
                new TextInputFrame(txt);

            }




        }
    }

        //Класс реализации окна для ввода целого числа

        class IntInputFrame implements ActionListener, KeyListener){
            private JFrame frame;
            private JLabel enter;
            prvate JButton btYes,btNo;
            private JTextField tf;
            private String name;
            private int age;
            //Конструктор класса
        IntInputFrame(String msg,String name){
            int width=300,height=150;
            //Создание окна
            frame=new JFrame("Окно для ввода (числа)возраста");
            //Определение положения и размеров окна
            frame.setBounds(400,300,width,height);
            //Отключение менеджера компоновки
            frame.setLayout(null);
            enter new JLabel(msg,JLabel.LEFT);
            enter.setBounds(10,10,width-20,height/6);
            tf new TextField(frame.getWidth()-20);
            tf.setBounds(10,enter.getHeight()+5,enter.getWidth(),height/6);
            tf.addKeyListener(this);
            btYes=new JButton("Подтверждаю");
            btYes.setBounds(10,height/2+10,(width-30)/2,height/6);
            btYes.setEnabled(false);

            btNo=new JButton("Завершить");
            btNo.setBounds((width-30)/2+18,height/2+10,(width-30)/2,height/6);
            btNo.setFocusPainted(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //Добавление текстовой метки
            frame.add(enter);
            frame.add(tf);
            frame.add(btYes);
            frame.add(btNo);
            frame.setResizable(false);

            btYes.addActionListener(this);
            btNo.addActionListener(this);

            frame.setVisible(true);
            //Обработка события отпускания нажатой клавиши
            public void keyReleased(KeyEvent ke){
                try {
                    //Попытка преобьразовать текст в число
                    Integer.parseInt(tf.getText());
                    btYes.setEnabled(true);

                }

                catch (Exception e){
                    btYes.setEnabled(false);
                }
                public void keyPressed(KeyEvent ke){}
                public void keyTyped(KeyEvent ke){}

                //Обработка нажатия кнопки
                public void actionPerformed(ActionEvent ae){
                    String btName=ae.getActionCommand();

                }



            }



        }

        }






}
