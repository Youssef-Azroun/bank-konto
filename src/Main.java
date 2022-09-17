import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("skriv ditt saldå: ");
        double saldå = scan.nextDouble();
        System.out.println("Skriv ditt namn: ");
        String name = scan.next();

        account user = new account(saldå,name);
        System.out.println(user.toString());
        int c;
        do{
            System.out.println("1. Withdraw.");
            System.out.println("2. Diposet");
            System.out.println("3. exit");
            c = scan.nextInt();

            if(c == 1){
                System.out.println("Hur myckt vill du withdraw? ");
                double d = scan.nextDouble();
                user.withdraw(d);
                System.out.println(user);
            }
            else if(c == 2){
                System.out.println("Hur myct vill du sätta? ");
                double e = scan.nextDouble();
                user.deposit(e);
                System.out.println(user);
            }
            else {
                System.out.println("Tack!");
            }
        }while (c!=3);
    }
}