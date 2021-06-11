package src;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Ejercicio9 ejer9 = new Ejercicio9();
    }
    Scanner scanner = new Scanner(System.in);
    int a, b, c, d = 0;
    public int [][] N1;
    public int [][] N2;
    public Ejercicio9(){
        System.out.println("ingrese las dimenciones del arreglo 1: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("ingrese las dimenciones dle arreglo 2: ");
        c = scanner.nextInt();
        d = scanner.nextInt();

        N1 = new int[a][b];
        N2 = new int[c][d];
        ingresar(a,b,c,d);
        if ((a==c)&&(b==d)) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    sum(i, j);
                    visualizar(i, j);
                }
                System.out.print("\n");
            }
            System.out.println("suma de matrices");
        } else {
            System.out.println("no son iguales");
        }
    }
    public void ingresar(int n1, int n2, int n3, int n4){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                N1[i][j] = (int)(Math.random()*100);
            }
        }
        for (int j = 0; j < c; j++) {
            for (int j2 = 0; j2 < d; j2++) {
                N2[j][j2] = (int)(Math.random()*100);
            }
        }
    }
    public void sum(int q, int v){
       N1[q][v] += N2[q][v];
    }
    public void visualizar(int q, int v){
        System.out.print(N1[q][v]+" ");
    }
}
