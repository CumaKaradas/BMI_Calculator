import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kilonuzu kilogram cinsinden girin:");
        double weight = scanner.nextDouble();

        System.out.println("Lütfen boyunuzu metre cinsinden girin:");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.println("Beden Kitle İndeksiniz (BMI): " + bmi);
        System.out.println("Durumunuz: " + getBMICategory(bmi));

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Zayıf";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 24.9 && bmi < 29.9) {
            return "Fazla Kilolu";
        } else {
            return "Obez";
        }
    }
}
