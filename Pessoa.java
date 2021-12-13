
class Pessoa {
    private String nome;
    private int AnoNascimento;
    private int altura;

    public Pessoa(String _nome, int _altura, int _AnoNascimento) {
        this.nome = _nome;
        this.altura = _altura;
        this.AnoNascimento = _AnoNascimento;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public int getData() {
        return AnoNascimento;
    }

    public int getAltura() {
        return altura;
    }

    public int CalculaAnoNascimento() {
        return 2021 - AnoNascimento;
    }
}