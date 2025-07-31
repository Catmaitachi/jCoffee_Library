### *Exercício de Java: Sistema de Gerenciamento de uma Biblioteca Digital*

*Objetivo:*
Criar um pequeno sistema de gerenciamento para uma biblioteca digital que cataloga diferentes tipos de mídias (livros, filmes e álbuns de música). O objetivo é projetar e implementar uma estrutura de classes que utilize Encapsulamento, Herança, Polimorfismo e Abstração de forma clara e coesa.

*Contexto:*
Imagine que você está construindo o backend para um aplicativo que permite aos usuários navegar e interagir com diferentes tipos de conteúdo digital. Cada tipo de mídia tem propriedades em comum (como título e ano de lançamento), mas também características e comportamentos únicos.

-----

### *Conceitos de POO a serem aplicados:*

1.  *Abstração:*

      * *Classe Abstrata:* Haverá uma classe base que define o que é uma "Mídia", mas que não poderá ser instanciada diretamente.
      * *Interface:* Haverá uma interface para definir comportamentos que podem ser compartilhados por diferentes classes, como a capacidade de ser "emprestável".

2.  *Encapsulamento:*

      * Todos os atributos das classes devem ser privados (private), e o acesso a eles deve ser feito através de métodos públicos (public), como getters e setters.

3.  *Herança:*

      * Classes específicas como Livro, Filme e AlbumDeMusica herdarão da classe abstrata Midia, reutilizando seus atributos e métodos comuns.

4.  *Polimorfismo:*

      * **Sobrescrita de Método (@Override):** Cada classe filha implementará um método getDetalhes() de forma única para exibir suas informações específicas.
      * *Uso de Tipos Genéricos:* O sistema principal (a Biblioteca) irá gerenciar uma lista de Midia sem se preocupar com o tipo específico (se é um livro, filme ou música), demonstrando o poder do polimorfismo.

-----

### *Requisitos e Passos:*

**Passo 1: Criar a Interface Emprestavel**

Crie uma interface chamada Emprestavel. Esta interface representará o contrato para qualquer item que possa ser emprestado.

  * Ela deve conter dois métodos:
      * void emprestar(): Simula o ato de emprestar o item.
      * void devolver(): Simula o ato de devolver o item.

**Passo 2: Criar a Classe Abstrata Midia**

Crie uma classe abstrata chamada Midia.

  * *Atributos (privados):*
      * codigo: int
      * titulo: String
      * anoLancamento: int
  * *Construtor:*
      * Um construtor que inicialize todos os atributos.
  * *Métodos:*
      * Getters para todos os atributos.
      * Um método abstrato public abstract String getDetalhes(); que será implementado pelas classes filhas.

*Passo 3: Criar as Classes Concretas (Herança)*

Agora, crie as classes que herdarão de Midia.

1.  **Classe Livro**

      * Herda de Midia e implementa a interface Emprestavel.
      * *Atributo adicional (privado):* autor: String.
      * *Construtor:* Deve chamar o construtor da superclasse (super()) e inicializar o seu próprio atributo.
      * *Implementação dos métodos:*
          * Sobrescreva (@Override) o método getDetalhes(). Ele deve retornar uma String formatada com todas as informações do livro, incluindo o autor.
          * Implemente os métodos emprestar() e devolver() da interface Emprestavel. Eles podem simplesmente imprimir uma mensagem no console, como "O livro '[título do livro]' foi emprestado."

2.  **Classe Filme**

      * Herda de Midia.
      * *Atributos adicionais (privados):*
          * diretor: String
          * duracaoEmMinutos: int
      * *Construtor:* Deve chamar o construtor da superclasse e inicializar seus próprios atributos.
      * *Implementação de método:*
          * Sobrescreva (@Override) o método getDetalhes() para retornar as informações do filme, incluindo diretor e duração.

3.  **Classe AlbumDeMusica**

      * Herda de Midia.
      * *Atributos adicionais (privados):*
          * artista: String
          * numeroDeFaixas: int
      * *Construtor:* Deve chamar o construtor da superclasse e inicializar seus próprios atributos.
      * *Implementação de método:*
          * Sobrescreva (@Override) o método getDetalhes() para retornar as informações do álbum, incluindo o artista e o número de faixas.

**Passo 4: Criar a Classe Principal Biblioteca (Demonstração do Polimorfismo)**

Crie uma classe chamada Biblioteca com um método main para testar todo o sistema.

  * Dentro do método main:
    1.  Crie uma lista de Midia: List<Midia> acervo = new ArrayList<>();
    2.  Instancie pelo menos um objeto de cada classe concreta (Livro, Filme, AlbumDeMusica) e adicione-os à lista acervo.
    3.  Itere sobre a lista acervo usando um loop for-each. Para cada midia na lista:
          * Imprima o resultado do método midia.getDetalhes(). Observe que o método correto será chamado para cada tipo de objeto (polimorfismo).
    4.  Após o loop, verifique quais itens do acervo são "emprestáveis" usando o operador instanceof.
          * Para cada item que for uma instância de Emprestavel, faça o "cast" do objeto para o tipo Emprestavel e chame os métodos emprestar() e devolver().

-----

### *Desafios Extras (Opcional):*

  * *Método Sobrecarregado (Overloading):* Na classe Livro, crie um segundo método emprestar que recebe um Usuario como parâmetro: void emprestar(Usuario usuario). Isso demonstra a sobrecarga de método.
  * *Composição:* Crie uma classe Usuario e modifique a classe Biblioteca para que ela tenha uma lista de Usuario e uma lista de Midia (composição).
  * *Tratamento de Exceções:* Modifique os métodos emprestar() para lançar uma exceção customizada (ex: ItemNaoDisponivelException) se o item já estiver emprestado.

### *Estrutura de Arquivos Esperada:*

```
src/
├── Emprestavel.java         (interface)
├── Midia.java               (abstract class)
├── Livro.java               (concrete class)
├── Filme.java               (concrete class)
├── AlbumDeMusica.java       (concrete class)
└── Biblioteca.java          (main class for testing)