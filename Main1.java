import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введіть першу дату (день.місяць.рік):");
        String date1 = scanner.nextLine();
        int day1 = scanner.nextInt();
        int month1 = scanner.nextInt() ;
        int year1 = scanner.nextInt();


        System.out.println("Введіть другу дату (день.місяць.рік):");
        String date2 = scanner.nextLine();
        int day2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int year2 = scanner.nextInt();


        if (year1 < year2) {
            System.out.println("Перша дата раніша.");
        }else if (year1 == year2 && month1 < month2) {
            System.out.println("Перша дата раніша.");
        }else if (year1 == year2 && month1 == month2 && day1 < day2) {
            System.out.println("Перша дата раніша.");
        }else if (year1 > year2) {
            System.out.println("Друга дата раніша.");
        }else if  (year1 == year2 && month1 > month2) {
            System.out.println("Друга дата раніша.");
        }else if  (year1 == year2 && month1 == month2 && day1 > day2) {
            System.out.println("Друга дата раніша.");
        }else {
            System.out.println("Дати однакові.");
        }
    }
}
