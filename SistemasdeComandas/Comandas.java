
package sistemadecomandas;
// classe Coamanda para conectar a main de SistemadeComandas
public class Comandas {
    private int ID; // (-)  Variavel Privada do tipo inteiro para armazenar o ID da comanda
    private int NumeroDaComanda; // (-)  Variavel Privada do tipo inteiro para armazenar o Numero da comanda
    private ItemConsumacao[]Item = new ItemConsumacao[0]; // (-)  Variavel Privada do tipo ItemConsumacao[] para armazenar o vetor/array de itens de consumo da comanda
    
    // onde o Usuario ira adicionar o ID da comanda
    public void setID(int ID){// (+)  Metodo publico do tipo void para setar o ID da comanda colocando dentro o tipo da variavel privada ID
        this.ID = ID;// Trabalha somente com a variavel privada ID, que armazena o ID da comanda
    }
    // onde o Usuario ira ver o ID da comanda
    public int getID(){// (+)  Metodo publico do tipo inteiro para retornar o ID da comanda
        return ID;// Trabalha somente com a variavel privada ID, que retorna o ID da comanda
    }
    // onde o Usuario ira adicionar o Numero da comanda
    public void setNumero(int NumeroDaComanda){// (+)  Metodo publico do tipo void para setar o Numero da comanda colocando dentro o tipo da variavel privada NumeroDaComanda
        this.NumeroDaComanda = NumeroDaComanda;// Trabalha somente com a variavel privada NumeroDaComanda, que armazena o Numero da comanda
    }
    // onde o Usuario ira ver o Numero da comanda
    public int getNumeroDaComanda(){ // (+)  Metodo publico do tipo inteiro para retornar o Numero da comanda
        return NumeroDaComanda;// Trabalha somente com a variavel privada NumeroDaComanda, que retorna o Numero da comanda
    }
    // onde o Usuario ira ver o vetor/array de itens de consumo da comanda
    public ItemConsumacao[] getItem() {// (+)  Metodo publico do tipo ItemConsumacao[] para retornar o vetor/array de itens de consumo da comanda
        return Item;// Trabalha somente com a variavel privada Item, que retorna o vetor/array de itens de consumo da comanda
    }
    // onde o Usuario ira adicionar um item de consumo no vetor/array de itens de consumo da comanda
    public void AdicionarItem(ItemConsumacao Item){// (+)  Metodo publico do tipo void para adicionar um item de consumo no vetor/array de itens de consumo da comanda
         ItemConsumacao[] novoArray = new ItemConsumacao[this.Item.length + 1];// Cria um novo vetor/array de itens de consumo com tamanho maior em 1(length) do que o vetor/array de itens de consumo da comanda
        // Logica de contagem para adicionar o item de consumo no vetor/array de itens de consumo da comanda
        for(int i = 0; i < this.Item.length; i ++){// Loop para percorrer o vetor/array de itens de consumo da comanda
            novoArray[i] = this.Item[i];// Adiciona o item de consumo no novo vetor/array de itens de consumo da comanda
        }
        // Adiciona o item de consumo no final do novo vetor/array de itens de consumo da comanda
        novoArray[novoArray.length - 1] = Item;
        this.Item = novoArray;// Atualiza o vetor/array de itens de consumo da comanda com o novo vetor/array de itens de consumo da comanda e trabalha somente com a variavel privada Item, que armazena o vetor/array de itens de consumo da comanda
    }
    // onde o Usuario ira ver o total da comanda
    public double CalcularTotalComanda(){// (+)  Metodo publico do tipo double para calcular o total da comanda
        double Total = 0;// Variavel do tipo double para armazenar o total da comanda
        // Logica de contagem para calcular o total da comanda
        for(int i = 0; i < Item.length; i++){// Loop para percorrer o vetor/array de itens de consumo da comanda
             Total = Total + Item[i].getSubtotal();// Adiciona o subtotal do item de consumo no total da comanda e trabalha somente com a variavel privada Item, que armazena o vetor/array de itens de consumo da comanda
        }
        return Total;// Retorna o total da comanda
    }
}
