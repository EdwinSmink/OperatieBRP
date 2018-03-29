/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at https://github.com/MinBZK/operatieBRP.
 */

package nl.bzk.migratiebrp.ggo.viewer.builder.brp;

import nl.bzk.algemeenbrp.dal.domein.brp.entity.PersoonInschrijvingHistorie;
import nl.bzk.migratiebrp.ggo.viewer.model.GgoBrpElementEnum;
import nl.bzk.migratiebrp.ggo.viewer.model.GgoBrpGroepEnum;
import nl.bzk.migratiebrp.ggo.viewer.model.GgoBrpVoorkomen;

import javax.inject.Inject;

/**
 * @see {nl.bzk.migratiebrp.ggo.viewer.mapper.GgoBrpMapper<T>}
 */
public class GgoBrpInschrijvingMapper extends AbstractGgoBrpMapper<PersoonInschrijvingHistorie> {

    /**
     * Constructor voor mapper implementatie.
     * @param ggoBrpGegevensgroepenBuilder gegevens groepen builder
     * @param ggoBrpActieBuilder actie builder
     * @param ggoBrpOnderzoekBuilder onderzoek builder
     * @param ggoBrpValueConvert value converter
     */
    @Inject
    public GgoBrpInschrijvingMapper(final GgoBrpGegevensgroepenBuilder ggoBrpGegevensgroepenBuilder, final GgoBrpActieBuilder ggoBrpActieBuilder,
                                    final GgoBrpOnderzoekBuilder ggoBrpOnderzoekBuilder, final GgoBrpValueConvert ggoBrpValueConvert) {
        super(ggoBrpGegevensgroepenBuilder, ggoBrpActieBuilder, ggoBrpOnderzoekBuilder, ggoBrpValueConvert);
    }

    @Override
    public final void verwerkInhoud(final GgoBrpVoorkomen voorkomen, final PersoonInschrijvingHistorie brpInhoud, final GgoBrpGroepEnum brpGroepEnum) {
        getGgoBrpValueConvert().verwerkElement(voorkomen, GgoBrpElementEnum.DATUM_INSCHRIJVING, brpInhoud.getDatumInschrijving());
        getGgoBrpValueConvert().verwerkElement(voorkomen, GgoBrpElementEnum.VERSIENUMMER, brpInhoud.getVersienummer());
        getGgoBrpValueConvert().verwerkElement(voorkomen, GgoBrpElementEnum.DATUMTIJDSTEMPEL, brpInhoud.getDatumtijdstempel());
    }
}