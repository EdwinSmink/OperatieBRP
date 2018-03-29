Meta:
@status                 Klaar
@sleutelwoorden         Geslaagd
@usecase                UCS-BY.1.MP

Narrative: Scenario 9 Fiat uizondering

Scenario: Gemeente BRP 1 sluit huwelijk voor Sandy en Danny woonachtig in Gemeente BRP auto fiat met uitzondering 1 met fiatuitz voor srtadmhnd is 20
          LT: MBHP09C10T30

Given alle personen zijn verwijderd
Given de database is aangepast met: delete from autaut.his_bijhouderfiatuitz where id =99999
And de database is aangepast met: delete from autaut.bijhouderfiatuitz where id =99999
And de database is aangepast met: insert into autaut.bijhouderfiatuitz (id,bijhouder, datingang, dateinde, bijhouderbijhvoorstel, srtdoc, srtadmhnd, indblok) values (99999, (select id from kern.partijrol where partij = (select id from kern.partij where naam = 'Gemeente BRP auto fiat met uitzondering 1') and rol=2), null , null , null, null, 20, null)
And de database is aangepast met: insert into autaut.his_bijhouderfiatuitz (id, bijhouderfiatuitz, tsreg, tsverval, datingang, dateinde,bijhouderbijhvoorstel, srtdoc, srtadmhnd, indblok) values(99999, 99999, now() at time zone 'UTC', null, 19990101, null,null,null, 20, null)


Given enkel initiele vulling uit bestand /LO3PL-MBHP/MBHP09C10T30-Marjan.xls
Given enkel initiele vulling uit bestand /LO3PL-MBHP/MBHP09C10T30-Victor.xls

When voer een bijhouding uit MBHP09C10T30.xml namens partij 'Gemeente BRP 1'

Then is het antwoordbericht gelijk aan /testcases/bijhouding/MBHP/expected/MBHP09C10T30.xml voor expressie //brp:bhg_hgpRegistreerHuwelijkGeregistreerdPartnerschap_R
Given de database is aangepast met: delete from autaut.his_bijhouderfiatuitz where id =99999
And de database is aangepast met: delete from autaut.bijhouderfiatuitz where id =99999

Then controleer tijdstip laatste wijziging in bijhoudingsplan voor bijgehouden personen





