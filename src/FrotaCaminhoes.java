public class FrotaCaminhoes extends Veiculo {
    private int capacidadeCarga;
    public FrotaCaminhoes(){}
    public FrotaCaminhoes(int idVeiculo, int quilometragemVeiculo, String tipoVeiculo, int capacidadeCarga){
        super(idVeiculo, quilometragemVeiculo, tipoVeiculo);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mostrarVeiculo(){
        System.out.println("seu "+getTipoVeiculo()+" com uma capacidade de carga de "+this.capacidadeCarga+" quilos e com a placa:|"+ getIdVeiculo()+"| percorreu um total de: "+getQuilometragemVeiculo()+ " kilometros.");
    }


}
