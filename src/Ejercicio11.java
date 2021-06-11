package src;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Ejercicio11 ejer11 = new Ejercicio11();
    }
    String name[] = new String[6];
    String resutado[] = new String[6];
    double nota[] = new double[6];
    Scanner scanner = new Scanner(System.in);
    public Ejercicio11(){
        for (int i = 0; i < name.length; i++) {
            insertar(i);
        }
        calificacion();
        imprimir();
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
        for (int i = 0; i < name.length; i++) {
            System.out.println(i+". alumno: "+name[i]+" nota: "+nota[i]+" calificación: "+resutado[i]);
        }
    }
    public void calificacion(){
        for (int i = 0; i < resutado.length; i++) {
            if ((0<=nota[i])&&(nota[i]<5)) {
                resutado[i] = "suspenso";
            }
            if ((5<=nota[i])&&(nota[i]<7)) {
                resutado[i] = "bien";
            }
            if ((7<=nota[i])&&(nota[i]<9)) {
                resutado[i] = "notable";
            }
            if ((9<=nota[i])&&(nota[i]<=10)) {
                resutado[i] = "sobresaliente";
            }
            if (resutado[i]==null) {
                System.out.println("sale del rango");
            }
        }
    }

}
