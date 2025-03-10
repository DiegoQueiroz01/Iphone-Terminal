package Iphone;

public class Main {
    
    public static void main(String[] args) {
        ReprodutorDeMusicas musica = new ReprodutorDeMusicas("Música 1", "Música 2", "Música 3");
        musica.musica();
        
        AparelhoTelefonico ligacao = new AparelhoTelefonico("123456789", "987654321", "987654321");
        ligacao.ligacao();
        
        navegadorWeb navegador = new navegadorWeb("www.google.com", "www.facebook.com", "www.instagram.com", "www.twitter.com");
        navegador.navegador();
    }
}
