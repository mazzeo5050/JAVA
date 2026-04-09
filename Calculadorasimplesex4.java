public class Calculadorasimplesex4 {
    public static void main(String[] args) {

        Calculadoraex4 minhaCalc = new Calculadoraex4();

        double x = 15;
        double y = 4;

        System.out.println("Calculadora");
        System.out.println("Valores: " + x + " e " + y);
        
        System.out.println("Soma:          " + minhaCalc.somar(x, y));
        System.out.println("Subtração:     " + minhaCalc.subtrair(x, y));
        System.out.println("Multiplicação: " + minhaCalc.multiplicar(x, y));
        System.out.println("Divisão:       " + minhaCalc.dividir(x, y));
        
        System.out.println("Divisão por 0: " + minhaCalc.dividir(x, 0));
    }
}
