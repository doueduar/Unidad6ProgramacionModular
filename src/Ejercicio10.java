package src;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Ejercicio10 eje10 = new Ejercicio10();
    }
    int f = 3; int c = 4; int n=0;
    int [][] N = new int[f][c];
    int [][] N1 = new int[c][f];
    Scanner scanner = new Scanner(System.in);

    public Ejercicio10(){   
        ingresar();
        invertir();
        imprimir();
    }
    public void ingresar(){
        System.out.print("ingresar 1. 4X3  2. 3X4 ");
        n = scanner.nextInt();
        if (n==1) {
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    N[i][j] = (int)(Math.random()*20);
                }
            }    
        }
        if (n == 2) {
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    N1[j][i] = (int)(Math.random()*20);
                }
            }
        }
        
    }
    public void imprimir(){
        for (int i = 0; i < 4; i++) {
                if (n == 1) {
                    for (int j2 = 0; j2 < c; j2++) {
                        System.out.print(N[i][j2]+" ");   
                    }
                    for (int k = 0; k < c; k++) {
                        System.out.print(N1[k][i]+" ");
                    }
                    System.out.print("\n");
                }
                if (n == 2) {
                    for (int j2 = 0; j2 < c; j2++) {
                        System.out.print(N1[j2][i]+" ");   
                    }
                    for (int k = 0; k < c; k++) {
                        System.out.print(N[i][c]+" ");
                    }
                    System.out.print("\n");
                }
        }
    }
    public void invertir(){
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (n ==1) {
                    N1[j][i] = N[i][j];
                }
                if (n ==2) {
                    N[i][j] = N1[j][i];
                }
            }
        }
    }

}
