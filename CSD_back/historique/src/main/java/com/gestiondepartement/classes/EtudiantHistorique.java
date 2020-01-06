//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.01.03 à 05:42:12 AM WAT 
//


package com.gestiondepartement.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EtudiantHistorique complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EtudiantHistorique">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="annee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="classe" type="{http://GestionDepartement.com}Classe"/>
 *         &lt;element name="etudiant" type="{http://GestionDepartement.com}Etudiant"/>
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
@XmlType(name = "EtudiantHistorique", propOrder = {
    "id",
    "annee",
    "classe",
    "etudiant",
    "moyenne"
})
public class EtudiantHistorique {

    protected int id;
    protected int annee;
    @XmlElement(required = true)
    protected Classe classe;
    @XmlElement(required = true)
    protected Etudiant etudiant;
    protected float moyenne;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

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
     * Obtient la valeur de la propriété classe.
     * 
     * @return
     *     possible object is
     *     {@link Classe }
     *     
     */
    public Classe getClasse() {
        return classe;
    }

    /**
     * Définit la valeur de la propriété classe.
     * 
     * @param value
     *     allowed object is
     *     {@link Classe }
     *     
     */
    public void setClasse(Classe value) {
        this.classe = value;
    }

    /**
     * Obtient la valeur de la propriété etudiant.
     * 
     * @return
     *     possible object is
     *     {@link Etudiant }
     *     
     */
    public Etudiant getEtudiant() {
        return etudiant;
    }

    /**
     * Définit la valeur de la propriété etudiant.
     * 
     * @param value
     *     allowed object is
     *     {@link Etudiant }
     *     
     */
    public void setEtudiant(Etudiant value) {
        this.etudiant = value;
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
