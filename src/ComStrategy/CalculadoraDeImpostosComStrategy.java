package ComStrategy;

public class CalculadoraDeImpostosComStrategy {

    public static void main(String[] args) {
        CalculadoraDeImpostosComStrategy calculadora = new CalculadoraDeImpostosComStrategy();
        ICMS icms = new ICMS(100.0);
        IPI ipi = new IPI(100.0);

        System.out.print("ICMS: ");
        System.out.println(calculadora.calcular(icms));
        System.out.print("IPI: ");
        System.out.println(calculadora.calcular(ipi));
    }

    public double calcular(Imposto imposto) {
        return imposto.calcular();
    }

}
