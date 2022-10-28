import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Livro livro = new Livro(1, "O torcedor acidental",
                "descricao de o torcedor acidental",
                "Artur Xexéo", "2010", "176", new Editora(1, "Rocco",
                "Rio de Janeiro", "0000", "email", "telefone"), "8532525695");

        Livro livroClone = livro.clone();
        livroClone.setTitulo("Todas as cartas");
        livroClone.setDescricao("descricao de todas as cartas");
        livroClone.setCodigo(2);
        livroClone.setAutora("Clarice Lispector");
        livroClone.setAnoPublicacao("2020");
        livroClone.setNumeroPaginas("864");
        livroClone.setISBN("6555320095");

        assertEquals("Livro{codigo=1, titulo='O torcedor acidental', descricao='descricao de todas as cartas', autora='Clarice Lispector', anoPublicao='2020'" +
                ",numeroPaginas='864', editora=Editora{codigo=1,nome='Rocco', endereco='Rio de Janeiro', cnpj='0000', email='email',telefone='telefone'}, ISBN='8532525695'", livro.toString());
        assertEquals("Livro{codigo=2, titulo='Todas as cartas', descricao='descricao de o torcedor acidental', autora='Artur Xexéo', anoPublicao='2010'" +
                ",numeroPaginas='176', editora=Editora{codigo=1,nome='Rocco', endereco='Rio de Janeiro', cnpj='0000', email='email',telefone='telefone'}, ISBN='6555320095'", livro.toString());
    }
}