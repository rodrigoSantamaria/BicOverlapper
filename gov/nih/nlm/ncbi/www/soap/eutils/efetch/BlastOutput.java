/**
 * BlastOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BlastOutput  implements java.io.Serializable {
    private java.lang.String blastOutput_program;

    private java.lang.String blastOutput_version;

    private java.lang.String blastOutput_reference;

    private java.lang.String blastOutput_db;

    private java.lang.String blastOutput_queryID;

    private java.lang.String blastOutput_queryDef;

    private java.lang.String blastOutput_queryLen;

    private java.lang.String blastOutput_querySeq;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastOutput_paramType blastOutput_param;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastOutput_iterationsType blastOutput_iterations;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastOutput_mbstatType blastOutput_mbstat;

    public BlastOutput() {
    }

    public BlastOutput(
           java.lang.String blastOutput_program,
           java.lang.String blastOutput_version,
           java.lang.String blastOutput_reference,
           java.lang.String blastOutput_db,
           java.lang.String blastOutput_queryID,
           java.lang.String blastOutput_queryDef,
           java.lang.String blastOutput_queryLen,
           java.lang.String blastOutput_querySeq,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastOutput_paramType blastOutput_param,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastOutput_iterationsType blastOutput_iterations,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastOutput_mbstatType blastOutput_mbstat) {
           this.blastOutput_program = blastOutput_program;
           this.blastOutput_version = blastOutput_version;
           this.blastOutput_reference = blastOutput_reference;
           this.blastOutput_db = blastOutput_db;
           this.blastOutput_queryID = blastOutput_queryID;
           this.blastOutput_queryDef = blastOutput_queryDef;
           this.blastOutput_queryLen = blastOutput_queryLen;
           this.blastOutput_querySeq = blastOutput_querySeq;
           this.blastOutput_param = blastOutput_param;
           this.blastOutput_iterations = blastOutput_iterations;
           this.blastOutput_mbstat = blastOutput_mbstat;
    }


    /**
     * Gets the blastOutput_program value for this BlastOutput.
     * 
     * @return blastOutput_program
     */
    public java.lang.String getBlastOutput_program() {
        return blastOutput_program;
    }


    /**
     * Sets the blastOutput_program value for this BlastOutput.
     * 
     * @param blastOutput_program
     */
    public void setBlastOutput_program(java.lang.String blastOutput_program) {
        this.blastOutput_program = blastOutput_program;
    }


    /**
     * Gets the blastOutput_version value for this BlastOutput.
     * 
     * @return blastOutput_version
     */
    public java.lang.String getBlastOutput_version() {
        return blastOutput_version;
    }


    /**
     * Sets the blastOutput_version value for this BlastOutput.
     * 
     * @param blastOutput_version
     */
    public void setBlastOutput_version(java.lang.String blastOutput_version) {
        this.blastOutput_version = blastOutput_version;
    }


    /**
     * Gets the blastOutput_reference value for this BlastOutput.
     * 
     * @return blastOutput_reference
     */
    public java.lang.String getBlastOutput_reference() {
        return blastOutput_reference;
    }


    /**
     * Sets the blastOutput_reference value for this BlastOutput.
     * 
     * @param blastOutput_reference
     */
    public void setBlastOutput_reference(java.lang.String blastOutput_reference) {
        this.blastOutput_reference = blastOutput_reference;
    }


    /**
     * Gets the blastOutput_db value for this BlastOutput.
     * 
     * @return blastOutput_db
     */
    public java.lang.String getBlastOutput_db() {
        return blastOutput_db;
    }


    /**
     * Sets the blastOutput_db value for this BlastOutput.
     * 
     * @param blastOutput_db
     */
    public void setBlastOutput_db(java.lang.String blastOutput_db) {
        this.blastOutput_db = blastOutput_db;
    }


    /**
     * Gets the blastOutput_queryID value for this BlastOutput.
     * 
     * @return blastOutput_queryID
     */
    public java.lang.String getBlastOutput_queryID() {
        return blastOutput_queryID;
    }


    /**
     * Sets the blastOutput_queryID value for this BlastOutput.
     * 
     * @param blastOutput_queryID
     */
    public void setBlastOutput_queryID(java.lang.String blastOutput_queryID) {
        this.blastOutput_queryID = blastOutput_queryID;
    }


    /**
     * Gets the blastOutput_queryDef value for this BlastOutput.
     * 
     * @return blastOutput_queryDef
     */
    public java.lang.String getBlastOutput_queryDef() {
        return blastOutput_queryDef;
    }


    /**
     * Sets the blastOutput_queryDef value for this BlastOutput.
     * 
     * @param blastOutput_queryDef
     */
    public void setBlastOutput_queryDef(java.lang.String blastOutput_queryDef) {
        this.blastOutput_queryDef = blastOutput_queryDef;
    }


    /**
     * Gets the blastOutput_queryLen value for this BlastOutput.
     * 
     * @return blastOutput_queryLen
     */
    public java.lang.String getBlastOutput_queryLen() {
        return blastOutput_queryLen;
    }


    /**
     * Sets the blastOutput_queryLen value for this BlastOutput.
     * 
     * @param blastOutput_queryLen
     */
    public void setBlastOutput_queryLen(java.lang.String blastOutput_queryLen) {
        this.blastOutput_queryLen = blastOutput_queryLen;
    }


    /**
     * Gets the blastOutput_querySeq value for this BlastOutput.
     * 
     * @return blastOutput_querySeq
     */
    public java.lang.String getBlastOutput_querySeq() {
        return blastOutput_querySeq;
    }


    /**
     * Sets the blastOutput_querySeq value for this BlastOutput.
     * 
     * @param blastOutput_querySeq
     */
    public void setBlastOutput_querySeq(java.lang.String blastOutput_querySeq) {
        this.blastOutput_querySeq = blastOutput_querySeq;
    }


    /**
     * Gets the blastOutput_param value for this BlastOutput.
     * 
     * @return blastOutput_param
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastOutput_paramType getBlastOutput_param() {
        return blastOutput_param;
    }


    /**
     * Sets the blastOutput_param value for this BlastOutput.
     * 
     * @param blastOutput_param
     */
    public void setBlastOutput_param(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastOutput_paramType blastOutput_param) {
        this.blastOutput_param = blastOutput_param;
    }


    /**
     * Gets the blastOutput_iterations value for this BlastOutput.
     * 
     * @return blastOutput_iterations
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastOutput_iterationsType getBlastOutput_iterations() {
        return blastOutput_iterations;
    }


    /**
     * Sets the blastOutput_iterations value for this BlastOutput.
     * 
     * @param blastOutput_iterations
     */
    public void setBlastOutput_iterations(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastOutput_iterationsType blastOutput_iterations) {
        this.blastOutput_iterations = blastOutput_iterations;
    }


    /**
     * Gets the blastOutput_mbstat value for this BlastOutput.
     * 
     * @return blastOutput_mbstat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastOutput_mbstatType getBlastOutput_mbstat() {
        return blastOutput_mbstat;
    }


    /**
     * Sets the blastOutput_mbstat value for this BlastOutput.
     * 
     * @param blastOutput_mbstat
     */
    public void setBlastOutput_mbstat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BlastOutput_mbstatType blastOutput_mbstat) {
        this.blastOutput_mbstat = blastOutput_mbstat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BlastOutput)) return false;
        BlastOutput other = (BlastOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blastOutput_program==null && other.getBlastOutput_program()==null) || 
             (this.blastOutput_program!=null &&
              this.blastOutput_program.equals(other.getBlastOutput_program()))) &&
            ((this.blastOutput_version==null && other.getBlastOutput_version()==null) || 
             (this.blastOutput_version!=null &&
              this.blastOutput_version.equals(other.getBlastOutput_version()))) &&
            ((this.blastOutput_reference==null && other.getBlastOutput_reference()==null) || 
             (this.blastOutput_reference!=null &&
              this.blastOutput_reference.equals(other.getBlastOutput_reference()))) &&
            ((this.blastOutput_db==null && other.getBlastOutput_db()==null) || 
             (this.blastOutput_db!=null &&
              this.blastOutput_db.equals(other.getBlastOutput_db()))) &&
            ((this.blastOutput_queryID==null && other.getBlastOutput_queryID()==null) || 
             (this.blastOutput_queryID!=null &&
              this.blastOutput_queryID.equals(other.getBlastOutput_queryID()))) &&
            ((this.blastOutput_queryDef==null && other.getBlastOutput_queryDef()==null) || 
             (this.blastOutput_queryDef!=null &&
              this.blastOutput_queryDef.equals(other.getBlastOutput_queryDef()))) &&
            ((this.blastOutput_queryLen==null && other.getBlastOutput_queryLen()==null) || 
             (this.blastOutput_queryLen!=null &&
              this.blastOutput_queryLen.equals(other.getBlastOutput_queryLen()))) &&
            ((this.blastOutput_querySeq==null && other.getBlastOutput_querySeq()==null) || 
             (this.blastOutput_querySeq!=null &&
              this.blastOutput_querySeq.equals(other.getBlastOutput_querySeq()))) &&
            ((this.blastOutput_param==null && other.getBlastOutput_param()==null) || 
             (this.blastOutput_param!=null &&
              this.blastOutput_param.equals(other.getBlastOutput_param()))) &&
            ((this.blastOutput_iterations==null && other.getBlastOutput_iterations()==null) || 
             (this.blastOutput_iterations!=null &&
              this.blastOutput_iterations.equals(other.getBlastOutput_iterations()))) &&
            ((this.blastOutput_mbstat==null && other.getBlastOutput_mbstat()==null) || 
             (this.blastOutput_mbstat!=null &&
              this.blastOutput_mbstat.equals(other.getBlastOutput_mbstat())));
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
        if (getBlastOutput_program() != null) {
            _hashCode += getBlastOutput_program().hashCode();
        }
        if (getBlastOutput_version() != null) {
            _hashCode += getBlastOutput_version().hashCode();
        }
        if (getBlastOutput_reference() != null) {
            _hashCode += getBlastOutput_reference().hashCode();
        }
        if (getBlastOutput_db() != null) {
            _hashCode += getBlastOutput_db().hashCode();
        }
        if (getBlastOutput_queryID() != null) {
            _hashCode += getBlastOutput_queryID().hashCode();
        }
        if (getBlastOutput_queryDef() != null) {
            _hashCode += getBlastOutput_queryDef().hashCode();
        }
        if (getBlastOutput_queryLen() != null) {
            _hashCode += getBlastOutput_queryLen().hashCode();
        }
        if (getBlastOutput_querySeq() != null) {
            _hashCode += getBlastOutput_querySeq().hashCode();
        }
        if (getBlastOutput_param() != null) {
            _hashCode += getBlastOutput_param().hashCode();
        }
        if (getBlastOutput_iterations() != null) {
            _hashCode += getBlastOutput_iterations().hashCode();
        }
        if (getBlastOutput_mbstat() != null) {
            _hashCode += getBlastOutput_mbstat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BlastOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">BlastOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastOutput_program");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_program"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastOutput_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastOutput_reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastOutput_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastOutput_queryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_query-ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastOutput_queryDef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_query-def"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastOutput_queryLen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_query-len"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastOutput_querySeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_query-seq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastOutput_param");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_param"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_paramType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastOutput_iterations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_iterations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_iterationsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blastOutput_mbstat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_mbstat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BlastOutput_mbstatType"));
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
