package src;

public class Ejercicio7 {
    public static void main(String[] args) {
        Ejercicio7 eje7 = new Ejercicio7();
    }
    int N[][] = new int[4][3];

    public Ejercicio7(){
        ingresar();
        suma();
    }
    public void ingresar(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                N[i][j] = (int)(Math.random()*556);           
            }
        }
    }
    public void suma(){
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (j ==1) {
                    sum += N[j][i];
                    System.out.print(N[j][i]+"+");
                }
                if (j ==3) {
                    sum += N[j][i];
                    System.out.print(N[j][i]+"+");
                }
            }
        }
        System.out.println("\nsuma es: "+sum);;
    }

}
