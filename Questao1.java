import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao1 {

    public static void main(String args[]) throws IOException {
        // COLOCAR CAMINHO PARA O ARQUIVO TXT EM QUESTÃO!!!!
        FileInputStream ArquivoDeEntrada = new FileInputStream("C:/Users/rapha/Desktop/Java B3A2/questao1.txt");
        InputStreamReader inputtxt = new InputStreamReader(ArquivoDeEntrada);
        BufferedReader funcaoler = new BufferedReader(inputtxt);
        String nome = funcaoler.readLine();
        String linha1 = funcaoler.readLine();
        String linha2 = funcaoler.readLine();
        int altura = Integer.parseInt(linha1);
        int data = Integer.parseInt(linha2);
        Pessoa pessoa = new Pessoa(nome, data, altura);
        System.out.printf("Nome do usuário:");
        System.out.println(pessoa.getNome());
        System.out.printf("Idade em anos:");
        System.out.println(pessoa.getData());
        System.out.printf("Altura:");
        System.out.println(pessoa.getAltura());
    }
}