public class Milho implements Produto {

    private Produto pizza;

    public Milho (Produto pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getValor() {
        return pizza.getValor() + 1.5;
    }

    @Override
    public String getNome() {
        return pizza.getNome() + ", milho extra";
    }
    
    public String toString() {
    	System.out.printf("\n Pedido:");
    	System.out.printf("\n %s %20s \n Valor : %.2f\n ","Pizza de",getNome(), getValor());
    	return super.toString();
    }
}
