##########################################
Anotacions sobre les propietats protegides
##########################################

* Autor/a: Iker Rivera Garcia

* Data: 12/03/2025

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de
*propietats protegides* dins de la *programació orientada a objectes*.

Considerarem la nova versió de ``GatRenat``::


::

    01   public class GatRenat {
    02       private int vides = 7;
    03       public int getVides() {  //  retorna el nombre de vides
    04           return vides;
    05       }
    06       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
    07           if (novesVides >= 0) {
    08               vides = novesVides;
    09           }
    10       }
    11   }


Pregunta 1. L'accés de sempre
=============================

Si ``UsaGatRenat`` fos:

::

       public class UsaGatRenat {
           public static void main(String[] args) {
               GatRenat renat = new GatRenat();
               System.out.println("El gat Renat té " + renat.vides + " vides");
           }
       }

Ens trobem que no podem accedir directament a la propietat `vides` perquè és privada. Això vol dir que només es pot accedir a ella des de dins de la classe `GatRenat`.

Penso que passa perquè la propietat `vides` està declarada com a `private`, la qual cosa impedeix que altres classes la puguin veure o modificar directament.

Pregunta 2. Un nou accés
========================

En modificar el codi de ``UsaGatRenat`` com:

::

     public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La diferència respecte a la versió de la pregunta anterior és que ara podem accedir al nombre de vides del gat Renat mitjançant el mètode públic `getVides()`, que retorna el valor de la propietat privada `vides`. Això permet que altres classes puguin obtenir el valor de `vides` sense accedir-hi directament.

El resultat ara és "El gat Renat té 7 vides"

Penso que passa això perquè getVides() retorna la variable vides dins de GatRenat.

Pregunta 3. Canviant valor
==========================

Per què des del ``main()`` de ``UsaGatRenat`` poguem dir que ``renat`` té
5 vides, cal trucar setVides(paràmetre).

El codi de ``UsaGatRenat`` seria:

::

    public staic void main(String[] args) {
        GatRenat renat = new GatRenat();
        renat.setVides(5);
        System.out.println("El gat Renat té " + renat.getVides() + " vides");
    }

La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 5 vides


La meva explicació de perquè això és així és perquè hem canviat l'anomenat a setVides que canvia la variable vinyes per l'argument que li hem passat en aquest cas 5 i ara getVides retorna 5.


Pregunta 4. Un valor absurd
===========================

En intentar assignar de la manera anterior -12 en comptes de 5 vides, ens trobem que no pots posar un valor negatiu

El codi seria:

::

    public staic void main(String[] args) {
        GatRenat renat = new GatRenat();
        renat.setVides(-12);
        System.out.println("El gat Renat té " + renat.getVides() + " vides");
    }


La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 0 vides


La meva explicació de perquè això és així és per que no pots posar un valor negatiu


Pregunta 5. I des de ``GatRenat``?
==================================

He experimentat com es comporta ``private`` des del ``main()`` del propi
``GatRenat``. En concret, he provat:

::

   public class GatRenat {
       private int vides = 7;
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();
           renat.vides = -12;
           System.out.println("El gat Renat té " + renat.vides + " vides");
       }
   }

En intentar compilar i executar aquesta versió em trobo què vides té un valor negatiu

Comparant-lo amb el que passava a la pregunta 1, veiem que en aquest cas podem accedir directament a la propietat `vides` des del `main()` de la classe `GatRenat` perquè `main()` és un mètode de la mateixa classe `GatRenat`. Això vol dir que els mètodes de la mateixa classe poden accedir a les propietats privades directament, sense necessitat d'utilitzar els mètodes `getVides()` o `setVides()`. 

La meva explicació és que les propietats privades només són accessibles directament dins de la mateixa classe on estan definides. Això permet encapsular les dades i protegir-les de modificacions externes no controlades.

Pregunta 6. Valors absurds novament
===================================

Un cop hem vist el funcionament d'aquesta versió de ``GatRenat``, ens
podem fer la següent pregunta:

    És possible posar un valor absurd a les vides d'una instància de
    GatRenat sense modificar el programa ``GatRenat.java``?

La meva resposta és no per el encapsulament de les propietats.

Pregunta 7. públic i privat
===========================

La meva idea del paper que juguen les paraules ``public`` i ``private`` a
les propietats d'una classe és que controlen la visibilitat i l'accés a les dades de la classe. Quan una propietat és declarada com a `public`, vol dir que qualsevol codi fora de la classe pot accedir-hi directament. En canvi, quan una propietat és declarada com a `private`, només els mètodes de la mateixa classe poden accedir-hi directament. Això permet encapsular les dades i protegir-les de modificacions externes no controlades.

Pregunta 8. Només *getter*
==========================

Aquesta implementació de ``GatRenat`` disposa de *getter* i de *setter*.
Aquests venen definits pels mètodes ``getVides()`` i ``setVides()``.

En cas que ``GatRenat`` només disposés de *getter*, el resultat seria que és només de lectura.

En canvi, si només en tingués *setter* el que passaria és no es podria llegir des de fora de la classe.

Finalment, si no en tingués cap dels dos, ens trobaríem que totalment privada.


Pregunta 9. Diferències amb els mòduls ja coneguts
==================================================

Els mòduls ``getVides()`` i ``setVides()`` tenen una definició
lleugerament diferent als mòduls que hem declarat abans del tema de POO.
En concret, aquests mòduls permeten accedir i modificar les propietats privades de la classe de manera controlada, mentre que en els mòduls anteriors no teníem aquest nivell de control sobre les dades.