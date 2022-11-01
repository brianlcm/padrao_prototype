public class Editora implements Cloneable {
    private int codigo;
    private String nome;
    private String endereco;
    private String email;

    public Editora(int codigo, String nome, String endereco, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Editora{" +
                "codigo='" + codigo +
                "', nome='" + nome +
                "', endereco='" + endereco +
                "', email='" + email + '\'' ;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
