/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at https://github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.regressie.it.jenkins;


import nl.bzk.brp.regressie.it.AbstractApiTest;
import org.jbehave.core.annotations.UsingPaths;

@UsingPaths(
        searchIn = "src/test/resources",
        includes = "testcases/Geconverteerde_Data_Test/*.story"
)
public class IT_GDT_Oplevering extends AbstractApiTest {

}