package src;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        
    }
    String name[] = new String[6];
    String resutado[] = new String[6];
    double nota[] = new double[6];
    Scanner scanner = new Scanner(System.in);
    public Ejercicio11(){

    }
    public void insertar(int i){
        int n =0;
        System.out.println("ingrese el nombre del estudiante no. "+i);
        name[i] = scanner.next();
        do {
            System.out.println("ingrese la nota");
            nota[i] = scanner.nextDouble();
            if ((0<=nota[i])&&(nota[i]<=10)) {
                n++;
            }else{
                System.out.println("nota invalida");
            }
        } while (n != 1);
    }
    public void imprimir(){

    }
    public void calificacion(){
    
    }

}
