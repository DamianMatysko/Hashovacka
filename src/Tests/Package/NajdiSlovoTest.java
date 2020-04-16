package Package;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NajdiSlovoTest {

    @Test
    void najdiRiesenieBinaryMethod() {
        assertEquals("je to ok",new NajdiSlovo("jetook", "je to ok".hashCode()).najdiRiesenieBinaryMethod());

        assertEquals("dnes je sobota",new NajdiSlovo("dnesjesobota", "dnes je sobota".hashCode()).najdiRiesenieBinaryMethod());
        assertEquals("a i on vie",new NajdiSlovo("aionvie", "a i on vie".hashCode()).najdiRiesenieBinaryMethod());
        assertEquals("slnko",new NajdiSlovo("slnko", "slnko".hashCode()).najdiRiesenieBinaryMethod());
        assertEquals("a",new NajdiSlovo("a", "a".hashCode()).najdiRiesenieBinaryMethod());
        assertNotEquals("b",new NajdiSlovo("b", "a".hashCode()).najdiRiesenieBinaryMethod());
        assertNotEquals("ja mam psi", new NajdiSlovo("jamampsi", "ja mam psa".hashCode()).najdiRiesenieBinaryMethod());
        //assertEquals("dnes rano som isiel na vylet",new NajdiSlovo("dnesranosomisielnavylet", "dnes rano som isiel na vylet".hashCode()).najdiRiesenieBinaryMethod());
    }

    @Test
    void najdiRiesenie() {
    }
}