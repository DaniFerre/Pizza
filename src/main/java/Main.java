

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Pizza (10,"Mussarela");
        p1 = new Milho (p1);
        p1 = new Ovo (p1);
        p1 = new BordaCatupiry(p1);
        
        
        Produto p2 = new Pizza (15,"Calabresa");
        p2 = new Milho (p2);
        p2 = new BordaCatupiry(p2);
        
        Produto p3 = new Pizza(14,"Frango");
        p3 = new BordaCatupiry(p3);
        
        
        
        System.out.println("****************************************************************************");
        System.out.println("*************************** Pizzaria SomeBodyLove***************************");
        System.out.println("****************************************************************************");
        p1.toString();
        p2.toString();
        p3.toString();
    }
}
