/**
 * MeshHeadingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MeshHeadingType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DescriptorNameType descriptorName;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.QualifierNameType[] qualifierName;

    public MeshHeadingType() {
    }

    public MeshHeadingType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DescriptorNameType descriptorName,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.QualifierNameType[] qualifierName) {
           this.descriptorName = descriptorName;
           this.qualifierName = qualifierName;
    }


    /**
     * Gets the descriptorName value for this MeshHeadingType.
     * 
     * @return descriptorName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DescriptorNameType getDescriptorName() {
        return descriptorName;
    }


    /**
     * Sets the descriptorName value for this MeshHeadingType.
     * 
     * @param descriptorName
     */
    public void setDescriptorName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DescriptorNameType descriptorName) {
        this.descriptorName = descriptorName;
    }


    /**
     * Gets the qualifierName value for this MeshHeadingType.
     * 
     * @return qualifierName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.QualifierNameType[] getQualifierName() {
        return qualifierName;
    }


    /**
     * Sets the qualifierName value for this MeshHeadingType.
     * 
     * @param qualifierName
     */
    public void setQualifierName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.QualifierNameType[] qualifierName) {
        this.qualifierName = qualifierName;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.QualifierNameType getQualifierName(int i) {
        return this.qualifierName[i];
    }

    public void setQualifierName(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.QualifierNameType _value) {
        this.qualifierName[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MeshHeadingType)) return false;
        MeshHeadingType other = (MeshHeadingType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descriptorName==null && other.getDescriptorName()==null) || 
             (this.descriptorName!=null &&
              this.descriptorName.equals(other.getDescriptorName()))) &&
            ((this.qualifierName==null && other.getQualifierName()==null) || 
             (this.qualifierName!=null &&
              java.util.Arrays.equals(this.qualifierName, other.getQualifierName())));
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
        if (getDescriptorName() != null) {
            _hashCode += getDescriptorName().hashCode();
        }
        if (getQualifierName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQualifierName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQualifierName(), i);
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
        new org.apache.axis.description.TypeDesc(MeshHeadingType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MeshHeadingType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DescriptorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DescriptorNameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifierName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "QualifierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "QualifierNameType"));
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
