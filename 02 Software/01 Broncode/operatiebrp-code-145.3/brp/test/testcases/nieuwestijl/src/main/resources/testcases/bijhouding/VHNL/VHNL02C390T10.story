Meta:
@auteur                 fuman
@status                 Klaar
@sleutelwoorden         Geslaagd
@usecase                UCS-BY.HG

Narrative:
Gemeente aanvang relatie geldig op datum aanvang relatie

Scenario:   Personen Libby Thatcher (Ingeschrevene-Ingezetene, Niet NL Nat) en Piet Jansen (Onbekende) gaan trouwen, Gemeente aanvang relatie geldig op datum aanvang relatie
            LT: VHNL02C390T10



Given alle personen zijn verwijderd
Given enkel initiele vulling uit bestand /LO3PL/VHNL02_reg_gesl_nm-Libby.xls

When voer een bijhouding uit VHNL02C390T10.xml namens partij 'Gemeente BRP 1'

Then heeft het antwoordbericht verwerking Geslaagd
Then is het antwoordbericht gelijk aan /testcases/bijhouding/VHNL/expected/VHNL02C390T10.xml voor expressie //brp:bhg_hgpRegistreerHuwelijkGeregistreerdPartnerschap_R



Then is in de database de persoon met bsn 690020041 wel als PARTNER betrokken bij een HUWELIJK

Then lees persoon met anummer 8240349473 uit database en vergelijk met expected VHNL02C390T10-persoon1.xml





