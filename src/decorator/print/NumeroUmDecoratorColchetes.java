package decorator.print;

public class NumeroUmDecoratorColchetes extends NumeroUmDecorator{
    NumeroUm numeroUm;

    public NumeroUmDecoratorColchetes( NumeroUm numeroUm ) {
        this.numeroUm = numeroUm;
    }
    public String imprimir() {
       return "[" + this.numeroUm.imprimir() + "]";
    }
}
