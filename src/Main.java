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
        System.out.println("Задача 4");
        int age1 = 24;
        if (age1 >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Придется еще подождать(");
        }
        System.out.println("Задача 5");
        if (age1<=7){
            System.out.println("Ты ходишь в школу");
        }else {
            if (age1>=18&&age1<24){
                System.out.println("Ты учишься в вузе");
            }else {
                System.out.println("Иди на свою первую работу(");
            }
        }
        System.out.println("Задача 6");
        int places1 = 100;
        if (places1>=102){
            System.out.println("Вагон забит, жди следующий поезд");
        }else {
            if(places1<60){
                System.out.println("Есть сидячие места!");
            }else {
                System.out.println("Остались только стоячие места(");
            }
        }
        System.out.println("Задача 7");
        int people = 19;
        boolean tru = people >=2 && people <=6;
        boolean try1 = people >=7 && people <=18;
        boolean try2 = people >= 19 && people <24;
        if (tru){
            System.out.println("Если возраст человека равен " + people + " то ему нужно ходить в Детский сад.");
        } else {
            if (try1) {
                System.out.println("Если возраст человека равен " + people + " то ему нужно ходить в Школу.");
            } else {
                if (try2) {
                    System.out.println("Если возраст человека равен " + people + " то ему нужно ходить в Университет.");
                }else {
                    if (people>=24) {
                        System.out.println("Если возраст человека равен " + people + " то ему нужно ходить на работу.");
                    }
                }
            }
        }
        System.out.println("Задание 8");
        int childrenAge = 14;
        boolean allowed = childrenAge <=5;
        boolean allowed1 = childrenAge >5 && childrenAge <14;
        if (allowed){
            System.out.println("Ребенок слишком маленький ему еще нельзя кататься на атракционе(");
        }else {
            if (allowed1){
                System.out.println("Ребенок может кататься только в сопровождении взрослого");
            }else {
                System.out.println("Ребенок может кататься один)");
            }
        }
        System.out.println("Задание 9");
        int one = 1;
        int two = 20;
        int free = 3;
        if (one >two && one >free){
            System.out.println("Самое большое число " + one + " из "+ two + " " + free );
        }else {
            if (two > one && two > free){
                System.out.println("Самое большое число " + two + " из "+ one + " " + free );
            }else {
                System.out.println("Самое большое число " + free + " из "+ one + " " + two );
            }
        }


    }
}