public class FirstInstance {
    public static void main(String[] args) {
        System.out.println("Цвет автомобиля "+Car.color);
        System.out.println("Тип кузова "+Car.bodyType);
        System.out.println(Car.accelerate());

        Car Porshe=new Car();
        System.out.println("Цвет Porshe "+Porshe.color);
    }
}
