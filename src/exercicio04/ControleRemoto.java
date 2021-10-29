package exercicio04;

public class ControleRemoto
{
    public void incrementaCanal(Televisao tv){
        if(tv.getCanalAtual()<tv.getTotalCanais()){
            tv.setCanalAtual(tv.getCanalAtual() + 1);
        }else{
            tv.setCanalAtual(0);
        }

    }

    public void diminuiCanal(Televisao tv){
        if(tv.getCanalAtual()>0){
            tv.setCanalAtual(tv.getCanalAtual() - 1);
        }else{
            tv.setCanalAtual(tv.getTotalCanais());
        }
    }

    public void aumentaVolume(Televisao tv){
        if(tv.getVolumeAtual()<tv.getVolumeMax()){
            tv.setVolumeAtual(tv.getVolumeAtual() + 1);
        }else{
            System.out.println("Volume máximo alcançado");
        }
    }

    public void diminuiVolume(Televisao tv){
        if(tv.getVolumeAtual()>0){
            tv.setVolumeAtual(tv.getVolumeAtual() - 1);
        }else{
            System.out.println("Volume mínimo alcançado");
        }
    }

    public void consultaEstado(Televisao tv){
        System.out.println("Volume: " + tv.getVolumeAtual() + " Canal: " + tv.getCanalAtual());
    }
}
