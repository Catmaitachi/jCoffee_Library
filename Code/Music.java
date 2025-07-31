package jCoffee_Library.Code;

public class Music extends Midia {
   
    private String artista;
    private int faixas;

    public Music( int codigo, String titulo, int anoLancamento, String artista, int faixas ) {

        super( codigo, titulo, anoLancamento );

        this.artista = artista;
        this.faixas = faixas;

    }

    public String getArtista() {

        return this.artista;

    }

    public int getFaixas() {

        return this.faixas;

    }

    @Override

    public String getDetalhes() {

        return "Álbum de Música: " + getTitulo() + " ( " + getAnoLancamento() + " ) - " + getArtista() + " - " + getFaixas() + " faixas";

    }

}
