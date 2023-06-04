package decorator.print;

public class NumeroUmConcretClass extends NumeroUm{

    public NumeroUmConcretClass() {
        this.numberOne = "1";
    }
    @Override
    public String imprimir() {
        return this.numberOne;
    }
}
