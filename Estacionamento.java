class Estacionamento {
    private String modelo;
    private String placa;
    private float entrada;
    private float saida;

    public Estacionamento(String _modelo, String _placa, float _entrada, float _saida) {
        this.modelo = _modelo;
        this.placa = _placa;
        this.entrada = _entrada;
        this.saida = _saida;
    }

    public String getNome() {

        return modelo;
    }

    public String getPlaca() {

        return placa;
    }
    // Este estacionamento não cobra horas quebradas, se o cliente ficar meia hora é
    // cobrado uma hora cheia, 1:30 = 2 horas

    public float getEntrada() {
        return entrada;
    }

    public float getSaida() {
        return saida;
    }

    public int CalculaValor() {
        float valor;
        valor = saida - entrada;
        return (int) (valor * 150);
    }
}