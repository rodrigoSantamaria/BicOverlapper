/**
 * ProjectItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ProjectItemType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_pmuidType projectItem_pmuid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_protuidType projectItem_protuid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_nucuidType projectItem_nucuid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_sequidType projectItem_sequid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_genomeuidType projectItem_genomeuid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_structuidType projectItem_structuid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_pmidType projectItem_pmid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_protidType projectItem_protid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_nucidType projectItem_nucid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_seqidType projectItem_seqid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_genomeidType projectItem_genomeid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_structid projectItem_structid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_pmentType projectItem_pment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_protentType projectItem_protent;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_nucentType projectItem_nucent;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_seqentType projectItem_seqent;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_genomeentType projectItem_genomeent;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_structent projectItem_structent;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_seqannotType projectItem_seqannot;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_locType projectItem_loc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_projType projectItem_proj;

    public ProjectItemType() {
    }

    public ProjectItemType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_pmuidType projectItem_pmuid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_protuidType projectItem_protuid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_nucuidType projectItem_nucuid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_sequidType projectItem_sequid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_genomeuidType projectItem_genomeuid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_structuidType projectItem_structuid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_pmidType projectItem_pmid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_protidType projectItem_protid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_nucidType projectItem_nucid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_seqidType projectItem_seqid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_genomeidType projectItem_genomeid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_structid projectItem_structid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_pmentType projectItem_pment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_protentType projectItem_protent,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_nucentType projectItem_nucent,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_seqentType projectItem_seqent,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_genomeentType projectItem_genomeent,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_structent projectItem_structent,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_seqannotType projectItem_seqannot,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_locType projectItem_loc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_projType projectItem_proj) {
           this.projectItem_pmuid = projectItem_pmuid;
           this.projectItem_protuid = projectItem_protuid;
           this.projectItem_nucuid = projectItem_nucuid;
           this.projectItem_sequid = projectItem_sequid;
           this.projectItem_genomeuid = projectItem_genomeuid;
           this.projectItem_structuid = projectItem_structuid;
           this.projectItem_pmid = projectItem_pmid;
           this.projectItem_protid = projectItem_protid;
           this.projectItem_nucid = projectItem_nucid;
           this.projectItem_seqid = projectItem_seqid;
           this.projectItem_genomeid = projectItem_genomeid;
           this.projectItem_structid = projectItem_structid;
           this.projectItem_pment = projectItem_pment;
           this.projectItem_protent = projectItem_protent;
           this.projectItem_nucent = projectItem_nucent;
           this.projectItem_seqent = projectItem_seqent;
           this.projectItem_genomeent = projectItem_genomeent;
           this.projectItem_structent = projectItem_structent;
           this.projectItem_seqannot = projectItem_seqannot;
           this.projectItem_loc = projectItem_loc;
           this.projectItem_proj = projectItem_proj;
    }


    /**
     * Gets the projectItem_pmuid value for this ProjectItemType.
     * 
     * @return projectItem_pmuid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_pmuidType getProjectItem_pmuid() {
        return projectItem_pmuid;
    }


    /**
     * Sets the projectItem_pmuid value for this ProjectItemType.
     * 
     * @param projectItem_pmuid
     */
    public void setProjectItem_pmuid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_pmuidType projectItem_pmuid) {
        this.projectItem_pmuid = projectItem_pmuid;
    }


    /**
     * Gets the projectItem_protuid value for this ProjectItemType.
     * 
     * @return projectItem_protuid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_protuidType getProjectItem_protuid() {
        return projectItem_protuid;
    }


    /**
     * Sets the projectItem_protuid value for this ProjectItemType.
     * 
     * @param projectItem_protuid
     */
    public void setProjectItem_protuid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_protuidType projectItem_protuid) {
        this.projectItem_protuid = projectItem_protuid;
    }


    /**
     * Gets the projectItem_nucuid value for this ProjectItemType.
     * 
     * @return projectItem_nucuid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_nucuidType getProjectItem_nucuid() {
        return projectItem_nucuid;
    }


    /**
     * Sets the projectItem_nucuid value for this ProjectItemType.
     * 
     * @param projectItem_nucuid
     */
    public void setProjectItem_nucuid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_nucuidType projectItem_nucuid) {
        this.projectItem_nucuid = projectItem_nucuid;
    }


    /**
     * Gets the projectItem_sequid value for this ProjectItemType.
     * 
     * @return projectItem_sequid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_sequidType getProjectItem_sequid() {
        return projectItem_sequid;
    }


    /**
     * Sets the projectItem_sequid value for this ProjectItemType.
     * 
     * @param projectItem_sequid
     */
    public void setProjectItem_sequid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_sequidType projectItem_sequid) {
        this.projectItem_sequid = projectItem_sequid;
    }


    /**
     * Gets the projectItem_genomeuid value for this ProjectItemType.
     * 
     * @return projectItem_genomeuid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_genomeuidType getProjectItem_genomeuid() {
        return projectItem_genomeuid;
    }


    /**
     * Sets the projectItem_genomeuid value for this ProjectItemType.
     * 
     * @param projectItem_genomeuid
     */
    public void setProjectItem_genomeuid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_genomeuidType projectItem_genomeuid) {
        this.projectItem_genomeuid = projectItem_genomeuid;
    }


    /**
     * Gets the projectItem_structuid value for this ProjectItemType.
     * 
     * @return projectItem_structuid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_structuidType getProjectItem_structuid() {
        return projectItem_structuid;
    }


    /**
     * Sets the projectItem_structuid value for this ProjectItemType.
     * 
     * @param projectItem_structuid
     */
    public void setProjectItem_structuid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_structuidType projectItem_structuid) {
        this.projectItem_structuid = projectItem_structuid;
    }


    /**
     * Gets the projectItem_pmid value for this ProjectItemType.
     * 
     * @return projectItem_pmid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_pmidType getProjectItem_pmid() {
        return projectItem_pmid;
    }


    /**
     * Sets the projectItem_pmid value for this ProjectItemType.
     * 
     * @param projectItem_pmid
     */
    public void setProjectItem_pmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_pmidType projectItem_pmid) {
        this.projectItem_pmid = projectItem_pmid;
    }


    /**
     * Gets the projectItem_protid value for this ProjectItemType.
     * 
     * @return projectItem_protid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_protidType getProjectItem_protid() {
        return projectItem_protid;
    }


    /**
     * Sets the projectItem_protid value for this ProjectItemType.
     * 
     * @param projectItem_protid
     */
    public void setProjectItem_protid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_protidType projectItem_protid) {
        this.projectItem_protid = projectItem_protid;
    }


    /**
     * Gets the projectItem_nucid value for this ProjectItemType.
     * 
     * @return projectItem_nucid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_nucidType getProjectItem_nucid() {
        return projectItem_nucid;
    }


    /**
     * Sets the projectItem_nucid value for this ProjectItemType.
     * 
     * @param projectItem_nucid
     */
    public void setProjectItem_nucid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_nucidType projectItem_nucid) {
        this.projectItem_nucid = projectItem_nucid;
    }


    /**
     * Gets the projectItem_seqid value for this ProjectItemType.
     * 
     * @return projectItem_seqid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_seqidType getProjectItem_seqid() {
        return projectItem_seqid;
    }


    /**
     * Sets the projectItem_seqid value for this ProjectItemType.
     * 
     * @param projectItem_seqid
     */
    public void setProjectItem_seqid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_seqidType projectItem_seqid) {
        this.projectItem_seqid = projectItem_seqid;
    }


    /**
     * Gets the projectItem_genomeid value for this ProjectItemType.
     * 
     * @return projectItem_genomeid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_genomeidType getProjectItem_genomeid() {
        return projectItem_genomeid;
    }


    /**
     * Sets the projectItem_genomeid value for this ProjectItemType.
     * 
     * @param projectItem_genomeid
     */
    public void setProjectItem_genomeid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_genomeidType projectItem_genomeid) {
        this.projectItem_genomeid = projectItem_genomeid;
    }


    /**
     * Gets the projectItem_structid value for this ProjectItemType.
     * 
     * @return projectItem_structid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_structid getProjectItem_structid() {
        return projectItem_structid;
    }


    /**
     * Sets the projectItem_structid value for this ProjectItemType.
     * 
     * @param projectItem_structid
     */
    public void setProjectItem_structid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_structid projectItem_structid) {
        this.projectItem_structid = projectItem_structid;
    }


    /**
     * Gets the projectItem_pment value for this ProjectItemType.
     * 
     * @return projectItem_pment
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_pmentType getProjectItem_pment() {
        return projectItem_pment;
    }


    /**
     * Sets the projectItem_pment value for this ProjectItemType.
     * 
     * @param projectItem_pment
     */
    public void setProjectItem_pment(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_pmentType projectItem_pment) {
        this.projectItem_pment = projectItem_pment;
    }


    /**
     * Gets the projectItem_protent value for this ProjectItemType.
     * 
     * @return projectItem_protent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_protentType getProjectItem_protent() {
        return projectItem_protent;
    }


    /**
     * Sets the projectItem_protent value for this ProjectItemType.
     * 
     * @param projectItem_protent
     */
    public void setProjectItem_protent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_protentType projectItem_protent) {
        this.projectItem_protent = projectItem_protent;
    }


    /**
     * Gets the projectItem_nucent value for this ProjectItemType.
     * 
     * @return projectItem_nucent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_nucentType getProjectItem_nucent() {
        return projectItem_nucent;
    }


    /**
     * Sets the projectItem_nucent value for this ProjectItemType.
     * 
     * @param projectItem_nucent
     */
    public void setProjectItem_nucent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_nucentType projectItem_nucent) {
        this.projectItem_nucent = projectItem_nucent;
    }


    /**
     * Gets the projectItem_seqent value for this ProjectItemType.
     * 
     * @return projectItem_seqent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_seqentType getProjectItem_seqent() {
        return projectItem_seqent;
    }


    /**
     * Sets the projectItem_seqent value for this ProjectItemType.
     * 
     * @param projectItem_seqent
     */
    public void setProjectItem_seqent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_seqentType projectItem_seqent) {
        this.projectItem_seqent = projectItem_seqent;
    }


    /**
     * Gets the projectItem_genomeent value for this ProjectItemType.
     * 
     * @return projectItem_genomeent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_genomeentType getProjectItem_genomeent() {
        return projectItem_genomeent;
    }


    /**
     * Sets the projectItem_genomeent value for this ProjectItemType.
     * 
     * @param projectItem_genomeent
     */
    public void setProjectItem_genomeent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_genomeentType projectItem_genomeent) {
        this.projectItem_genomeent = projectItem_genomeent;
    }


    /**
     * Gets the projectItem_structent value for this ProjectItemType.
     * 
     * @return projectItem_structent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_structent getProjectItem_structent() {
        return projectItem_structent;
    }


    /**
     * Sets the projectItem_structent value for this ProjectItemType.
     * 
     * @param projectItem_structent
     */
    public void setProjectItem_structent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_structent projectItem_structent) {
        this.projectItem_structent = projectItem_structent;
    }


    /**
     * Gets the projectItem_seqannot value for this ProjectItemType.
     * 
     * @return projectItem_seqannot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_seqannotType getProjectItem_seqannot() {
        return projectItem_seqannot;
    }


    /**
     * Sets the projectItem_seqannot value for this ProjectItemType.
     * 
     * @param projectItem_seqannot
     */
    public void setProjectItem_seqannot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_seqannotType projectItem_seqannot) {
        this.projectItem_seqannot = projectItem_seqannot;
    }


    /**
     * Gets the projectItem_loc value for this ProjectItemType.
     * 
     * @return projectItem_loc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_locType getProjectItem_loc() {
        return projectItem_loc;
    }


    /**
     * Sets the projectItem_loc value for this ProjectItemType.
     * 
     * @param projectItem_loc
     */
    public void setProjectItem_loc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_locType projectItem_loc) {
        this.projectItem_loc = projectItem_loc;
    }


    /**
     * Gets the projectItem_proj value for this ProjectItemType.
     * 
     * @return projectItem_proj
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_projType getProjectItem_proj() {
        return projectItem_proj;
    }


    /**
     * Sets the projectItem_proj value for this ProjectItemType.
     * 
     * @param projectItem_proj
     */
    public void setProjectItem_proj(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ProjectItem_projType projectItem_proj) {
        this.projectItem_proj = projectItem_proj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectItemType)) return false;
        ProjectItemType other = (ProjectItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.projectItem_pmuid==null && other.getProjectItem_pmuid()==null) || 
             (this.projectItem_pmuid!=null &&
              this.projectItem_pmuid.equals(other.getProjectItem_pmuid()))) &&
            ((this.projectItem_protuid==null && other.getProjectItem_protuid()==null) || 
             (this.projectItem_protuid!=null &&
              this.projectItem_protuid.equals(other.getProjectItem_protuid()))) &&
            ((this.projectItem_nucuid==null && other.getProjectItem_nucuid()==null) || 
             (this.projectItem_nucuid!=null &&
              this.projectItem_nucuid.equals(other.getProjectItem_nucuid()))) &&
            ((this.projectItem_sequid==null && other.getProjectItem_sequid()==null) || 
             (this.projectItem_sequid!=null &&
              this.projectItem_sequid.equals(other.getProjectItem_sequid()))) &&
            ((this.projectItem_genomeuid==null && other.getProjectItem_genomeuid()==null) || 
             (this.projectItem_genomeuid!=null &&
              this.projectItem_genomeuid.equals(other.getProjectItem_genomeuid()))) &&
            ((this.projectItem_structuid==null && other.getProjectItem_structuid()==null) || 
             (this.projectItem_structuid!=null &&
              this.projectItem_structuid.equals(other.getProjectItem_structuid()))) &&
            ((this.projectItem_pmid==null && other.getProjectItem_pmid()==null) || 
             (this.projectItem_pmid!=null &&
              this.projectItem_pmid.equals(other.getProjectItem_pmid()))) &&
            ((this.projectItem_protid==null && other.getProjectItem_protid()==null) || 
             (this.projectItem_protid!=null &&
              this.projectItem_protid.equals(other.getProjectItem_protid()))) &&
            ((this.projectItem_nucid==null && other.getProjectItem_nucid()==null) || 
             (this.projectItem_nucid!=null &&
              this.projectItem_nucid.equals(other.getProjectItem_nucid()))) &&
            ((this.projectItem_seqid==null && other.getProjectItem_seqid()==null) || 
             (this.projectItem_seqid!=null &&
              this.projectItem_seqid.equals(other.getProjectItem_seqid()))) &&
            ((this.projectItem_genomeid==null && other.getProjectItem_genomeid()==null) || 
             (this.projectItem_genomeid!=null &&
              this.projectItem_genomeid.equals(other.getProjectItem_genomeid()))) &&
            ((this.projectItem_structid==null && other.getProjectItem_structid()==null) || 
             (this.projectItem_structid!=null &&
              this.projectItem_structid.equals(other.getProjectItem_structid()))) &&
            ((this.projectItem_pment==null && other.getProjectItem_pment()==null) || 
             (this.projectItem_pment!=null &&
              this.projectItem_pment.equals(other.getProjectItem_pment()))) &&
            ((this.projectItem_protent==null && other.getProjectItem_protent()==null) || 
             (this.projectItem_protent!=null &&
              this.projectItem_protent.equals(other.getProjectItem_protent()))) &&
            ((this.projectItem_nucent==null && other.getProjectItem_nucent()==null) || 
             (this.projectItem_nucent!=null &&
              this.projectItem_nucent.equals(other.getProjectItem_nucent()))) &&
            ((this.projectItem_seqent==null && other.getProjectItem_seqent()==null) || 
             (this.projectItem_seqent!=null &&
              this.projectItem_seqent.equals(other.getProjectItem_seqent()))) &&
            ((this.projectItem_genomeent==null && other.getProjectItem_genomeent()==null) || 
             (this.projectItem_genomeent!=null &&
              this.projectItem_genomeent.equals(other.getProjectItem_genomeent()))) &&
            ((this.projectItem_structent==null && other.getProjectItem_structent()==null) || 
             (this.projectItem_structent!=null &&
              this.projectItem_structent.equals(other.getProjectItem_structent()))) &&
            ((this.projectItem_seqannot==null && other.getProjectItem_seqannot()==null) || 
             (this.projectItem_seqannot!=null &&
              this.projectItem_seqannot.equals(other.getProjectItem_seqannot()))) &&
            ((this.projectItem_loc==null && other.getProjectItem_loc()==null) || 
             (this.projectItem_loc!=null &&
              this.projectItem_loc.equals(other.getProjectItem_loc()))) &&
            ((this.projectItem_proj==null && other.getProjectItem_proj()==null) || 
             (this.projectItem_proj!=null &&
              this.projectItem_proj.equals(other.getProjectItem_proj())));
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
        if (getProjectItem_pmuid() != null) {
            _hashCode += getProjectItem_pmuid().hashCode();
        }
        if (getProjectItem_protuid() != null) {
            _hashCode += getProjectItem_protuid().hashCode();
        }
        if (getProjectItem_nucuid() != null) {
            _hashCode += getProjectItem_nucuid().hashCode();
        }
        if (getProjectItem_sequid() != null) {
            _hashCode += getProjectItem_sequid().hashCode();
        }
        if (getProjectItem_genomeuid() != null) {
            _hashCode += getProjectItem_genomeuid().hashCode();
        }
        if (getProjectItem_structuid() != null) {
            _hashCode += getProjectItem_structuid().hashCode();
        }
        if (getProjectItem_pmid() != null) {
            _hashCode += getProjectItem_pmid().hashCode();
        }
        if (getProjectItem_protid() != null) {
            _hashCode += getProjectItem_protid().hashCode();
        }
        if (getProjectItem_nucid() != null) {
            _hashCode += getProjectItem_nucid().hashCode();
        }
        if (getProjectItem_seqid() != null) {
            _hashCode += getProjectItem_seqid().hashCode();
        }
        if (getProjectItem_genomeid() != null) {
            _hashCode += getProjectItem_genomeid().hashCode();
        }
        if (getProjectItem_structid() != null) {
            _hashCode += getProjectItem_structid().hashCode();
        }
        if (getProjectItem_pment() != null) {
            _hashCode += getProjectItem_pment().hashCode();
        }
        if (getProjectItem_protent() != null) {
            _hashCode += getProjectItem_protent().hashCode();
        }
        if (getProjectItem_nucent() != null) {
            _hashCode += getProjectItem_nucent().hashCode();
        }
        if (getProjectItem_seqent() != null) {
            _hashCode += getProjectItem_seqent().hashCode();
        }
        if (getProjectItem_genomeent() != null) {
            _hashCode += getProjectItem_genomeent().hashCode();
        }
        if (getProjectItem_structent() != null) {
            _hashCode += getProjectItem_structent().hashCode();
        }
        if (getProjectItem_seqannot() != null) {
            _hashCode += getProjectItem_seqannot().hashCode();
        }
        if (getProjectItem_loc() != null) {
            _hashCode += getProjectItem_loc().hashCode();
        }
        if (getProjectItem_proj() != null) {
            _hashCode += getProjectItem_proj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-itemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_pmuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_pmuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_pmuidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_protuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_protuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_protuidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_nucuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_nucuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_nucuidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_sequid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_sequid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_sequidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_genomeuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_genomeuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_genomeuidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_structuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_structuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_structuidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_pmid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_pmid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_pmidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_protid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_protid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_protidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_nucid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_nucid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_nucidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_seqid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_seqid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_seqidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_genomeid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_genomeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_genomeidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_structid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_structid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Project-item_structid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_pment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_pment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_pmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_protent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_protent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_protentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_nucent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_nucent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_nucentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_seqent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_seqent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_seqentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_genomeent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_genomeent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_genomeentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_structent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_structent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Project-item_structent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_seqannot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_seqannot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_seqannotType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_loc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_locType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectItem_proj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_proj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_projType"));
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
