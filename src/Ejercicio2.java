package src;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Ejercicio2 ej2 = new Ejercicio2();
    }
    int N[] = new int[10];
    Scanner scanner = new Scanner(System.in);
    public Ejercicio2(){
        llenar();
        mostrar();
        nMayor();
    }
    public void mostrar(){
        for (int i = 0; i < N.length; i++) {
            System.out.println("los numeros ingresados No."+i+"= "+N[i]);
        }
    }
    public void llenar(){
        for (int i = 0; i < N.length; i++) {
            int ale = (int)(Math.random()*100);
            N[i] = ale;
        }
    }
    public void nMayor(){
        int maximo = N[1];
        for (int i = 0; i < N.length; i++) {
            if (N[i]>maximo)
                maximo = N[i];
        }
        System.out.println("El numero mayor: "+maximo);
    }
}
