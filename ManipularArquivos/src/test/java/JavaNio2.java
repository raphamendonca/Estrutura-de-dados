import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaNio2 {

    @Test
    public void dadoCaminho_verificaExistencia(){
        Path path = Paths.get("docs/arquivos/listacompras.txt");
        assertTrue(Files.exists(path));

    }
}
