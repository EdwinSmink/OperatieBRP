Meta:
@status                 Klaar
@regels                 R1674
@sleutelwoorden         voltrekkingHuwelijkInNederland
@usecase                UCS-BY.HG


Narrative:
Adellijke titel verwijst niet naar een bestaand stamgegeven

Scenario:   Personen Libby Thatcher (Ingeschrevene-Ingezetene, Niet NL Nat) en Piet Jansen (Onbekende) gaan trouwen, adellijke titel verwijst niet naar een bestaand stamgegeven
            LT: VHNL03C150T10




Given alle personen zijn verwijderd
Given enkel initiele vulling uit bestand /LO3PL/VHNL02_reg_gesl_nm-Libby.xls

When voer een bijhouding uit VHNL03C150T10.xml namens partij 'Gemeente BRP 1'

Then is het foutief antwoordbericht gelijk aan /testcases/bijhouding/VHNL/expected/VHNL03C150T10.txt

Then is in de database de persoon met bsn 690020041 niet als PARTNER betrokken bij een HUWELIJK
Then is in de database de persoon met bsn 373230217 niet als PARTNER betrokken bij een HUWELIJK

Then lees persoon met anummer 8240349473 uit database en vergelijk met expected VHNL03C150T10-persoon1.xml

