package jCoffee_Library.Code;

public abstract class Midia {
    
    private int codigo;
    private String titulo;
    private int anoLancamento;

    public Midia ( int codigo , String titulo , int anoLancamento ) {

        this.codigo = codigo ;
        this.titulo = titulo ;
        this.anoLancamento = anoLancamento ;

    }

    public int getCodigo() {

        return this.codigo;  

    }

    public String getTitulo() {

        return this.titulo;

    }

    public int getAnoLancamento() {

        return this.anoLancamento;

    }

    public abstract String getDetalhes();

}

