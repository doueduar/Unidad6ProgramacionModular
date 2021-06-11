package src;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 ej1 = new Ejercicio1();
    }
    int N[] = new int[5];
    Scanner scanner = new Scanner(System.in);
    
    public Ejercicio1(){
        for (int i = 0; i < N.length; i++) {
            pedirDato(i);
        }
        for (int i = 0; i < N.length; i++) {
            mostrarContenido(i);
        }
    }
    public void pedirDato(int i){
        System.out.println(i+". ingresar el valor");
        N[i] = scanner.nextInt();
    } 
    public void mostrarContenido(int i){
        System.out.println("El valor No."+i+"= "+N[i]);
    }
}
