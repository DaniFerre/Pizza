public class Tomate implements Produto {

    private Produto pizza;

    @Override
    public double getValor() {
        return pizza.getValor() + 2;
    }

    @Override
    public String getNome() {
        return pizza.getNome() + " com tomate extra";
    }
    
    public String toString() {
    	System.out.printf("\n Pedido:");
    	System.out.printf("\n %s %20s \n Valor : %.2f\n ","Pizza de",getNome(), getValor());
    	return super.toString();
    }
}

