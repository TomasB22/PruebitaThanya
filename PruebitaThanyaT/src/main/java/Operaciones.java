import java.util.Scanner;

public class Operaciones {
    String alumno;
    int numNotas;
    double promedio;
    double [] notas;
    public void ingresarCantNotas(){
        Scanner scanner = new Scanner (System.in);
        System.out.println ("¿Cual será la cantidad de notas que ingresará?");
        numNotas = scanner.nextInt ();
        notas = new double [numNotas];
    }
    public void ingresarNotas(double [] notas, int numNotas){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Ingresa"+ numNotas + "notas:");
        for(int i=0; i<notas.length; i++){
            System.out.print("Nota "+ (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }
    }



}
