import java.util.Scanner;
public class Exemplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,count;
        a = entrada.nextInt();
        count = 0;
        while(count < 11 ){
            System.out.println(a + " x " + count + " = " + (a*count));
            count += 1;
        }
        entrada.close();
    }
}
