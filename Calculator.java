import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Calculator {
    private double x, y, z, c, f;

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть x: ");
        x = scanner.nextDouble();
        System.out.print("Введіть y: ");
        y = scanner.nextDouble();
        System.out.print("Введіть z: ");
        z = scanner.nextDouble();
        scanner.close();
        c = Math.abs(Math.pow(x, y/x) - Math.pow(y/x,1.0/3.0));
        f = ((y - x) * (y - z) / (y - x)) / (1 + Math.pow(y - z, 2));
        System.out.println("Результати обчислень:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("c = " + c);
        System.out.println("f = " + f);
    }

    public void printDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        Date now = new Date();
        System.out.println("Дата: " + dateFormat.format(now));
        System.out.println("Час: " + timeFormat.format(now));
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate();
        calculator.printDateTime();
    }
}
