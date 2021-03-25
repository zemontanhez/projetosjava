package exercicios.exercicio43;

public class Veiculo {
    String modelo,marca;
    double consumo;

    Veiculo(String modelo,String marca,double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    public void dados(){
        System.out.println("Modelo: " + modelo + " Marca: " + marca);
    }
    public double getConsumo(){
        return consumo;
    }
    public void setConsumo(double novoConsumo){
        if(novoConsumo > 0){
        consumo = novoConsumo;
        }
    }

}
