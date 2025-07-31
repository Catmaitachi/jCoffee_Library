package jCoffee_Library.Code;

public class Book extends Midia implements iLend {
       
    private String autor;
    private boolean emprestado;
    
    public Book( int codigo, String titulo, int anoLancamento, String autor ) {

        super( codigo, titulo, anoLancamento );

        this.autor = autor;
        this.emprestado = false;
        
    }
    
    public String getAutor() {
        
        return this.autor;
        
    }
    
    @Override
    
    public String getDetalhes() {

        return "Livro: " + getTitulo() + " ( " + getAnoLancamento() + " ) - " + getAutor();

    }
    
    @Override
    
    public void emprestar() {
    
        if (!emprestado) {
    
            emprestado = true;
            System.out.println("Livro emprestado com sucesso: " + getTitulo());
    
        } else {
    
            System.out.println("O livro já está emprestado.");
    
        }
    
    }
    
    @Override
    
    public void devolver() {
    
        if (emprestado) {
    
            emprestado = false;
            System.out.println("Livro devolvido com sucesso: " + getTitulo());
    
        } else {
    
            System.out.println("O livro não está emprestado.");
    
        }
        
    }

}
