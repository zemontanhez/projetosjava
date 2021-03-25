package exercicios.exercicio43;

public class appVeiculo {
    public static void main(String[] args) {
        Veiculo a = new Veiculo("modelo","marca",11);

        a.dados();

        System.out.println("Consumo: " + a.getConsumo());

        a.setConsumo(-2);

        
    }
}
