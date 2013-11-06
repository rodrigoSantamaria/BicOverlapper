/**
 * CddType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddType  implements java.io.Serializable {
    private java.lang.String cdd_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_idType cdd_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_descriptionType cdd_description;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_seqannotType cdd_seqannot;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_featuresType cdd_features;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_sequencesType cdd_sequences;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_profileRangeType cdd_profileRange;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_truncMasterType cdd_truncMaster;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_posfreqType cdd_posfreq;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_scorematType cdd_scoremat;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_distanceType cdd_distance;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_parentType cdd_parent;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_childrenType cdd_children;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_siblingsType cdd_siblings;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_neighborsType cdd_neighbors;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_pendingType cdd_pending;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_rejectsType cdd_rejects;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_master3DType cdd_master3D;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_alignannotType cdd_alignannot;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_styleDictionaryType cdd_styleDictionary;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_userAnnotationsType cdd_userAnnotations;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_ancestorsType cdd_ancestors;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_scoreparamsType cdd_scoreparams;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_seqtreeType cdd_seqtree;

    public CddType() {
    }

    public CddType(
           java.lang.String cdd_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_idType cdd_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_descriptionType cdd_description,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_seqannotType cdd_seqannot,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_featuresType cdd_features,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_sequencesType cdd_sequences,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_profileRangeType cdd_profileRange,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_truncMasterType cdd_truncMaster,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_posfreqType cdd_posfreq,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_scorematType cdd_scoremat,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_distanceType cdd_distance,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_parentType cdd_parent,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_childrenType cdd_children,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_siblingsType cdd_siblings,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_neighborsType cdd_neighbors,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_pendingType cdd_pending,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_rejectsType cdd_rejects,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_master3DType cdd_master3D,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_alignannotType cdd_alignannot,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_styleDictionaryType cdd_styleDictionary,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_userAnnotationsType cdd_userAnnotations,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_ancestorsType cdd_ancestors,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_scoreparamsType cdd_scoreparams,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_seqtreeType cdd_seqtree) {
           this.cdd_name = cdd_name;
           this.cdd_id = cdd_id;
           this.cdd_description = cdd_description;
           this.cdd_seqannot = cdd_seqannot;
           this.cdd_features = cdd_features;
           this.cdd_sequences = cdd_sequences;
           this.cdd_profileRange = cdd_profileRange;
           this.cdd_truncMaster = cdd_truncMaster;
           this.cdd_posfreq = cdd_posfreq;
           this.cdd_scoremat = cdd_scoremat;
           this.cdd_distance = cdd_distance;
           this.cdd_parent = cdd_parent;
           this.cdd_children = cdd_children;
           this.cdd_siblings = cdd_siblings;
           this.cdd_neighbors = cdd_neighbors;
           this.cdd_pending = cdd_pending;
           this.cdd_rejects = cdd_rejects;
           this.cdd_master3D = cdd_master3D;
           this.cdd_alignannot = cdd_alignannot;
           this.cdd_styleDictionary = cdd_styleDictionary;
           this.cdd_userAnnotations = cdd_userAnnotations;
           this.cdd_ancestors = cdd_ancestors;
           this.cdd_scoreparams = cdd_scoreparams;
           this.cdd_seqtree = cdd_seqtree;
    }


    /**
     * Gets the cdd_name value for this CddType.
     * 
     * @return cdd_name
     */
    public java.lang.String getCdd_name() {
        return cdd_name;
    }


    /**
     * Sets the cdd_name value for this CddType.
     * 
     * @param cdd_name
     */
    public void setCdd_name(java.lang.String cdd_name) {
        this.cdd_name = cdd_name;
    }


    /**
     * Gets the cdd_id value for this CddType.
     * 
     * @return cdd_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_idType getCdd_id() {
        return cdd_id;
    }


    /**
     * Sets the cdd_id value for this CddType.
     * 
     * @param cdd_id
     */
    public void setCdd_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_idType cdd_id) {
        this.cdd_id = cdd_id;
    }


    /**
     * Gets the cdd_description value for this CddType.
     * 
     * @return cdd_description
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_descriptionType getCdd_description() {
        return cdd_description;
    }


    /**
     * Sets the cdd_description value for this CddType.
     * 
     * @param cdd_description
     */
    public void setCdd_description(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_descriptionType cdd_description) {
        this.cdd_description = cdd_description;
    }


    /**
     * Gets the cdd_seqannot value for this CddType.
     * 
     * @return cdd_seqannot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_seqannotType getCdd_seqannot() {
        return cdd_seqannot;
    }


    /**
     * Sets the cdd_seqannot value for this CddType.
     * 
     * @param cdd_seqannot
     */
    public void setCdd_seqannot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_seqannotType cdd_seqannot) {
        this.cdd_seqannot = cdd_seqannot;
    }


    /**
     * Gets the cdd_features value for this CddType.
     * 
     * @return cdd_features
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_featuresType getCdd_features() {
        return cdd_features;
    }


    /**
     * Sets the cdd_features value for this CddType.
     * 
     * @param cdd_features
     */
    public void setCdd_features(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_featuresType cdd_features) {
        this.cdd_features = cdd_features;
    }


    /**
     * Gets the cdd_sequences value for this CddType.
     * 
     * @return cdd_sequences
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_sequencesType getCdd_sequences() {
        return cdd_sequences;
    }


    /**
     * Sets the cdd_sequences value for this CddType.
     * 
     * @param cdd_sequences
     */
    public void setCdd_sequences(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_sequencesType cdd_sequences) {
        this.cdd_sequences = cdd_sequences;
    }


    /**
     * Gets the cdd_profileRange value for this CddType.
     * 
     * @return cdd_profileRange
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_profileRangeType getCdd_profileRange() {
        return cdd_profileRange;
    }


    /**
     * Sets the cdd_profileRange value for this CddType.
     * 
     * @param cdd_profileRange
     */
    public void setCdd_profileRange(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_profileRangeType cdd_profileRange) {
        this.cdd_profileRange = cdd_profileRange;
    }


    /**
     * Gets the cdd_truncMaster value for this CddType.
     * 
     * @return cdd_truncMaster
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_truncMasterType getCdd_truncMaster() {
        return cdd_truncMaster;
    }


    /**
     * Sets the cdd_truncMaster value for this CddType.
     * 
     * @param cdd_truncMaster
     */
    public void setCdd_truncMaster(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_truncMasterType cdd_truncMaster) {
        this.cdd_truncMaster = cdd_truncMaster;
    }


    /**
     * Gets the cdd_posfreq value for this CddType.
     * 
     * @return cdd_posfreq
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_posfreqType getCdd_posfreq() {
        return cdd_posfreq;
    }


    /**
     * Sets the cdd_posfreq value for this CddType.
     * 
     * @param cdd_posfreq
     */
    public void setCdd_posfreq(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_posfreqType cdd_posfreq) {
        this.cdd_posfreq = cdd_posfreq;
    }


    /**
     * Gets the cdd_scoremat value for this CddType.
     * 
     * @return cdd_scoremat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_scorematType getCdd_scoremat() {
        return cdd_scoremat;
    }


    /**
     * Sets the cdd_scoremat value for this CddType.
     * 
     * @param cdd_scoremat
     */
    public void setCdd_scoremat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_scorematType cdd_scoremat) {
        this.cdd_scoremat = cdd_scoremat;
    }


    /**
     * Gets the cdd_distance value for this CddType.
     * 
     * @return cdd_distance
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_distanceType getCdd_distance() {
        return cdd_distance;
    }


    /**
     * Sets the cdd_distance value for this CddType.
     * 
     * @param cdd_distance
     */
    public void setCdd_distance(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_distanceType cdd_distance) {
        this.cdd_distance = cdd_distance;
    }


    /**
     * Gets the cdd_parent value for this CddType.
     * 
     * @return cdd_parent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_parentType getCdd_parent() {
        return cdd_parent;
    }


    /**
     * Sets the cdd_parent value for this CddType.
     * 
     * @param cdd_parent
     */
    public void setCdd_parent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_parentType cdd_parent) {
        this.cdd_parent = cdd_parent;
    }


    /**
     * Gets the cdd_children value for this CddType.
     * 
     * @return cdd_children
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_childrenType getCdd_children() {
        return cdd_children;
    }


    /**
     * Sets the cdd_children value for this CddType.
     * 
     * @param cdd_children
     */
    public void setCdd_children(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_childrenType cdd_children) {
        this.cdd_children = cdd_children;
    }


    /**
     * Gets the cdd_siblings value for this CddType.
     * 
     * @return cdd_siblings
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_siblingsType getCdd_siblings() {
        return cdd_siblings;
    }


    /**
     * Sets the cdd_siblings value for this CddType.
     * 
     * @param cdd_siblings
     */
    public void setCdd_siblings(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_siblingsType cdd_siblings) {
        this.cdd_siblings = cdd_siblings;
    }


    /**
     * Gets the cdd_neighbors value for this CddType.
     * 
     * @return cdd_neighbors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_neighborsType getCdd_neighbors() {
        return cdd_neighbors;
    }


    /**
     * Sets the cdd_neighbors value for this CddType.
     * 
     * @param cdd_neighbors
     */
    public void setCdd_neighbors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_neighborsType cdd_neighbors) {
        this.cdd_neighbors = cdd_neighbors;
    }


    /**
     * Gets the cdd_pending value for this CddType.
     * 
     * @return cdd_pending
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_pendingType getCdd_pending() {
        return cdd_pending;
    }


    /**
     * Sets the cdd_pending value for this CddType.
     * 
     * @param cdd_pending
     */
    public void setCdd_pending(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_pendingType cdd_pending) {
        this.cdd_pending = cdd_pending;
    }


    /**
     * Gets the cdd_rejects value for this CddType.
     * 
     * @return cdd_rejects
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_rejectsType getCdd_rejects() {
        return cdd_rejects;
    }


    /**
     * Sets the cdd_rejects value for this CddType.
     * 
     * @param cdd_rejects
     */
    public void setCdd_rejects(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_rejectsType cdd_rejects) {
        this.cdd_rejects = cdd_rejects;
    }


    /**
     * Gets the cdd_master3D value for this CddType.
     * 
     * @return cdd_master3D
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_master3DType getCdd_master3D() {
        return cdd_master3D;
    }


    /**
     * Sets the cdd_master3D value for this CddType.
     * 
     * @param cdd_master3D
     */
    public void setCdd_master3D(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_master3DType cdd_master3D) {
        this.cdd_master3D = cdd_master3D;
    }


    /**
     * Gets the cdd_alignannot value for this CddType.
     * 
     * @return cdd_alignannot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_alignannotType getCdd_alignannot() {
        return cdd_alignannot;
    }


    /**
     * Sets the cdd_alignannot value for this CddType.
     * 
     * @param cdd_alignannot
     */
    public void setCdd_alignannot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_alignannotType cdd_alignannot) {
        this.cdd_alignannot = cdd_alignannot;
    }


    /**
     * Gets the cdd_styleDictionary value for this CddType.
     * 
     * @return cdd_styleDictionary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_styleDictionaryType getCdd_styleDictionary() {
        return cdd_styleDictionary;
    }


    /**
     * Sets the cdd_styleDictionary value for this CddType.
     * 
     * @param cdd_styleDictionary
     */
    public void setCdd_styleDictionary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_styleDictionaryType cdd_styleDictionary) {
        this.cdd_styleDictionary = cdd_styleDictionary;
    }


    /**
     * Gets the cdd_userAnnotations value for this CddType.
     * 
     * @return cdd_userAnnotations
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_userAnnotationsType getCdd_userAnnotations() {
        return cdd_userAnnotations;
    }


    /**
     * Sets the cdd_userAnnotations value for this CddType.
     * 
     * @param cdd_userAnnotations
     */
    public void setCdd_userAnnotations(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_userAnnotationsType cdd_userAnnotations) {
        this.cdd_userAnnotations = cdd_userAnnotations;
    }


    /**
     * Gets the cdd_ancestors value for this CddType.
     * 
     * @return cdd_ancestors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_ancestorsType getCdd_ancestors() {
        return cdd_ancestors;
    }


    /**
     * Sets the cdd_ancestors value for this CddType.
     * 
     * @param cdd_ancestors
     */
    public void setCdd_ancestors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_ancestorsType cdd_ancestors) {
        this.cdd_ancestors = cdd_ancestors;
    }


    /**
     * Gets the cdd_scoreparams value for this CddType.
     * 
     * @return cdd_scoreparams
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_scoreparamsType getCdd_scoreparams() {
        return cdd_scoreparams;
    }


    /**
     * Sets the cdd_scoreparams value for this CddType.
     * 
     * @param cdd_scoreparams
     */
    public void setCdd_scoreparams(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_scoreparamsType cdd_scoreparams) {
        this.cdd_scoreparams = cdd_scoreparams;
    }


    /**
     * Gets the cdd_seqtree value for this CddType.
     * 
     * @return cdd_seqtree
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_seqtreeType getCdd_seqtree() {
        return cdd_seqtree;
    }


    /**
     * Sets the cdd_seqtree value for this CddType.
     * 
     * @param cdd_seqtree
     */
    public void setCdd_seqtree(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cdd_seqtreeType cdd_seqtree) {
        this.cdd_seqtree = cdd_seqtree;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddType)) return false;
        CddType other = (CddType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdd_name==null && other.getCdd_name()==null) || 
             (this.cdd_name!=null &&
              this.cdd_name.equals(other.getCdd_name()))) &&
            ((this.cdd_id==null && other.getCdd_id()==null) || 
             (this.cdd_id!=null &&
              this.cdd_id.equals(other.getCdd_id()))) &&
            ((this.cdd_description==null && other.getCdd_description()==null) || 
             (this.cdd_description!=null &&
              this.cdd_description.equals(other.getCdd_description()))) &&
            ((this.cdd_seqannot==null && other.getCdd_seqannot()==null) || 
             (this.cdd_seqannot!=null &&
              this.cdd_seqannot.equals(other.getCdd_seqannot()))) &&
            ((this.cdd_features==null && other.getCdd_features()==null) || 
             (this.cdd_features!=null &&
              this.cdd_features.equals(other.getCdd_features()))) &&
            ((this.cdd_sequences==null && other.getCdd_sequences()==null) || 
             (this.cdd_sequences!=null &&
              this.cdd_sequences.equals(other.getCdd_sequences()))) &&
            ((this.cdd_profileRange==null && other.getCdd_profileRange()==null) || 
             (this.cdd_profileRange!=null &&
              this.cdd_profileRange.equals(other.getCdd_profileRange()))) &&
            ((this.cdd_truncMaster==null && other.getCdd_truncMaster()==null) || 
             (this.cdd_truncMaster!=null &&
              this.cdd_truncMaster.equals(other.getCdd_truncMaster()))) &&
            ((this.cdd_posfreq==null && other.getCdd_posfreq()==null) || 
             (this.cdd_posfreq!=null &&
              this.cdd_posfreq.equals(other.getCdd_posfreq()))) &&
            ((this.cdd_scoremat==null && other.getCdd_scoremat()==null) || 
             (this.cdd_scoremat!=null &&
              this.cdd_scoremat.equals(other.getCdd_scoremat()))) &&
            ((this.cdd_distance==null && other.getCdd_distance()==null) || 
             (this.cdd_distance!=null &&
              this.cdd_distance.equals(other.getCdd_distance()))) &&
            ((this.cdd_parent==null && other.getCdd_parent()==null) || 
             (this.cdd_parent!=null &&
              this.cdd_parent.equals(other.getCdd_parent()))) &&
            ((this.cdd_children==null && other.getCdd_children()==null) || 
             (this.cdd_children!=null &&
              this.cdd_children.equals(other.getCdd_children()))) &&
            ((this.cdd_siblings==null && other.getCdd_siblings()==null) || 
             (this.cdd_siblings!=null &&
              this.cdd_siblings.equals(other.getCdd_siblings()))) &&
            ((this.cdd_neighbors==null && other.getCdd_neighbors()==null) || 
             (this.cdd_neighbors!=null &&
              this.cdd_neighbors.equals(other.getCdd_neighbors()))) &&
            ((this.cdd_pending==null && other.getCdd_pending()==null) || 
             (this.cdd_pending!=null &&
              this.cdd_pending.equals(other.getCdd_pending()))) &&
            ((this.cdd_rejects==null && other.getCdd_rejects()==null) || 
             (this.cdd_rejects!=null &&
              this.cdd_rejects.equals(other.getCdd_rejects()))) &&
            ((this.cdd_master3D==null && other.getCdd_master3D()==null) || 
             (this.cdd_master3D!=null &&
              this.cdd_master3D.equals(other.getCdd_master3D()))) &&
            ((this.cdd_alignannot==null && other.getCdd_alignannot()==null) || 
             (this.cdd_alignannot!=null &&
              this.cdd_alignannot.equals(other.getCdd_alignannot()))) &&
            ((this.cdd_styleDictionary==null && other.getCdd_styleDictionary()==null) || 
             (this.cdd_styleDictionary!=null &&
              this.cdd_styleDictionary.equals(other.getCdd_styleDictionary()))) &&
            ((this.cdd_userAnnotations==null && other.getCdd_userAnnotations()==null) || 
             (this.cdd_userAnnotations!=null &&
              this.cdd_userAnnotations.equals(other.getCdd_userAnnotations()))) &&
            ((this.cdd_ancestors==null && other.getCdd_ancestors()==null) || 
             (this.cdd_ancestors!=null &&
              this.cdd_ancestors.equals(other.getCdd_ancestors()))) &&
            ((this.cdd_scoreparams==null && other.getCdd_scoreparams()==null) || 
             (this.cdd_scoreparams!=null &&
              this.cdd_scoreparams.equals(other.getCdd_scoreparams()))) &&
            ((this.cdd_seqtree==null && other.getCdd_seqtree()==null) || 
             (this.cdd_seqtree!=null &&
              this.cdd_seqtree.equals(other.getCdd_seqtree())));
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
        if (getCdd_name() != null) {
            _hashCode += getCdd_name().hashCode();
        }
        if (getCdd_id() != null) {
            _hashCode += getCdd_id().hashCode();
        }
        if (getCdd_description() != null) {
            _hashCode += getCdd_description().hashCode();
        }
        if (getCdd_seqannot() != null) {
            _hashCode += getCdd_seqannot().hashCode();
        }
        if (getCdd_features() != null) {
            _hashCode += getCdd_features().hashCode();
        }
        if (getCdd_sequences() != null) {
            _hashCode += getCdd_sequences().hashCode();
        }
        if (getCdd_profileRange() != null) {
            _hashCode += getCdd_profileRange().hashCode();
        }
        if (getCdd_truncMaster() != null) {
            _hashCode += getCdd_truncMaster().hashCode();
        }
        if (getCdd_posfreq() != null) {
            _hashCode += getCdd_posfreq().hashCode();
        }
        if (getCdd_scoremat() != null) {
            _hashCode += getCdd_scoremat().hashCode();
        }
        if (getCdd_distance() != null) {
            _hashCode += getCdd_distance().hashCode();
        }
        if (getCdd_parent() != null) {
            _hashCode += getCdd_parent().hashCode();
        }
        if (getCdd_children() != null) {
            _hashCode += getCdd_children().hashCode();
        }
        if (getCdd_siblings() != null) {
            _hashCode += getCdd_siblings().hashCode();
        }
        if (getCdd_neighbors() != null) {
            _hashCode += getCdd_neighbors().hashCode();
        }
        if (getCdd_pending() != null) {
            _hashCode += getCdd_pending().hashCode();
        }
        if (getCdd_rejects() != null) {
            _hashCode += getCdd_rejects().hashCode();
        }
        if (getCdd_master3D() != null) {
            _hashCode += getCdd_master3D().hashCode();
        }
        if (getCdd_alignannot() != null) {
            _hashCode += getCdd_alignannot().hashCode();
        }
        if (getCdd_styleDictionary() != null) {
            _hashCode += getCdd_styleDictionary().hashCode();
        }
        if (getCdd_userAnnotations() != null) {
            _hashCode += getCdd_userAnnotations().hashCode();
        }
        if (getCdd_ancestors() != null) {
            _hashCode += getCdd_ancestors().hashCode();
        }
        if (getCdd_scoreparams() != null) {
            _hashCode += getCdd_scoreparams().hashCode();
        }
        if (getCdd_seqtree() != null) {
            _hashCode += getCdd_seqtree().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CddType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_descriptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_seqannot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_seqannot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_seqannotType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_features");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_features"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_featuresType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_sequences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_sequences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_sequencesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_profileRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_profile-range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_profile-rangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_truncMaster");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_trunc-master"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_trunc-masterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_posfreq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_posfreq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_posfreqType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_scoremat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_scoremat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_scorematType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_distance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_distance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_distanceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_parentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_childrenType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_siblings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_siblings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_siblingsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_neighbors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_neighbors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_neighborsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_pending");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_pending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_pendingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_rejects");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_rejects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_rejectsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_master3D");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_master3d"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_master3dType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_alignannot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_alignannot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_alignannotType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_styleDictionary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_style-dictionary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_style-dictionaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_userAnnotations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_user-annotations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_user-annotationsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_ancestors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_ancestors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_ancestorsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_scoreparams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_scoreparams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_scoreparamsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd_seqtree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_seqtree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_seqtreeType"));
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
