public class Livro implements Cloneable {
    private int codigo;
    private String titulo;
    private String descricao;
    private String autora;
    private String anoPublicacao;
    private String numeroPaginas;
    private Editora editora;
    private String ISBN;

    public Livro(int codigo, String titulo, String descricao, String autora, String anoPublicacao, String numeroPaginas, Editora editora, String ISBN) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.autora = autora;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
        this.ISBN = ISBN;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAutora() {
        return autora;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getNumeroPaginas() {
        return numeroPaginas;
    }

    public Editora getEditora() {
        return editora;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAutora(String autora) {
        this.autora = autora;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
