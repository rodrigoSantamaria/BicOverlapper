/**
 * PssmParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PssmParametersType  implements java.io.Serializable {
    private java.lang.String pssmParameters_pseudocount;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmParameters_rpsdbparamsType pssmParameters_rpsdbparams;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmParameters_constraintsType pssmParameters_constraints;

    public PssmParametersType() {
    }

    public PssmParametersType(
           java.lang.String pssmParameters_pseudocount,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmParameters_rpsdbparamsType pssmParameters_rpsdbparams,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmParameters_constraintsType pssmParameters_constraints) {
           this.pssmParameters_pseudocount = pssmParameters_pseudocount;
           this.pssmParameters_rpsdbparams = pssmParameters_rpsdbparams;
           this.pssmParameters_constraints = pssmParameters_constraints;
    }


    /**
     * Gets the pssmParameters_pseudocount value for this PssmParametersType.
     * 
     * @return pssmParameters_pseudocount
     */
    public java.lang.String getPssmParameters_pseudocount() {
        return pssmParameters_pseudocount;
    }


    /**
     * Sets the pssmParameters_pseudocount value for this PssmParametersType.
     * 
     * @param pssmParameters_pseudocount
     */
    public void setPssmParameters_pseudocount(java.lang.String pssmParameters_pseudocount) {
        this.pssmParameters_pseudocount = pssmParameters_pseudocount;
    }


    /**
     * Gets the pssmParameters_rpsdbparams value for this PssmParametersType.
     * 
     * @return pssmParameters_rpsdbparams
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmParameters_rpsdbparamsType getPssmParameters_rpsdbparams() {
        return pssmParameters_rpsdbparams;
    }


    /**
     * Sets the pssmParameters_rpsdbparams value for this PssmParametersType.
     * 
     * @param pssmParameters_rpsdbparams
     */
    public void setPssmParameters_rpsdbparams(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmParameters_rpsdbparamsType pssmParameters_rpsdbparams) {
        this.pssmParameters_rpsdbparams = pssmParameters_rpsdbparams;
    }


    /**
     * Gets the pssmParameters_constraints value for this PssmParametersType.
     * 
     * @return pssmParameters_constraints
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmParameters_constraintsType getPssmParameters_constraints() {
        return pssmParameters_constraints;
    }


    /**
     * Sets the pssmParameters_constraints value for this PssmParametersType.
     * 
     * @param pssmParameters_constraints
     */
    public void setPssmParameters_constraints(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmParameters_constraintsType pssmParameters_constraints) {
        this.pssmParameters_constraints = pssmParameters_constraints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssmParametersType)) return false;
        PssmParametersType other = (PssmParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssmParameters_pseudocount==null && other.getPssmParameters_pseudocount()==null) || 
             (this.pssmParameters_pseudocount!=null &&
              this.pssmParameters_pseudocount.equals(other.getPssmParameters_pseudocount()))) &&
            ((this.pssmParameters_rpsdbparams==null && other.getPssmParameters_rpsdbparams()==null) || 
             (this.pssmParameters_rpsdbparams!=null &&
              this.pssmParameters_rpsdbparams.equals(other.getPssmParameters_rpsdbparams()))) &&
            ((this.pssmParameters_constraints==null && other.getPssmParameters_constraints()==null) || 
             (this.pssmParameters_constraints!=null &&
              this.pssmParameters_constraints.equals(other.getPssmParameters_constraints())));
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
        if (getPssmParameters_pseudocount() != null) {
            _hashCode += getPssmParameters_pseudocount().hashCode();
        }
        if (getPssmParameters_rpsdbparams() != null) {
            _hashCode += getPssmParameters_rpsdbparams().hashCode();
        }
        if (getPssmParameters_constraints() != null) {
            _hashCode += getPssmParameters_constraints().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssmParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmParameters_pseudocount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmParameters_pseudocount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmParameters_rpsdbparams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmParameters_rpsdbparams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmParameters_rpsdbparamsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmParameters_constraints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmParameters_constraints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmParameters_constraintsType"));
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
