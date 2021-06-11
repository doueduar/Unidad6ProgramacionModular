package src;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Ejercicio5 ej5 = new Ejercicio5();
    }
    int [] N = new int[100];
    int a =0;
    double suma =0;
    Scanner scanner = new Scanner(System.in);
    public Ejercicio5() {
        String s ="";
        do {
            ingresar();
            sum();
            medio();
            System.out.print("Deseas seguir s/n: ");
            s = scanner.next();
        } while (s.equalsIgnoreCase("s"));
    }
    public void ingresar(){
        int valor = 0;
        a = 0;
        do {
            System.out.println("ingrese un valor");
            N[a] = scanner.nextInt();
            valor = N[a];
            a++;
        } while (valor != (-50));
        System.out.println("sali");
    }
    public void medio(){
        if (0<a) {
            double media = suma/a;
            System.out.println("valor medio es: "+media);    
        }else{
            System.out.println("no ingreso ningun valor");
        }
    }
    public void sum(){
        a = 0;
        while (N[a]!=-50) {
            suma += N[a];
            a++;
        }
    }


}
