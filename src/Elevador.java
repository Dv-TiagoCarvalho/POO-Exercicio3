
public class Elevador {

        private int AndarAtual;
        private int NumeroAndares;
        private int Capacidade;
        private int NumeroPessoas;

        public void Inicializar(int numeroAndares, int Capacidade) {

            this.NumeroAndares = numeroAndares;
            this.Capacidade = Capacidade;
            this.NumeroPessoas = 0; 
            this. AndarAtual = 0;

        }
        public void entrar(){

            if (NumeroPessoas<Capacidade) {
                NumeroPessoas++;   
            }
        }

        public void sair(){

            if (NumeroPessoas > 0) {
                NumeroPessoas--;     
            }
        }

        public void subir(){

            if (AndarAtual < NumeroAndares) {
                 AndarAtual++;
          } 
        }

        public void descer(){

            if (AndarAtual > 0) {
                AndarAtual--;   
            }
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



