package Iphone;

//classe de reprodução de música.
class ReprodutorDeMusicas {
    //definir as variáveis da classe.
    public String selecionandoMusica;
    public String tocando;
    public String pausado;

    public ReprodutorDeMusicas(String selecionandoMusica, String tocando, String pausado) {
        this.selecionandoMusica = selecionandoMusica;
        this.tocando = tocando;
        this.pausado = pausado;
    }

    public void musica(){
        System.out.println("Selecionando música " + selecionandoMusica);
        System.out.println("Tocando musica selecionada " + tocando);
        System.out.println("Musica pausada " + pausado);
    }
}
