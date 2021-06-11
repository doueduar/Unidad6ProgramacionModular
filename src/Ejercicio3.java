package src;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Ejercicio3 ej3 = new Ejercicio3();
    }
    int N[] = new int[8];

    Scanner scanner = new Scanner(System.in);

    public Ejercicio3(){
        ingresar();
        System.out.println("ingrese un numero a buscar del 1 al 20");
        int a = scanner.nextInt();
        busqueda(a);
    }

    public void ingresar(){
        System.out.println("ingreso los valores aleatorios");
        for (int i = 0; i < N.length; i++){
            int ale = (int)(Math.random()*20+1); 
            N[i] = ale;
            System.out.println(i+". valor "+N[i]);
        } 
    }
    public void busqueda(int a){
        int i = 0;
        do {
            if (a==N[i]) {
                System.out.println("verdadero");
                a = 0;
            }
            i++;
        } while ((a !=0)&&(i<N.length));
        if (a != 0) {
            System.out.println("FALSO");
        }
    }
}
