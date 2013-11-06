/**
 * MSSearchSettings_usermodsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSSearchSettings_usermodsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpecSetType MSModSpecSet;

    public MSSearchSettings_usermodsType() {
    }

    public MSSearchSettings_usermodsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpecSetType MSModSpecSet) {
           this.MSModSpecSet = MSModSpecSet;
    }


    /**
     * Gets the MSModSpecSet value for this MSSearchSettings_usermodsType.
     * 
     * @return MSModSpecSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpecSetType getMSModSpecSet() {
        return MSModSpecSet;
    }


    /**
     * Sets the MSModSpecSet value for this MSSearchSettings_usermodsType.
     * 
     * @param MSModSpecSet
     */
    public void setMSModSpecSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpecSetType MSModSpecSet) {
        this.MSModSpecSet = MSModSpecSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSSearchSettings_usermodsType)) return false;
        MSSearchSettings_usermodsType other = (MSSearchSettings_usermodsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSModSpecSet==null && other.getMSModSpecSet()==null) || 
             (this.MSModSpecSet!=null &&
              this.MSModSpecSet.equals(other.getMSModSpecSet())));
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
        if (getMSModSpecSet() != null) {
            _hashCode += getMSModSpecSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSSearchSettings_usermodsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_usermodsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModSpecSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpecSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpecSetType"));
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
