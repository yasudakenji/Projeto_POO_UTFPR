//Vitor Kenji Soares Yasuda

import java.util.Date;

public abstract class Gado implements Calculo {

    private int codigo;
    private float peso;
    private int idade;
    private String sexo;
    private String raca;
    private String cor;
    private HistoricoMedico historico;
    private Date dataCompra;


    //Polimorfismo por sobrecarga
    public Gado() {
        codigo = 0;
        peso = 0;
        idade = 0;
        raca = "";
        cor = "";
        historico = new HistoricoMedico();
        dataCompra = new Date();

    }

    public Gado(int codigo, float peso, int idade, String sexo, String raca, String cor, HistoricoMedico historico, Date dataCompra) {
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

    public float getPeso() {
        return peso;
    }

    public int getIdade() {
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

    public Date getData() {
        return dataCompra;
    }


    public final void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public final void setPeso(float peso) throws PesoException{
        if(peso<10){
            throw new PesoException();
        }
        this.peso = peso;
    }

    public final void getIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setIdade(int idade) throws IdadeException {
        if(idade<1){
            throw new IdadeException();
        }
        this.idade = idade;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
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

    public final void setData(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public abstract float calculoConfiRacao();

    public abstract int calculoConfiIdade();
}