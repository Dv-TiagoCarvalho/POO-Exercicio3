public class Main {
    public static void main(String[] args) {

        Elevador c1 = new Elevador();
        c1.subir();

        c1.Inicializar(4, 5);

        System.out.println(" Andar Atual: " + c1.getAndarAtual());

        c1.entrar();
        c1.entrar();
        c1.entrar();
        c1.subir();

        System.out.println("Andar Atual após Subir: " + c1.getAndarAtual());

        c1.subir();

        System.out.println("Andar Atual após Subir novamente : " + c1.getAndarAtual());

        c1.sair();
        c1.sair();

        System.out.println("Numero total de Pessoas Elevador: " + c1.getNumeroPessoas());

        c1.subir();
        c1.subir();
        c1.subir();

        System.out.println("Tentativa de Subir Andar inexistente: " + c1.getAndarAtual());
        
        c1.descer();

        System.out.println("Andar após descer: " +  c1.getAndarAtual());

        c1.descer();
        c1.descer();
        c1.descer(); 

        System.out.println("Andar Atual após descer até o térreo: " + c1.getAndarAtual());
        
        c1.descer();

        System.out.println("Tentativa de descer além do permitido: " + c1.getAndarAtual());
      
        
    }
    
}
