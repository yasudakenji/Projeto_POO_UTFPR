//Vitor Kenji Soares Yasuda

import java.time.LocalDate;

public class Nelore extends Gado {

    private int ganhoPeso;
    private String nivelAdapt;
    private String rusticidade;

    //Polimorfismo por sobrecarga
    public Nelore() {
        ganhoPeso = 0;
        nivelAdapt = "";
        rusticidade = "";
    }

    public Nelore(int codigo, int peso, int idade, String sexo, String raca, String cor, HistoricoMedico historico, LocalDate dataCompra, int ganhoPeso, String nivelAdapt, String rusticidade) {
        super(codigo, peso, idade, sexo, raca, cor, historico, dataCompra);
        this.ganhoPeso = ganhoPeso;
        this.nivelAdapt = nivelAdapt;
        this.rusticidade = rusticidade;
    }

    public int getGanhoPeso() {
        return ganhoPeso;
    }

    public void setGanhoPeso(int ganhoPeso) {
        this.ganhoPeso = ganhoPeso;
    }

    public String getNivelAdapt() {
        return nivelAdapt;
    }

    public void setNivelAdapt(String nivelAdapt) {
        this.nivelAdapt = nivelAdapt;
    }

    public String getRusticidade() {
        return rusticidade;
    }

    public void setRusticidade(String rusticidade) {
        this.rusticidade = rusticidade;
    }

}
