package src;

public class Ejercicio4 {
    public static void main(String[] args) {
        Ejercicio4 ej4 = new Ejercicio4();
    }
    int maximo=0;
    int[]N = new int[10];
    int[]D = new int[10];
    public Ejercicio4(){
        ingresados();
        mayor();
        deducir();
    }
    public void deducir(){
        for (int i = 0; i < N.length; i++) {
            if (N[i]!=maximo) {
                D[i] = maximo-N[i];
                System.out.println("Distancia "+maximo+" a "+N[i]+" es: "+ D[i] );
            }
        }
    }
    public void ingresados(){
        for (int i = 0; i < N.length; i++) {
            N[i] = (int)(Math.random()*100+1);
            System.out.println(i+". numero ingresado "+N[i]);
        }
    }
    public void mayor(){
        maximo = N[1];
        for (int i = 0; i < N.length; i++) {
            if (N[i]>maximo) {
                maximo = N[i];
            }
        }
    }


}
