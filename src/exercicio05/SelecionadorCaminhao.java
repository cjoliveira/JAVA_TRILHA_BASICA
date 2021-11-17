package exercicio05;

import java.util.ArrayList;
import java.util.List;

public class SelecionadorCaminhao extends Controle{
    private static int totalCaminhoes = 0;

    public static void selecionaMaisApto(){
        List<Caminhao> listaCaminhoes = new ArrayList<Caminhao>();
        TipoCaminhao tipoCaminhao;
        System.out.println("Compute os dados da sua lista de caminhões:");
        boolean opcao = true;

        while(opcao){
            System.out.print("\nDigite um tipo válido para o caminhão (Alfa, Beta ou Fim para terminar): ");
            String entrada = leString();
            try{
                tipoCaminhao = TipoCaminhao.getTipoByString(entrada);
                if(tipoCaminhao.equals((TipoCaminhao.ENCERRA))){
                    opcao = false;
                    System.out.println("Saindo...\n");
                    int idMaisApto = getIdMaisApto(listaCaminhoes);
                    imprimeCaminhaoMaisApto(idMaisApto, listaCaminhoes);
                }else{
                    System.out.print("Digite o número de pluviômetros a serem transportados: ");
                    int totalPluviometros = leInteiro();
                    List<Pluviometro> listaPluviometros = geraListaPluviometros(totalPluviometros);
                    Caminhao c = new Caminhao(tipoCaminhao.getTipo(), totalPluviometros, listaPluviometros);
                    listaCaminhoes.add(c);
                    totalCaminhoes++;
                }
            }catch(RuntimeException e) {
                System.out.println("Tipo inválido. Tente novamente...");
            }
        }
    }

    // Métodos que vericam se os tipos são válidos
    public static boolean ehTipoValidoPluviometro(String tipoPluviometro){
        return (tipoPluviometro.equalsIgnoreCase("p")||tipoPluviometro.equalsIgnoreCase("m")||tipoPluviometro.equalsIgnoreCase("g"));
    }

    // Método que gera a lista com os pluviometros
    private static List<Pluviometro> geraListaPluviometros(int totalPluviometros){
        List<Pluviometro> listaPluviometros = new ArrayList<Pluviometro>();
        for(int i=0; i<totalPluviometros; i++){
            System.out.print("Digite um tipo de pluviômetro válido (p, m ou g) -> ["+i+"]: ");
            String tipoPluviometro = leString();
            while(!ehTipoValidoPluviometro(tipoPluviometro)){
                System.out.print("Tente novamente -> ["+i+"]: ");
                tipoPluviometro = leString();
            }
            Pluviometro p = new Pluviometro(tipoPluviometro);
            listaPluviometros.add(p);
        }
        return listaPluviometros;
    }

    // Métodos para encontrar e imprimir o caminhão mais apto
    private static int getIdMaisApto(List<Caminhao> listaCaminhoes){
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
        return idMaisApto;
    }

    private static void imprimeCaminhaoMaisApto(int idMaisApto, List<Caminhao> lista){
        System.out.println("O caminhão mais apto tem: ");
        System.out.println("Tipo: "+ lista.get(idMaisApto).getTipo());
        System.out.println("Lista de Pluviômetros: ");
        for(int i = 0; i< lista.get(idMaisApto).getTotalPluviometros(); i++){
            System.out.println("Pluviômetro["+i+"] -> Tipo: "+ lista.get(idMaisApto).listaPluviometros.get(i).getTipo()+
                    " -> Capacidade: " + lista.get(idMaisApto).listaPluviometros.get(i).getCapacidade()+"mm");
        }
    }
}
