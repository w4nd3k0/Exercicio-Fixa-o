/*Crie uma Classe: Casa Atributos: cor, porta1, porta2, porta3 Método: void
pinta(String s), int quantasPortasEstaoAbertas().*/

public class Casa {
    
    String Cor;
    boolean Porta1;
    boolean Porta2;
    boolean Porta3;
    
void Pinta(String New_Cor){
    
    Cor = New_Cor;
    
}

int QuantasPortasEstaoAbertas(){
    
    int Total= 0;
    if(Porta1 == true)
       Total = Total+1;
    
    else if (Porta2 == true)
        Total = Total+1;
    
    else if (Porta3 == true)
        Total = Total+1;
    
    return Total;
}

}
