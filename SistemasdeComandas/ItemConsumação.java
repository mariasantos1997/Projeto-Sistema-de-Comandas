package sistemadecomandas;

public class ItemConsumacao {
    private String Nome;
    private double Preço;
    private int Quantidade;
    
    public void ItemConsumacao(String Nome,double Preço,int Quantidade){
      this.Nome = Nome;
      this.Preço = Preço;
      this.Quantidade = Quantidade;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public String getNome(){
        return Nome;
    }
    
    public void setPreço(double Preço){
        this.Preço = Preço;
    }
    public double getPreço(){
        return Preço;
    }
    public void setQuantidade(int Quantidade){
        this.Quantidade = Quantidade;
    }
    public int getQuantidade(){
        return Quantidade;
    }
    public double getSubTotal(){
        return Preço * Quantidade;
}
