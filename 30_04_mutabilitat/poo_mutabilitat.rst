####################################
Anotacions sobre propietats mutables
####################################

* Autor/a: Iker Rivera Garcia

* Data: 05/03/2025

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *propietats mutables*
dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01    public class GatRenat {
    02        int vides = 7;                // vides disponibles del gat Renat
    03        public static void main(String[] args) {
    04            GatRenat renat;           // declarem l'objecte (la referència) al gat
    05            renat = new GatRenat();   // creem la instància del gat Renat.
    06            System.out.println("Abans el gat Renat tenia " + renat.vides + " vides");
    07            renat.vides = renat.vides - 1;  // Renat ha tingut un accident
    08            System.out.println("Ara el gat Renat té " + renat.vides);
    09        }
    10    }

Pregunta 1. Obtenir
===================

Per consultar (llegir, obtenir) el valor d'una propietat de la instància,
cal acceder a la instancia y si la variable es publica o estas dentro de la misma clase se puede acceder directamente a ella desde otra clase.

Pregunta 2. Assignar
====================

Per canviar (escriure, assignar) el valor d'una propietat de la instància,
cal acceder a la instancia y si la variable es publica o estas dentro de la misma clase se puede acceder directamente a ella desde otra clase.

Pregunta 3. Valors absurds
==========================

A la pregunta següent:

    És possible indicar que el gat Renat té -12 vides? Com? És quelcom
    desitjable que pugui passar? En cas que es pugui, com ho podries
    evitar fent servir els coneixements de programació estructurada i
    modular que hem treballat fins ara?

La meva resposta és: Si, es posible indicar que el gat Renat té -12 vides, pero no es deseable, ya que no tiene sentido que un gato tenga vidas negativas. Para evitarlo se puede hacer una comprobacion antes de restar las vidas, si el resultado es menor que 0, no se resta.
