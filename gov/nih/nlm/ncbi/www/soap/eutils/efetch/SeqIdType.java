/**
 * SeqIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_localType seqId_local;

    private java.lang.String seqId_gibbsq;

    private java.lang.String seqId_gibbmt;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_giimType seqId_giim;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_genbankType seqId_genbank;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_emblType seqId_embl;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_pirType seqId_pir;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_swissprotType seqId_swissprot;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_patentType seqId_patent;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_otherType seqId_other;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_generalType seqId_general;

    private java.lang.String seqId_gi;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_ddbjType seqId_ddbj;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_prfType seqId_prf;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_pdbType seqId_pdb;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_tpgType seqId_tpg;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_tpeType seqId_tpe;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_tpdType seqId_tpd;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_gpipeType seqId_gpipe;

    public SeqIdType() {
    }

    public SeqIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_localType seqId_local,
           java.lang.String seqId_gibbsq,
           java.lang.String seqId_gibbmt,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_giimType seqId_giim,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_genbankType seqId_genbank,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_emblType seqId_embl,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_pirType seqId_pir,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_swissprotType seqId_swissprot,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_patentType seqId_patent,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_otherType seqId_other,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_generalType seqId_general,
           java.lang.String seqId_gi,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_ddbjType seqId_ddbj,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_prfType seqId_prf,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_pdbType seqId_pdb,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_tpgType seqId_tpg,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_tpeType seqId_tpe,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_tpdType seqId_tpd,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_gpipeType seqId_gpipe) {
           this.seqId_local = seqId_local;
           this.seqId_gibbsq = seqId_gibbsq;
           this.seqId_gibbmt = seqId_gibbmt;
           this.seqId_giim = seqId_giim;
           this.seqId_genbank = seqId_genbank;
           this.seqId_embl = seqId_embl;
           this.seqId_pir = seqId_pir;
           this.seqId_swissprot = seqId_swissprot;
           this.seqId_patent = seqId_patent;
           this.seqId_other = seqId_other;
           this.seqId_general = seqId_general;
           this.seqId_gi = seqId_gi;
           this.seqId_ddbj = seqId_ddbj;
           this.seqId_prf = seqId_prf;
           this.seqId_pdb = seqId_pdb;
           this.seqId_tpg = seqId_tpg;
           this.seqId_tpe = seqId_tpe;
           this.seqId_tpd = seqId_tpd;
           this.seqId_gpipe = seqId_gpipe;
    }


    /**
     * Gets the seqId_local value for this SeqIdType.
     * 
     * @return seqId_local
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_localType getSeqId_local() {
        return seqId_local;
    }


    /**
     * Sets the seqId_local value for this SeqIdType.
     * 
     * @param seqId_local
     */
    public void setSeqId_local(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_localType seqId_local) {
        this.seqId_local = seqId_local;
    }


    /**
     * Gets the seqId_gibbsq value for this SeqIdType.
     * 
     * @return seqId_gibbsq
     */
    public java.lang.String getSeqId_gibbsq() {
        return seqId_gibbsq;
    }


    /**
     * Sets the seqId_gibbsq value for this SeqIdType.
     * 
     * @param seqId_gibbsq
     */
    public void setSeqId_gibbsq(java.lang.String seqId_gibbsq) {
        this.seqId_gibbsq = seqId_gibbsq;
    }


    /**
     * Gets the seqId_gibbmt value for this SeqIdType.
     * 
     * @return seqId_gibbmt
     */
    public java.lang.String getSeqId_gibbmt() {
        return seqId_gibbmt;
    }


    /**
     * Sets the seqId_gibbmt value for this SeqIdType.
     * 
     * @param seqId_gibbmt
     */
    public void setSeqId_gibbmt(java.lang.String seqId_gibbmt) {
        this.seqId_gibbmt = seqId_gibbmt;
    }


    /**
     * Gets the seqId_giim value for this SeqIdType.
     * 
     * @return seqId_giim
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_giimType getSeqId_giim() {
        return seqId_giim;
    }


    /**
     * Sets the seqId_giim value for this SeqIdType.
     * 
     * @param seqId_giim
     */
    public void setSeqId_giim(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_giimType seqId_giim) {
        this.seqId_giim = seqId_giim;
    }


    /**
     * Gets the seqId_genbank value for this SeqIdType.
     * 
     * @return seqId_genbank
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_genbankType getSeqId_genbank() {
        return seqId_genbank;
    }


    /**
     * Sets the seqId_genbank value for this SeqIdType.
     * 
     * @param seqId_genbank
     */
    public void setSeqId_genbank(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_genbankType seqId_genbank) {
        this.seqId_genbank = seqId_genbank;
    }


    /**
     * Gets the seqId_embl value for this SeqIdType.
     * 
     * @return seqId_embl
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_emblType getSeqId_embl() {
        return seqId_embl;
    }


    /**
     * Sets the seqId_embl value for this SeqIdType.
     * 
     * @param seqId_embl
     */
    public void setSeqId_embl(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_emblType seqId_embl) {
        this.seqId_embl = seqId_embl;
    }


    /**
     * Gets the seqId_pir value for this SeqIdType.
     * 
     * @return seqId_pir
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_pirType getSeqId_pir() {
        return seqId_pir;
    }


    /**
     * Sets the seqId_pir value for this SeqIdType.
     * 
     * @param seqId_pir
     */
    public void setSeqId_pir(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_pirType seqId_pir) {
        this.seqId_pir = seqId_pir;
    }


    /**
     * Gets the seqId_swissprot value for this SeqIdType.
     * 
     * @return seqId_swissprot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_swissprotType getSeqId_swissprot() {
        return seqId_swissprot;
    }


    /**
     * Sets the seqId_swissprot value for this SeqIdType.
     * 
     * @param seqId_swissprot
     */
    public void setSeqId_swissprot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_swissprotType seqId_swissprot) {
        this.seqId_swissprot = seqId_swissprot;
    }


    /**
     * Gets the seqId_patent value for this SeqIdType.
     * 
     * @return seqId_patent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_patentType getSeqId_patent() {
        return seqId_patent;
    }


    /**
     * Sets the seqId_patent value for this SeqIdType.
     * 
     * @param seqId_patent
     */
    public void setSeqId_patent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_patentType seqId_patent) {
        this.seqId_patent = seqId_patent;
    }


    /**
     * Gets the seqId_other value for this SeqIdType.
     * 
     * @return seqId_other
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_otherType getSeqId_other() {
        return seqId_other;
    }


    /**
     * Sets the seqId_other value for this SeqIdType.
     * 
     * @param seqId_other
     */
    public void setSeqId_other(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_otherType seqId_other) {
        this.seqId_other = seqId_other;
    }


    /**
     * Gets the seqId_general value for this SeqIdType.
     * 
     * @return seqId_general
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_generalType getSeqId_general() {
        return seqId_general;
    }


    /**
     * Sets the seqId_general value for this SeqIdType.
     * 
     * @param seqId_general
     */
    public void setSeqId_general(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_generalType seqId_general) {
        this.seqId_general = seqId_general;
    }


    /**
     * Gets the seqId_gi value for this SeqIdType.
     * 
     * @return seqId_gi
     */
    public java.lang.String getSeqId_gi() {
        return seqId_gi;
    }


    /**
     * Sets the seqId_gi value for this SeqIdType.
     * 
     * @param seqId_gi
     */
    public void setSeqId_gi(java.lang.String seqId_gi) {
        this.seqId_gi = seqId_gi;
    }


    /**
     * Gets the seqId_ddbj value for this SeqIdType.
     * 
     * @return seqId_ddbj
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_ddbjType getSeqId_ddbj() {
        return seqId_ddbj;
    }


    /**
     * Sets the seqId_ddbj value for this SeqIdType.
     * 
     * @param seqId_ddbj
     */
    public void setSeqId_ddbj(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_ddbjType seqId_ddbj) {
        this.seqId_ddbj = seqId_ddbj;
    }


    /**
     * Gets the seqId_prf value for this SeqIdType.
     * 
     * @return seqId_prf
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_prfType getSeqId_prf() {
        return seqId_prf;
    }


    /**
     * Sets the seqId_prf value for this SeqIdType.
     * 
     * @param seqId_prf
     */
    public void setSeqId_prf(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_prfType seqId_prf) {
        this.seqId_prf = seqId_prf;
    }


    /**
     * Gets the seqId_pdb value for this SeqIdType.
     * 
     * @return seqId_pdb
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_pdbType getSeqId_pdb() {
        return seqId_pdb;
    }


    /**
     * Sets the seqId_pdb value for this SeqIdType.
     * 
     * @param seqId_pdb
     */
    public void setSeqId_pdb(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_pdbType seqId_pdb) {
        this.seqId_pdb = seqId_pdb;
    }


    /**
     * Gets the seqId_tpg value for this SeqIdType.
     * 
     * @return seqId_tpg
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_tpgType getSeqId_tpg() {
        return seqId_tpg;
    }


    /**
     * Sets the seqId_tpg value for this SeqIdType.
     * 
     * @param seqId_tpg
     */
    public void setSeqId_tpg(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_tpgType seqId_tpg) {
        this.seqId_tpg = seqId_tpg;
    }


    /**
     * Gets the seqId_tpe value for this SeqIdType.
     * 
     * @return seqId_tpe
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_tpeType getSeqId_tpe() {
        return seqId_tpe;
    }


    /**
     * Sets the seqId_tpe value for this SeqIdType.
     * 
     * @param seqId_tpe
     */
    public void setSeqId_tpe(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_tpeType seqId_tpe) {
        this.seqId_tpe = seqId_tpe;
    }


    /**
     * Gets the seqId_tpd value for this SeqIdType.
     * 
     * @return seqId_tpd
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_tpdType getSeqId_tpd() {
        return seqId_tpd;
    }


    /**
     * Sets the seqId_tpd value for this SeqIdType.
     * 
     * @param seqId_tpd
     */
    public void setSeqId_tpd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_tpdType seqId_tpd) {
        this.seqId_tpd = seqId_tpd;
    }


    /**
     * Gets the seqId_gpipe value for this SeqIdType.
     * 
     * @return seqId_gpipe
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_gpipeType getSeqId_gpipe() {
        return seqId_gpipe;
    }


    /**
     * Sets the seqId_gpipe value for this SeqIdType.
     * 
     * @param seqId_gpipe
     */
    public void setSeqId_gpipe(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqId_gpipeType seqId_gpipe) {
        this.seqId_gpipe = seqId_gpipe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqIdType)) return false;
        SeqIdType other = (SeqIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqId_local==null && other.getSeqId_local()==null) || 
             (this.seqId_local!=null &&
              this.seqId_local.equals(other.getSeqId_local()))) &&
            ((this.seqId_gibbsq==null && other.getSeqId_gibbsq()==null) || 
             (this.seqId_gibbsq!=null &&
              this.seqId_gibbsq.equals(other.getSeqId_gibbsq()))) &&
            ((this.seqId_gibbmt==null && other.getSeqId_gibbmt()==null) || 
             (this.seqId_gibbmt!=null &&
              this.seqId_gibbmt.equals(other.getSeqId_gibbmt()))) &&
            ((this.seqId_giim==null && other.getSeqId_giim()==null) || 
             (this.seqId_giim!=null &&
              this.seqId_giim.equals(other.getSeqId_giim()))) &&
            ((this.seqId_genbank==null && other.getSeqId_genbank()==null) || 
             (this.seqId_genbank!=null &&
              this.seqId_genbank.equals(other.getSeqId_genbank()))) &&
            ((this.seqId_embl==null && other.getSeqId_embl()==null) || 
             (this.seqId_embl!=null &&
              this.seqId_embl.equals(other.getSeqId_embl()))) &&
            ((this.seqId_pir==null && other.getSeqId_pir()==null) || 
             (this.seqId_pir!=null &&
              this.seqId_pir.equals(other.getSeqId_pir()))) &&
            ((this.seqId_swissprot==null && other.getSeqId_swissprot()==null) || 
             (this.seqId_swissprot!=null &&
              this.seqId_swissprot.equals(other.getSeqId_swissprot()))) &&
            ((this.seqId_patent==null && other.getSeqId_patent()==null) || 
             (this.seqId_patent!=null &&
              this.seqId_patent.equals(other.getSeqId_patent()))) &&
            ((this.seqId_other==null && other.getSeqId_other()==null) || 
             (this.seqId_other!=null &&
              this.seqId_other.equals(other.getSeqId_other()))) &&
            ((this.seqId_general==null && other.getSeqId_general()==null) || 
             (this.seqId_general!=null &&
              this.seqId_general.equals(other.getSeqId_general()))) &&
            ((this.seqId_gi==null && other.getSeqId_gi()==null) || 
             (this.seqId_gi!=null &&
              this.seqId_gi.equals(other.getSeqId_gi()))) &&
            ((this.seqId_ddbj==null && other.getSeqId_ddbj()==null) || 
             (this.seqId_ddbj!=null &&
              this.seqId_ddbj.equals(other.getSeqId_ddbj()))) &&
            ((this.seqId_prf==null && other.getSeqId_prf()==null) || 
             (this.seqId_prf!=null &&
              this.seqId_prf.equals(other.getSeqId_prf()))) &&
            ((this.seqId_pdb==null && other.getSeqId_pdb()==null) || 
             (this.seqId_pdb!=null &&
              this.seqId_pdb.equals(other.getSeqId_pdb()))) &&
            ((this.seqId_tpg==null && other.getSeqId_tpg()==null) || 
             (this.seqId_tpg!=null &&
              this.seqId_tpg.equals(other.getSeqId_tpg()))) &&
            ((this.seqId_tpe==null && other.getSeqId_tpe()==null) || 
             (this.seqId_tpe!=null &&
              this.seqId_tpe.equals(other.getSeqId_tpe()))) &&
            ((this.seqId_tpd==null && other.getSeqId_tpd()==null) || 
             (this.seqId_tpd!=null &&
              this.seqId_tpd.equals(other.getSeqId_tpd()))) &&
            ((this.seqId_gpipe==null && other.getSeqId_gpipe()==null) || 
             (this.seqId_gpipe!=null &&
              this.seqId_gpipe.equals(other.getSeqId_gpipe())));
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
        if (getSeqId_local() != null) {
            _hashCode += getSeqId_local().hashCode();
        }
        if (getSeqId_gibbsq() != null) {
            _hashCode += getSeqId_gibbsq().hashCode();
        }
        if (getSeqId_gibbmt() != null) {
            _hashCode += getSeqId_gibbmt().hashCode();
        }
        if (getSeqId_giim() != null) {
            _hashCode += getSeqId_giim().hashCode();
        }
        if (getSeqId_genbank() != null) {
            _hashCode += getSeqId_genbank().hashCode();
        }
        if (getSeqId_embl() != null) {
            _hashCode += getSeqId_embl().hashCode();
        }
        if (getSeqId_pir() != null) {
            _hashCode += getSeqId_pir().hashCode();
        }
        if (getSeqId_swissprot() != null) {
            _hashCode += getSeqId_swissprot().hashCode();
        }
        if (getSeqId_patent() != null) {
            _hashCode += getSeqId_patent().hashCode();
        }
        if (getSeqId_other() != null) {
            _hashCode += getSeqId_other().hashCode();
        }
        if (getSeqId_general() != null) {
            _hashCode += getSeqId_general().hashCode();
        }
        if (getSeqId_gi() != null) {
            _hashCode += getSeqId_gi().hashCode();
        }
        if (getSeqId_ddbj() != null) {
            _hashCode += getSeqId_ddbj().hashCode();
        }
        if (getSeqId_prf() != null) {
            _hashCode += getSeqId_prf().hashCode();
        }
        if (getSeqId_pdb() != null) {
            _hashCode += getSeqId_pdb().hashCode();
        }
        if (getSeqId_tpg() != null) {
            _hashCode += getSeqId_tpg().hashCode();
        }
        if (getSeqId_tpe() != null) {
            _hashCode += getSeqId_tpe().hashCode();
        }
        if (getSeqId_tpd() != null) {
            _hashCode += getSeqId_tpd().hashCode();
        }
        if (getSeqId_gpipe() != null) {
            _hashCode += getSeqId_gpipe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_local");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_localType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_gibbsq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_gibbsq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_gibbmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_gibbmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_giim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_giim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_giimType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_genbank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_genbank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_genbankType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_embl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_embl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_emblType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_pir");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_pir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_pirType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_swissprot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_swissprot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_swissprotType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_patent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_patent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_patentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_other");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_other"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_otherType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_general");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_general"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_generalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_gi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_ddbj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_ddbj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_ddbjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_prf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_prf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_prfType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_pdb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_pdb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_pdbType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_tpg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_tpg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_tpgType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_tpe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_tpe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_tpeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_tpd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_tpd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_tpdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId_gpipe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_gpipe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id_gpipeType"));
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
