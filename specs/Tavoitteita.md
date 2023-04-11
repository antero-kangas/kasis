# Käsikirjoitus

## Tavoitteita

1. Teksti luetaan erilaisilla rooliäänillä ja äänitehosteilla, tuloksena mp3-tiedosto
   - Teksti käsikirjoitusformaattia mukaileva
   - kommentit
   - Kertoja ja rooliäänet voidaan määrittää 
   - Äänitehosteet mp3-tiedostoista muokattu, mm. leikattu, feidattu, yms.
   - Ryhmä = yhtäaikaisia rooleja ja/tai ääniä
2. Teksti muotoillaan käsikirjoitusformaattiin
   - Syöteteksti vakioidaan
3. Toimii veppisivulla/liittymässä
   - Kirjastoituja ääniä 
   - Myös kirjastoituja rooliasetuksia
   - Kaiken käsittely lomakkeilla
4. äänen generointivaihtoehtoja
   - otsikko
   - author+date
   - synopsis
   - kohtausotsikot
   - parenteesit
   - nimet
   - repliikit

   - vain repliikit ja efektit = repliikit
   - myös nimet, parenteesit ja kohtaukset = kohtaukset
   - kaikki = kaikki

5. current namen parametrin asetus väliaikaisesti/pysyvästi
   - esim. kieli
   - komento

6. repliikin talletus eli mp3-tiedoston luonti

7. Overlay
   - henkilöryhmä
   - henkilön/äänen päällekkäisyys

8. äänien käsitely ffmpeg

9. Yksittäisten roolien äänet voi äänittää oikeasta puheesta

## Formaatti

Käsikirjoituksen rakenne on seuraava

| Osio             | Tekstin koko               | Sisennys                               |
| ---------------- | -------------------------- | -------------------------------------- |
| Pääotsikko       | ISO                        | Keskitys                               |
| Nimi, pvm        | Iso alkukirjain            | Keskitys                               |
| SYNOPSIS-otsikko | ISO, vakio-otsikko         | Vasen                                  |
| Synopsis-teksti  | Iso alkukirjain            | Vasen                                  |
| KOHTAUS-otsikko  | ISO, alkaa sanalla KOHTAUS | Vasen                                  |
| Parenthesis      | Iso alkukirjain            | Vasen                                  |
| Nimi             | ISO                        | Keskitetty                             |
| Repliikki        | Iso alkukirjain            | Sisennetty (vasen ja oikea)            |
| komento          | (Suluissa)                 | Missä vain, itsenäinen tai repliikissä |

​	PÄÄOTSIKKO 				

​	Tekijän nimi

​	pvm

SYNOPSIS // kiinte



ISO

- Sisältää vain ISOJA kirjaimia, numeroita välilyöntejä ja erikoismerkkejä, ainakin ISOJA kirjaimia

match leveys N

```
|------------------|       |------------------|
xxx xxxxxxxx xx xxxxxx ->  xxx xxxxxxxx xx 
                           xxxxxx 
```


