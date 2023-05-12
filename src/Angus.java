//Vitor Kenji Soares Yasuda

import java.util.Date;

public class Angus extends Gado {

    private int quantGordura;
    private String qualCarne;
    private String precocidade;

    //Polimorfismo por sobrecarga
    public Angus() {
        int quantGordura = 0;
        String qualCarne = "";
        String precocidade = "";
    }

    public Angus(int codigo, int peso, int idade, String sexo, String raca, String cor, HistoricoMedico historico, Date dataCompra, int quantGordura, String qualCarne, String precocidade) {
        super(codigo, peso, idade, sexo, raca, cor, historico, dataCompra);
        this.quantGordura = quantGordura;
        this.qualCarne = qualCarne;
        this.precocidade = precocidade;
    }

    public int getQuantGordura() {
        return quantGordura;
    }

    public void setQuantGordura(int quantGordura) {
        this.quantGordura = quantGordura;
    }

    public String getQualCarne() {
        return qualCarne;
    }

    public void setQualCarne(String qualCarne) {
        this.qualCarne = qualCarne;
    }

    public String getPrecocidade() {
        return precocidade;
    }

    public void setPrecocidade(String precocidade) {
        this.precocidade = precocidade;
    }

    //Polimorfismo por sobrescricao -> sobrescrevendo metodo abstrato
    public int qtdHist() {
        return 1; //retorna 1, pois ainda nao foi implementado a lista de historico medico
    }
//Os dois metodos abaixo sao polimorfismo por sobrescrita -> interface
    public float calcPastoPeso(float peso) {
        float pesoIdeal = 500.0f;
        return (pesoIdeal - peso <= 0) ? 0.0f : pesoIdeal - peso;
    }

    public int calcPastoIdade(int idade) {
        int idadeIdeal = 70;
        return (idadeIdeal - idade <= 0) ? 0 : idadeIdeal - idade;
    }


    //Os dois metodos abaixo sao polimorfismo por sobrescrita -> metodo abstrato
    public float calculoConfiRacao() {
        return (float) (0.03 * getPeso());
    }

    public int calculoConfiIdade() {
        int idadeIdeal = 70;
        return (idadeIdeal - getIdade() <= 0) ? 0 : idadeIdeal - getIdade();
    }
}
