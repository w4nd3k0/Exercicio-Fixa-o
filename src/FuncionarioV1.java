/*Crie uma classe FuncionarioV1. Ela deve ter o nome do funcionário (String), o
departamento onde trabalha (String), seu salário (double), a data de entrada no
banco (String), seu RG (String) e um atributo chamado ativo que é um valor
booleano que indique se o funcionário está na empresa no momento ou se já foi
embora.*/

public class FuncionarioV1 {
    
    String Funcionario;
    String Departamento;
    double Salario;
    String Data_Entrada;
    String RG;
    boolean Ativo;
    
/*Crie um método bonifica que aumenta o salario do funcionário de acordo com o
parâmetro passado como argumento. Esse argumento representa a
porcentagem de aumento que o funcionário irá receber.*/

void Bonifica(double Aumento){  
  Salario = Salario + (Salario / 100 * Aumento);
}

/*Crie, também, um método demite, que não recebe parâmetro algum, só
modifica o valor booleano indicando que o funcionário não trabalha mais na
empresa.*/

void Demite(){
    
    this.Ativo = false;
}
    
}

