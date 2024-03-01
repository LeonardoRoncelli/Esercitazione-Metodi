import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        double base;
        double altezza;
        double perimetro;
        System.out.println("Inserisci l'altezza");
        altezza= input.nextDouble();
        System.out.println("Inserisci la base");
        base= input.nextDouble();
        perimetro=perimetroRettangolo(base,altezza);
        System.out.println("Il perimetro è: "+perimetro);
    }
    private static double perimetroRettangolo (double h, double b){
        double p;
        p=(b*2)+(h*2);
        return p;
    }
}