//Vitor Kenji Soares Yasuda

public class PesoException extends Exception{
    Leitura l = new Leitura();

    public void corrigePeso(Gado gado){
        try{
            gado.setPeso(Float.parseFloat(l.entDados("O peso deve ser maior que 10:")));
        }catch(PesoException pe){
            pe.corrigePeso(gado);
        }
    }
}
