/*Crie uma classe chamada Produto com os atributos preço e nome.
a) Nessa classe crie o método diminuir10 que diminui o preço em 10% e o método
aumenta25 que aumenta o preço em 25%.*/

public class Produto {
    
    String Nome_Produto;
    double Preco;
    
void diminuir10(){
    
    Preco = Preco - (Preco/100*10);
}
void aumenta25(){
    
    Preco = Preco + (Preco/100*25);
}  
}
