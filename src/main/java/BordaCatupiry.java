public class BordaCatupiry implements Produto {

    private Produto pizza;

    public BordaCatupiry (Produto pizza){
        this.pizza = pizza;
    }

    @Override
    public double getValor() {
        return pizza.getValor() + 2.5;
    }

    @Override
    public String getNome() {
        return pizza.getNome() + ", com borda de Catupiry";
    }
    public String toString() {
    	System.out.printf("\n Pedido:");
    	System.out.printf("\n %s %20s \n Valor : %.2f\n ","Pizza de",getNome(), getValor());
    	return super.toString();
    }

}