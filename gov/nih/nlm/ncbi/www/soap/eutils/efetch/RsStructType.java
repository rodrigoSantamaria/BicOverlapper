/**
 * RsStructType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RsStructType  implements java.io.Serializable {
    private java.lang.String rsStruct_protAcc;

    private java.lang.String rsStruct_protGi;

    private java.lang.String rsStruct_protLoc;

    private java.lang.String rsStruct_protResidue;

    private java.lang.String rsStruct_rsResidue;

    private java.lang.String rsStruct_structGi;

    private java.lang.String rsStruct_structLoc;

    private java.lang.String rsStruct_structResidue;

    public RsStructType() {
    }

    public RsStructType(
           java.lang.String rsStruct_protAcc,
           java.lang.String rsStruct_protGi,
           java.lang.String rsStruct_protLoc,
           java.lang.String rsStruct_protResidue,
           java.lang.String rsStruct_rsResidue,
           java.lang.String rsStruct_structGi,
           java.lang.String rsStruct_structLoc,
           java.lang.String rsStruct_structResidue) {
           this.rsStruct_protAcc = rsStruct_protAcc;
           this.rsStruct_protGi = rsStruct_protGi;
           this.rsStruct_protLoc = rsStruct_protLoc;
           this.rsStruct_protResidue = rsStruct_protResidue;
           this.rsStruct_rsResidue = rsStruct_rsResidue;
           this.rsStruct_structGi = rsStruct_structGi;
           this.rsStruct_structLoc = rsStruct_structLoc;
           this.rsStruct_structResidue = rsStruct_structResidue;
    }


    /**
     * Gets the rsStruct_protAcc value for this RsStructType.
     * 
     * @return rsStruct_protAcc
     */
    public java.lang.String getRsStruct_protAcc() {
        return rsStruct_protAcc;
    }


    /**
     * Sets the rsStruct_protAcc value for this RsStructType.
     * 
     * @param rsStruct_protAcc
     */
    public void setRsStruct_protAcc(java.lang.String rsStruct_protAcc) {
        this.rsStruct_protAcc = rsStruct_protAcc;
    }


    /**
     * Gets the rsStruct_protGi value for this RsStructType.
     * 
     * @return rsStruct_protGi
     */
    public java.lang.String getRsStruct_protGi() {
        return rsStruct_protGi;
    }


    /**
     * Sets the rsStruct_protGi value for this RsStructType.
     * 
     * @param rsStruct_protGi
     */
    public void setRsStruct_protGi(java.lang.String rsStruct_protGi) {
        this.rsStruct_protGi = rsStruct_protGi;
    }


    /**
     * Gets the rsStruct_protLoc value for this RsStructType.
     * 
     * @return rsStruct_protLoc
     */
    public java.lang.String getRsStruct_protLoc() {
        return rsStruct_protLoc;
    }


    /**
     * Sets the rsStruct_protLoc value for this RsStructType.
     * 
     * @param rsStruct_protLoc
     */
    public void setRsStruct_protLoc(java.lang.String rsStruct_protLoc) {
        this.rsStruct_protLoc = rsStruct_protLoc;
    }


    /**
     * Gets the rsStruct_protResidue value for this RsStructType.
     * 
     * @return rsStruct_protResidue
     */
    public java.lang.String getRsStruct_protResidue() {
        return rsStruct_protResidue;
    }


    /**
     * Sets the rsStruct_protResidue value for this RsStructType.
     * 
     * @param rsStruct_protResidue
     */
    public void setRsStruct_protResidue(java.lang.String rsStruct_protResidue) {
        this.rsStruct_protResidue = rsStruct_protResidue;
    }


    /**
     * Gets the rsStruct_rsResidue value for this RsStructType.
     * 
     * @return rsStruct_rsResidue
     */
    public java.lang.String getRsStruct_rsResidue() {
        return rsStruct_rsResidue;
    }


    /**
     * Sets the rsStruct_rsResidue value for this RsStructType.
     * 
     * @param rsStruct_rsResidue
     */
    public void setRsStruct_rsResidue(java.lang.String rsStruct_rsResidue) {
        this.rsStruct_rsResidue = rsStruct_rsResidue;
    }


    /**
     * Gets the rsStruct_structGi value for this RsStructType.
     * 
     * @return rsStruct_structGi
     */
    public java.lang.String getRsStruct_structGi() {
        return rsStruct_structGi;
    }


    /**
     * Sets the rsStruct_structGi value for this RsStructType.
     * 
     * @param rsStruct_structGi
     */
    public void setRsStruct_structGi(java.lang.String rsStruct_structGi) {
        this.rsStruct_structGi = rsStruct_structGi;
    }


    /**
     * Gets the rsStruct_structLoc value for this RsStructType.
     * 
     * @return rsStruct_structLoc
     */
    public java.lang.String getRsStruct_structLoc() {
        return rsStruct_structLoc;
    }


    /**
     * Sets the rsStruct_structLoc value for this RsStructType.
     * 
     * @param rsStruct_structLoc
     */
    public void setRsStruct_structLoc(java.lang.String rsStruct_structLoc) {
        this.rsStruct_structLoc = rsStruct_structLoc;
    }


    /**
     * Gets the rsStruct_structResidue value for this RsStructType.
     * 
     * @return rsStruct_structResidue
     */
    public java.lang.String getRsStruct_structResidue() {
        return rsStruct_structResidue;
    }


    /**
     * Sets the rsStruct_structResidue value for this RsStructType.
     * 
     * @param rsStruct_structResidue
     */
    public void setRsStruct_structResidue(java.lang.String rsStruct_structResidue) {
        this.rsStruct_structResidue = rsStruct_structResidue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RsStructType)) return false;
        RsStructType other = (RsStructType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rsStruct_protAcc==null && other.getRsStruct_protAcc()==null) || 
             (this.rsStruct_protAcc!=null &&
              this.rsStruct_protAcc.equals(other.getRsStruct_protAcc()))) &&
            ((this.rsStruct_protGi==null && other.getRsStruct_protGi()==null) || 
             (this.rsStruct_protGi!=null &&
              this.rsStruct_protGi.equals(other.getRsStruct_protGi()))) &&
            ((this.rsStruct_protLoc==null && other.getRsStruct_protLoc()==null) || 
             (this.rsStruct_protLoc!=null &&
              this.rsStruct_protLoc.equals(other.getRsStruct_protLoc()))) &&
            ((this.rsStruct_protResidue==null && other.getRsStruct_protResidue()==null) || 
             (this.rsStruct_protResidue!=null &&
              this.rsStruct_protResidue.equals(other.getRsStruct_protResidue()))) &&
            ((this.rsStruct_rsResidue==null && other.getRsStruct_rsResidue()==null) || 
             (this.rsStruct_rsResidue!=null &&
              this.rsStruct_rsResidue.equals(other.getRsStruct_rsResidue()))) &&
            ((this.rsStruct_structGi==null && other.getRsStruct_structGi()==null) || 
             (this.rsStruct_structGi!=null &&
              this.rsStruct_structGi.equals(other.getRsStruct_structGi()))) &&
            ((this.rsStruct_structLoc==null && other.getRsStruct_structLoc()==null) || 
             (this.rsStruct_structLoc!=null &&
              this.rsStruct_structLoc.equals(other.getRsStruct_structLoc()))) &&
            ((this.rsStruct_structResidue==null && other.getRsStruct_structResidue()==null) || 
             (this.rsStruct_structResidue!=null &&
              this.rsStruct_structResidue.equals(other.getRsStruct_structResidue())));
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
        if (getRsStruct_protAcc() != null) {
            _hashCode += getRsStruct_protAcc().hashCode();
        }
        if (getRsStruct_protGi() != null) {
            _hashCode += getRsStruct_protGi().hashCode();
        }
        if (getRsStruct_protLoc() != null) {
            _hashCode += getRsStruct_protLoc().hashCode();
        }
        if (getRsStruct_protResidue() != null) {
            _hashCode += getRsStruct_protResidue().hashCode();
        }
        if (getRsStruct_rsResidue() != null) {
            _hashCode += getRsStruct_rsResidue().hashCode();
        }
        if (getRsStruct_structGi() != null) {
            _hashCode += getRsStruct_structGi().hashCode();
        }
        if (getRsStruct_structLoc() != null) {
            _hashCode += getRsStruct_structLoc().hashCode();
        }
        if (getRsStruct_structResidue() != null) {
            _hashCode += getRsStruct_structResidue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RsStructType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsStructType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsStruct_protAcc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsStruct_protAcc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsStruct_protGi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsStruct_protGi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsStruct_protLoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsStruct_protLoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsStruct_protResidue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsStruct_protResidue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsStruct_rsResidue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsStruct_rsResidue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsStruct_structGi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsStruct_structGi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsStruct_structLoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsStruct_structLoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsStruct_structResidue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsStruct_structResidue"));
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
