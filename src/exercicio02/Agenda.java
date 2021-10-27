package exercicio02;

import java.util.Objects;

public class Agenda {
    private Pessoa[] lista = new Pessoa[10];

    public void armazenaPessoa(String nome, int idade, float altura) {
        boolean sucessoArmazenaPessoa = false;
        for(int i=0; i<lista.length; i++){
            if(this.lista[i]==null){
                lista[i] = new Pessoa(nome, idade, altura);
                sucessoArmazenaPessoa = true;
                break;
            }
        }
        if(!sucessoArmazenaPessoa){
            System.out.println("Erro em armazenar, agenda cheia");
        }
    }

    public void removePessoa(String nome){
        boolean sucessoRemocao = false;
        for(int i=0; i<lista.length; i++){
            if(Objects.equals(this.lista[i].getNome(), nome)){
                for(int j=i; j<lista.length; j++){
                    if(lista[j+1]!=null&&j<9){
                        lista[j]=lista[j+1];
                        lista[j+1]=null;
                    }else{
                        if(j==9){
                            lista[j]=null;
                        }
                        break;
                    }
                }
                sucessoRemocao = true;
                break;
            }
        }
        if(!sucessoRemocao){
            System.out.println("Erro, nome não encontrado.");
        }
    }

    public int buscaPessoa(String nome){
        for(int i=0; i<lista.length; i++){
            if(Objects.equals(lista[i].getNome(), nome)){
                return i;
            }
        }
        return -1;
    }

    public void imprimeAgenda(){
        System.out.println("##### Agenda JAVA_TRILHA_BÁSICA #####\n");
        for(int i=0; i<lista.length; i++){
            if(lista[i]!=null){
                System.out.println("Contato ID[" + i + "]:");
                lista[i].imprimeDadosPessoa();
                System.out.println("");
            }
        }
    }

    public void imprimePessoa(int index){
        if(lista[index]!=null){
            lista[index].imprimeDadosPessoa();
        }else{
            System.out.println("Indice nulo.");
        }
    }
}


