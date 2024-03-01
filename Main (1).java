import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        double base;
        double altezza;
        System.out.println("Inserisci la base");
        base= input.nextDouble();
        System.out.println("Inserisci l'altezza");
        altezza= input.nextDouble();
        AreaRettangolo(base, altezza);
    }
    private static void AreaRettangolo(double base, double altezza){
        double area=base*altezza;
        System.out.println("L'area è: "+area);
    }
}