public class FrotaCarros extends Veiculo{
    private int quantiadePassageirosCarro;

    public FrotaCarros(){}
    public FrotaCarros(int idVeiculo, int quilometragemVeiculo, String tipoVeiculo, int quantiadePassageirosCarro){
        super(idVeiculo, quilometragemVeiculo, tipoVeiculo);
        this.quantiadePassageirosCarro = quantiadePassageirosCarro;
    }

    @Override
    public void mostrarVeiculo(){
        System.out.println("seu "+getTipoVeiculo()+" com uma capacidade de passageiros de "+this.quantiadePassageirosCarro+" pessoas e com a placa:|"+ getIdVeiculo()+"| percorreu um total de: "+getQuilometragemVeiculo()+ " kilometros.");
    }

}

