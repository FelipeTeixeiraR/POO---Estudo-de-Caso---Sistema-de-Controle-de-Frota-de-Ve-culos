import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Veiculo v1 =  new FrotaCarros(133213, 290, "carro", 5);
        Veiculo v2 = new FrotaCaminhoes(58723, 1230, "caminhão", 1000);


        v1.kmTxt();
        v1.adicionarQuilometragem(scanner.nextInt());
        v2.kmTxt();
        v2.adicionarQuilometragem(scanner.nextInt());

        v1.mostrarVeiculo();
        v2.mostrarVeiculo();

        v1.percorrer();
        v2.percorrer();

    }
}
