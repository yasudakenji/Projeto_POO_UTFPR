//Vitor Kenji Soares Yasuda

import java.util.ArrayList;
import java.util.List;

public class BDGado {
    private List<Gado> listaGado = new ArrayList<>();
    private Integer id = 0;
    public List<Gado> getListaGado() {
        return listaGado;
        
    } 
    private static BDGado bancoUnico;
   

    public Gado buscarPorCod(int cod) {
        for (int i = 0; i < listaGado.size(); i++) {
            if (cod == listaGado.get(i).getCodigo()) {
                return listaGado.get(i);
            }
        }
        return null;
    }
    
     public static BDGado getBanco(){
        if(bancoUnico == null){
            bancoUnico = new BDGado();
        }
        return bancoUnico;
    }
     
     public List<Gado> getBDGado(){
         return listaGado;
     }
     
    public void cadGado(Gado gado) {
        id ++;
        gado.setCodigo(id);
        listaGado.add(gado);//Codigo é gerado automaticamente a cada novo cadastro
       
    }

    public boolean deletarGado(int id) {
        Gado gado = buscarPorCod(id);
        if (gado == null) {
            return false;
        }
        listaGado.remove(gado);
        return true;
    }

    public boolean altGado(Gado gado) {
        for (int i = 0; i < listaGado.size(); i++) {
            if (gado.getCodigo() == listaGado.get(i).getCodigo()) {
                listaGado.set(i, gado);
                return true;
            }
        }
        return false;
    }
}
