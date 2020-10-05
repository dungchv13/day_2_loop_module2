import java.util.Scanner;

public class Hien_thi_hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("-------Menu------");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle");
        System.out.println("3. Draw the isosceles");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                for(int i = 0;i < 3;i++){
                    for(int j = 0;j < 7;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for(int i = 1;i <= 5;i++){
                    for(int j = 0;j < i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for(int i = 5;i >= 1;i--){
                    for(int j = i;j > 0;j--){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for(int i = 0;i <= 5;i++){
                    for(int k = 0;k < i;k++){
                        System.out.print(" ");
                    }
                    for(int j = 5 - i;j > 0;j--){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for(int i = 1;i <= 5;i++){
                    for(int k = 5-i;k >= 1;k--){
                        System.out.print(" ");
                    }
                    for (int j = 1;j <= i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i = 1;i <= 7;i += 2){
                    for(int x = (7-i)/2;x >= 0;x--){
                        System.out.print(" ");
                    }
                    for (int y = 1;y <= i;y++){
                        System.out.print("*");
                    }
                    for(int x = (7-i)/2;x >= 0;x--){
                        System.out.print(" ");
                    }
                    System.out.println();
                }
        }
    }
}
