import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int anno;
        boolean bisestile=false;
        System.out.println("Inserisci anno");
        anno= input.nextInt();
        annoBisestile(anno);
        if(anno<0){
            System.out.println("Errore");
        }
        else if (annoBisestile(anno)){
            System.out.println("L'anno è bisestile");
        }
        else{
            System.out.println("L'anno non è bisestile");
        }
    }
    private static boolean annoBisestile(int anno){
        return (anno%4==0||anno%100==0)||(anno%400==0);
    }
}