/*Copiando a classe FuncionarioV1, crie uma classe FuncionarioV2 adicionando um
método chamado mostrar() que não recebe nem devolve nenhum valor e somente
imprime todos os atributos do funcionário.*/

public class FuncionarioV2 {
    
    String Funcionario;
    String Departamento;
    double Salario;
    String Data_Entrada;
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
    System.out.println("Data Entrada: " + Data_Entrada);
    System.out.println("Situação: " + Ativo);

}
    
}
