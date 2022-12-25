import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Restaurant resto = new Restaurant();
        int id,pesan;

        try{
            System.out.print("Enter Customer ID : ");
            id= sc.nextInt();
            System.out.print("Enter how much food to made : ");
            pesan = sc.nextInt();

            Thread a = new Thread(resto);
            Waiters waiter = new Waiters(pesan,id);
            Thread b = new Thread(waiter);

            a.start();
            a.start();
            b.join();
            b.join();
            
        }catch(Exception e){
            System.out.println("Input must be integer");
        }
    }
}

