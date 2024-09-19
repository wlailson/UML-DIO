
public class Usuario {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		//telefone
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		//internet
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		//musica
		iphone.tocarMusica();
		iphone.pausarMusica();
		iphone.selecionarMusica();
	}
}
