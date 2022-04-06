1. PostgreSQL se nalazi na defaultnom portu (5432).

2. Treba napraviti bazu "ingemark" na koju se spaja aplikacija, entity klasa updatea tablicu u bazi svaki put.
    Moze se promjeniti u application.properties tako da se u spring.jpa.hibernate.ddl-auto umjesto "update" stavi "create" pa ce ju svaki put raditi ispocetka.

3. Aplikacija se nalazi na portu 9000.

4. Swagger se nalazi na "/swagger-ingemark.html" (za lolakno "localhost:9000/swagger-ingemark.html")

5. Napravljen je security. Pri pokretanju aplikacije se stvaraju role i user: ingemark@mail.hr/ingemark sa ADMIN rolom.

6. JWT token se dohvaca slanjem AuthenticationRequest (Swagger) na endpoint "/token" (POST). Token se salje u polju "Authorization" u headeru.

Staviti ovo u body:
{
"username": "ingemark@mail.hr",
"password":"ingemark"
}


7. Pri pokretanju aplikacije se osim stvaranja defaultnog usera i rola još aktivira scheduler koji svakih sat vremena provjeri da li je HNB izdao novi tecaj.
	Scheduler skuplja podatke od 1.1.2022. god (ako skuplja podatke od prvog datuma u HNB-u, a to je 30.5.1994. god, onda mu treba 10-15min da popuni tablicu, a to nam nije bitno za ovaj projekt)

8. GET request na "/product" vraca listu svih proizvoda sa paginacijom, sortiranjem i pretrazivanjem.

9. POST request na "/product" sprema listu novi proizvoda u bazu. Ako dodje do greske (ponavljanje koda i sl. ne sprema se ni jedan proizvod).

10. PUT request na "/product" update sva polja (osim code) koja nisu null.

11. DELETE request na "/product" je soft delete proizvoda (stavi timestamp u stupac deleted te nam tako ostaje ukoliko nam bude trebao nekad u buducnosti).

12. GET request na "/user" vraca listu svih proizvoda sa paginacijom, sortiranjem i pretrazivanjem.

13. POST request na "/user" sprema listu novi usera u bazu. Ako dodje do greske (ponavljanje usernamea ne sprema se ni jedan proizvod).

14. PUT request na "/user" update sva polja (osim uuid i id) koja nisu null.

15. DELETE request na "/user" je soft delete usera (stavi timestamp u stupac deleted te nam tako ostaje ukoliko nam bude trebao nekad u buducnosti).




Napomene:
    Nema JUnit i Wiremock jer ih nikad do sada nisam koristio.

Obrisani se korisnik moze ponovo napraviti (stari korisnik se aktivira).

Sto se tice strukture aplikacije, svi su kontroler u paketu controller, sve entity klasse u paketu entity itd. jer aplikacija nije velika.

Role su dodjeljene preko @PreAuthorize anotacije u kontrolerima te se tu mogu prema potrebi mjenjati, vecini endpointova mogu pristupiti sve role, za ovaj projekt nam nije bitno tko ima kakvu rolu, stavio sam ih cisto radi prezentacije svojeg znanja.