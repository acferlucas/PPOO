package decorator.print;

public class NumeroUmParentesesDecorator extends NumeroUmDecorator {
    NumeroUm numeroUm;

    public NumeroUmParentesesDecorator( NumeroUm numeroUm ) {
        this.numeroUm = numeroUm;
    }

    @Override
    public String imprimir() {
        return "(" + this.numeroUm.imprimir() + ")";
    }
}
