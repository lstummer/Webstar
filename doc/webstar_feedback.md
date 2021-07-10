####Pro
- Örültem, hogy kilépett a statikus metódusok köréből és példánymetódusokkal dolgozik.
- Írt teszteseteket.
- A friss JUnit-ot használta (jupiter)
- Java 11 szintaxis
- Maven használat
- GitHub használat, beszédes commit message-ekkel.
####Kontra / javaslatok
- A `TIME_UNITS` név helyett jobb lenne a `TIME_UNITS_SINGULAR`, ha már van egy pluralos párja.
- A getter metódusok nevét szerintem jobb lenne többesszámban írni, mert jellemzően 1-nél nagyobb számot adnak, az 1 a kivétel valójában.
  Tehát **`getYears()`**, **`getDays()`**, stb.
Az input validálásokat (seconds < 0 és seconds == 0) fel lehetne vinni a metódus legelejére. Kár inicializálni/deklarálni a változókat 0 esetben.
A listComponents változónév helyett elég lenne a components. Szerintem kár beletenni a változó típusát a változó nevébe. Az látszik az IDE-ben. Ha mindenképp bele szeretné tenni, akkor inkább componentList lenne jó.
A változókat érdemes a felhasználás helyén deklarálni, felesleges a metódus legelején. Például ilyen az indexOfLastNonZeroTimeUnit.
Az indexOfLastNonZeroTimeUnit kiszámolásánál felesleges az i változó, lehetne rögtön az előbbivel dolgozni.
Nem jó gyakorlat egy változó újrahasználása több célra. Például az i változót két ciklus is használja. A változók scope-ját (ha technikailag nem is, de logikailag mindenképp) érdemes a lehető legszűkebben tartani.
Ha ciklusban fűzünk hozzá egy String-hez, optimálisabb a StringBuilder osztályt használni.
Összegzés
Hibás a megoldás. A következő tesztesetekre rossz eredményt ad:

1 hour and 1 second
1 hour and 2 seconds
3 years, 15 days and 1 second
1 year and 1 second
1 day, 1 hour and 1 second
Sajnos így nem tudom elfogadni.