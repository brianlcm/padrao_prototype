import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Livro livro = new Livro(1, "O torcedor acidental",
                "Artur Xexéo", "171", new Editora(1, "Rocco",
                "Rio de Janeiro", "0000"));

        Livro livroClone = livro.clone();
        livroClone.setTitulo("Todas as cartas");
        livroClone.setCodigo(2);
        livroClone.setAutora("Clarice Lispector");
        livroClone.setNumeroPaginas("864");

        assertEquals("Livro{codigo='1', titulo='O torcedor acidental', autora='Artur Xexéo', " +
                "numeroPaginas='171', Editora=Editora{codigo='1', nome='Rocco', endereco='Rio de Janeiro', email='0000'}", livro.toString());
        assertEquals("Livro{codigo='2', titulo='Todas as cartas', autora='Clarice Lispector'" +
                ", numeroPaginas='864', Editora=Editora{codigo='1', nome='Rocco', endereco='Rio de Janeiro', email='0000'}", livroClone.toString());
    }
}
