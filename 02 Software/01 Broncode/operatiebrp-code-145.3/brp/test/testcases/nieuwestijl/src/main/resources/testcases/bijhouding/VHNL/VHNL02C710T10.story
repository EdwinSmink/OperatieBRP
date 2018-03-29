Meta:
@auteur                 tjlee
@status                 Klaar
@regels                 R2162
@sleutelwoorden         voltrekkingHuwelijkInNederland,registratieNaamgebruik,TjieWah,VHNL02C710T10
@usecase                UCS-BY.HG

Narrative:
R1861 Huwelijk en geregistreerd partnerschap, voltrekking huwelijk in Nederland, actie registratieAanvangHuwelijkGeregistreerdPartnerschap, registratieNaamgebruik

Scenario: R2162 Persoon.Predicaat naamgebruik en de Persoon.Adellijke titel naamgebruik hebben beiden een waarde
          LT: VHNL02C710T10



Given alle personen zijn verwijderd

Given enkel initiele vulling uit bestand /LO3PL/VHNL02_reg_gesl_nm-Libby.xls
Given enkel initiele vulling uit bestand /LO3PL/VHNL02_reg_gesl_nm-Piet.xls

When voer een bijhouding uit VHNL02C710T10.xml namens partij 'Gemeente BRP 1'

Then heeft het antwoordbericht verwerking Foutief
Then is het antwoordbericht gelijk aan /testcases/bijhouding/VHNL/expected/VHNL02C710T10.xml voor expressie //brp:bhg_hgpRegistreerHuwelijkGeregistreerdPartnerschap_R

Then is in de database de persoon met bsn 690020041 niet als PARTNER betrokken bij een HUWELIJK
Then is in de database de persoon met bsn 373230217 niet als PARTNER betrokken bij een HUWELIJK

Then lees persoon met anummer 8240349473 uit database en vergelijk met expected VHNL02C710T10-persoon1.xml
Then lees persoon met anummer 9543058721 uit database en vergelijk met expected VHNL02C710T10-persoon2.xml