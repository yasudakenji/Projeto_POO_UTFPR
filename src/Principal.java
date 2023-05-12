//Vitor Kenji Soares Yasuda

import java.util.ArrayList;
import java.util.List;

public class Principal {

    static List<Gado> listaGado = new ArrayList<>();
    private static int cod = 0;

    public static void imprimir() {

        for (int i = 0; i < listaGado.size(); i++) {

            System.out.println("Codigo:" + listaGado.get(i).getCodigo());
            System.out.println("Peso:" + listaGado.get(i).getPeso());
            System.out.println("Idade:" + listaGado.get(i).getIdade());
            System.out.println("Sexo:" + listaGado.get(i).getSexo());
            System.out.println("Cor:" + listaGado.get(i).getCor());
            System.out.println("Raca:" + listaGado.get(i).getRaca());

            System.out.println("Vacina aplicada:" + listaGado.get(i).getHistorico().getVacina());
            System.out.println("Quantidade vacina:" + listaGado.get(i).getHistorico().getquantVacina());

            if (listaGado.get(i).getClass() == Angus.class) {
                System.out.println("Percentual de gordura:" + ((Angus) listaGado.get(i)).getQuantGordura());
                System.out.println("Qualidade da carne:" + ((Angus) listaGado.get(i)).getQualCarne());
                System.out.println("Precocidade:" + ((Angus) listaGado.get(i)).getPrecocidade());
            } else if (listaGado.get(i).getClass() == Tabapua.class) {
                System.out.println("Quantidade criacao:" + ((Tabapua) listaGado.get(i)).getQuantCria());
                System.out.println("Habilidade materna:" + ((Tabapua) listaGado.get(i)).getHabMaterna());
                System.out.println("Fertilidade:" + ((Tabapua) listaGado.get(i)).getFertilidade());
            } else {
                System.out.println("Ganho de peso:" + ((Nelore) listaGado.get(i)).getGanhoPeso());
                System.out.println("Nivel de adaptacao:" + ((Nelore) listaGado.get(i)).getNivelAdapt());
                System.out.println("Rusticidade:" + ((Nelore) listaGado.get(i)).getRusticidade());
            }
        }
    }

    public static void main(String[] args) {

        Leitura l = new Leitura();
        boolean loop = true;

        while (loop) {
            System.out.println("CADASTRAMENTO DE GADO");
            System.out.println("\n1) CADASTRAR NOVO ANIMAL");
            System.out.println("2) CONSULTAR ANIMAL");
            System.out.println("3) ALTERAR ANIMAL");
            System.out.println("4) EXCLUIR ANIMAL");
            System.out.println("0) SAIR");

            int opcao = Integer.parseInt(l.entDados("Escolha uma opção"));
            SwitchRaca sr = new SwitchRaca();

            switch (opcao) {
                case 1:
                    boolean voltar = false;
                    while (!voltar) {
                        System.out.println("\nSELECIONE A RACA");
                        System.out.println("1) ANGUS");
                        System.out.println("2) TABAPUA");
                        System.out.println("3) NELORE");
                        System.out.println("0) VOLTAR PARA O MENU PRINCIPAL");

                        int opcaoRaca = Integer.parseInt(l.entDados("Escolha uma opcao"));

                        switch (opcaoRaca) {
                            case 1 -> sr.srAngus();
                            case 2 -> sr.srTabapua();
                            case 3 -> sr.srNelore();
                            case 0 -> voltar = true;
                        }
                    }
                    break;
                case 2:
                    imprimir();
                    break;
                case 0:
                    loop = false;
                    break;
            }
        }
    }
}