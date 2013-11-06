/**
 * Cn3DStyleSettingsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DStyleSettingsType  implements java.io.Serializable {
    private java.lang.String cn3DStyleSettings_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_proteinBackboneType cn3DStyleSettings_proteinBackbone;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_nucleotideBackboneType cn3DStyleSettings_nucleotideBackbone;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_proteinSidechainsType cn3DStyleSettings_proteinSidechains;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_nucleotideSidechainsType cn3DStyleSettings_nucleotideSidechains;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_heterogensType cn3DStyleSettings_heterogens;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_solventsType cn3DStyleSettings_solvents;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_connectionsType cn3DStyleSettings_connections;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_helixObjectsType cn3DStyleSettings_helixObjects;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_strandObjectsType cn3DStyleSettings_strandObjects;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_virtualDisulfidesOnType cn3DStyleSettings_virtualDisulfidesOn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_virtualDisulfideColorType cn3DStyleSettings_virtualDisulfideColor;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_hydrogensOnType cn3DStyleSettings_hydrogensOn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_backgroundColorType cn3DStyleSettings_backgroundColor;

    private java.lang.String cn3DStyleSettings_scaleFactor;

    private java.lang.String cn3DStyleSettings_spaceFillProportion;

    private java.lang.String cn3DStyleSettings_ballRadius;

    private java.lang.String cn3DStyleSettings_stickRadius;

    private java.lang.String cn3DStyleSettings_tubeRadius;

    private java.lang.String cn3DStyleSettings_tubeWormRadius;

    private java.lang.String cn3DStyleSettings_helixRadius;

    private java.lang.String cn3DStyleSettings_strandWidth;

    private java.lang.String cn3DStyleSettings_strandThickness;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_proteinLabelsType cn3DStyleSettings_proteinLabels;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_nucleotideLabelsType cn3DStyleSettings_nucleotideLabels;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_ionLabelsType cn3DStyleSettings_ionLabels;

    public Cn3DStyleSettingsType() {
    }

    public Cn3DStyleSettingsType(
           java.lang.String cn3DStyleSettings_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_proteinBackboneType cn3DStyleSettings_proteinBackbone,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_nucleotideBackboneType cn3DStyleSettings_nucleotideBackbone,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_proteinSidechainsType cn3DStyleSettings_proteinSidechains,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_nucleotideSidechainsType cn3DStyleSettings_nucleotideSidechains,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_heterogensType cn3DStyleSettings_heterogens,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_solventsType cn3DStyleSettings_solvents,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_connectionsType cn3DStyleSettings_connections,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_helixObjectsType cn3DStyleSettings_helixObjects,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_strandObjectsType cn3DStyleSettings_strandObjects,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_virtualDisulfidesOnType cn3DStyleSettings_virtualDisulfidesOn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_virtualDisulfideColorType cn3DStyleSettings_virtualDisulfideColor,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_hydrogensOnType cn3DStyleSettings_hydrogensOn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_backgroundColorType cn3DStyleSettings_backgroundColor,
           java.lang.String cn3DStyleSettings_scaleFactor,
           java.lang.String cn3DStyleSettings_spaceFillProportion,
           java.lang.String cn3DStyleSettings_ballRadius,
           java.lang.String cn3DStyleSettings_stickRadius,
           java.lang.String cn3DStyleSettings_tubeRadius,
           java.lang.String cn3DStyleSettings_tubeWormRadius,
           java.lang.String cn3DStyleSettings_helixRadius,
           java.lang.String cn3DStyleSettings_strandWidth,
           java.lang.String cn3DStyleSettings_strandThickness,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_proteinLabelsType cn3DStyleSettings_proteinLabels,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_nucleotideLabelsType cn3DStyleSettings_nucleotideLabels,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_ionLabelsType cn3DStyleSettings_ionLabels) {
           this.cn3DStyleSettings_name = cn3DStyleSettings_name;
           this.cn3DStyleSettings_proteinBackbone = cn3DStyleSettings_proteinBackbone;
           this.cn3DStyleSettings_nucleotideBackbone = cn3DStyleSettings_nucleotideBackbone;
           this.cn3DStyleSettings_proteinSidechains = cn3DStyleSettings_proteinSidechains;
           this.cn3DStyleSettings_nucleotideSidechains = cn3DStyleSettings_nucleotideSidechains;
           this.cn3DStyleSettings_heterogens = cn3DStyleSettings_heterogens;
           this.cn3DStyleSettings_solvents = cn3DStyleSettings_solvents;
           this.cn3DStyleSettings_connections = cn3DStyleSettings_connections;
           this.cn3DStyleSettings_helixObjects = cn3DStyleSettings_helixObjects;
           this.cn3DStyleSettings_strandObjects = cn3DStyleSettings_strandObjects;
           this.cn3DStyleSettings_virtualDisulfidesOn = cn3DStyleSettings_virtualDisulfidesOn;
           this.cn3DStyleSettings_virtualDisulfideColor = cn3DStyleSettings_virtualDisulfideColor;
           this.cn3DStyleSettings_hydrogensOn = cn3DStyleSettings_hydrogensOn;
           this.cn3DStyleSettings_backgroundColor = cn3DStyleSettings_backgroundColor;
           this.cn3DStyleSettings_scaleFactor = cn3DStyleSettings_scaleFactor;
           this.cn3DStyleSettings_spaceFillProportion = cn3DStyleSettings_spaceFillProportion;
           this.cn3DStyleSettings_ballRadius = cn3DStyleSettings_ballRadius;
           this.cn3DStyleSettings_stickRadius = cn3DStyleSettings_stickRadius;
           this.cn3DStyleSettings_tubeRadius = cn3DStyleSettings_tubeRadius;
           this.cn3DStyleSettings_tubeWormRadius = cn3DStyleSettings_tubeWormRadius;
           this.cn3DStyleSettings_helixRadius = cn3DStyleSettings_helixRadius;
           this.cn3DStyleSettings_strandWidth = cn3DStyleSettings_strandWidth;
           this.cn3DStyleSettings_strandThickness = cn3DStyleSettings_strandThickness;
           this.cn3DStyleSettings_proteinLabels = cn3DStyleSettings_proteinLabels;
           this.cn3DStyleSettings_nucleotideLabels = cn3DStyleSettings_nucleotideLabels;
           this.cn3DStyleSettings_ionLabels = cn3DStyleSettings_ionLabels;
    }


    /**
     * Gets the cn3DStyleSettings_name value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_name
     */
    public java.lang.String getCn3DStyleSettings_name() {
        return cn3DStyleSettings_name;
    }


    /**
     * Sets the cn3DStyleSettings_name value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_name
     */
    public void setCn3DStyleSettings_name(java.lang.String cn3DStyleSettings_name) {
        this.cn3DStyleSettings_name = cn3DStyleSettings_name;
    }


    /**
     * Gets the cn3DStyleSettings_proteinBackbone value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_proteinBackbone
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_proteinBackboneType getCn3DStyleSettings_proteinBackbone() {
        return cn3DStyleSettings_proteinBackbone;
    }


    /**
     * Sets the cn3DStyleSettings_proteinBackbone value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_proteinBackbone
     */
    public void setCn3DStyleSettings_proteinBackbone(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_proteinBackboneType cn3DStyleSettings_proteinBackbone) {
        this.cn3DStyleSettings_proteinBackbone = cn3DStyleSettings_proteinBackbone;
    }


    /**
     * Gets the cn3DStyleSettings_nucleotideBackbone value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_nucleotideBackbone
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_nucleotideBackboneType getCn3DStyleSettings_nucleotideBackbone() {
        return cn3DStyleSettings_nucleotideBackbone;
    }


    /**
     * Sets the cn3DStyleSettings_nucleotideBackbone value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_nucleotideBackbone
     */
    public void setCn3DStyleSettings_nucleotideBackbone(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_nucleotideBackboneType cn3DStyleSettings_nucleotideBackbone) {
        this.cn3DStyleSettings_nucleotideBackbone = cn3DStyleSettings_nucleotideBackbone;
    }


    /**
     * Gets the cn3DStyleSettings_proteinSidechains value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_proteinSidechains
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_proteinSidechainsType getCn3DStyleSettings_proteinSidechains() {
        return cn3DStyleSettings_proteinSidechains;
    }


    /**
     * Sets the cn3DStyleSettings_proteinSidechains value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_proteinSidechains
     */
    public void setCn3DStyleSettings_proteinSidechains(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_proteinSidechainsType cn3DStyleSettings_proteinSidechains) {
        this.cn3DStyleSettings_proteinSidechains = cn3DStyleSettings_proteinSidechains;
    }


    /**
     * Gets the cn3DStyleSettings_nucleotideSidechains value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_nucleotideSidechains
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_nucleotideSidechainsType getCn3DStyleSettings_nucleotideSidechains() {
        return cn3DStyleSettings_nucleotideSidechains;
    }


    /**
     * Sets the cn3DStyleSettings_nucleotideSidechains value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_nucleotideSidechains
     */
    public void setCn3DStyleSettings_nucleotideSidechains(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_nucleotideSidechainsType cn3DStyleSettings_nucleotideSidechains) {
        this.cn3DStyleSettings_nucleotideSidechains = cn3DStyleSettings_nucleotideSidechains;
    }


    /**
     * Gets the cn3DStyleSettings_heterogens value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_heterogens
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_heterogensType getCn3DStyleSettings_heterogens() {
        return cn3DStyleSettings_heterogens;
    }


    /**
     * Sets the cn3DStyleSettings_heterogens value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_heterogens
     */
    public void setCn3DStyleSettings_heterogens(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_heterogensType cn3DStyleSettings_heterogens) {
        this.cn3DStyleSettings_heterogens = cn3DStyleSettings_heterogens;
    }


    /**
     * Gets the cn3DStyleSettings_solvents value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_solvents
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_solventsType getCn3DStyleSettings_solvents() {
        return cn3DStyleSettings_solvents;
    }


    /**
     * Sets the cn3DStyleSettings_solvents value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_solvents
     */
    public void setCn3DStyleSettings_solvents(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_solventsType cn3DStyleSettings_solvents) {
        this.cn3DStyleSettings_solvents = cn3DStyleSettings_solvents;
    }


    /**
     * Gets the cn3DStyleSettings_connections value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_connections
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_connectionsType getCn3DStyleSettings_connections() {
        return cn3DStyleSettings_connections;
    }


    /**
     * Sets the cn3DStyleSettings_connections value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_connections
     */
    public void setCn3DStyleSettings_connections(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_connectionsType cn3DStyleSettings_connections) {
        this.cn3DStyleSettings_connections = cn3DStyleSettings_connections;
    }


    /**
     * Gets the cn3DStyleSettings_helixObjects value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_helixObjects
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_helixObjectsType getCn3DStyleSettings_helixObjects() {
        return cn3DStyleSettings_helixObjects;
    }


    /**
     * Sets the cn3DStyleSettings_helixObjects value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_helixObjects
     */
    public void setCn3DStyleSettings_helixObjects(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_helixObjectsType cn3DStyleSettings_helixObjects) {
        this.cn3DStyleSettings_helixObjects = cn3DStyleSettings_helixObjects;
    }


    /**
     * Gets the cn3DStyleSettings_strandObjects value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_strandObjects
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_strandObjectsType getCn3DStyleSettings_strandObjects() {
        return cn3DStyleSettings_strandObjects;
    }


    /**
     * Sets the cn3DStyleSettings_strandObjects value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_strandObjects
     */
    public void setCn3DStyleSettings_strandObjects(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_strandObjectsType cn3DStyleSettings_strandObjects) {
        this.cn3DStyleSettings_strandObjects = cn3DStyleSettings_strandObjects;
    }


    /**
     * Gets the cn3DStyleSettings_virtualDisulfidesOn value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_virtualDisulfidesOn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_virtualDisulfidesOnType getCn3DStyleSettings_virtualDisulfidesOn() {
        return cn3DStyleSettings_virtualDisulfidesOn;
    }


    /**
     * Sets the cn3DStyleSettings_virtualDisulfidesOn value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_virtualDisulfidesOn
     */
    public void setCn3DStyleSettings_virtualDisulfidesOn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_virtualDisulfidesOnType cn3DStyleSettings_virtualDisulfidesOn) {
        this.cn3DStyleSettings_virtualDisulfidesOn = cn3DStyleSettings_virtualDisulfidesOn;
    }


    /**
     * Gets the cn3DStyleSettings_virtualDisulfideColor value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_virtualDisulfideColor
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_virtualDisulfideColorType getCn3DStyleSettings_virtualDisulfideColor() {
        return cn3DStyleSettings_virtualDisulfideColor;
    }


    /**
     * Sets the cn3DStyleSettings_virtualDisulfideColor value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_virtualDisulfideColor
     */
    public void setCn3DStyleSettings_virtualDisulfideColor(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_virtualDisulfideColorType cn3DStyleSettings_virtualDisulfideColor) {
        this.cn3DStyleSettings_virtualDisulfideColor = cn3DStyleSettings_virtualDisulfideColor;
    }


    /**
     * Gets the cn3DStyleSettings_hydrogensOn value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_hydrogensOn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_hydrogensOnType getCn3DStyleSettings_hydrogensOn() {
        return cn3DStyleSettings_hydrogensOn;
    }


    /**
     * Sets the cn3DStyleSettings_hydrogensOn value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_hydrogensOn
     */
    public void setCn3DStyleSettings_hydrogensOn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_hydrogensOnType cn3DStyleSettings_hydrogensOn) {
        this.cn3DStyleSettings_hydrogensOn = cn3DStyleSettings_hydrogensOn;
    }


    /**
     * Gets the cn3DStyleSettings_backgroundColor value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_backgroundColor
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_backgroundColorType getCn3DStyleSettings_backgroundColor() {
        return cn3DStyleSettings_backgroundColor;
    }


    /**
     * Sets the cn3DStyleSettings_backgroundColor value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_backgroundColor
     */
    public void setCn3DStyleSettings_backgroundColor(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_backgroundColorType cn3DStyleSettings_backgroundColor) {
        this.cn3DStyleSettings_backgroundColor = cn3DStyleSettings_backgroundColor;
    }


    /**
     * Gets the cn3DStyleSettings_scaleFactor value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_scaleFactor
     */
    public java.lang.String getCn3DStyleSettings_scaleFactor() {
        return cn3DStyleSettings_scaleFactor;
    }


    /**
     * Sets the cn3DStyleSettings_scaleFactor value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_scaleFactor
     */
    public void setCn3DStyleSettings_scaleFactor(java.lang.String cn3DStyleSettings_scaleFactor) {
        this.cn3DStyleSettings_scaleFactor = cn3DStyleSettings_scaleFactor;
    }


    /**
     * Gets the cn3DStyleSettings_spaceFillProportion value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_spaceFillProportion
     */
    public java.lang.String getCn3DStyleSettings_spaceFillProportion() {
        return cn3DStyleSettings_spaceFillProportion;
    }


    /**
     * Sets the cn3DStyleSettings_spaceFillProportion value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_spaceFillProportion
     */
    public void setCn3DStyleSettings_spaceFillProportion(java.lang.String cn3DStyleSettings_spaceFillProportion) {
        this.cn3DStyleSettings_spaceFillProportion = cn3DStyleSettings_spaceFillProportion;
    }


    /**
     * Gets the cn3DStyleSettings_ballRadius value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_ballRadius
     */
    public java.lang.String getCn3DStyleSettings_ballRadius() {
        return cn3DStyleSettings_ballRadius;
    }


    /**
     * Sets the cn3DStyleSettings_ballRadius value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_ballRadius
     */
    public void setCn3DStyleSettings_ballRadius(java.lang.String cn3DStyleSettings_ballRadius) {
        this.cn3DStyleSettings_ballRadius = cn3DStyleSettings_ballRadius;
    }


    /**
     * Gets the cn3DStyleSettings_stickRadius value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_stickRadius
     */
    public java.lang.String getCn3DStyleSettings_stickRadius() {
        return cn3DStyleSettings_stickRadius;
    }


    /**
     * Sets the cn3DStyleSettings_stickRadius value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_stickRadius
     */
    public void setCn3DStyleSettings_stickRadius(java.lang.String cn3DStyleSettings_stickRadius) {
        this.cn3DStyleSettings_stickRadius = cn3DStyleSettings_stickRadius;
    }


    /**
     * Gets the cn3DStyleSettings_tubeRadius value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_tubeRadius
     */
    public java.lang.String getCn3DStyleSettings_tubeRadius() {
        return cn3DStyleSettings_tubeRadius;
    }


    /**
     * Sets the cn3DStyleSettings_tubeRadius value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_tubeRadius
     */
    public void setCn3DStyleSettings_tubeRadius(java.lang.String cn3DStyleSettings_tubeRadius) {
        this.cn3DStyleSettings_tubeRadius = cn3DStyleSettings_tubeRadius;
    }


    /**
     * Gets the cn3DStyleSettings_tubeWormRadius value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_tubeWormRadius
     */
    public java.lang.String getCn3DStyleSettings_tubeWormRadius() {
        return cn3DStyleSettings_tubeWormRadius;
    }


    /**
     * Sets the cn3DStyleSettings_tubeWormRadius value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_tubeWormRadius
     */
    public void setCn3DStyleSettings_tubeWormRadius(java.lang.String cn3DStyleSettings_tubeWormRadius) {
        this.cn3DStyleSettings_tubeWormRadius = cn3DStyleSettings_tubeWormRadius;
    }


    /**
     * Gets the cn3DStyleSettings_helixRadius value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_helixRadius
     */
    public java.lang.String getCn3DStyleSettings_helixRadius() {
        return cn3DStyleSettings_helixRadius;
    }


    /**
     * Sets the cn3DStyleSettings_helixRadius value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_helixRadius
     */
    public void setCn3DStyleSettings_helixRadius(java.lang.String cn3DStyleSettings_helixRadius) {
        this.cn3DStyleSettings_helixRadius = cn3DStyleSettings_helixRadius;
    }


    /**
     * Gets the cn3DStyleSettings_strandWidth value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_strandWidth
     */
    public java.lang.String getCn3DStyleSettings_strandWidth() {
        return cn3DStyleSettings_strandWidth;
    }


    /**
     * Sets the cn3DStyleSettings_strandWidth value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_strandWidth
     */
    public void setCn3DStyleSettings_strandWidth(java.lang.String cn3DStyleSettings_strandWidth) {
        this.cn3DStyleSettings_strandWidth = cn3DStyleSettings_strandWidth;
    }


    /**
     * Gets the cn3DStyleSettings_strandThickness value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_strandThickness
     */
    public java.lang.String getCn3DStyleSettings_strandThickness() {
        return cn3DStyleSettings_strandThickness;
    }


    /**
     * Sets the cn3DStyleSettings_strandThickness value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_strandThickness
     */
    public void setCn3DStyleSettings_strandThickness(java.lang.String cn3DStyleSettings_strandThickness) {
        this.cn3DStyleSettings_strandThickness = cn3DStyleSettings_strandThickness;
    }


    /**
     * Gets the cn3DStyleSettings_proteinLabels value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_proteinLabels
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_proteinLabelsType getCn3DStyleSettings_proteinLabels() {
        return cn3DStyleSettings_proteinLabels;
    }


    /**
     * Sets the cn3DStyleSettings_proteinLabels value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_proteinLabels
     */
    public void setCn3DStyleSettings_proteinLabels(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_proteinLabelsType cn3DStyleSettings_proteinLabels) {
        this.cn3DStyleSettings_proteinLabels = cn3DStyleSettings_proteinLabels;
    }


    /**
     * Gets the cn3DStyleSettings_nucleotideLabels value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_nucleotideLabels
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_nucleotideLabelsType getCn3DStyleSettings_nucleotideLabels() {
        return cn3DStyleSettings_nucleotideLabels;
    }


    /**
     * Sets the cn3DStyleSettings_nucleotideLabels value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_nucleotideLabels
     */
    public void setCn3DStyleSettings_nucleotideLabels(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_nucleotideLabelsType cn3DStyleSettings_nucleotideLabels) {
        this.cn3DStyleSettings_nucleotideLabels = cn3DStyleSettings_nucleotideLabels;
    }


    /**
     * Gets the cn3DStyleSettings_ionLabels value for this Cn3DStyleSettingsType.
     * 
     * @return cn3DStyleSettings_ionLabels
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_ionLabelsType getCn3DStyleSettings_ionLabels() {
        return cn3DStyleSettings_ionLabels;
    }


    /**
     * Sets the cn3DStyleSettings_ionLabels value for this Cn3DStyleSettingsType.
     * 
     * @param cn3DStyleSettings_ionLabels
     */
    public void setCn3DStyleSettings_ionLabels(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleSettings_ionLabelsType cn3DStyleSettings_ionLabels) {
        this.cn3DStyleSettings_ionLabels = cn3DStyleSettings_ionLabels;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DStyleSettingsType)) return false;
        Cn3DStyleSettingsType other = (Cn3DStyleSettingsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DStyleSettings_name==null && other.getCn3DStyleSettings_name()==null) || 
             (this.cn3DStyleSettings_name!=null &&
              this.cn3DStyleSettings_name.equals(other.getCn3DStyleSettings_name()))) &&
            ((this.cn3DStyleSettings_proteinBackbone==null && other.getCn3DStyleSettings_proteinBackbone()==null) || 
             (this.cn3DStyleSettings_proteinBackbone!=null &&
              this.cn3DStyleSettings_proteinBackbone.equals(other.getCn3DStyleSettings_proteinBackbone()))) &&
            ((this.cn3DStyleSettings_nucleotideBackbone==null && other.getCn3DStyleSettings_nucleotideBackbone()==null) || 
             (this.cn3DStyleSettings_nucleotideBackbone!=null &&
              this.cn3DStyleSettings_nucleotideBackbone.equals(other.getCn3DStyleSettings_nucleotideBackbone()))) &&
            ((this.cn3DStyleSettings_proteinSidechains==null && other.getCn3DStyleSettings_proteinSidechains()==null) || 
             (this.cn3DStyleSettings_proteinSidechains!=null &&
              this.cn3DStyleSettings_proteinSidechains.equals(other.getCn3DStyleSettings_proteinSidechains()))) &&
            ((this.cn3DStyleSettings_nucleotideSidechains==null && other.getCn3DStyleSettings_nucleotideSidechains()==null) || 
             (this.cn3DStyleSettings_nucleotideSidechains!=null &&
              this.cn3DStyleSettings_nucleotideSidechains.equals(other.getCn3DStyleSettings_nucleotideSidechains()))) &&
            ((this.cn3DStyleSettings_heterogens==null && other.getCn3DStyleSettings_heterogens()==null) || 
             (this.cn3DStyleSettings_heterogens!=null &&
              this.cn3DStyleSettings_heterogens.equals(other.getCn3DStyleSettings_heterogens()))) &&
            ((this.cn3DStyleSettings_solvents==null && other.getCn3DStyleSettings_solvents()==null) || 
             (this.cn3DStyleSettings_solvents!=null &&
              this.cn3DStyleSettings_solvents.equals(other.getCn3DStyleSettings_solvents()))) &&
            ((this.cn3DStyleSettings_connections==null && other.getCn3DStyleSettings_connections()==null) || 
             (this.cn3DStyleSettings_connections!=null &&
              this.cn3DStyleSettings_connections.equals(other.getCn3DStyleSettings_connections()))) &&
            ((this.cn3DStyleSettings_helixObjects==null && other.getCn3DStyleSettings_helixObjects()==null) || 
             (this.cn3DStyleSettings_helixObjects!=null &&
              this.cn3DStyleSettings_helixObjects.equals(other.getCn3DStyleSettings_helixObjects()))) &&
            ((this.cn3DStyleSettings_strandObjects==null && other.getCn3DStyleSettings_strandObjects()==null) || 
             (this.cn3DStyleSettings_strandObjects!=null &&
              this.cn3DStyleSettings_strandObjects.equals(other.getCn3DStyleSettings_strandObjects()))) &&
            ((this.cn3DStyleSettings_virtualDisulfidesOn==null && other.getCn3DStyleSettings_virtualDisulfidesOn()==null) || 
             (this.cn3DStyleSettings_virtualDisulfidesOn!=null &&
              this.cn3DStyleSettings_virtualDisulfidesOn.equals(other.getCn3DStyleSettings_virtualDisulfidesOn()))) &&
            ((this.cn3DStyleSettings_virtualDisulfideColor==null && other.getCn3DStyleSettings_virtualDisulfideColor()==null) || 
             (this.cn3DStyleSettings_virtualDisulfideColor!=null &&
              this.cn3DStyleSettings_virtualDisulfideColor.equals(other.getCn3DStyleSettings_virtualDisulfideColor()))) &&
            ((this.cn3DStyleSettings_hydrogensOn==null && other.getCn3DStyleSettings_hydrogensOn()==null) || 
             (this.cn3DStyleSettings_hydrogensOn!=null &&
              this.cn3DStyleSettings_hydrogensOn.equals(other.getCn3DStyleSettings_hydrogensOn()))) &&
            ((this.cn3DStyleSettings_backgroundColor==null && other.getCn3DStyleSettings_backgroundColor()==null) || 
             (this.cn3DStyleSettings_backgroundColor!=null &&
              this.cn3DStyleSettings_backgroundColor.equals(other.getCn3DStyleSettings_backgroundColor()))) &&
            ((this.cn3DStyleSettings_scaleFactor==null && other.getCn3DStyleSettings_scaleFactor()==null) || 
             (this.cn3DStyleSettings_scaleFactor!=null &&
              this.cn3DStyleSettings_scaleFactor.equals(other.getCn3DStyleSettings_scaleFactor()))) &&
            ((this.cn3DStyleSettings_spaceFillProportion==null && other.getCn3DStyleSettings_spaceFillProportion()==null) || 
             (this.cn3DStyleSettings_spaceFillProportion!=null &&
              this.cn3DStyleSettings_spaceFillProportion.equals(other.getCn3DStyleSettings_spaceFillProportion()))) &&
            ((this.cn3DStyleSettings_ballRadius==null && other.getCn3DStyleSettings_ballRadius()==null) || 
             (this.cn3DStyleSettings_ballRadius!=null &&
              this.cn3DStyleSettings_ballRadius.equals(other.getCn3DStyleSettings_ballRadius()))) &&
            ((this.cn3DStyleSettings_stickRadius==null && other.getCn3DStyleSettings_stickRadius()==null) || 
             (this.cn3DStyleSettings_stickRadius!=null &&
              this.cn3DStyleSettings_stickRadius.equals(other.getCn3DStyleSettings_stickRadius()))) &&
            ((this.cn3DStyleSettings_tubeRadius==null && other.getCn3DStyleSettings_tubeRadius()==null) || 
             (this.cn3DStyleSettings_tubeRadius!=null &&
              this.cn3DStyleSettings_tubeRadius.equals(other.getCn3DStyleSettings_tubeRadius()))) &&
            ((this.cn3DStyleSettings_tubeWormRadius==null && other.getCn3DStyleSettings_tubeWormRadius()==null) || 
             (this.cn3DStyleSettings_tubeWormRadius!=null &&
              this.cn3DStyleSettings_tubeWormRadius.equals(other.getCn3DStyleSettings_tubeWormRadius()))) &&
            ((this.cn3DStyleSettings_helixRadius==null && other.getCn3DStyleSettings_helixRadius()==null) || 
             (this.cn3DStyleSettings_helixRadius!=null &&
              this.cn3DStyleSettings_helixRadius.equals(other.getCn3DStyleSettings_helixRadius()))) &&
            ((this.cn3DStyleSettings_strandWidth==null && other.getCn3DStyleSettings_strandWidth()==null) || 
             (this.cn3DStyleSettings_strandWidth!=null &&
              this.cn3DStyleSettings_strandWidth.equals(other.getCn3DStyleSettings_strandWidth()))) &&
            ((this.cn3DStyleSettings_strandThickness==null && other.getCn3DStyleSettings_strandThickness()==null) || 
             (this.cn3DStyleSettings_strandThickness!=null &&
              this.cn3DStyleSettings_strandThickness.equals(other.getCn3DStyleSettings_strandThickness()))) &&
            ((this.cn3DStyleSettings_proteinLabels==null && other.getCn3DStyleSettings_proteinLabels()==null) || 
             (this.cn3DStyleSettings_proteinLabels!=null &&
              this.cn3DStyleSettings_proteinLabels.equals(other.getCn3DStyleSettings_proteinLabels()))) &&
            ((this.cn3DStyleSettings_nucleotideLabels==null && other.getCn3DStyleSettings_nucleotideLabels()==null) || 
             (this.cn3DStyleSettings_nucleotideLabels!=null &&
              this.cn3DStyleSettings_nucleotideLabels.equals(other.getCn3DStyleSettings_nucleotideLabels()))) &&
            ((this.cn3DStyleSettings_ionLabels==null && other.getCn3DStyleSettings_ionLabels()==null) || 
             (this.cn3DStyleSettings_ionLabels!=null &&
              this.cn3DStyleSettings_ionLabels.equals(other.getCn3DStyleSettings_ionLabels())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCn3DStyleSettings_name() != null) {
            _hashCode += getCn3DStyleSettings_name().hashCode();
        }
        if (getCn3DStyleSettings_proteinBackbone() != null) {
            _hashCode += getCn3DStyleSettings_proteinBackbone().hashCode();
        }
        if (getCn3DStyleSettings_nucleotideBackbone() != null) {
            _hashCode += getCn3DStyleSettings_nucleotideBackbone().hashCode();
        }
        if (getCn3DStyleSettings_proteinSidechains() != null) {
            _hashCode += getCn3DStyleSettings_proteinSidechains().hashCode();
        }
        if (getCn3DStyleSettings_nucleotideSidechains() != null) {
            _hashCode += getCn3DStyleSettings_nucleotideSidechains().hashCode();
        }
        if (getCn3DStyleSettings_heterogens() != null) {
            _hashCode += getCn3DStyleSettings_heterogens().hashCode();
        }
        if (getCn3DStyleSettings_solvents() != null) {
            _hashCode += getCn3DStyleSettings_solvents().hashCode();
        }
        if (getCn3DStyleSettings_connections() != null) {
            _hashCode += getCn3DStyleSettings_connections().hashCode();
        }
        if (getCn3DStyleSettings_helixObjects() != null) {
            _hashCode += getCn3DStyleSettings_helixObjects().hashCode();
        }
        if (getCn3DStyleSettings_strandObjects() != null) {
            _hashCode += getCn3DStyleSettings_strandObjects().hashCode();
        }
        if (getCn3DStyleSettings_virtualDisulfidesOn() != null) {
            _hashCode += getCn3DStyleSettings_virtualDisulfidesOn().hashCode();
        }
        if (getCn3DStyleSettings_virtualDisulfideColor() != null) {
            _hashCode += getCn3DStyleSettings_virtualDisulfideColor().hashCode();
        }
        if (getCn3DStyleSettings_hydrogensOn() != null) {
            _hashCode += getCn3DStyleSettings_hydrogensOn().hashCode();
        }
        if (getCn3DStyleSettings_backgroundColor() != null) {
            _hashCode += getCn3DStyleSettings_backgroundColor().hashCode();
        }
        if (getCn3DStyleSettings_scaleFactor() != null) {
            _hashCode += getCn3DStyleSettings_scaleFactor().hashCode();
        }
        if (getCn3DStyleSettings_spaceFillProportion() != null) {
            _hashCode += getCn3DStyleSettings_spaceFillProportion().hashCode();
        }
        if (getCn3DStyleSettings_ballRadius() != null) {
            _hashCode += getCn3DStyleSettings_ballRadius().hashCode();
        }
        if (getCn3DStyleSettings_stickRadius() != null) {
            _hashCode += getCn3DStyleSettings_stickRadius().hashCode();
        }
        if (getCn3DStyleSettings_tubeRadius() != null) {
            _hashCode += getCn3DStyleSettings_tubeRadius().hashCode();
        }
        if (getCn3DStyleSettings_tubeWormRadius() != null) {
            _hashCode += getCn3DStyleSettings_tubeWormRadius().hashCode();
        }
        if (getCn3DStyleSettings_helixRadius() != null) {
            _hashCode += getCn3DStyleSettings_helixRadius().hashCode();
        }
        if (getCn3DStyleSettings_strandWidth() != null) {
            _hashCode += getCn3DStyleSettings_strandWidth().hashCode();
        }
        if (getCn3DStyleSettings_strandThickness() != null) {
            _hashCode += getCn3DStyleSettings_strandThickness().hashCode();
        }
        if (getCn3DStyleSettings_proteinLabels() != null) {
            _hashCode += getCn3DStyleSettings_proteinLabels().hashCode();
        }
        if (getCn3DStyleSettings_nucleotideLabels() != null) {
            _hashCode += getCn3DStyleSettings_nucleotideLabels().hashCode();
        }
        if (getCn3DStyleSettings_ionLabels() != null) {
            _hashCode += getCn3DStyleSettings_ionLabels().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DStyleSettingsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settingsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_proteinBackbone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_protein-backbone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_protein-backboneType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_nucleotideBackbone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_nucleotide-backbone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_nucleotide-backboneType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_proteinSidechains");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_protein-sidechains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_protein-sidechainsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_nucleotideSidechains");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_nucleotide-sidechains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_nucleotide-sidechainsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_heterogens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_heterogens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_heterogensType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_solvents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_solvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_solventsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_connections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_connections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_connectionsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_helixObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_helix-objects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_helix-objectsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_strandObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_strand-objects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_strand-objectsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_virtualDisulfidesOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_virtual-disulfides-on"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_virtual-disulfides-onType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_virtualDisulfideColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_virtual-disulfide-color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_virtual-disulfide-colorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_hydrogensOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_hydrogens-on"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_hydrogens-onType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_backgroundColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_background-color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_background-colorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_scaleFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_scale-factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_spaceFillProportion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_space-fill-proportion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_ballRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_ball-radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_stickRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_stick-radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_tubeRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_tube-radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_tubeWormRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_tube-worm-radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_helixRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_helix-radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_strandWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_strand-width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_strandThickness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_strand-thickness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_proteinLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_protein-labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_protein-labelsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_nucleotideLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_nucleotide-labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_nucleotide-labelsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleSettings_ionLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_ion-labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_ion-labelsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
