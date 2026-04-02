# Autode garaaži programm

**Kerdo Timak, Ain Tamm**

---

## Projekti kirjeldus

Projekti eesmärk oli luua programm, mis võimaldab hallata autosid garaažis.  
Kasutaja saab lisada autosid, neid vaadata, eemaldada ning kasutada (nt sõita, tankida ja remontida).

---

## Programmi üldine töö

Programm koosneb kahest põhiklassist:

- **Auto** - kirjeldab ühte autot ja selle omadusi
- **Garaaž** - haldab autode kogumit

Kasutaja saab:

- lisada uusi autosid garaaži
- vaadata garaažis olevaid autosid
- valida konkreetse auto
- sõita valitud autoga (kulutades kütust ja pärast sõitu on võimalus, et auto läheb katki)
- tankida autot
- parandada autot
- eemaldada auto garaažist

---

## Klasside kirjeldus

### Auto

Hoiab ühe auto andmeid ja võimaldab sellega seotud tegevusi.

**Meetodid:**

- `soida(int km)`
    - suurendab läbisõitu
    - vähendab kütust
    - võib auto katki teha (juhuslikult)

- `tangi(double liitrid)`
    - lisab kütust paaki

- `remondi()`
    - parandab auto, kui see on katki

- `toString()`
  - tagastab auto info tekstina

---

### Garaaž

Haldab autode listi ja võimaldab nendega töötada.

**Meetodid:**

- `lisaAuto(Auto auto)`
    - lisab auto garaaži

- `kuvaNimekiri()`
    - kuvab kõik autod garaažis

- `valiAuto(int indeks)`
    - tagastab valitud auto info

- `eemaldaAuto(int indeks)`
    - eemaldab auto garaažist

---

## Projekti tegemise protsess

Esimene etapp oli repositooriumi loomine ja ülesannete jagamine.  
Teises etappis alustas üks liige Auto klassi loomist ja lõi algse Peaklassi.  
Teine liige alustas Garaazi klassi loomist ja täiendas Peaklassi.  
Kolmandas etapis tegid mõlemad liikmed teste ning täiendavaid muudatusi failides.  
Viimases etapis lõime rühmatöö kirjelduse ja esitasime töö.

---

## Liikmete panus

### Ain Tamm

- Auto klassi loomine
- Peaklassi alustamine

Ajakulu: 7h

---

### Kerdo Timak

- Garaaž klassi loomine
- Peaklassi lõpetamine

Ajakulu: 7h

---

## Tekkinud probleemid

- Puudu jäi teadmisi JOptionPane-ist

---

## Hinnang töötulemusele

**Õnnestus hästi:**

- klasside loogiline ülesehitus
- auto käitumise simulatsioon

**Vajab arendamist:**

- vigade käsitlemine (nt vale sisend)
- rohkem funktsioone (nt mitu garaaži)

---

## Testimine

Testisime tervet programmi korraga.  
Saadud tulemusest mõtlesime, mida ja kuidas muuta.