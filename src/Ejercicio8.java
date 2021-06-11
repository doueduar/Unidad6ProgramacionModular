package src;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Ejercicio8 eje8 = new Ejercicio8();
    }
    String [] N = new String[5];
    String [] D = new String[5];
    Scanner scanner = new Scanner(System.in);

    public Ejercicio8(){
        ingresar();
        verificar();
    }
    public void ingresar(){
        for (int i = 0; i < N.length; i++) {
            System.out.println("ingrese palabras: ");
            N[i] = scanner.next();
        }
        for (int i = 0; i < D.length; i++) {
            System.out.println("ingrese palabras: ");
            D[i] = scanner.next();
        }
    }
    public void verificar(){
        for (int i = 0; i < D.length; i++) {
            if (N[i].length() == D[i].length()) {
                System.out.print("son iguales no."+i+". tamaño: "+N[i].length()+" ");   
            }else{
                System.out.print(i+". tamaño: "+N[i].length()+" no son iguales con "+D[i].length()+" ");
            }
        }
    }

}
