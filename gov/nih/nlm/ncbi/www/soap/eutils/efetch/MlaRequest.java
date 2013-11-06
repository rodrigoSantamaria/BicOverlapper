/**
 * MlaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MlaRequest  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_init mlaRequest_init;

    private java.lang.String mlaRequest_getmle;

    private java.lang.String mlaRequest_getpub;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_gettitleType mlaRequest_gettitle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_citmatchType mlaRequest_citmatch;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_fini mlaRequest_fini;

    private java.lang.String mlaRequest_getmriuids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getaccuidsType mlaRequest_getaccuids;

    private java.lang.String mlaRequest_uidtopmid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_pmidtouidType mlaRequest_pmidtouid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getmlepmidType mlaRequest_getmlepmid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getpubpmidType mlaRequest_getpubpmid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_citmatchpmidType mlaRequest_citmatchpmid;

    private java.lang.String mlaRequest_getmripmids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getaccpmidsType mlaRequest_getaccpmids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_citlstpmidsType mlaRequest_citlstpmids;

    private java.lang.String mlaRequest_getmleuid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getmlrpmidType mlaRequest_getmlrpmid;

    private java.lang.String mlaRequest_getmlruid;

    public MlaRequest() {
    }

    public MlaRequest(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_init mlaRequest_init,
           java.lang.String mlaRequest_getmle,
           java.lang.String mlaRequest_getpub,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_gettitleType mlaRequest_gettitle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_citmatchType mlaRequest_citmatch,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_fini mlaRequest_fini,
           java.lang.String mlaRequest_getmriuids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getaccuidsType mlaRequest_getaccuids,
           java.lang.String mlaRequest_uidtopmid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_pmidtouidType mlaRequest_pmidtouid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getmlepmidType mlaRequest_getmlepmid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getpubpmidType mlaRequest_getpubpmid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_citmatchpmidType mlaRequest_citmatchpmid,
           java.lang.String mlaRequest_getmripmids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getaccpmidsType mlaRequest_getaccpmids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_citlstpmidsType mlaRequest_citlstpmids,
           java.lang.String mlaRequest_getmleuid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getmlrpmidType mlaRequest_getmlrpmid,
           java.lang.String mlaRequest_getmlruid) {
           this.mlaRequest_init = mlaRequest_init;
           this.mlaRequest_getmle = mlaRequest_getmle;
           this.mlaRequest_getpub = mlaRequest_getpub;
           this.mlaRequest_gettitle = mlaRequest_gettitle;
           this.mlaRequest_citmatch = mlaRequest_citmatch;
           this.mlaRequest_fini = mlaRequest_fini;
           this.mlaRequest_getmriuids = mlaRequest_getmriuids;
           this.mlaRequest_getaccuids = mlaRequest_getaccuids;
           this.mlaRequest_uidtopmid = mlaRequest_uidtopmid;
           this.mlaRequest_pmidtouid = mlaRequest_pmidtouid;
           this.mlaRequest_getmlepmid = mlaRequest_getmlepmid;
           this.mlaRequest_getpubpmid = mlaRequest_getpubpmid;
           this.mlaRequest_citmatchpmid = mlaRequest_citmatchpmid;
           this.mlaRequest_getmripmids = mlaRequest_getmripmids;
           this.mlaRequest_getaccpmids = mlaRequest_getaccpmids;
           this.mlaRequest_citlstpmids = mlaRequest_citlstpmids;
           this.mlaRequest_getmleuid = mlaRequest_getmleuid;
           this.mlaRequest_getmlrpmid = mlaRequest_getmlrpmid;
           this.mlaRequest_getmlruid = mlaRequest_getmlruid;
    }


    /**
     * Gets the mlaRequest_init value for this MlaRequest.
     * 
     * @return mlaRequest_init
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_init getMlaRequest_init() {
        return mlaRequest_init;
    }


    /**
     * Sets the mlaRequest_init value for this MlaRequest.
     * 
     * @param mlaRequest_init
     */
    public void setMlaRequest_init(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_init mlaRequest_init) {
        this.mlaRequest_init = mlaRequest_init;
    }


    /**
     * Gets the mlaRequest_getmle value for this MlaRequest.
     * 
     * @return mlaRequest_getmle
     */
    public java.lang.String getMlaRequest_getmle() {
        return mlaRequest_getmle;
    }


    /**
     * Sets the mlaRequest_getmle value for this MlaRequest.
     * 
     * @param mlaRequest_getmle
     */
    public void setMlaRequest_getmle(java.lang.String mlaRequest_getmle) {
        this.mlaRequest_getmle = mlaRequest_getmle;
    }


    /**
     * Gets the mlaRequest_getpub value for this MlaRequest.
     * 
     * @return mlaRequest_getpub
     */
    public java.lang.String getMlaRequest_getpub() {
        return mlaRequest_getpub;
    }


    /**
     * Sets the mlaRequest_getpub value for this MlaRequest.
     * 
     * @param mlaRequest_getpub
     */
    public void setMlaRequest_getpub(java.lang.String mlaRequest_getpub) {
        this.mlaRequest_getpub = mlaRequest_getpub;
    }


    /**
     * Gets the mlaRequest_gettitle value for this MlaRequest.
     * 
     * @return mlaRequest_gettitle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_gettitleType getMlaRequest_gettitle() {
        return mlaRequest_gettitle;
    }


    /**
     * Sets the mlaRequest_gettitle value for this MlaRequest.
     * 
     * @param mlaRequest_gettitle
     */
    public void setMlaRequest_gettitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_gettitleType mlaRequest_gettitle) {
        this.mlaRequest_gettitle = mlaRequest_gettitle;
    }


    /**
     * Gets the mlaRequest_citmatch value for this MlaRequest.
     * 
     * @return mlaRequest_citmatch
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_citmatchType getMlaRequest_citmatch() {
        return mlaRequest_citmatch;
    }


    /**
     * Sets the mlaRequest_citmatch value for this MlaRequest.
     * 
     * @param mlaRequest_citmatch
     */
    public void setMlaRequest_citmatch(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_citmatchType mlaRequest_citmatch) {
        this.mlaRequest_citmatch = mlaRequest_citmatch;
    }


    /**
     * Gets the mlaRequest_fini value for this MlaRequest.
     * 
     * @return mlaRequest_fini
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_fini getMlaRequest_fini() {
        return mlaRequest_fini;
    }


    /**
     * Sets the mlaRequest_fini value for this MlaRequest.
     * 
     * @param mlaRequest_fini
     */
    public void setMlaRequest_fini(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_fini mlaRequest_fini) {
        this.mlaRequest_fini = mlaRequest_fini;
    }


    /**
     * Gets the mlaRequest_getmriuids value for this MlaRequest.
     * 
     * @return mlaRequest_getmriuids
     */
    public java.lang.String getMlaRequest_getmriuids() {
        return mlaRequest_getmriuids;
    }


    /**
     * Sets the mlaRequest_getmriuids value for this MlaRequest.
     * 
     * @param mlaRequest_getmriuids
     */
    public void setMlaRequest_getmriuids(java.lang.String mlaRequest_getmriuids) {
        this.mlaRequest_getmriuids = mlaRequest_getmriuids;
    }


    /**
     * Gets the mlaRequest_getaccuids value for this MlaRequest.
     * 
     * @return mlaRequest_getaccuids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getaccuidsType getMlaRequest_getaccuids() {
        return mlaRequest_getaccuids;
    }


    /**
     * Sets the mlaRequest_getaccuids value for this MlaRequest.
     * 
     * @param mlaRequest_getaccuids
     */
    public void setMlaRequest_getaccuids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getaccuidsType mlaRequest_getaccuids) {
        this.mlaRequest_getaccuids = mlaRequest_getaccuids;
    }


    /**
     * Gets the mlaRequest_uidtopmid value for this MlaRequest.
     * 
     * @return mlaRequest_uidtopmid
     */
    public java.lang.String getMlaRequest_uidtopmid() {
        return mlaRequest_uidtopmid;
    }


    /**
     * Sets the mlaRequest_uidtopmid value for this MlaRequest.
     * 
     * @param mlaRequest_uidtopmid
     */
    public void setMlaRequest_uidtopmid(java.lang.String mlaRequest_uidtopmid) {
        this.mlaRequest_uidtopmid = mlaRequest_uidtopmid;
    }


    /**
     * Gets the mlaRequest_pmidtouid value for this MlaRequest.
     * 
     * @return mlaRequest_pmidtouid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_pmidtouidType getMlaRequest_pmidtouid() {
        return mlaRequest_pmidtouid;
    }


    /**
     * Sets the mlaRequest_pmidtouid value for this MlaRequest.
     * 
     * @param mlaRequest_pmidtouid
     */
    public void setMlaRequest_pmidtouid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_pmidtouidType mlaRequest_pmidtouid) {
        this.mlaRequest_pmidtouid = mlaRequest_pmidtouid;
    }


    /**
     * Gets the mlaRequest_getmlepmid value for this MlaRequest.
     * 
     * @return mlaRequest_getmlepmid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getmlepmidType getMlaRequest_getmlepmid() {
        return mlaRequest_getmlepmid;
    }


    /**
     * Sets the mlaRequest_getmlepmid value for this MlaRequest.
     * 
     * @param mlaRequest_getmlepmid
     */
    public void setMlaRequest_getmlepmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getmlepmidType mlaRequest_getmlepmid) {
        this.mlaRequest_getmlepmid = mlaRequest_getmlepmid;
    }


    /**
     * Gets the mlaRequest_getpubpmid value for this MlaRequest.
     * 
     * @return mlaRequest_getpubpmid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getpubpmidType getMlaRequest_getpubpmid() {
        return mlaRequest_getpubpmid;
    }


    /**
     * Sets the mlaRequest_getpubpmid value for this MlaRequest.
     * 
     * @param mlaRequest_getpubpmid
     */
    public void setMlaRequest_getpubpmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getpubpmidType mlaRequest_getpubpmid) {
        this.mlaRequest_getpubpmid = mlaRequest_getpubpmid;
    }


    /**
     * Gets the mlaRequest_citmatchpmid value for this MlaRequest.
     * 
     * @return mlaRequest_citmatchpmid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_citmatchpmidType getMlaRequest_citmatchpmid() {
        return mlaRequest_citmatchpmid;
    }


    /**
     * Sets the mlaRequest_citmatchpmid value for this MlaRequest.
     * 
     * @param mlaRequest_citmatchpmid
     */
    public void setMlaRequest_citmatchpmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_citmatchpmidType mlaRequest_citmatchpmid) {
        this.mlaRequest_citmatchpmid = mlaRequest_citmatchpmid;
    }


    /**
     * Gets the mlaRequest_getmripmids value for this MlaRequest.
     * 
     * @return mlaRequest_getmripmids
     */
    public java.lang.String getMlaRequest_getmripmids() {
        return mlaRequest_getmripmids;
    }


    /**
     * Sets the mlaRequest_getmripmids value for this MlaRequest.
     * 
     * @param mlaRequest_getmripmids
     */
    public void setMlaRequest_getmripmids(java.lang.String mlaRequest_getmripmids) {
        this.mlaRequest_getmripmids = mlaRequest_getmripmids;
    }


    /**
     * Gets the mlaRequest_getaccpmids value for this MlaRequest.
     * 
     * @return mlaRequest_getaccpmids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getaccpmidsType getMlaRequest_getaccpmids() {
        return mlaRequest_getaccpmids;
    }


    /**
     * Sets the mlaRequest_getaccpmids value for this MlaRequest.
     * 
     * @param mlaRequest_getaccpmids
     */
    public void setMlaRequest_getaccpmids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getaccpmidsType mlaRequest_getaccpmids) {
        this.mlaRequest_getaccpmids = mlaRequest_getaccpmids;
    }


    /**
     * Gets the mlaRequest_citlstpmids value for this MlaRequest.
     * 
     * @return mlaRequest_citlstpmids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_citlstpmidsType getMlaRequest_citlstpmids() {
        return mlaRequest_citlstpmids;
    }


    /**
     * Sets the mlaRequest_citlstpmids value for this MlaRequest.
     * 
     * @param mlaRequest_citlstpmids
     */
    public void setMlaRequest_citlstpmids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_citlstpmidsType mlaRequest_citlstpmids) {
        this.mlaRequest_citlstpmids = mlaRequest_citlstpmids;
    }


    /**
     * Gets the mlaRequest_getmleuid value for this MlaRequest.
     * 
     * @return mlaRequest_getmleuid
     */
    public java.lang.String getMlaRequest_getmleuid() {
        return mlaRequest_getmleuid;
    }


    /**
     * Sets the mlaRequest_getmleuid value for this MlaRequest.
     * 
     * @param mlaRequest_getmleuid
     */
    public void setMlaRequest_getmleuid(java.lang.String mlaRequest_getmleuid) {
        this.mlaRequest_getmleuid = mlaRequest_getmleuid;
    }


    /**
     * Gets the mlaRequest_getmlrpmid value for this MlaRequest.
     * 
     * @return mlaRequest_getmlrpmid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getmlrpmidType getMlaRequest_getmlrpmid() {
        return mlaRequest_getmlrpmid;
    }


    /**
     * Sets the mlaRequest_getmlrpmid value for this MlaRequest.
     * 
     * @param mlaRequest_getmlrpmid
     */
    public void setMlaRequest_getmlrpmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MlaRequest_getmlrpmidType mlaRequest_getmlrpmid) {
        this.mlaRequest_getmlrpmid = mlaRequest_getmlrpmid;
    }


    /**
     * Gets the mlaRequest_getmlruid value for this MlaRequest.
     * 
     * @return mlaRequest_getmlruid
     */
    public java.lang.String getMlaRequest_getmlruid() {
        return mlaRequest_getmlruid;
    }


    /**
     * Sets the mlaRequest_getmlruid value for this MlaRequest.
     * 
     * @param mlaRequest_getmlruid
     */
    public void setMlaRequest_getmlruid(java.lang.String mlaRequest_getmlruid) {
        this.mlaRequest_getmlruid = mlaRequest_getmlruid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MlaRequest)) return false;
        MlaRequest other = (MlaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mlaRequest_init==null && other.getMlaRequest_init()==null) || 
             (this.mlaRequest_init!=null &&
              this.mlaRequest_init.equals(other.getMlaRequest_init()))) &&
            ((this.mlaRequest_getmle==null && other.getMlaRequest_getmle()==null) || 
             (this.mlaRequest_getmle!=null &&
              this.mlaRequest_getmle.equals(other.getMlaRequest_getmle()))) &&
            ((this.mlaRequest_getpub==null && other.getMlaRequest_getpub()==null) || 
             (this.mlaRequest_getpub!=null &&
              this.mlaRequest_getpub.equals(other.getMlaRequest_getpub()))) &&
            ((this.mlaRequest_gettitle==null && other.getMlaRequest_gettitle()==null) || 
             (this.mlaRequest_gettitle!=null &&
              this.mlaRequest_gettitle.equals(other.getMlaRequest_gettitle()))) &&
            ((this.mlaRequest_citmatch==null && other.getMlaRequest_citmatch()==null) || 
             (this.mlaRequest_citmatch!=null &&
              this.mlaRequest_citmatch.equals(other.getMlaRequest_citmatch()))) &&
            ((this.mlaRequest_fini==null && other.getMlaRequest_fini()==null) || 
             (this.mlaRequest_fini!=null &&
              this.mlaRequest_fini.equals(other.getMlaRequest_fini()))) &&
            ((this.mlaRequest_getmriuids==null && other.getMlaRequest_getmriuids()==null) || 
             (this.mlaRequest_getmriuids!=null &&
              this.mlaRequest_getmriuids.equals(other.getMlaRequest_getmriuids()))) &&
            ((this.mlaRequest_getaccuids==null && other.getMlaRequest_getaccuids()==null) || 
             (this.mlaRequest_getaccuids!=null &&
              this.mlaRequest_getaccuids.equals(other.getMlaRequest_getaccuids()))) &&
            ((this.mlaRequest_uidtopmid==null && other.getMlaRequest_uidtopmid()==null) || 
             (this.mlaRequest_uidtopmid!=null &&
              this.mlaRequest_uidtopmid.equals(other.getMlaRequest_uidtopmid()))) &&
            ((this.mlaRequest_pmidtouid==null && other.getMlaRequest_pmidtouid()==null) || 
             (this.mlaRequest_pmidtouid!=null &&
              this.mlaRequest_pmidtouid.equals(other.getMlaRequest_pmidtouid()))) &&
            ((this.mlaRequest_getmlepmid==null && other.getMlaRequest_getmlepmid()==null) || 
             (this.mlaRequest_getmlepmid!=null &&
              this.mlaRequest_getmlepmid.equals(other.getMlaRequest_getmlepmid()))) &&
            ((this.mlaRequest_getpubpmid==null && other.getMlaRequest_getpubpmid()==null) || 
             (this.mlaRequest_getpubpmid!=null &&
              this.mlaRequest_getpubpmid.equals(other.getMlaRequest_getpubpmid()))) &&
            ((this.mlaRequest_citmatchpmid==null && other.getMlaRequest_citmatchpmid()==null) || 
             (this.mlaRequest_citmatchpmid!=null &&
              this.mlaRequest_citmatchpmid.equals(other.getMlaRequest_citmatchpmid()))) &&
            ((this.mlaRequest_getmripmids==null && other.getMlaRequest_getmripmids()==null) || 
             (this.mlaRequest_getmripmids!=null &&
              this.mlaRequest_getmripmids.equals(other.getMlaRequest_getmripmids()))) &&
            ((this.mlaRequest_getaccpmids==null && other.getMlaRequest_getaccpmids()==null) || 
             (this.mlaRequest_getaccpmids!=null &&
              this.mlaRequest_getaccpmids.equals(other.getMlaRequest_getaccpmids()))) &&
            ((this.mlaRequest_citlstpmids==null && other.getMlaRequest_citlstpmids()==null) || 
             (this.mlaRequest_citlstpmids!=null &&
              this.mlaRequest_citlstpmids.equals(other.getMlaRequest_citlstpmids()))) &&
            ((this.mlaRequest_getmleuid==null && other.getMlaRequest_getmleuid()==null) || 
             (this.mlaRequest_getmleuid!=null &&
              this.mlaRequest_getmleuid.equals(other.getMlaRequest_getmleuid()))) &&
            ((this.mlaRequest_getmlrpmid==null && other.getMlaRequest_getmlrpmid()==null) || 
             (this.mlaRequest_getmlrpmid!=null &&
              this.mlaRequest_getmlrpmid.equals(other.getMlaRequest_getmlrpmid()))) &&
            ((this.mlaRequest_getmlruid==null && other.getMlaRequest_getmlruid()==null) || 
             (this.mlaRequest_getmlruid!=null &&
              this.mlaRequest_getmlruid.equals(other.getMlaRequest_getmlruid())));
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
        if (getMlaRequest_init() != null) {
            _hashCode += getMlaRequest_init().hashCode();
        }
        if (getMlaRequest_getmle() != null) {
            _hashCode += getMlaRequest_getmle().hashCode();
        }
        if (getMlaRequest_getpub() != null) {
            _hashCode += getMlaRequest_getpub().hashCode();
        }
        if (getMlaRequest_gettitle() != null) {
            _hashCode += getMlaRequest_gettitle().hashCode();
        }
        if (getMlaRequest_citmatch() != null) {
            _hashCode += getMlaRequest_citmatch().hashCode();
        }
        if (getMlaRequest_fini() != null) {
            _hashCode += getMlaRequest_fini().hashCode();
        }
        if (getMlaRequest_getmriuids() != null) {
            _hashCode += getMlaRequest_getmriuids().hashCode();
        }
        if (getMlaRequest_getaccuids() != null) {
            _hashCode += getMlaRequest_getaccuids().hashCode();
        }
        if (getMlaRequest_uidtopmid() != null) {
            _hashCode += getMlaRequest_uidtopmid().hashCode();
        }
        if (getMlaRequest_pmidtouid() != null) {
            _hashCode += getMlaRequest_pmidtouid().hashCode();
        }
        if (getMlaRequest_getmlepmid() != null) {
            _hashCode += getMlaRequest_getmlepmid().hashCode();
        }
        if (getMlaRequest_getpubpmid() != null) {
            _hashCode += getMlaRequest_getpubpmid().hashCode();
        }
        if (getMlaRequest_citmatchpmid() != null) {
            _hashCode += getMlaRequest_citmatchpmid().hashCode();
        }
        if (getMlaRequest_getmripmids() != null) {
            _hashCode += getMlaRequest_getmripmids().hashCode();
        }
        if (getMlaRequest_getaccpmids() != null) {
            _hashCode += getMlaRequest_getaccpmids().hashCode();
        }
        if (getMlaRequest_citlstpmids() != null) {
            _hashCode += getMlaRequest_citlstpmids().hashCode();
        }
        if (getMlaRequest_getmleuid() != null) {
            _hashCode += getMlaRequest_getmleuid().hashCode();
        }
        if (getMlaRequest_getmlrpmid() != null) {
            _hashCode += getMlaRequest_getmlrpmid().hashCode();
        }
        if (getMlaRequest_getmlruid() != null) {
            _hashCode += getMlaRequest_getmlruid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MlaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Mla-request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_init");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_init"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Mla-request_init"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_getmle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getmle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_getpub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getpub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_gettitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_gettitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_gettitleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_citmatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_citmatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_citmatchType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_fini");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_fini"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Mla-request_fini"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_getmriuids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getmriuids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_getaccuids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getaccuids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getaccuidsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_uidtopmid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_uidtopmid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_pmidtouid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_pmidtouid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_pmidtouidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_getmlepmid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getmlepmid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getmlepmidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_getpubpmid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getpubpmid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getpubpmidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_citmatchpmid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_citmatchpmid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_citmatchpmidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_getmripmids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getmripmids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_getaccpmids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getaccpmids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getaccpmidsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_citlstpmids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_citlstpmids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_citlstpmidsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_getmleuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getmleuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_getmlrpmid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getmlrpmid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getmlrpmidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlaRequest_getmlruid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-request_getmlruid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
