//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.01.07 à 02:47:25 PM CET 
//


package com.gestiondepartement.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StatNiveau complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StatNiveau">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="moyenne" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatNiveau", propOrder = {
    "annee",
    "moyenne"
})
public class StatNiveau {

    protected int annee;
    protected float moyenne;

    /**
     * Obtient la valeur de la propriété annee.
     * 
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * Définit la valeur de la propriété annee.
     * 
     */
    public void setAnnee(int value) {
        this.annee = value;
    }

    /**
     * Obtient la valeur de la propriété moyenne.
     * 
     */
    public float getMoyenne() {
        return moyenne;
    }

    /**
     * Définit la valeur de la propriété moyenne.
     * 
     */
    public void setMoyenne(float value) {
        this.moyenne = value;
    }

}
