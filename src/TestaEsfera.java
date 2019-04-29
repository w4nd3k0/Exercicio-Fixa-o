/*Crie uma classe chama Esfera que tenha um atributo que represente seu raio.
Além disso nessa classe deve ter um método que calcule o volume dessa esfera.
Obs: O volume de uma esfera é dado como: (4.0/3.0) * PI * raio³)*/

public class TestaEsfera {
    
    public static void main(String[] args) {
        
        Esfera E1 = new Esfera();
        
        E1.Raio = 2;
        E1.CalcularVolume();
        
        System.out.println("Volume: " + E1.Volume);
        
    }
    
}
