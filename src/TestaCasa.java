/*Numa classe TestaCasa crie uma casa e pinte-a. Crie três portas e coloque-as 
na casa; abra e feche as mesmas como desejar. Utilize o método 
quantasPortasEstaoAbertas para imprimir o número de portas abertas.*/

public class TestaCasa {
    
    public static void main(String[] args) {
              
        Casa C1 = new Casa();
        
        C1.Cor = "Branca";
        C1.Porta1 = true;
        C1.Porta2 = false;
        C1.Porta3 = true;
        
        System.out.println("Portas Abertas: " + C1.QuantasPortasEstaoAbertas());
    }
    
}
