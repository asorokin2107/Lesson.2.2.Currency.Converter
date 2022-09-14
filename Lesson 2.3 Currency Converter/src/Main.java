import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = "08.09.2022";
        double euro = 60.29;
        double dollar = 60.80;
        double china = 8.71;
        while (true) {
            System.out.print("Актуальный курс валют на " + date + " Евро: " + euro + " Доллар: " + dollar + " Юань: "
                    + china + "\n");
            System.out.println("Выберите в какую валюту хотите конвертировать рубли:");
            System.out.println("1.Евро");
            System.out.println("2.Доллар");
            System.out.println("3.Юань");
            System.out.println("4.Выйти");
            int choice = scanner.nextInt();
            double result;
            if (choice == 4) {
                break;

            } else if (choice == 1) {
                System.out.println("Введите рубли: ");
                double rub = scanner.nextDouble();
                result = (rub / euro);
                System.out.println("Евро : " + result);
            }
             else if (choice == 2) {
                System.out.println("Введите рубли: ");
                double rub = scanner.nextDouble();
                result = (rub / dollar);
                System.out.println("Доллар : " + result);
            }
            else if (choice == 3) {
                System.out.println("Введите рубли: ");
                double rub = scanner.nextDouble();
                result = (rub / china);
                System.out.println("Юань : " + result);


            }
        }
    }
}