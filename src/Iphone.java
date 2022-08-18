
public abstract class Iphone implements ReprodutorMusical,AparelhoTelonico, NavegandoInternet {
	
    public void ligar() {
        System.out.println("FAZENDO LIGAÇÃO");
    }

    
    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    
    public void correioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA");
    }

    
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA");
    }

    
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    
    public void tocar() {
        System.out.println("PLAY");
    }

    
    public void pausar() {
        System.out.println("PAUSE");
    }

    
    public void selecionarMusica() {
        System.out.println(" MÚSICA");
    }
}
