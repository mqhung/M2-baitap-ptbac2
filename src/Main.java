import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        double a = sc.nextDouble();
        System.out.println("Enter b");
        double b = sc.nextDouble();
        System.out.println("Enter c");
        double c = sc.nextDouble();
        QuadraticEquation hung = new QuadraticEquation(a,b,c);
        if (hung.getDiscriminant()>=0){
            System.out.println(hung.display());
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
