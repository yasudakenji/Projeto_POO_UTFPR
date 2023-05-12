//Vitor Kenji Soares Yasuda

public class HistoricoMedico {

    private String vacina;
    private int quantVacina;

    //Polimorfismo sobrecarga
    public HistoricoMedico() {
        vacina = "";
        quantVacina = 0;
    }

    public HistoricoMedico(String vacina, int quantVacina) {
        this.vacina = vacina;
        this.quantVacina = quantVacina;
    }

    public String getVacina() {
        return vacina;
    }

    public int getquantVacina() {
        return quantVacina;

    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public void setQuantVacina(int quantVacina) {
        this.quantVacina = quantVacina;
    }
}