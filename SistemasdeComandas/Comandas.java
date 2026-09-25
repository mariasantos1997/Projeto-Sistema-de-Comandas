package sistemadecomandas;
public class Comandas {
    private int ID; 
    private int NumeroDaComanda; 
    private ItemConsumacao[]Item = new ItemConsumacao[0]; 
    
    
    public void setID(int ID){
    }
    public int getID(){
        return ID;
    }
    public void setNumero(int NumeroDaComanda){
        this.NumeroDaComanda = NumeroDaComanda;
    public ItemConsumacao[] getItem() {
        return Item;

    public void AdicionarItem(ItemConsumacao Item){
         ItemConsumacao[] novoArray = new ItemConsumacao[this.Item.length + 1];
        for(int i = 0; i < this.Item.length; i ++){
            novoArray[i] = this.Item[i];
        }
        novoArray[novoArray.length - 1] = Item;
        this.Item = novoArray;
    }
    public double CalcularTotalComanda(){
        double Total = 0;
        for(int i = 0; i < Item.length; i++){
             Total = Total + Item[i].getSubtotal();
        }
        return Total;
    }
}
