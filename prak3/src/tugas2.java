/*
 * Created by 21343048_ghenta alif alde
 */
public class tugas2 {
    public static void main(String[]args){
        int val1=10;
        int val2=23;
        int val3=5;
        int status =(val1>val2)?(val1>val3?val1:val3):(val2>val3?val2:val3);

        System.out.println("number1="+val1);
        System.out.println("number2="+val2);
        System.out.println("number3="+val3);
        System.out.println("Nilai tertinggi adalah angka="+status);
    }
}
