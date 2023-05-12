//Vitor Kenji Soares Yasuda

import java.util.Date;

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

    public Nelore(int codigo, int peso, int idade, String sexo, String raca, String cor, HistoricoMedico historico, Date dataCompra, int ganhoPeso, String nivelAdapt, String rusticidade) {
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

    //Polimorfismo por sobrescricao -> sobrescrevendo metodo abstrato
    public int qtdHist() {
        return 1; //retorna 1, pois ainda nao foi implementado a lista de historico medico
    }

    public float calcPastoPeso(float peso) {
        float pesoIdeal = 500.0f;
        return (pesoIdeal - peso <= 0) ? 0.0f : pesoIdeal - peso;
    }

    public int calcPastoIdade(int idade) {
        int idadeIdeal = 70;
        return (idadeIdeal - idade <= 0) ? 0 : idadeIdeal - idade;
    }

    public float calculoConfiRacao() {
        return (float) (0.03 * getPeso());
    }

    public int calculoConfiIdade() {
        int idadeIdeal = 70;
        return (idadeIdeal - getIdade() <= 0) ? 0 : idadeIdeal - getIdade();
    }

}
