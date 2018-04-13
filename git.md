# Pautes a seguir per git

En aquest document trobaràs comandes de git, juntament amb el seu ús i explicació. Les comandes estan agrupades en tres nivells, ja que no totes són igual d'entenedores o simples, ni igual d'importants. Amb els dos primers nivells n'hi ha prou com per poder treballar amb el repositori.

## Índex
### Part 1 (Local)
* [Estructura de git](#estructura-de-git)
* [Git add](#git-add)
* [Git commit](#git-commit)
* [Git status](#git-status)
* [Git branch](#git-branch)
* [Git checkout](#git-checkout)
* [Git merge](#git-merge)

### Part 2 (Origin part 1)
* [Git clone](#git-clone)
* [Origin](#origin)
* [Git pull origin branca](#git-pull-origin-branca)
* [Git push origin branca](#git-push-origin-branca)

### Part 3 (Origin part 2)
* [Git fetch](#git-fetch)
* [Git pull](#git-pull)
* [Git revert](#git-revert)

## Part 1
En aquest nivell no s'entra en detall de cap dels conceptes explicats, només es dóna una petita pinzellada per sobre, per saber que es fa.

### Estructura de git
Git és en essència, un arbre. Aquest arbre està format per dos conceptes generals que s'han de tenir clars: Branques i commits.

**Commit:**
Un commit és una versió del nostre programa, que hem guardat.

*Exemple*
```
|____ i18n  <= Un commit
|      |___ fitxer 'mgra' modificat
|      |___ fitxer 'mcli' eliminat
|____ a32c  <= Un altre commit
       |___ fitxer 'mcli00' creat
```

**Branca:**
Una branca és una cadena de commits. En el cas anterior era la branca master.

*Exemple*
```
master
|____ i18n  <= Un commit
|      |___ fitxer 'mgra' modificat
|      |___ fitxer 'mcli' eliminat
|____ a32c  <= Un altre commit
       |___ fitxer 'mcli00' creat
```

**Nosaltres:**
Nosaltres sempre estem en qualsevol branca, per defecte sempre mirem l'últim commit que hem fet amb les coses noves que anem escrivint (també podem viatjar pels commits d'una branca, de moment no ho mirarem perquè només complica les coses i quasi mai fa falta fer això).

*Exemple*
```
        i18n              a32c
---------|-----------------|-------------- master
                            \
                             |------------ development <=Nosaltres
                            c43k
```

En aquest últim exemple veiem una nova sub branca, anomenada development. Nosaltres estem apuntant allà, i podem tornar a master si volem amb una simple comanda (més tard ho veurem).

Aquesta nova sub branca, en el moment que s'ha creat (si, té una comanda per fer-ho), passa a ser independent de master, i els commits que és facin en aquesta nova branca no els tindrà development. Ho podem veure com si caminéssim per un camí que es diu master, i de cop i volta ens trobem una bifurcació, master continua cap a l'esquerra i a la dreta tenim un camí que es diu development. Tot el que passi a development, no passarà a master, i tot el que passi a master (a partir de la bifurcació), no passarà a development.


### Git add

Quan modifiquem un fitxer, git sap que s'ha modificat, però no sap si s'ha de guardar aquella nova modificació en el següent commit. Per tant, utilitzant la comanda git add nomDelFitxer li diem al git que en el pròxim commit, les accions fetes sobre aquell fitxer es guardaran.

*Exemple*
```
Fitxer modificar.js se li modifica una línia i volem guardar-ho en el següent commit.

> git add modificar.js
```

### Git commit

Quan ja li hem dit a git tots els fitxers que volem que es guardin en el següent commit, és hora de fer-lo. Només falta fer git commit -m "Frase indicant el canvi".

*Exemple*
```
> git commit -m "Realitzada una modificacio en el tractament de taules sobre les granges modificades"
```

És MOLT important que els missatges de commit siguin descriptius, indicant que conté aquell commit (així si mai volem veure una modificació, sabrem a quina anar només per aquest missatge).

### Git status

Aquesta és probablement una de les millors comandes que té git. Quan no recordem quins fitxers hem modificat o de quins fitxers s'ha fet add, aquesta comanda indicarà tota la informació necessària.

*Exemple*
```
>git status

  On branch redactant_git
  Changes not staged for commit:
    (use "git add <file>..." to update what will be committed)
    (use "git checkout -- <file>..." to discard changes in working directory)

          modified:   instruccionsGit.md

  no changes added to commit (use "git add" and/or "git commit -a")
```

Com veiem, el fitxer instruccionsGit.md s'ha modificat, però no s'ha fet un add encara.

### Git branch

Abans hem vist que de la branca master, sortia la sub branca development (si no ho has llegit, fes-ho). Aquesta branca s'ha creat quan estàvem a dins de master, fent git branch development .

*Exemple*
```
        i18n              a32c
---------|-----------------|-------------- master  <=Nosaltres
                            \ <=  >git branch development
                             \ development
```

### Git checkout

Quan tenim vàries branques, com per exemple master, development, funcionalitat1, funcionalitat2, etc... Hem de poder moure'ns entre aquestes branques d'alguna manera. Per fer-ho utilitzem git checkout [nom de la branca]

*Exemple*
```
        i18n              a32c
---------|-----------------|-------------- master <=Nosaltres
                            \
                             |------------ development
                            c43k

> git checkout development

        i18n              a32c
---------|-----------------|-------------- master
                            \
                             |------------ development <=Nosaltres
                            c43k

```

### Git merge

Aquesta és la comanda més difícil del nivell 1. Normalment en el projecte es farà només merge una vegada acabada cada funcionalitat, cap a development. Sempre hi ha una persona encargada de fer els merge de totes les branques a development, per tant, prohibit utilitzar aquesta comanda cap a development sense permís.

Quan nosaltres tenim dues branques diferents i amb commits diferents entre elles, potser ens interessa ajuntar el codi d'una branca, amb el codi de l'altra. Això ho farem amb la comanda git merge [nom de la branca que volem agafar]

*Exemple*
```
a32c  i23s 3fs1
|-----|----|----- master <=Nosaltres
\
 |------|---|---- development
u42a   n42m h21k
```

Ens interessa fer que master guanyi les funcionalitats de development, per tant farem >git merge development. ATENCIÓ si fem git merge master des de la branca development, serà development qui guanyarà les funcionalitats de master i no al revés.

```
>git merge development
a32c  i23s 3fs1
|-----|----|------|- master <=Nosaltres
\                / >git merge development
 |------|---|---|---development
u42a   n42m h21k
```

Quan utilitzem aquesta comanda, poden passar dues coses. La primera és que no passi res i que master tingui les dues funcionalitats, aquesta és la millor possibilitat. El problema és si els commits entre branques contenen modificacions dels mateixos arxius, aquí apareix la segona opció, conflictes.

**Conflictes**

Sempre que apareix conflictes en un merge, git ens ho comunica amb un missatge per terminal, indicant en quin fitxer hi ha conflicte.

Si entrem al fitxer, tindrem una estructura així:

*Exemple*
```
<<<<<<< HEAD
// Aqui hi ha el codi que tenim
=======
// Aqui hi ha el codi nou
>>>>>>> Commit de la branca que ens volem quedar
```

Aquí s'ha de decidir amb quin codi ens quedem i amb quin no, o quines modificacions s'han de fer segons a quin codi. Per tant modifiquem el fitxer arreglant el conflicte, i esborrem el codi que no vulguem juntament amb els missatges que ha creat git.

## Part 2
En el nivell anterior s'ha comentat l'ús de git guardant la informació localment, en l'ordinador propi. L'objectiu d'aquest nivell és explicar l'ús de git remot, a un repositori d'internet.

### Git clone
Si volem treballar sobre un repositori d'internet, hem d'utilitzar la comanda >git clone [enllaç http o ssh que ens proporciona el repositori].
Un exemple seria > git clone https://github.com/exemple/directori.git
Aquesta comanda descarrega la branca master, les altres branques s'elegeix amb altres comandes que veurem.

### Origin
Quan es treballa amb git es pot guardar informació a local o a remot (conegut com origin). Origin és la informació connectada amb el repositori d'internet.

Diguem que la informació dels commits/projecte, en total, es pot guardar de tres maneres:

*Exemple*
```
Repositori
---|-----|------|--
 j23k   l12j   k32g
__________
Origin
---|-----|--
 j23k   l12j
__________
Local
---|-----|----
 j23k  a34f
```

Com podem veure, tenim la versió del repositori, la versió d'origin, i la nostra versió, la local.
La versió del repositori té tres commits, la versió d'origin en té dos d'ells, i finalment la branca local en té un d'ells més un que hem fet nosaltres, que no té ningú més.
Tenim moltes possibilitats en aquesta situació, podem actualitzar l'origin, podem actualitzar el local sense actualitzar origin, podem actualitzar origin i local a la vegada, etc...

### Git pull origin branca

Quan nosaltres estem en local i volem descarregar informació del repositori, s'han de seguir uns passos.

Primer de tot, s'ha de tenir una branca amb el mateix nom que la branca que volem descarregar o actualitzar. Per tant, si volem descarregar la branca development i no la tenim creada, haurem de fer git branch development => git checkout development.

Quan tenim una branca amb el mateix nom que al repositori, ja podem utilitzar la comanda git pull origin [nom de la branca]. Aquesta comanda agafarà la informació del repositori i actualitzarà Origin i Local (la branca des de la que hem executat la comanda).

Atenció, si tenim alguns commits en la branca local, que no té el repositori, i toquen la mateixa part de codi que els commits que descarreguem, hi haurà conflictes, s'hauran de solucionar.

*Exemple*
```
> git pull origin development
Repositori
---|-----|------|-- <= development
 j23k   l12j   k32g
__________      \
Origin           \
---|-----|--------|- <= development
 j23k   l12j     k32g
_________\        \
Local     \        \
---|-----|-|--------|- <= development
 j23k  a34f        k32g
          l12j
```

### Git push origin branca

Quan la nostra versió (Local) del projecte té tots els commits del repositori, i a més a més té commits que hem fet nostaltres, ens interessa actualitzar el repositori. Per fer-ho, utilitzarem la comanda git push origin [nom de la branca]. Aquesta comanda agafa tots els commits que tenim en la nostra branca, i els envia al repositori remot, actualitzant-ho.

*Exemple*
```
Repositori                   a34f
---|-----|------|-------------|- <= development
 j23k   l12j   k32g          /
__________                  /
Origin                a34f /
---|-----|------|---------|- <= development
 j23k   l12j   k32g      /
__________              /
Local                  /
---|-----|------|-----|--- <= development
 j23k   l12j   k32g  a34f
```

També podem fer git push -u origin [nom branca], aixi les següents vegades només fara falta utilitzar la comanda git push i git ja sabrà a quina localització fer push.

## Part 3

En aquest apartat veurem més a fons les comandes que treballen sobre origin i el repositori, a part de comandes més complexes.

### Git fetch
Si la nostra intenció és actualitzar l'origin descarregant les dades del repositori, hem d'actualitzar git fetch.

*Exemple*
```
> git pull origin development
Repositori
---|-----|------|-- <= development
 j23k   l12j   k32g
__________      \   <= >git fetch
Origin           \
---|-----|--------|- <= development
 j23k   l12j     k32g
```

### Git pull

Si el que volem és actualitzar-ho tot (origin i local) amb l'informació del repositori, utilitzarem git pull. Aquesta comanda és una convinació de git fetch i git merge, és a dir:

*Exemple*
```
>git pull == >git fetch => >git merge

Repositori
---|-----|------|-- <= development
 j23k   l12j   k32g
__________      \   <= git fetch
Origin           \
---|-----|--------|- <= development
 j23k   l12j     k32g
_________\        \ <= git merge
Local     \        \
---|-----|-|--------|- <= development
 j23k  a34f        k32g
          l12j
```

Que significa això? Aquesta comanda es molt util, però a vegades perillosa. Si estem treballant sobre una branca i fem modificacions que no té el repositori, aquesta comanda pot ocasionar conflictes(en la part de merge).

### Git revert

Aquesta comanda es simple, però molt perillosa. Si hem fet un merge amb una branca equivocada, o un error que el commit anterior no tenia, aquesta comanda es l'indicada, però si el nostre objectiu es tirar més d'un commit enrere, s'ha de vigilar molt amb aquesta comanda, ja que pot provocar molts errors.

L'intencio de la comanda és fer un nou commit amb l'ús d'un commit anterior. Que vol dir això? Podriem dir que es un backup d'informació anterior.

*Exemple*
```
--------|---------|-------|-- <= popUp
      g45o      i15g    a31o

> git revert i15g

                   ____________
                  /            \
--------|---------|-------|-----| <= popUp
      g45o      i15g    a31o   w32v (anterior commit i15g)
```

<a rel="license" href="http://creativecommons.org/licenses/by/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by/4.0/88x31.png" /></a><br />This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by/4.0/">Creative Commons Attribution 4.0 International License</a>
