package ComStrategy;

public class ICMS implements Imposto {

    private double value;

    public ICMS(double value){
        this.value = value;
    }

    @Override
    public double calcular() {
        return value*0.1;
    }
}