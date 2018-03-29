/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.algemeenbrp.dal.domein.brp.annotatie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import nl.bzk.algemeenbrp.dal.domein.brp.enums.Regel;

/**
 * Annotatie voor {@link Regel}.
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Bedrijfsregels.class)
public @interface Bedrijfsregel {
    /**
     * De value van deze annotatie is een {@link Regel}.
     * @return de regel waarvoor deze annotatie is
     */
    Regel value();
}