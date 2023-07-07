package model;

import interfaces.NavegadorInterface;
import interfaces.ReprodutoInterface;


public class Iphone extends Celular
        implements NavegadorInterface, ReprodutoInterface {

    private int anoLancamento;
    private double versaoIOS;

    public Iphone(String model, String fabricante, int anoLancamento, double versaoIOS) {
        super(model, fabricante);
        this.anoLancamento = anoLancamento;
        this.versaoIOS = versaoIOS;
    }

    private void verificaConexao(){
        System.out.println("Verificando Conexão com a internet");
    }

    @Override
    public void exibirPagina(String URL) {
        verificaConexao();
        System.out.println("Acessando a pagina: " + URL);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        verificaConexao();
        System.out.println("Atualizando Pagina");
    }


    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a musica " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void parar() {
        System.out.println("Musica interrompida");
    }

    @Override
    public void selecionarMusica(String novaMusica) {
        System.out.println("Selecionado outra musica" + novaMusica);
    }

    @Override
    public void ligar(String numeroDestinatario) {
        System.out.println("Ligando para " + numeroDestinatario + " no iPhone");
    }

    @Override
    public void mandarSMS(String mensagem, String numeroDestinatario) {
        System.out.println("Enviando mensagem: '" + mensagem + "'");
        System.out.println("Para: " + numeroDestinatario + " pelo iPhone");

    }

    public void adicionarAosFavoritos(String numero) {
        System.out.println("Adicionando o número " + numero + " aos favoritos");
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getVersaoIOS() {
        return versaoIOS;
    }

    public void setVersaoIOS(double versaoIOS) {
        this.versaoIOS = versaoIOS;
    }
}