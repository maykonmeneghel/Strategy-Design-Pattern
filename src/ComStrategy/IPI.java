package ComStrategy;

public class IPI implements Imposto {

    private double value;

    public IPI(double value){
        this.value = value;
    }

    @Override
    public double calcular() {
        return value*0.2;
    }
}
