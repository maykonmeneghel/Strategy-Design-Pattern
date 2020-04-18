package SemStrategy;

public class CalculadoraDeImpostosSemStrategy {

    public static void main(String[] args) {

        CalculadoraDeImpostosSemStrategy calculadora = new CalculadoraDeImpostosSemStrategy();

        System.out.print("ICMS: ");
        System.out.println(calculadora.calcular("ICMS", 100.0));
        System.out.print("IPI: ");
        System.out.println(calculadora.calcular("IPI", 100.0));
    }

    public double calcular(String imposto, double value) {
        switch (imposto){
            case "ICMS":
                return value * 0.1;
            case "IPI":
                return value * 0.2;
            case "NOVOIMPOSTO":
                return value * 0.3;
            default:
                throw new IllegalStateException("Unexpected value: " + imposto);
        }
    }
}
