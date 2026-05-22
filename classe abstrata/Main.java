package veiculo;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2000);
        Moto moto = new Moto("Honda", "CB500", 500);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 3000);

        carro.exibirInformacoes();
        moto.exibirInformacoes();
        caminhao.exibirInformacoes();
    }
}