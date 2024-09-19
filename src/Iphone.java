
public class Iphone implements Internet,MusicPlayer,Telefone {
	public static void main(String[] args) {
	}
	//Internet
	public void exibirPagina() {
		System.out.println("Exibindo Pagina");
		
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova guia");	
	}

	public void atualizarPagina() {
		System.out.println("Atualizar pagina");
	}
	//Chamadas
	@Override
	public void ligar() {
		System.out.println("Realizar chamada");
		
	}
	@Override
	public void atender() {
		System.out.println("Recebendo chamada");
		
	}
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correiro de voz");
		
	}
	//Music Player
	@Override
	public void tocarMusica() {
		System.out.println("Tocar Musica");
		
	}
	@Override
	public void pausarMusica() {
		System.out.println("Pausar Musica");
		
	}
	@Override
	public void selecionarMusica() {
		System.out.println("Selecione a musica");
		
	}
}
