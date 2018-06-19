
public class Ovo implements Produto {

    private Produto pizza;

    public Ovo (Produto pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getValor() {
        return pizza.getValor() + 1;
    }

    @Override
    public String getNome() {
        return pizza.getNome() + ", ovo extra";
    }
    
    public String toString() {
    	System.out.printf("\n Pedido:");
    	System.out.printf("\n %s %20s \n Valor : %.2f\n ","Pizza de",getNome(), getValor());
    	return super.toString();
    }
}