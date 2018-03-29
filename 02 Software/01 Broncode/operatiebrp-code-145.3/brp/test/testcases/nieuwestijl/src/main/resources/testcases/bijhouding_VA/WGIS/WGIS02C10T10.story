Meta:
@status                 Klaar
@usecase                UCS-BY.0.VA

Narrative: R2344 Waarschuwing tonen indien de gemeente binnen het adres wordt gewijzigd terwijl een verstrekkingsbeperking op basis van een gemeentelijke verordening geregistreerd staat

Scenario:   Persoon heeft een volledige verstrekkingsbeperking
            LT: WGIS02C10T10

Given alle personen zijn verwijderd
Given enkel initiele vulling uit bestand /LO3PL-VA/LO3PL-WGIS/WGIS02C10T10-001.xls

When voer een bijhouding uit WGIS02C10T10a.xml namens partij 'Gemeente BRP 1'

Then heeft het antwoordbericht verwerking Geslaagd
Then is het antwoordbericht gelijk aan /testcases/bijhouding_VA/WGIS/expected/WGIS02C10T10a.xml voor expressie //brp:bhg_vbaRegistreerVerhuizing_R

When voer een bijhouding uit WGIS02C10T10b.xml namens partij 'Gemeente BRP 2'

Then heeft het antwoordbericht verwerking Geslaagd
Then is het antwoordbericht gelijk aan /testcases/bijhouding_VA/WGIS/expected/WGIS02C10T10b.xml voor expressie //brp:bhg_vbaActualiseerInfrastructureleWijziging_R
