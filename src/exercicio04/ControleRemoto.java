package exercicio04;

public class ControleRemoto implements AcoesControle
{
    private final Televisao tv;

    public ControleRemoto(Televisao tv){
        this.tv = tv;
    }

    @Override
    public void incrementaCanal(){
        if(tv.getCanalAtual()<tv.getTotalCanais()){
            tv.setCanalAtual(tv.getCanalAtual() + 1);
        }else{
            tv.setCanalAtual(0);
        }
    }
    @Override
    public void diminuiCanal(){
        if(tv.getCanalAtual()>0){
            tv.setCanalAtual(tv.getCanalAtual() - 1);
        }else{
            tv.setCanalAtual(tv.getTotalCanais());
        }
    }

    @Override
    public void aumentaVolume(){
        if(tv.getVolumeAtual()<tv.getVolumeMax()){
            tv.setVolumeAtual(tv.getVolumeAtual() + 1);
        }else{
            System.out.println("Volume máximo alcançado");
        }
    }

    @Override
    public void diminuiVolume(){
        if(tv.getVolumeAtual()>0){
            tv.setVolumeAtual(tv.getVolumeAtual() - 1);
        }else{
            System.out.println("Volume mínimo alcançado");
        }
    }

    @Override
    public void trocaCanal(int canal){
        if(canal>=0&&canal<=tv.getTotalCanais())
            tv.setCanalAtual(canal);
        else
            System.out.println("Não existe esse canal");
    }
    @Override
    public void consultaEstado(){
        System.out.println("Volume: " + tv.getVolumeAtual() + " Canal: " + tv.getCanalAtual());
    }
}
