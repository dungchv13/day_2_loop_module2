public class Hien_thi_20_soNT_dautien {
    public static void main(String[] args) {
        int count = 20;
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
                count--;
            }
            number++;
        }while (count >= 1);
    }

}
