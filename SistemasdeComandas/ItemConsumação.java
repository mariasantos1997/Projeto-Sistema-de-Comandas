
package sistemadecomandas;
// Classe Item de Consumação para conectar a main SistemasdeCoamandas
public class ItemConsumacao {
    private String Nome;// (-)  Variavel Privada do tipo String para armazenar o Nome do item de consumo
    private double Preço;// (-)  Variavel Privada do tipo double para armazenar o Preço do item de consumo
    private int Quantidade;// (-)  Variavel Privada do tipo inteiro para armazenar a Quantidade do item de consumo
    
    // onde o Usuario ira adicionar o Nome, Preço e Quantidade do item de consumo
    public void ItemConsumacao(String Nome,double Preço,int Quantidade){// (+)  Metodo publico do tipo void para adicionar o Nome, Preço e Quantidade do item de consumo
      this.Nome = Nome;
      this.Preço = Preço;
      this.Quantidade = Quantidade;
    }

    // onde o Usuario ira colocar o Nome, Preço e Quantidade do item de consumo
    public void setNome(String Nome){// (+)  Metodo publico do tipo void para setar o Nome do item de consumo colocando dentro o tipo da variavel privada Nome
        this.Nome = Nome;// Trabalha somente com a variavel privada Nome, que armazena o Nome do item de consumo
    }
    // onde o Usuario ira ver o Nome do item de consumo
    public String getNome(){// (+)  Metodo publico do tipo String para retornar o Nome do item de consumo
        return Nome;// Trabalha somente com a variavel privada Nome, que retorna o Nome do item de consumo
    }
    // onde o Usuario colocar o Preço e Quantidade do item de consumo
    public void setPreço(double Preço){// (+)  Metodo publico do tipo void para setar o Preço do item de consumo colocando dentro o tipo da variavel privada Preço
        this.Preço = Preço;// Trabalha somente com a variavel privada Preço, que armazena o Preço do item de consumo
    }
    // onde o Usuario ira ver o Preço do item de consumo
    public double getPreço(){// (+)  Metodo publico do tipo double para retornar o Preço do item de consumo
        return Preço;// Trabalha somente com a variavel privada Preço, que retorna o Preço do item de consumo
    }
    // onde o Usuario ira colocar a Quantidade do item de consumo
    public void setQuantidade(int Quantidade){// (+)  Metodo publico do tipo void para setar a Quantidade do item de consumo colocando dentro o tipo da variavel privada Quantidade
        this.Quantidade = Quantidade;// Trabalha somente com a variavel privada Quantidade, que armazena a Quantidade do item de consumo
    }
    // onde o Usuario ira ver a Quantidade do item de consumo
    public int getQuantidade(){// (+)  Metodo publico do tipo inteiro para retornar a Quantidade do item de consumo
        return Quantidade;// Trabalha somente com a variavel privada Quantidade, que retorna a Quantidade do item de consumo
    }
    // onde o Usuario ira ver o Subtotal do item de consumo
    public double getSubTotal(){// (+)  Metodo publico do tipo double para retornar o Subtotal do item de consumo
        return Preço * Quantidade;// Trabalha somente com a variavel privada Preço e Quantidade, que retorna o Subtotal do item de consumo junto com a logica de multiplicação do Preço e Quantidade do item de consumo
    }
}
