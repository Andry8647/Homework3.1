public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 9;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } if ( age < 18){
            System.out.println("Придется еще подождать(");
        }

        System.out.println("Задача 2");
        if ( age >= 7 && age < 18){
            System.out.println("Ты еще ходишь в школу");
        } if (age >=18 && age < 24){
            System.out.println("Тебе пора в университет");
        } if (age >= 24){
            System.out.println("Пора на работу(");
        }
        System.out.println("Задача 3");
        int places = 60;
        if (places >=102){
            System.out.println("Вагон забит! Ждите следующий поезд");
        }if (places < 60){
            System.out.println("Есть сидячие места");
        }if (places >= 60 && places<102){
            System.out.println("Только стоячие места(");
        }

    }
}