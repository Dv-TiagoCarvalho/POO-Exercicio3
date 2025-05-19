
public class Elevador {

        private int AndarAtual;
        private int NumeroAndares;
        private int Capacidade;
        private int NumeroPessoas;

        public void Elevador(int andarAtual, int numeroAndares, int capacidade, int numeroPessoas) {

           this. AndarAtual = andarAtual;
            this.NumeroAndares = numeroAndares;
            this.Capacidade = capacidade;
            this.NumeroPessoas = numeroPessoas;
        }

        public Inicializar(int Capacidade) {
        this.Capacidade = Capacidade;
        this.NumeroPessoas = 0;
    }


        public int getAndarAtual() {
            return AndarAtual;
        }

        public void setAndarAtual(int andarAtual) {
            AndarAtual = andarAtual;
        }

        public int getNumeroAndares() {
            return NumeroAndares;
        }

        public void setNumeroAndares(int numeroAndares) {
            NumeroAndares = numeroAndares;
        }

        public int getCapacidade() {
            return Capacidade;
        }

        public void setCapacidade(int capacidade) {
            Capacidade = capacidade;
        }

        public int getNumeroPessoas() {
            return NumeroPessoas;
        }

        public void setNumeroPessoas(int numeroPessoas) {
            NumeroPessoas = numeroPessoas;
        }
    }



