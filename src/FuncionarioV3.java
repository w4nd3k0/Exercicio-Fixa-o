/*Cria uma classe FuncionarioV3, copiando tudo que tem em FuncionarioV2. Crie
uma classe chamada Data que possui 3 campos int, para dia, mês e ano.
Modifique a classe FuncionarioV3 para que, ao invés de utilizar uma String para
representar a data, utilize a classe Data criada. (É parecido como quando fizemos
a classe Conta ter referência para um Cliente).*/

public class FuncionarioV3 {
    
    String Funcionario;
    String Departamento;
    double Salario;
    Data Data_Entrada;
    String RG;
    boolean Ativo;
    
void Bonifica(double Aumento){  
  Salario = Salario + (Salario / 100 * Aumento);
}

void Demite(){
    
    this.Ativo = false;
}

void Mostrar(){
    
    System.out.println("Nome: " + Funcionario);
    System.out.println("Departamento: " + Departamento);
    System.out.println("RG" + RG);
    System.out.println("Salário: " + Salario);
    System.out.println("Data Entrada: " + Data_Entrada.Dia + "/" + Data_Entrada.Mes + "/" + Data_Entrada.Ano);
    System.out.println("Situação: " + Ativo);

}
    
}
