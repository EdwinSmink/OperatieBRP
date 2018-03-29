/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at https://github.com/MinBZK/operatieBRP.
 */

package nl.bzk.migratiebrp.conversie.model.lo3.element;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Lo3HuisnummerTest {

    @Test
    public void testGetIntegerWaarde() throws Exception {
        Lo3Huisnummer lo3 = new Lo3Huisnummer("22", null);
        assertEquals(22, lo3.getIntegerWaarde().intValue());
    }
}