public class Hien_thi_soNT_nho_hon_100 {
    public static void main(String[] args) {

        int number = 2;
        do  {
            boolean mark = true;
            int i = 2;
            while(i < number){
                if(number % i == 0){
                    mark = false;
                    break;
                }
                i++;
            }
            if (mark){
                System.out.println(number);
            }
            number++;
        }while (number < 100);
    }
}
