a. Mitä assertArrayEquals-metodi tekee?

Vastaus:
assertArrayEquals-metodi on JUnit-kirjaston metodi, joka vertailee kahta taulukkoa keskenään tarkistaakseen niiden yhtäläisyyden. Se tarkistaa, onko taulukoilla sama pituus ja ovatko kaikki vastaavissa indekseissä olevat elementit yhtä suuria. Alkeistietotyyppien taulukoille se käyttää ==-operaattoria vertailuun, kun taas oliotaulukoille se käyttää equals()-metodia.

b. Mitä tapahtuu, jos taulukot a1 ja a2 eivät ole yhtä suuria testSingleDimensionalArrayEquality-testissä?

Vastaus:
Jos taulukot eivät ole yhtä suuria, testi epäonnistuu. JUnit heittää AssertionError-poikkeuksen, ja testiajuri merkitsee testin epäonnistuneeksi. Virheviesti sisältää yksityiskohtia eroavaisuudesta, kuten indeksin, jossa taulukot ensimmäisen kerran eroavat toisistaan, sekä kyseisessä indeksissä olevat arvot.

c. Miten assertArrayEquals-metodi käsittelee moniulotteisia taulukoita, kuten testMultiDimensionalArrayEquality-testissä nähdään?

Vastaus:
Moniulotteisten taulukoiden kohdalla assertArrayEquals suorittaa syvän vertailun. Se tarkistaa ensin, että uloimmat taulukot ovat samanpituisia, ja vertailee sitten rekursiivisesti jokaisen sisemmän taulukon. Kahden moniulotteisen taulukon katsotaan olevan yhtä suuria, jos niillä on sama rakenne (ulottuvuudet) ja kaikki vastaavat elementit ovat yhtä suuria.