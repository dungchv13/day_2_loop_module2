import java.util.Scanner;

public class Kiem_tra_so_NT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so ban muon kiem tra:");
        int number = scanner.nextInt();
        boolean mark = true;
        int i = 2;
        while(i < number){
            if(number % i == 0){
                mark = false;
                break;
            }
            i++;
        }
        if(mark){
            System.out.println(number+" la so Nguyen To");
        }else{
            System.out.println(number+" ko phai la so Nguyen To");
        }
    }
}
