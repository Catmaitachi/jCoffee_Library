package jCoffee_Library.Code;

public class Movie extends Midia {

    private String diretor;
    private int duracao;

    public Movie( int codigo, String titulo, int anoLancamento, String diretor, int duracao ) {

        super( codigo, titulo, anoLancamento );

        this.diretor = diretor;
        this.duracao = duracao;

    }

    public String getDiretor() {

        return this.diretor;

    }

    public int getDuracao() {

        return this.duracao;

    }

    @Override

    public String getDetalhes() {

        return "Filme: " + getTitulo() + " ( " + getAnoLancamento() + " ) - " + getDiretor() + " - " + getDuracao() + " min";
    
    }
    
}
