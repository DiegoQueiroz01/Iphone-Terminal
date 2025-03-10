package Iphone;

public class navegadorWeb {

    public String exibirPagina;
    public String adicionarAba;
    public String atualizarAba;
    public String fecharAba;

    public navegadorWeb(String exibirPagina, String adicionarAba, String atualizarAba, String fecharAba) {
        this.exibirPagina = exibirPagina;
        this.adicionarAba = adicionarAba;
        this.atualizarAba = atualizarAba;
        this.fecharAba = fecharAba;
    }

    public void navegador(){
        System.out.println("Exibindo página " + exibirPagina);
        System.out.println("Adicionando aba " + adicionarAba);
        System.out.println("Atualizando aba " + atualizarAba);
        System.out.println("Fechando aba " + fecharAba);
    }
}
