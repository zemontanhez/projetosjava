package exercicios;

public class Exercicio42 {
    public static void main(String[] args) {
        int resultado;
        resultado = menor(4,3,3);
        System.out.println(resultado);

        
    }

    static int menor(int a,int b, int c){
            if(a <= b && b <= c){
                return a;
            }
            if (b <= a && b <=c){
                return b;
            }
            return c;
    }
}