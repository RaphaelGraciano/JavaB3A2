class Elevador {
    private int numero_pessoas;
    private int andar_atual;
    private int total_andares;
    private int capacidade;

    public Elevador() {
        System.out.printf("O elevador chegou!");
    }

    public void Inicializar(int _capacidade, int _total_andares) {
        this.capacidade = _capacidade;
        this.total_andares = _total_andares;
        this.numero_pessoas = 0;
        this.andar_atual = 0;
    }

    public void Entra() {
        if (capacidade == numero_pessoas) {
            System.out.printf("O elevador está cheio!");
        } else {
            numero_pessoas++;
        }
    }

    public void Sai() {
        if (capacidade == 0) {
            System.out.printf("O Elevador está cheio!");
        } else {
            numero_pessoas--;
        }
    }

    public void Sobe() {
        if (andar_atual == total_andares) {
            System.out.printf("O elevador está no último andar!");
        } else {
            andar_atual++;
        }
    }

    public void Desce() {
        if (andar_atual == 0) {
            System.out.printf("O elevador está no terreo!");
        } else {
            andar_atual--;
        }
    }

    public int getAndar() {
        return andar_atual;
    }

    public int getTotal() {
        return total_andares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getNumeroPessoas() {
        return numero_pessoas;
    }
}