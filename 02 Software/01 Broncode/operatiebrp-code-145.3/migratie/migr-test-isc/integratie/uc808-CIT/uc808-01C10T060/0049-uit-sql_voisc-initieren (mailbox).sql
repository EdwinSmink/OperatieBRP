insert into voisc.lo3_mailbox(id, mailboxnr, verzender, partijcode, mailboxpwd)
select nextval('voisc.lo3_mailbox_id_sequence'), '9900820' as mailboxnr, '3000230' as vezender, a.nr as partijcode, 'password' as mailboxpwd
from (select '990082' as nr) AS a
where not exists (select id from voisc.lo3_mailbox where partijcode = '990082');
