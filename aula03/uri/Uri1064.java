import java.util.Scanner;
public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int c,contp;
        double x,media;
        media = 0;
        contp = 0;
        x = 0;
        for (c=1;c < 7;c++){
            x = entrada.nextDouble();
            if(x >= 0){
                media += x;
                contp++;
            }
        }
        media /= contp;
        System.out.println(contp + " valores positivos");
        System.out.printf("%.1f",media);
        entrada.close();
    }    
}
