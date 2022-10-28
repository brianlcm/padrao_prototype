public class Editora implements Cloneable {
    private int codigo;
    private String nome;
    private String endereco;
    private String cnpj;
    private String email;
    private String telefone;

    public Editora(int codigo, String nome, String endereco, String cnpj, String email, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
