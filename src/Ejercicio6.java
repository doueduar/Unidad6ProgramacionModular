package src;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    Ejercicio6 ej6 = new Ejercicio6();    
    }
    int N[][] = new int[3][3];
    int a,b = 0;
    Scanner scanner = new Scanner(System.in);
    public Ejercicio6(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ingresar(i, j);
                multiplicar(i, j);
            }
        }
        mostrar();
    }
    public void ingresar(int i,int j){
            System.out.println("ingrese el valor ");
            N[i][j] =  scanner.nextInt();
    }
    public void multiplicar(int i,int j){
                N[i][j] *= 2;
    }
    public void mostrar(){
        for (int i = 0; i < 3; i++) {
            System.out.print(N[0][i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < 3; i++) {
            System.out.print(N[1][i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < 3; i++) {
            System.out.print(N[2][i]+" ");
        }
        System.out.print("\n");
    }
}
