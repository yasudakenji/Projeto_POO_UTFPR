//Vitor Kenji Soares Yasuda

public class IdadeException extends Exception{
    Leitura l = new Leitura();

    public void corrigeIdade(Gado gado){
        try{
            gado.setIdade(Integer.parseInt(l.entDados("Idade deve ser maior que 1!")));
        }catch(IdadeException ie){
            ie.corrigeIdade(gado);
        }
    }
}
