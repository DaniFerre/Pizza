
import org.junit.Test;
import org.junit.Assert;

public class PizzaTest{
	
	@Test
	public void testPizzMussarela() {
		
		Produto p1 = new Pizza(10,"Mussarela");
		p1 = new Milho(p1);
		p1 = new Ovo(p1);
		p1 = new BordaCatupiry(p1);
		
		double esperado = 15;
		double retornado = p1.getValor();
		Assert.assertEquals(esperado, retornado,0);
	}
	
	@Test
	public void testPizzaCalabresaMilhoCatupiry() {
		Produto p2 = new Pizza(15,"Calabresa");
		p2 = new Milho(p2);
		p2 = new BordaCatupiry(p2);
		double esperado = 19;
		double retornado = p2.getValor();
		Assert.assertEquals(esperado, retornado,0);
	}
	
	@Test
	public void testPizzaFrangoCatupiry() {
		Produto p3 = new Pizza(14,"Frango");
		p3 = new BordaCatupiry(p3);
		double esperado = 16.5;
		double retornado = p3.getValor();
		Assert.assertEquals(esperado, retornado,0);
	}
	
}