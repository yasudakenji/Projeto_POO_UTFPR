//Vitor Kenji Soares Yasuda

import java.util.Date;

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

    public Tabapua(int codigo, int peso, int idade, String sexo, String raca, String cor, HistoricoMedico historico, Date dataCompra, int quantCria, String habMaterna, String fertilidade) {
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
