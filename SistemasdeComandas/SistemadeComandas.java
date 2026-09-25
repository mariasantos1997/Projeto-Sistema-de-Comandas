package sistemadecomandas;
public class SistemaDeComandas {

    public static void main(String[] args) {
        System.out.println("===== Criando Itens =====");
        
        ItemConsumacao item1 = new ItemConsumacao();
        item1.setNome("Refrigerante");
        item1.setPreço(5.0);
        item1.setQuantidade(3);
       

        ItemConsumacao item2 = new ItemConsumacao();
        item2.setNome("Hamburguer");
        item2.setPreço(20.0);
        item2.setQuantidade(2);

        System.out.println("Subtotal item1: " + item1.getSubtotal());
        System.out.println("Subtotal item2: " + item2.getSubtotal());

        System.out.println("======= criando Comanda ======");
         ItemConsumacao Suco = new ItemConsumacao();
        Suco.setNome("Suco"); 
        Suco.setPreço(7.0);
        Suco.setQuantidade(1);
        
        Comandas Chamado = new Comandas();
        Chamado.setID(1);
        
        Chamado.AdicionarItem(item1);
        Chamado.AdicionarItem(item2);
        Chamado.AdicionarItem(Suco);
        
        System.out.println("Total da Comanda: " + Chamado.CalcularTotalComanda());
        
        System.out.println("==== Criando Pedido ====");
        
        Pedidos pedidonl = new Pedidos();
        pedidonl.setID(1001);// ID do pedido
        
        pedidonl.AdicionarItem(Chamado);
        
        System.out.println("Total do pedido1: " + pedidonl.Calcular_Total_Pedido());
    }
}
