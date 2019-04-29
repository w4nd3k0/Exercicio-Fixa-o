/*Crie uma classe FuncionarioV4 (baseada na FuncionarioV3) que tenha um método
chamado equals e receba como parâmetro um outro FuncionarioV4 e compare se
os dois são iguais baseados nos seus valores de atributos. Crie uma classe
TestaFuncionarioV4 para testar o método equals.*/

public class FuncionarioV4 {
    
    String Funcionario;
    String Departamento;
    double Salario;
    Data Data;
    String RG;
    boolean Ativo;
    
void Bonifica(double Aumento){  
  Salario = Salario + (Salario / 100 * Aumento);
}

void Demite(){
    
    Ativo = false;
}

void Mostrar(){
    
    System.out.println("Nome: " + Funcionario);
    System.out.println("Departamento: " + Departamento);
    System.out.println("RG" + RG);
    System.out.println("Salário: " + Salario);
    System.out.println("Data Entrada: " + Data.Dia + "/" + Data.Mes + "/" + Data.Ano);
    System.out.println("Situação: " + Ativo);

}

void equals(FuncionarioV4 Func){
    
    if((Funcionario == Func.Funcionario) && (Departamento == Func.Departamento) && 
            (Salario == Func.Salario) && (RG == Func.RG) && (Ativo == Func.Ativo) && 
            (Data.Dia+Data.Mes+Data.Ano == Func.Data.Dia+Func.Data.Mes+Func.Data.Ano))
        
        System.out.println("São Iguais");
    
    else
        
        System.out.println("Não são iguais");
}
    
}
