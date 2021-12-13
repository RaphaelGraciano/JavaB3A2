import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao2 {
    public static void main(String args[]) throws IOException {
        // COLOCAR CAMINHO PARA O ARQUIVO TXT EM QUESTÃO!!!!
        FileInputStream ArquivoDeEntrada = new FileInputStream("C:/Users/rapha/Desktop/Java B3A2/questao2.txt");
        InputStreamReader inputtxt = new InputStreamReader(ArquivoDeEntrada);
        BufferedReader funcaoler = new BufferedReader(inputtxt);
        String linha1 = funcaoler.readLine();
        String linha2 = funcaoler.readLine();
        int andares = Integer.parseInt(linha1);
        int capacidade = Integer.parseInt(linha2);
        Elevador elevador = new Elevador();
        elevador.Inicializar(capacidade, andares);
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Desce();
        elevador.Desce();
        elevador.Desce();
        elevador.Sai();
        elevador.Desce();
    }
}