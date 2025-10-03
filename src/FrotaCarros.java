import com.sun.jdi.DoubleValue;

public class FrotaCarros {

    private int quilometragemVeiculo;
    private String tipoVeiculo;
    private int quantiadePassageirosCarro;
    private int capacidadeDeCarga;


    public FrotaCarros(){

    }
    public FrotaCarros(int quilometragemVeiculo){
        this.quilometragemVeiculo = 0;
    }



    public void adicionarQuilometragem(int kms){
        if(kms>=0){
            this.quilometragemVeiculo+=kms;
        }
        else{
            System.out.println("A entrada não pode ser igual ou menor que 0!!!");
        }
    }

    public int getQuilometragemVeiculo(){return this.quilometragemVeiculo;}

    public void setQuilometragemVeiculo(int quilometragemVeiculo){this.quilometragemVeiculo = quilometragemVeiculo;}



    

}
