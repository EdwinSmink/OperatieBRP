truncate table blokkering.mig_blokkering cascade;

truncate table ist.stapel cascade;
truncate table ist.stapelrelatie cascade;
truncate table ist.stapelvoorkomen cascade;

truncate table kern.actie cascade;
truncate table kern.actiebron cascade;
truncate table kern.admhnd cascade;
truncate table kern.betr cascade;
truncate table kern.doc cascade;
truncate table kern.his_erkenningongeborenvrucht cascade;
truncate table kern.his_huwelijkgeregistreerdpar cascade;
truncate table kern.his_multirealiteitregel cascade;
truncate table kern.his_naamskeuzeongeborenvruch cascade;
truncate table kern.his_onderzoek cascade;
truncate table kern.his_ouderouderlijkgezag cascade;
truncate table kern.his_ouderouderschap cascade;
truncate table kern.his_persaanschr cascade;
truncate table kern.his_persadres cascade;
truncate table kern.his_persbijhaard cascade;
truncate table kern.his_persbijhgem cascade;
truncate table kern.his_persbvp cascade;
truncate table kern.his_perseuverkiezingen cascade;
truncate table kern.his_persgeboorte cascade;
truncate table kern.his_persgeslachtsaand cascade;
truncate table kern.his_persgeslnaamcomp cascade;
truncate table kern.his_persids cascade;
truncate table kern.his_persimmigratie cascade;
truncate table kern.his_persindicatie cascade;
truncate table kern.his_persinschr cascade;
truncate table kern.his_persnation cascade;
truncate table kern.his_persopschorting cascade;
truncate table kern.his_persoverlijden cascade;
truncate table kern.his_perspk cascade;
truncate table kern.his_perssamengesteldenaam cascade;
truncate table kern.his_persuitslnlkiesr cascade;
truncate table kern.his_persverblijfstitel cascade;
truncate table kern.his_persverificatie cascade;
truncate table kern.his_persvoornaam cascade;
truncate table kern.his_verstrderde cascade;
truncate table kern.multirealiteitregel cascade;
truncate table kern.pers cascade;
truncate table kern.persadres cascade;
truncate table kern.persgeslnaamcomp cascade;
truncate table kern.persindicatie cascade;
truncate table kern.persnation cascade;
truncate table kern.persreisdoc cascade;
truncate table kern.persverificatie cascade;
truncate table kern.persvoornaam cascade;
truncate table kern.relatie cascade;

truncate table logging.berichtlog cascade;
truncate table logging.lo3herkomst cascade;
truncate table logging.logregel cascade;

commit;