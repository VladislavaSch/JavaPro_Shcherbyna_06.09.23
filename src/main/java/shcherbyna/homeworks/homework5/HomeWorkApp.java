package shcherbyna.homeworks.homework5;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign(5,-6);
        printColor(67);
        compareNumbers(7,12);
        System.out.println(sum(3,56));
        posOrNeg(4);
        System.out.println(posOrNeg2(56));
        print("Hi there!", 3);
        System.out.println(year(1000));

    }
    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    public static void checkSumSign(int a, int b) {
        if ((a+b)>=0){
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void printColor(int a) {
        if (a <= 0){
            System.out.println("Червоний");
        } else if (a <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean sum (int a, int b) {
        return (a + b) > 9 && (a + b) < 21;
    }

    public static void posOrNeg (int a) {
        if (a >= 0){
            System.out.println("Число позитивне");
        } else {
            System.out.println("Число негативне");
        }
    }

    public static boolean posOrNeg2 (int a){
        return a < 0;
    }

    public static void print (String print, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(print);
        }
    }

    public static boolean year (int year) {
        if (year % 4 == 0 ){
            if (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }
}
