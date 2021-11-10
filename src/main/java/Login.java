import java.util.Scanner;

public class Login {

    public static void ingresarCorreo(){
        Scanner sc = new Scanner (System.in);
        String correo;
        String matricula;
        System.out.println ("Ingresa tu CORREO");
        correo = sc.nextLine();
        System.out.println ("Ingresa tu MATRICULA");
        matricula = sc.nextLine ();
        Usuario usuario = new Usuario(correo, matricula);
    }
}
