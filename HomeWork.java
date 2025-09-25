package Project.First;

public class HomeWork {
        public static void main(String[] args) {
            System.out.println("1.");
            System.out.println("Hello \nWorld \nfrom \nJava");
            System.out.println("2.");
            checkSign();
            System.out.println("3.");
            selectColor();
            System.out.println("4.");
            compareNumbers();
            System.out.println("5.");
            addOrSubtractAndPrint(5,2,true);
    }
    public static void checkSign() {
        int a = 2;
        int b = 3;
        int c = 4;
        if (a + b + c >= 0) {
            System.out.println("Cумма положительна");
        }
        else{
            System.out.println("Сумма отрицательна");
        }

    }

    public static void selectColor() {
            int data = (int) (Math.random() * 40);
                System.out.println("data = " +data);
            if (data <= 10) {
                System.out.println("Красный");
            }
            if (data > 10 && data <= 20) {
                System.out.println("Желтый");
            }
            if (data > 20) {
                System.out.println("Зелёный");
            }
    }
    public static void compareNumbers() {
        int a = (int) (Math.random() * 100);
        System.out.println("a = "+a);
        int b = (int) (Math.random() * 100);
        System.out.println("b = "+b);
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
        }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
            if (increment == true){
                System.out.println(initValue + delta);
        }
            else{
                System.out.println(initValue - delta);
            }

    }
}
