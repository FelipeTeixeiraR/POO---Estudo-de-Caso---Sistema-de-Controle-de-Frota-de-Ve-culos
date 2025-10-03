import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        FrotaCarros f = new FrotaCarros();

        f.adicionarQuilometragem(scanner.nextInt());


        System.out.println("este veiculo atualmente tem "+f.getQuilometragemVeiculo()+" kilometros rodados.");


    }
}
