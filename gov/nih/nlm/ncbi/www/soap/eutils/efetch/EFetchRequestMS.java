/**
 * EFetchRequestMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EFetchRequestMS  implements java.io.Serializable {
    private java.lang.String db;

    private java.lang.String id;

    private java.lang.String webEnv;

    private java.lang.String query_key;

    private java.lang.String tool;

    private java.lang.String email;

    private java.lang.String retstart;

    private java.lang.String retmax;

    private java.lang.String rettype;

    private java.lang.String strand;

    private java.lang.String seq_start;

    private java.lang.String seq_stop;

    private java.lang.String complexity;

    private java.lang.String report;

    public EFetchRequestMS() {
    }

    public EFetchRequestMS(
           java.lang.String db,
           java.lang.String id,
           java.lang.String webEnv,
           java.lang.String query_key,
           java.lang.String tool,
           java.lang.String email,
           java.lang.String retstart,
           java.lang.String retmax,
           java.lang.String rettype,
           java.lang.String strand,
           java.lang.String seq_start,
           java.lang.String seq_stop,
           java.lang.String complexity,
           java.lang.String report) {
           this.db = db;
           this.id = id;
           this.webEnv = webEnv;
           this.query_key = query_key;
           this.tool = tool;
           this.email = email;
           this.retstart = retstart;
           this.retmax = retmax;
           this.rettype = rettype;
           this.strand = strand;
           this.seq_start = seq_start;
           this.seq_stop = seq_stop;
           this.complexity = complexity;
           this.report = report;
    }


    /**
     * Gets the db value for this EFetchRequestMS.
     * 
     * @return db
     */
    public java.lang.String getDb() {
        return db;
    }


    /**
     * Sets the db value for this EFetchRequestMS.
     * 
     * @param db
     */
    public void setDb(java.lang.String db) {
        this.db = db;
    }


    /**
     * Gets the id value for this EFetchRequestMS.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this EFetchRequestMS.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the webEnv value for this EFetchRequestMS.
     * 
     * @return webEnv
     */
    public java.lang.String getWebEnv() {
        return webEnv;
    }


    /**
     * Sets the webEnv value for this EFetchRequestMS.
     * 
     * @param webEnv
     */
    public void setWebEnv(java.lang.String webEnv) {
        this.webEnv = webEnv;
    }


    /**
     * Gets the query_key value for this EFetchRequestMS.
     * 
     * @return query_key
     */
    public java.lang.String getQuery_key() {
        return query_key;
    }


    /**
     * Sets the query_key value for this EFetchRequestMS.
     * 
     * @param query_key
     */
    public void setQuery_key(java.lang.String query_key) {
        this.query_key = query_key;
    }


    /**
     * Gets the tool value for this EFetchRequestMS.
     * 
     * @return tool
     */
    public java.lang.String getTool() {
        return tool;
    }


    /**
     * Sets the tool value for this EFetchRequestMS.
     * 
     * @param tool
     */
    public void setTool(java.lang.String tool) {
        this.tool = tool;
    }


    /**
     * Gets the email value for this EFetchRequestMS.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EFetchRequestMS.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the retstart value for this EFetchRequestMS.
     * 
     * @return retstart
     */
    public java.lang.String getRetstart() {
        return retstart;
    }


    /**
     * Sets the retstart value for this EFetchRequestMS.
     * 
     * @param retstart
     */
    public void setRetstart(java.lang.String retstart) {
        this.retstart = retstart;
    }


    /**
     * Gets the retmax value for this EFetchRequestMS.
     * 
     * @return retmax
     */
    public java.lang.String getRetmax() {
        return retmax;
    }


    /**
     * Sets the retmax value for this EFetchRequestMS.
     * 
     * @param retmax
     */
    public void setRetmax(java.lang.String retmax) {
        this.retmax = retmax;
    }


    /**
     * Gets the rettype value for this EFetchRequestMS.
     * 
     * @return rettype
     */
    public java.lang.String getRettype() {
        return rettype;
    }


    /**
     * Sets the rettype value for this EFetchRequestMS.
     * 
     * @param rettype
     */
    public void setRettype(java.lang.String rettype) {
        this.rettype = rettype;
    }


    /**
     * Gets the strand value for this EFetchRequestMS.
     * 
     * @return strand
     */
    public java.lang.String getStrand() {
        return strand;
    }


    /**
     * Sets the strand value for this EFetchRequestMS.
     * 
     * @param strand
     */
    public void setStrand(java.lang.String strand) {
        this.strand = strand;
    }


    /**
     * Gets the seq_start value for this EFetchRequestMS.
     * 
     * @return seq_start
     */
    public java.lang.String getSeq_start() {
        return seq_start;
    }


    /**
     * Sets the seq_start value for this EFetchRequestMS.
     * 
     * @param seq_start
     */
    public void setSeq_start(java.lang.String seq_start) {
        this.seq_start = seq_start;
    }


    /**
     * Gets the seq_stop value for this EFetchRequestMS.
     * 
     * @return seq_stop
     */
    public java.lang.String getSeq_stop() {
        return seq_stop;
    }


    /**
     * Sets the seq_stop value for this EFetchRequestMS.
     * 
     * @param seq_stop
     */
    public void setSeq_stop(java.lang.String seq_stop) {
        this.seq_stop = seq_stop;
    }


    /**
     * Gets the complexity value for this EFetchRequestMS.
     * 
     * @return complexity
     */
    public java.lang.String getComplexity() {
        return complexity;
    }


    /**
     * Sets the complexity value for this EFetchRequestMS.
     * 
     * @param complexity
     */
    public void setComplexity(java.lang.String complexity) {
        this.complexity = complexity;
    }


    /**
     * Gets the report value for this EFetchRequestMS.
     * 
     * @return report
     */
    public java.lang.String getReport() {
        return report;
    }


    /**
     * Sets the report value for this EFetchRequestMS.
     * 
     * @param report
     */
    public void setReport(java.lang.String report) {
        this.report = report;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EFetchRequestMS)) return false;
        EFetchRequestMS other = (EFetchRequestMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.db==null && other.getDb()==null) || 
             (this.db!=null &&
              this.db.equals(other.getDb()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.webEnv==null && other.getWebEnv()==null) || 
             (this.webEnv!=null &&
              this.webEnv.equals(other.getWebEnv()))) &&
            ((this.query_key==null && other.getQuery_key()==null) || 
             (this.query_key!=null &&
              this.query_key.equals(other.getQuery_key()))) &&
            ((this.tool==null && other.getTool()==null) || 
             (this.tool!=null &&
              this.tool.equals(other.getTool()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.retstart==null && other.getRetstart()==null) || 
             (this.retstart!=null &&
              this.retstart.equals(other.getRetstart()))) &&
            ((this.retmax==null && other.getRetmax()==null) || 
             (this.retmax!=null &&
              this.retmax.equals(other.getRetmax()))) &&
            ((this.rettype==null && other.getRettype()==null) || 
             (this.rettype!=null &&
              this.rettype.equals(other.getRettype()))) &&
            ((this.strand==null && other.getStrand()==null) || 
             (this.strand!=null &&
              this.strand.equals(other.getStrand()))) &&
            ((this.seq_start==null && other.getSeq_start()==null) || 
             (this.seq_start!=null &&
              this.seq_start.equals(other.getSeq_start()))) &&
            ((this.seq_stop==null && other.getSeq_stop()==null) || 
             (this.seq_stop!=null &&
              this.seq_stop.equals(other.getSeq_stop()))) &&
            ((this.complexity==null && other.getComplexity()==null) || 
             (this.complexity!=null &&
              this.complexity.equals(other.getComplexity()))) &&
            ((this.report==null && other.getReport()==null) || 
             (this.report!=null &&
              this.report.equals(other.getReport())));
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
        if (getDb() != null) {
            _hashCode += getDb().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getWebEnv() != null) {
            _hashCode += getWebEnv().hashCode();
        }
        if (getQuery_key() != null) {
            _hashCode += getQuery_key().hashCode();
        }
        if (getTool() != null) {
            _hashCode += getTool().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getRetstart() != null) {
            _hashCode += getRetstart().hashCode();
        }
        if (getRetmax() != null) {
            _hashCode += getRetmax().hashCode();
        }
        if (getRettype() != null) {
            _hashCode += getRettype().hashCode();
        }
        if (getStrand() != null) {
            _hashCode += getStrand().hashCode();
        }
        if (getSeq_start() != null) {
            _hashCode += getSeq_start().hashCode();
        }
        if (getSeq_stop() != null) {
            _hashCode += getSeq_stop().hashCode();
        }
        if (getComplexity() != null) {
            _hashCode += getComplexity().hashCode();
        }
        if (getReport() != null) {
            _hashCode += getReport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EFetchRequestMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">eFetchRequestMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webEnv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "WebEnv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "query_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tool");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "tool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retstart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "retstart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retmax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "retmax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rettype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "rettype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "strand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seq_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "seq_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seq_stop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "seq_stop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complexity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "complexity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "report"));
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
