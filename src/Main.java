public class Main {
    public static void main(String[] args) {   task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();}
    private static void task1() {
        System.out.println("задача  1, цикл i");
        for(int i =1; i<=10;i=i+1){
            System.out.println(i);}
    }
    private static void task2() {
        System.out.println("задача 2, цикл a");
        for (int a = 10; a>=1; a--){
            System.out.println(+a);}
    }
    private static void task3() {
        System.out.println("задача 3, цикл b ");
        for(int b = 0; b<17;b+=2){
            System.out.println(b);}
    }
    private static void task4() {
        System.out.println("задача 4, цикл c ");
        for(int c = 10; c >=-10;c--){
            System.out.println(c);}
    }
    private static void task5() {
        System.out.println("задача 5");
        for(int year = 1904;year<=2096;year+=4){
            System.out.println(year+ "год является високосным");}
    }
    private static void task6() {
        System.out.println("задача 6");
        for (int num =7; num<=98; num+=7){
            System.out.print(num +" ");
        }
    }
    private static void task7() {
        System.out.println(" ");
        System.out.println("задача 7");
        for (int num =1; num<=512; num*=2){
            System.out.print(num +" ");}
        }
    private static void task8() {
        System.out.println(" ");
        System.out.println("задача 8");
        int delay = 29000;
        int accumulated = 0;
        for (int i = 1; i <=12; i++) {
            accumulated = accumulated + delay;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + accumulated + " рублей».");
        }
    }
    private static void task9() {
        System.out.println("задача 9");
        int delay = 29000;
        int accumulated = 0;
        for (int i = 1; i <= 12; i++) {
            delay *= 1.01;
            accumulated = accumulated + delay;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + accumulated + " рублей».");
        }
    }
    private static void task10() {
        System.out.println("задача 10");
        int num = 2;
        for (int i = 1; i <= 10; i++){
           int total = num*i;
            System.out.println(num+"*"+i+"="+total);
        }
    }
}