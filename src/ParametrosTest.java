package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarVersaoApp() {
        Parametros.getInstance().setVersaoApp("Versao 1.0");
        assertEquals("Versao 1.0", Parametros.getInstance().getVersaoApp());
    }

}