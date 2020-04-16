package Package;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NajdiSlovoTest {

    @Test
    void najdiRiesenieBinaryMethod() {
        assertEquals("je to ok",new NajdiSlovo("jetook", "je to ok".hashCode()).najdiRiesenie());

        assertEquals("dnes je sobota",new NajdiSlovo("dnesjesobota", "dnes je sobota".hashCode()).najdiRiesenie());
        assertEquals("a i on vie",new NajdiSlovo("aionvie", "a i on vie".hashCode()).najdiRiesenie());
        assertEquals("slnko",new NajdiSlovo("slnko", "slnko".hashCode()).najdiRiesenie());
        assertEquals("a",new NajdiSlovo("a", "a".hashCode()).najdiRiesenie());
        assertNotEquals("b",new NajdiSlovo("b", "a".hashCode()).najdiRiesenie());
        assertNotEquals("ja mam psi", new NajdiSlovo("jamampsi", "ja mam psa".hashCode()).najdiRiesenie());
        assertEquals("dnes rano som isiel na vylet",new NajdiSlovo("dnesranosomisielnavylet", "dnes rano som isiel na vylet".hashCode()).najdiRiesenie());
    }

    @Test
    void najdiRiesenie() {
    }
}