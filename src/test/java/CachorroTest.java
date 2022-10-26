import model.Cachorro;
import model.Raca;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CachorroTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Cachorro cachorro = new Cachorro("Lucinho", 80f, new Raca("São Bernardo", "Suiça"));

        Cachorro cachorroClone = cachorro.clone();
        cachorroClone.setNome("Beethoven");
        cachorroClone.getRaca().setOrigem("Turquia");

        assertEquals("Lucinho", cachorro.getNome());
        assertEquals("Beethoven", cachorroClone.getNome());
        assertEquals(80f,cachorro.getPeso());
        assertEquals(80f,cachorroClone.getPeso());
        assertEquals("Suiça",cachorro.getRaca().getOrigem());
        assertEquals("Turquia",cachorroClone.getRaca().getOrigem());
    }

}
