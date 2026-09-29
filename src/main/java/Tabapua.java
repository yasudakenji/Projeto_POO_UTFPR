//Vitor Kenji Soares Yasuda

import java.time.LocalDate;

public class Tabapua extends Gado {

    private int quantCria;
    private String habMaterna;
    private String fertilidade;

    //Polimorfismo por sobrecarga
    public Tabapua() {
        quantCria = 0;
        habMaterna = "";
        fertilidade = "";
    }

    public Tabapua(int codigo, int peso, int idade, String sexo, String raca, String cor, HistoricoMedico historico, LocalDate dataCompra, int quantCria, String habMaterna, String fertilidade) {
        super(codigo, peso, idade, sexo, raca, cor, historico, dataCompra);
        this.quantCria = quantCria;
        this.habMaterna = habMaterna;
        this.fertilidade = fertilidade;
    }

    public int getQuantCria() {
        return quantCria;
    }

    public void setQuantCria(int quantCria) {
        this.quantCria = quantCria;
    }

    public String getHabMaterna() {
        return habMaterna;
    }

    public void setHabMaterna(String habMaterna) {
        this.habMaterna = habMaterna;
    }

    public String getFertilidade() {
        return fertilidade;
    }

    public void setFertilidade(String fertilidade) {
        this.fertilidade = fertilidade;
    }
}
