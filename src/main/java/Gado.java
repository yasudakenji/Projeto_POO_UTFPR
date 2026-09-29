//Vitor Kenji Soares Yasuda

import java.time.LocalDate;

public abstract class Gado {

    private int codigo;
    private float peso;
    private int idade;
    private String sexo;
    private String raca;
    private String cor;
    private HistoricoMedico historico;
    private LocalDate dataCompra;


    //Polimorfismo por sobrecarga
    public Gado() {
        codigo = 0;
        peso = 0;
        idade = 0;
        raca = "";
        cor = "";
        historico = new HistoricoMedico();
        dataCompra = LocalDate.now();

    }

    public Gado(int codigo, float peso, int idade, String sexo, String raca, String cor, HistoricoMedico historico, LocalDate dataCompra) {
        this.codigo = codigo;
        this.peso = peso;
        this.idade = idade;
        this.sexo = sexo;
        this.raca = raca;
        this.cor = cor;
        this.historico = historico;
        this.dataCompra = dataCompra;
    }


    public int getCodigo() {
        return codigo;
    }

    public Float getPeso() {
        return peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }

    public HistoricoMedico getHistorico() {
        return historico;
    }


    public final void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public final void setPeso(float peso) {
        this.peso = peso;
    }

    public final void getIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setIdade(int idade)  {

        this.idade = idade;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public final void setRaca(String raca) {
        this.raca = raca;
    }

    public final void setCor(String cor) {
        this.cor = cor;
    }

    public final void setHistorico(HistoricoMedico historico) {
        this.historico = historico;
    }

}