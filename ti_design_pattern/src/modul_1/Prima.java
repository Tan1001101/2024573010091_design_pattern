package modul_1;

public class Prima {
    public static void main(String[] args){
        int n = 7;
        boolean isPrima = true;
        for(int i = 2; i<= n/2 ; i++){
            if(n % i == 0){
                isPrima = false;
                break;
            }
        }
        System.out.println(n + (isPrima ? " adalah bilangan prima." : "bukan bilangan prima."));
    }
}
