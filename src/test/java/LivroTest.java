import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Livro livro = new Livro(1, "O torcedor acidental",
                "No livro, Xexéo reúne dicas e roubadas de viagem, fala de bastidores jornalísticos e de episódios divertidos de personagens famosos e anônimos.",
                "Artur Xexéo", "2010", "176", new Editora(1, "Rocco",
                "Rio de Janeiro", "0000", "email", "telefone"), "8532525695");

        Livro livroClone = livro.clone();
        livroClone.setTitulo("Todas as cartas");

    }
}