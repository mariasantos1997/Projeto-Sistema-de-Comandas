
package sistemadecomandas;
// Comentarios Para lembrar do que eu fiz 
public class SistemaDeComandas {

    public static void main(String[] args) {
        // Criando itens de consumo do Vetor/Array que serão adicionados na comanda
        System.out.println("===== Criando Itens =====");
        
        // Criando item1
        ItemConsumacao item1 = new ItemConsumacao();
        item1.setNome("Refrigerante");// Nome do item
        item1.setPreço(5.0);// Preço do item
        item1.setQuantidade(3);// Quantidade do item
        // subtotal esperado: 5.0 * 3 = 15.0

        // Criando item2
        ItemConsumacao item2 = new ItemConsumacao();
        item2.setNome("Hamburguer");// Nome do item
        item2.setPreço(20.0);// Preço do item
        item2.setQuantidade(2);// Quantidade do item
        // subtotal esperado: 20.0 * 2 = 40.0

        // Exibindo os subtotais dos itens para o usuário
        System.out.println("Subtotal item1: " + item1.getSubtotal()); // deve ser 15.0
        System.out.println("Subtotal item2: " + item2.getSubtotal()); // deve ser 40.0 

        // Criando comanda e adicionando os itens criados anteriormente
        System.out.println("======= criando Comanda ======");
         ItemConsumacao Suco = new ItemConsumacao();// Criando item3 no vetor/array que será adicionado na comanda
        Suco.setNome("Suco"); // Nome do item
        Suco.setPreço(7.0);// Preço do item
        Suco.setQuantidade(1);// Quantidade do item
        // subtotal esperado: 7.0 * 1 = 7.0
        
        // Criando comanda e adicionando os itens criados anteriormente
        Comandas Chamado = new Comandas();
        Chamado.setID(1);// ID da comanda
        
        // Adicionando os itens na comanda
        Chamado.AdicionarItem(item1);// Adicionando Refrigerante
        Chamado.AdicionarItem(item2);// Adicionando Hamburguer
        Chamado.AdicionarItem(Suco);// Adicionando Suco
        
        // Exibindo o total da comanda para o usuário
        System.out.println("Total da Comanda: " + Chamado.CalcularTotalComanda());
        
        // Criando pedido e adicionando a comanda criada anteriormente
        System.out.println("==== Criando Pedido ====");
        
        // Criando pedido e adicionando a comanda criada anteriormente
        Pedidos pedidonl = new Pedidos();
        pedidonl.setID(1001);// ID do pedido
        
        // Adicionando a comanda no pedido
        pedidonl.AdicionarItem(Chamado);
        
        // Exibindo o total do pedido para o usuário
        System.out.println("Total do pedido1: " + pedidonl.Calcular_Total_Pedido());
    }
}
