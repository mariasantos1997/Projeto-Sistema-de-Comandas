package sistemadecomandas;
public class Pedidos {
    private int ID;
    private Comandas[]Pedido = new Comandas[0];
    public void setID(int ID){ 
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
    public Comandas[] getComanda(){
        return Pedido;
    }
    public void AdicionarItem(Comandas Comanda){
         Comandas[] novoArray = new Comandas[this.Pedido.length + 1];
        for(int i = 0; i < this.Pedido.length; i ++){ 
            novoArray[i] = this.Pedido[i];
        }
        novoArray[novoArray.length - 1] = Comanda;
        this.Pedido = novoArray;
    }
    public double Calcular_Total_Pedido(){
        double Total = 0; 
        for(int i = 0; i < Pedido.length; i++){ 
            Total = Total + Pedido[i].CalcularTotalComanda(); 
        }
        return Total;
    }
}
