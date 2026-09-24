
package sistemadecomandas;
// Classe Pedido para conectar a main SistemasdeComandas 
public class Pedidos {
    private int ID;// (-)  Variavel Privada do tipo inteiro para armazenar o ID do pedido
    private Comandas[]Pedido = new Comandas[0]; // (-)  Variavel Privada do tipo Comandas[] para armazenar o vetor/array de comandas do pedido
    
    // onde o Usuario ira Adicionar o ID do pedido
    public void setID(int ID){ // (-)  Metodo publico do tipo void para setar o ID do pedido
        this.ID = ID;// Trabalha somente com a variavel privada ID, que armazena o ID do pedido
    }
    // onde o Usuario ira ver o ID do pedido que ele adicionou
    public int getID(){// (+)  Metodo publico do tipo inteiro para retornar o ID do pedido
        return ID;// Trabalha somente com a variavel privada ID, que retorna o ID do pedido
    }
    // onde o Usuario ira ver o vetor/array de comandas do pedido
    public Comandas[] getComanda(){// (+)  Metodo publico do tipo Comandas[] para retornar o vetor/array de comandas do pedido
        return Pedido;// Trabalha somente com a variavel privada Pedido, que retorna o vetor/array de comandas do pedido
    }
    // onde o Usuario ira adicionar uma comanda no vetor/array de comandas do pedido
    public void AdicionarItem(Comandas Comanda){// (-)  Metodo publico do tipo void para adicionar uma comanda no vetor/array de comandas do pedido
         Comandas[] novoArray = new Comandas[this.Pedido.length + 1];// Cria um novo vetor/array de comandas com tamanho maior em 1(length) do que o vetor/array de comandas do pedido
        // Logica de contagem para adicionar a comanda no vetor/array de comandas do pedido
        for(int i = 0; i < this.Pedido.length; i ++){ // Loop para percorrer o vetor/array de comandas do pedido
            novoArray[i] = this.Pedido[i];// Adiciona a comanda no novo vetor/array de comandas do pedido
        }
        novoArray[novoArray.length - 1] = Comanda;// Adiciona a comanda no final do novo vetor/array de comandas do pedido
        this.Pedido = novoArray;// Atualiza o vetor/array de comandas do pedido com o novo vetor/array de comandas do pedido e trabalha somente com a variavel privada Pedido, que armazena o vetor/array de comandas do pedido
    }
    // onde o Usuario ira ver o total do pedido
    public double Calcular_Total_Pedido(){// (+)  Metodo publico do tipo double para calcular o total do pedido
        double Total = 0; // Variavel do tipo double para armazenar o total do pedido
        for(int i = 0; i < Pedido.length; i++){ // Loop para percorrer o vetor/array de comandas do pedido
            Total = Total + Pedido[i].CalcularTotalComanda(); // Adiciona o total da comanda no total do pedido e trabalha somente com a variavel privada Pedido, que armazena o vetor/array de comandas do pedido
        }
        return Total;// Retorna o total do pedido
    }
}
