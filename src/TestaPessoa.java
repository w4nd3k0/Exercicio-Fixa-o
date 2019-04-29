/*Crie uma classe TestaPessoa onde você irá criar uma pessoa, colocar seu nome e
idade iniciais, fazer alguns aniversários (aumentando a idade) e imprimir no fim seu
nome e sua idade.*/

public class TestaPessoa {
    
    public static void main(String[] args) {
        
        Pessoa P1 = new Pessoa();
        P1.Nome_Pessoa = "Wanderley";
        P1.Idade_Pessoa = 31;
        
        int Aniversario = 2;
            
        P1.Idade_Pessoa = P1.Idade_Pessoa + Aniversario;
        
        
        System.out.println("Nome: " + P1.Nome_Pessoa);
        System.out.println("Idade:" + P1.Idade_Pessoa);
        
    }
    
}
