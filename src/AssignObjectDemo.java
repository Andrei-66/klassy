import javax.swing.*;

 class AssignObject {
    String text;
    AssignObject(){     //Конструктор класса без аргументов
        text="Новый обьект.";
    }

    AssignObject(String str){
        text=str;
    }

    void show(){
        JOptionPane.showMessageDialog(null, text);
    }

}

public class AssignObjectDemo{
    public static void main(String[] args) {

        //Создание обьектов
        AssignObject objA=new AssignObject();
        AssignObject objB=new AssignObject();


        //Отображение текстовых полей обьекта
        objA.show();
        objB.show();

        //Присваивание обьектов
        objA=objB;
        objA.show();

        objB.text="Изменен второй обьект";
        objA.show();



    }
}
