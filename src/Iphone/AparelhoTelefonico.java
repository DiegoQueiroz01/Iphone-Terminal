package Iphone;

class AparelhoTelefonico {
    public String ligar;
    public String atender;
    public String iniciarCorreioDeVoz;

    public AparelhoTelefonico(String ligar, String atender, String iniciarCorreioDeVoz) {
        this.ligar = ligar;
        this.atender = atender;
        this.iniciarCorreioDeVoz = iniciarCorreioDeVoz;
    }

    public void ligacao(){
        System.out.println("Ligando para " + ligar);
        System.out.println("Atendendo ligação de " + atender);
        System.out.println("Iniciando correio de voz " + iniciarCorreioDeVoz);
    }
}
