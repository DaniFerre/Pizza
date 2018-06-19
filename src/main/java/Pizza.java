public class Pizza implements Produto {

    private double preco;
    private String nome;

    public Pizza (double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public double getValor() {
        return this.preco;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
    public String toString() {
    	System.out.printf("\n Pedido:");
    	System.out.printf("\n %s %20s \n Valor : %.2f\n ","Pizza de",getNome(), getValor());
    	return super.toString();
    }
}