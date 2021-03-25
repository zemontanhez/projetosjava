import java.util.Scanner;
public class Uri1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int c,contpos,contpar,x;
        contpar = 0;
        contpos = 0;
        x = 0;
        for (c=0;c < 5;c++){
            x = entrada.nextInt();
            if(x > 0 && x != 0){
                contpos++;
            }
            if(x % 2 == 0){
                contpar++;
            }
        }
        System.out.println(contpar + " valor(es) par(es)");
        System.out.println((5 - contpar) + " valor(es) impar(es)");
        System.out.println(contpos + " valor(es) positivo(s)");
        System.out.println((5-contpos) + " valor(es) negativo(s)\n");
        entrada.close();
    }    
}
