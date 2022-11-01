public class Livro implements Cloneable {
    private int codigo;
    private String titulo;
    private String autora;
    private String numeroPaginas;
    private Editora editora;

    public Livro(int codigo, String titulo, String autora, String numeroPaginas, Editora editora) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autora = autora;
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
    }

    @Override
    public Livro clone() throws CloneNotSupportedException {
        Livro livroClone = (Livro) super.clone();
        livroClone.editora = (Editora) livroClone.editora.clone();
        return livroClone;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo='" + codigo +
                "', titulo='" + titulo +
                "', autora='" + autora +
                "', numeroPaginas='" + numeroPaginas +
                "', Editora=" + editora +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutora() {
        return autora;
    }

    public void setAutora(String autora) {
        this.autora = autora;
    }

    public String getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
