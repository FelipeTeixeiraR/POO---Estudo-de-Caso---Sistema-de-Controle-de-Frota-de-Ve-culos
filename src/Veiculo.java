public abstract class Veiculo {
    private int idVeiculo;
    private int quilometragemVeiculo;
    private String tipoVeiculo;

    public Veiculo(){}

    public Veiculo(int idVeiculo, int quilometragemVeiculo, String tipoVeiculo){
        this.idVeiculo = idVeiculo;
        this.quilometragemVeiculo = quilometragemVeiculo;
        this.tipoVeiculo = tipoVeiculo;
    }

    public abstract void mostrarVeiculo();
    public void adicionarQuilometragem(int kms){

        if(kms>=0){
            this.quilometragemVeiculo+=kms;
        }
        else{
            System.out.println("A entrada não pode ser igual ou menor que 0!!!");
        }
    }
    public void kmTxt(){
        System.out.println("Digite quantos quilômetros foram percorridos com seu "+this.tipoVeiculo+" de placa |"+this.idVeiculo+"| : ");
    }

    public void percorrer(){
        if (getTipoVeiculo().equals("caminhão")){
            int consumo = getQuilometragemVeiculo() / 3;
            System.out.println("A quantidade de litros total consumida pelo Veiculo " + getIdVeiculo() + " foi de: " + consumo);
        }else if (getTipoVeiculo().equals("carro")){
            int consumo = getQuilometragemVeiculo() / 10;
            System.out.println("A quantidade de litros total consumida pelo Veiculo " + getIdVeiculo() + " foi de: " + consumo);
        }
    }
    public int getQuilometragemVeiculo(){return this.quilometragemVeiculo;}
    public String getTipoVeiculo() {return this.tipoVeiculo;}
    public int getIdVeiculo() {return this.idVeiculo;}

    public void setIdVeiculo(int idVeiculo) {this.idVeiculo = idVeiculo;}
    public void setTipoVeiculo(String tipoVeiculo) {this.tipoVeiculo = tipoVeiculo;}


}
