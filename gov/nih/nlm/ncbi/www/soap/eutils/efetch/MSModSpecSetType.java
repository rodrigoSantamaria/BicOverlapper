/**
 * MSModSpecSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSModSpecSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpecType[] MSModSpec;

    public MSModSpecSetType() {
    }

    public MSModSpecSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpecType[] MSModSpec) {
           this.MSModSpec = MSModSpec;
    }


    /**
     * Gets the MSModSpec value for this MSModSpecSetType.
     * 
     * @return MSModSpec
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpecType[] getMSModSpec() {
        return MSModSpec;
    }


    /**
     * Sets the MSModSpec value for this MSModSpecSetType.
     * 
     * @param MSModSpec
     */
    public void setMSModSpec(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpecType[] MSModSpec) {
        this.MSModSpec = MSModSpec;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpecType getMSModSpec(int i) {
        return this.MSModSpec[i];
    }

    public void setMSModSpec(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpecType _value) {
        this.MSModSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSModSpecSetType)) return false;
        MSModSpecSetType other = (MSModSpecSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSModSpec==null && other.getMSModSpec()==null) || 
             (this.MSModSpec!=null &&
              java.util.Arrays.equals(this.MSModSpec, other.getMSModSpec())));
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
        if (getMSModSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSModSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSModSpec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSModSpecSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpecSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpecType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
