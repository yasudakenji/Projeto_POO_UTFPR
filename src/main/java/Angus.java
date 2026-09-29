//Vitor Kenji Soares Yasuda

import java.time.LocalDate;

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

    public Angus(int codigo, int peso, int idade, String sexo, String raca, String cor, HistoricoMedico historico, LocalDate dataCompra, int quantGordura, String qualCarne, String precocidade) {
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

}
