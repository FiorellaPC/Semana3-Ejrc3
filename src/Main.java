import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Indique su puntuación actual de crédito: ");
        int puntuacion = scan.nextInt();

        if (puntuacion >= 750){
            System.out.println("Nivel de riesgo crediticio: Bajo riesgo");
        } else if (puntuacion >= 650) {
            System.out.println("Nivel de riesgo crediticio: Riesgo moderado");
        } else if (puntuacion >= 550 ) {
            System.out.println("Nivel de riesgo crediticio: Alto riesgo");
        } else  {
            System.out.println("Nivel de riesgo crediticio: Riesgo muy alto");
        }
    }
}