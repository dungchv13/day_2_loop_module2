import java.util.Scanner;

public class Uoc_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so nguyen a:");
        int a = scanner.nextInt();

        System.out.println("nhap so nguyen b:");
        int b = scanner.nextInt();;

        a = Math.abs(a);
        b = Math.abs(b);

        if(a == 0 || b == 0){
            System.out.println("No greatest common factor");
        }else{
            while(a != b){
                if(a > b){
                    a = a - b;
                }else{
                    b = b - a;
                }
            }
            System.out.println("uoc chung lon nhat cua a va b la: "+a);
        }
    }
}
