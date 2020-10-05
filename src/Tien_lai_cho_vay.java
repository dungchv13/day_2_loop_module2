import java.util.Scanner;

public class Tien_lai_cho_vay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so tien cho vay:");
        double money = scanner.nextDouble();

        System.out.println("nhap so thang vay:");
        int month = scanner.nextInt();

        System.out.println("nhap ti le lai suat:");
        double interset_rate = scanner.nextDouble();

        double total = money;
        for(int i = 0;i < month;i++){
           total = total*(100+interset_rate)/100;
        }

        System.out.println("so tien lai la:"+(total-money));

    }
}
