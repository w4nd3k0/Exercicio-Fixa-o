/*b) Crie uma classe MainProduto e teste a classe Produto.*/

public class MainProduto {
    
    public static void main(String[] args) {
        
        Produto P1 = new Produto();
        
        P1.Nome_Produto = "Açaí";
        P1.Preco = 10;
        
        System.out.println("Produto: " + P1.Nome_Produto);
        System.out.println("Preço: " + P1.Preco);
        
        P1.diminuir10();
        System.out.println("Produto: " + P1.Nome_Produto);
        System.out.println("Preço: " + P1.Preco);
        
        P1.aumenta25();
        System.out.println("Produto: " + P1.Nome_Produto);
        System.out.println("Preço: " + P1.Preco);      
        
    }
    
}
