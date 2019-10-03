#### CAHA

Cards Against Humanity inspired App

## Welke info staat hier in?

Hierin zal ik uitleggen wanneer je iets moet uploaden, en op welke manier dit moet gebeuren. De regels en richtlijnen omtreft gebruik van github staan hier ook in.

### Algemene info

# De algemene opzet van branches

```
De Master branch bevat altijd een werkende, volledige versie. Het werken aan het project gebeurt in de Development branch. Hier stuurt iedereen zijn/haar commits naar toe. Op het moment dat we alle onderdelen waar we aan werken werkend hebben, pushen we dit pas naar de Master. We werken dus allemaal in dezelfde branch.
```

## Wanneer en hoe te uploaden

#Allemaal leuk en aardig die github, maar hoe werkt het nou?

Commit

```
Door iets te committen, sla je een lokale versie op van het project, in zijn huidige vorm. Het is voor jezelf good practise om na elk kleine toevoeging een commit te doen. Mocht er dan later wat fout gaan, dan kan je altijd reverten naar die ene commit. Committen hoeft niet bij elke regel code, maar wel bij onderdelen van features. 

```

Pull/Sync

```
Op het moment dat je de online versie van het project wil ophalen, PULL je. Als je het online project wil mergen met jouw huidige versie, dan SYNC je. Pull en Sync zo vaak mogelijk, om er voor te zorgen dat je geen versies achter gaat lopen met de rest. Dit voorkomt EEN HOOP GEDOE voor iedereen, maar vooral voor jezelf :P

```

Push

```
Dit gebruik je op het moment dat je je lokale project naar de remote branch wil uploaden. BELANGRIJK: NOOIT ZOMAAR PUSHEN, ALTIJD EERST SYNCEN EN DE EVENTUELE MERCH CONFILICTS OPLOSSEN, VOOR JE PUSHED NAAR DE DEVELOPMENTBRANCH. NOOIT ZOMAAR PUSHEN NAAR MASTER BRANCH

```

#Minder vaak voorkomende termen/tools

Revert/Rebase

```
Dit zal ik gebruiken op het moment dat iemand iets upload wat de rest van de applicatie laat crashen, of als we om een andere reden terug willen naar een vorige versie van een branch.

```

Merge
```
Dit gebruikt men op het moment dat je 2 branches (zowel lokale als online branches) samen te voegen. Hieruit ontstaan vaak merge conflicten, dus het is belangrijk dat je na het oplossen van deze confilicten naloopt of alles het nog doen voor je het daadwerkelijk pushed naar the remote branch. Pull nog 1 laatste keer voor je het pushed na de merge, om te voorkomen dat je andermans werk override op de server. 

```


## Regels en verantwoordelijkheden

* Iedereen is verantwoordelijk voor zijn/haar eigen merging met de Development branch. Als ergens hulp bij nodig hebt, vraag dat gerust, maar iedereen is er uiteindelijk zelf verantwoordelijk voor dat ze up to date blijven met het online project, en hier zelf hun lokale project correct in mergen. Aan te raden tool hier voor: GitKraken.

* Je synct en pushed je lokale project zo vaak mogelijk, zodat de online versie zo up to date mogelijk blijft.

* Iedereen werkt zo veel mogelijk in diens eigen files, dit voorkomt een hoop hoofdpijn. Mergen gaat namelijk per regel, als je ineens 2 regels toevoegd aan een bestaand bestand waar ook iemand in werkt, krijg je heel HEEL veel merge conflicten. Je maakt echter geen files aan met je eigen naam of zo. Probeer zo veel mogelijk in je eigen classes te werken, en goed te overleggen als je de classes van een ander wil gebruiken

* DOCUMENTATIE: voor elke class, geef een korte beschrijving wat het doet, welke gegevens je erin moet stoppen en wat er uit komt. Dit om hergebruik van classes te bevordern.
