/*Crie uma classe chama Esfera que tenha um atributo que represente seu raio.
Além disso nessa classe deve ter um método que calcule o volume dessa esfera.
Obs: O volume de uma esfera é dado como: (4.0/3.0) * PI * raio³)*/

public class Esfera {
    
    double Raio;
    double Volume;
    
    void CalcularVolume(){
        
        Volume = (4.0 / 3.0) * Math.PI * Math.pow(Raio, 3);
    }
    
}
