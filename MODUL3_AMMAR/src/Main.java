import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean repeat = true;
            Scanner sc = new Scanner(System.in);
            Calculation calcu = new Calculation();
        
        do {
            try {
                System.out.println("====Menu Program====");
                System.out.println("1. Square");
                System.out.println("2. Circle");
                System.out.println("3. Trapoized");
                System.out.println("0. Exit");
                System.out.print("Select menu : ");
        
                int menu = sc.nextInt();
                switch (menu) {
                  case 1:
                    System.out.print("Enter the length of the side of the square : ");
                    double Square = sc.nextDouble();
                    calcu.setSquare(Square);
                    calcu.run();
                    System.out.println("Result = " + calcu.getSquare());
                    break;
        
                  case 2:
                    System.out.print("Enter the radius of circle : ");
                    double Circle = sc.nextDouble();
                    calcu.setCircle(Circle);
                    calcu.run();
                    System.out.println("Result = " + calcu.getCircle());
                    break;
        
                  case 3:
                    System.out.print("Insert the side of the base of the trapezoid : ");
                    double a = sc.nextDouble();
                    System.out.print("Enter the upper side of the trapezoid : ");
                    double b = sc.nextDouble();
                    System.out.print("Enter the height of the trapezoid : ");
                    double t = sc.nextDouble();
        
                    calcu.setTrapezoid(a, b, t);
                    calcu.run();
                    System.out.println("Result = " + calcu.getTrapezoid());
        
                  case 0:
                    System.out.println("Program End");
                    repeat = false;
                    break;
                  default:
                    System.out.println("Option not available");
                    continue;
                }
        
        } catch (InputMismatchException e) {
            System.out.println("====Error: Input must be a number====");
            sc.next();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } 
        } while (repeat);
        sc.close();
        }
    }

    