public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 20;
        if ( age >= 18){
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача 2");
        int degrees = 5;
        if (degrees >=5){
            System.out.println("На улице "+degrees+" градусов, можно идти без шапки." );
        } else {
            System.out.println("На улице "+degrees+" градусов, нужно надеть шапку.");
        }

        System.out.println("Задача 3");
        int speed = 75;
        if (speed <= 60){
            System.out.println("Если скорость "+ speed+", то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость "+ speed+", то придется заплатить штраф.");
        }

        System.out.println("Задача 4");
        int howOld = 24;
        if (howOld>=2&&howOld<=6){
            System.out.println("Если возраст человека равен "+howOld+" лет, то ему нужно ходить в детский сад.");
        }
        if (howOld>=7&&howOld<=17){
            System.out.println("Если возраст человека равен "+howOld+" лет, то ему нужно ходить в школу.");
        }
        if (howOld>=18&&howOld<=24){
            System.out.println("Если возраст человека равен "+howOld+" лет, то ему нужно ходить в университет.");
        }
        if (howOld>24){
            System.out.println("Если возраст человека равен "+howOld+" лет, то ему пора ходить на работу.");
        }

        System.out.println("Задача 5");
        int childAge = 14;
        if (childAge<5){
            System.out.println("Если возраст ребенка равен "+childAge+" года, то ему нельзя кататься на аттракционе.");
        }
        if (childAge>=5&&childAge<14){
            System.out.println("Если возраст ребенка равен "+childAge+" лет, то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (childAge>=14){
            System.out.println("Если возраст ребенка равен "+childAge+" лет, то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("Задача 6");
        int passenger=102;
        if (passenger<60){
            System.out.println("В вагоне есть сидячие места.");
        } else if (passenger>=60&&passenger<102) {
            System.out.println("В вагоне есть стоячие места.");
        }else if (passenger>=102) {
            System.out.println ("В вагоне мест нет.");
        }

        System.out.println("Задача 7");
        int one=461;
        int two=72;
        int three=54;
        if (one>two&&one>three){
            System.out.println("Число one="+one+" больше остальных.");
        } else if (two>one&&two>three) {
            System.out.println("Число two="+two+" больше остальных.");
        }
        else {
            System.out.println("Число three="+three+" больше остальных.");
        }
    }
}