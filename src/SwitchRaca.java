//Vitor Kenji Soares Yasuda

public class SwitchRaca {

    private Angus angus = new Angus();
    private Tabapua tabapua = new Tabapua();
    private Nelore nelore = new Nelore();
    private Leitura l = new Leitura();
    private int cod = 0;
    public void srAngus (){
        angus = new Angus();
        System.out.println("ANGUS:");
        angus.setCodigo(++cod);
        angus.setRaca("Angus");
        try {
            angus.setPeso(Integer.parseInt(l.entDados("Peso:")));
        }catch (PesoException pe){
            pe.corrigePeso(angus);
        }
        try {
            angus.setIdade(Integer.parseInt(l.entDados("Idade:")));
        }catch (IdadeException ie){
            ie.corrigeIdade(angus);
        }
        angus.setCor(l.entDados("Cor:"));
        angus.getHistorico().setVacina(l.entDados("Vacina aplicada:"));
        angus.getHistorico().setQuantVacina(Integer.parseInt(l.entDados("Quantidade vacinas:")));
        angus.setPrecocidade(l.entDados("Nivel de preocidade:"));
        angus.setQualCarne(l.entDados("Qualidade da carne:"));
        angus.setQuantGordura(Integer.parseInt(l.entDados("Pencentual de gordura:")));
        Principal.listaGado.add(angus);
        System.out.println("Animal cadastrado com sucesso!");
    }
    public void srTabapua(){
        tabapua = new Tabapua();
        System.out.println("TABAPUA:");
        tabapua.setCodigo(++cod);
        tabapua.setRaca("Tabapua");
        try {
            tabapua.setPeso(Integer.parseInt(l.entDados("Peso:")));
        }catch (PesoException pe){
            pe.corrigePeso(tabapua);
        }
        try {
            tabapua.setIdade(Integer.parseInt(l.entDados("Idade:")));
        }catch (IdadeException ie){
            ie.corrigeIdade(tabapua);
        }
        tabapua.setCor(l.entDados("Cor:"));
        tabapua.getHistorico().setVacina(l.entDados("Vacina aplicada:"));
        tabapua.getHistorico().setQuantVacina(Integer.parseInt(l.entDados("Quantidade vacinas:")));
        tabapua.setQuantCria(Integer.parseInt(l.entDados("Quantidade criacao:")));
        tabapua.setHabMaterna(l.entDados("Habilidade materna:"));
        tabapua.setFertilidade(l.entDados("Fertilidade:"));
        Principal.listaGado.add(tabapua);
        System.out.println("Animal cadastrado com sucesso!");
    }
    public void srNelore(){
        nelore = new Nelore();
        System.out.println("NELORE:");
        nelore.setCodigo(++cod);
        nelore.setRaca("Nelore");
        try {
            nelore.setPeso(Integer.parseInt(l.entDados("Peso:")));
        }catch (PesoException pe){
            pe.corrigePeso(nelore);
        }
        try {
            nelore.setIdade(Integer.parseInt(l.entDados("Idade:")));
        }catch (IdadeException ie){
            ie.corrigeIdade(nelore);
        }
        nelore.setCor(l.entDados("Cor:"));
        nelore.getHistorico().setVacina(l.entDados("Vacina aplicada:"));
        nelore.getHistorico().setQuantVacina(Integer.parseInt(l.entDados("Quantidade vacinas:")));
        nelore.setGanhoPeso(Integer.parseInt(l.entDados("Ganho de peso:")));
        nelore.setNivelAdapt(l.entDados("Nivel de adaptacao:"));
        nelore.setRusticidade((l.entDados("Rusticidade:")));
        Principal.listaGado.add(nelore);
        System.out.println("Animal cadastrado com sucesso!");
    }
}
