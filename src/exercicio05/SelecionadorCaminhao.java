package exercicio05;

import java.util.ArrayList;
import java.util.List;

public class SelecionadorCaminhao extends Controle{
    private static int totalCaminhoes = 0;

    public static void selecionaMaisApto(){
        List<Caminhao> listaCaminhoes = new ArrayList<Caminhao>();

        // Verificação para iniciar o looping

        String tipoCaminhao = "";
        System.out.println("Compute os dados da sua lista de caminhões:");
        while (!(tipoCaminhao.equals("Alfa") || tipoCaminhao.equals("Beta") || tipoCaminhao.equals("Fim"))) {
            System.out.println("Digite um tipo válido para o caminhão (Alfa, Beta ou Fim para terminar): ");
            tipoCaminhao = leString();
        }

        // Aqui ele lê a lista com os dados dos caminhoes até digitar Fim
        while(!tipoCaminhao.equals("Fim")){
            int totalPluviometros;

            System.out.println("Digite o número de pluviômetros a serem transportados: ");
            totalPluviometros = leInteiro();

            System.out.println("Agora, compute a lista de pluviômetros a serem transportados: ");
            List<Pluviometro> listaPluviometros = new ArrayList<Pluviometro>();

            for(int i=0; i<totalPluviometros; i++){
                System.out.println("Digite um tipo de pluviômetro válido (p, m ou g) -> ["+i+"]: ");
                String tipoPluviometro = leString();
                boolean validaTipo = (!(tipoPluviometro.equals("p")||tipoPluviometro.equals("m")||tipoPluviometro.equals("g")));
                while(validaTipo){
                    System.out.println("Tente novamente -> ["+i+"]: ");
                    tipoPluviometro = leString();
                    validaTipo = (!(tipoPluviometro.equals("p")||tipoPluviometro.equals("m")||tipoPluviometro.equals("g")));
                }
                Pluviometro p = new Pluviometro(tipoPluviometro);
                listaPluviometros.add(p);
            }

            Caminhao c = new Caminhao(tipoCaminhao, totalPluviometros, listaPluviometros);
            listaCaminhoes.add(c);

            // Verificação para fechar o looping
            System.out.println("Digite um tipo válido para o caminhão (Alfa, Beta ou Fim para terminar): ");
            tipoCaminhao = leString();
            while (!(tipoCaminhao.equals("Alfa") || tipoCaminhao.equals("Beta") || tipoCaminhao.equals("Fim"))) {
                System.out.println("Tente novamente (Alfa, Beta ou Fim para terminar): ");
                tipoCaminhao = leString();
            }

            totalCaminhoes++;
        }


        // Código para encontrar o mais apto, podia colocar num outro método, privado de preferencia

        int idMaisApto = 0, capacidadeTotal = 0;
        for(int i = 0; i < totalCaminhoes; i++) {
            if(i==0){
                for(int j = 0; j< listaCaminhoes.get(i).getTotalPluviometros(); j++) {
                    capacidadeTotal = capacidadeTotal + listaCaminhoes.get(i).listaPluviometros.get(j).getCapacidade();
                }
            }else{
                int aux = 0;
                for(int j = 0; j< listaCaminhoes.get(i).getTotalPluviometros(); j++) {
                    aux = aux + listaCaminhoes.get(i).listaPluviometros.get(j).getCapacidade();
                }
                if(aux>capacidadeTotal){
                    idMaisApto=i;
                    capacidadeTotal=aux;
                }
            }
        }

        // Faz a impressão do caminhão mais apto, idem o comentario acima

        System.out.println("O caminhão mais apto tem: ");
        System.out.println("Tipo: "+ listaCaminhoes.get(idMaisApto).getTipo());
        System.out.println("Lista de Pluviômetros: ");
        for(int i = 0; i< listaCaminhoes.get(idMaisApto).getTotalPluviometros(); i++){
            System.out.println("Pluviômetro["+i+"] -> Tipo: "+ listaCaminhoes.get(idMaisApto).listaPluviometros.get(i).getTipo()+
                    " -> Capacidade: " + listaCaminhoes.get(idMaisApto).listaPluviometros.get(i).getCapacidade()+"mm");
        }
    }
}
