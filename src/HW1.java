import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        System.out.println(task1(5));
        System.out.println(task2(5));
        task3(1000);
        task4();

    }

    public static int task1(int n){

        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }
    public static int task2(int n){
        int fact = 1;
        if (n == 0 || n == 1){
            return fact;
        }
        for (int i = 2; i <= n; i++) {
            fact *= i;
            
        }
        return fact;
    }
    public static void task3(int n) {
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                    System.out.println(i);
                }


            }
        }
        public static void task4(){
        int res = 0;
            System.out.print("введите первое число: ");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            System.out.print("введите второе число: ");
            int b = scan.nextInt();
            System.out.print("укажите операцию: ");
            String oper = scan.next();
            if (oper.equals("+")){
                res = a + b;
            }
            else if (oper.equals("-")){
                res = a - b;
            }
            else if (oper.equals("*")){
                res = a * b;
            }
            else if (oper.equals("/")){
                res = a / b;
            }
            System.out.println("Ответ: " + res);

        }

}

