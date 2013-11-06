/**
 * MSMassSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSMassSetType  implements java.io.Serializable {
    private java.lang.String MSMassSet_monomass;

    private java.lang.String MSMassSet_averagemass;

    private java.lang.String MSMassSet_n15Mass;

    public MSMassSetType() {
    }

    public MSMassSetType(
           java.lang.String MSMassSet_monomass,
           java.lang.String MSMassSet_averagemass,
           java.lang.String MSMassSet_n15Mass) {
           this.MSMassSet_monomass = MSMassSet_monomass;
           this.MSMassSet_averagemass = MSMassSet_averagemass;
           this.MSMassSet_n15Mass = MSMassSet_n15Mass;
    }


    /**
     * Gets the MSMassSet_monomass value for this MSMassSetType.
     * 
     * @return MSMassSet_monomass
     */
    public java.lang.String getMSMassSet_monomass() {
        return MSMassSet_monomass;
    }


    /**
     * Sets the MSMassSet_monomass value for this MSMassSetType.
     * 
     * @param MSMassSet_monomass
     */
    public void setMSMassSet_monomass(java.lang.String MSMassSet_monomass) {
        this.MSMassSet_monomass = MSMassSet_monomass;
    }


    /**
     * Gets the MSMassSet_averagemass value for this MSMassSetType.
     * 
     * @return MSMassSet_averagemass
     */
    public java.lang.String getMSMassSet_averagemass() {
        return MSMassSet_averagemass;
    }


    /**
     * Sets the MSMassSet_averagemass value for this MSMassSetType.
     * 
     * @param MSMassSet_averagemass
     */
    public void setMSMassSet_averagemass(java.lang.String MSMassSet_averagemass) {
        this.MSMassSet_averagemass = MSMassSet_averagemass;
    }


    /**
     * Gets the MSMassSet_n15Mass value for this MSMassSetType.
     * 
     * @return MSMassSet_n15Mass
     */
    public java.lang.String getMSMassSet_n15Mass() {
        return MSMassSet_n15Mass;
    }


    /**
     * Sets the MSMassSet_n15Mass value for this MSMassSetType.
     * 
     * @param MSMassSet_n15Mass
     */
    public void setMSMassSet_n15Mass(java.lang.String MSMassSet_n15Mass) {
        this.MSMassSet_n15Mass = MSMassSet_n15Mass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSMassSetType)) return false;
        MSMassSetType other = (MSMassSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSMassSet_monomass==null && other.getMSMassSet_monomass()==null) || 
             (this.MSMassSet_monomass!=null &&
              this.MSMassSet_monomass.equals(other.getMSMassSet_monomass()))) &&
            ((this.MSMassSet_averagemass==null && other.getMSMassSet_averagemass()==null) || 
             (this.MSMassSet_averagemass!=null &&
              this.MSMassSet_averagemass.equals(other.getMSMassSet_averagemass()))) &&
            ((this.MSMassSet_n15Mass==null && other.getMSMassSet_n15Mass()==null) || 
             (this.MSMassSet_n15Mass!=null &&
              this.MSMassSet_n15Mass.equals(other.getMSMassSet_n15Mass())));
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
        if (getMSMassSet_monomass() != null) {
            _hashCode += getMSMassSet_monomass().hashCode();
        }
        if (getMSMassSet_averagemass() != null) {
            _hashCode += getMSMassSet_averagemass().hashCode();
        }
        if (getMSMassSet_n15Mass() != null) {
            _hashCode += getMSMassSet_n15Mass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSMassSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMassSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSMassSet_monomass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMassSet_monomass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSMassSet_averagemass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMassSet_averagemass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSMassSet_n15Mass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMassSet_n15mass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
