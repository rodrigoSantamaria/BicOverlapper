/**
 * NameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NameType  implements java.io.Serializable {
    private java.lang.String classCDE;

    private java.lang.String dispName;

    private java.lang.String uniqueName;

    public NameType() {
    }

    public NameType(
           java.lang.String classCDE,
           java.lang.String dispName,
           java.lang.String uniqueName) {
           this.classCDE = classCDE;
           this.dispName = dispName;
           this.uniqueName = uniqueName;
    }


    /**
     * Gets the classCDE value for this NameType.
     * 
     * @return classCDE
     */
    public java.lang.String getClassCDE() {
        return classCDE;
    }


    /**
     * Sets the classCDE value for this NameType.
     * 
     * @param classCDE
     */
    public void setClassCDE(java.lang.String classCDE) {
        this.classCDE = classCDE;
    }


    /**
     * Gets the dispName value for this NameType.
     * 
     * @return dispName
     */
    public java.lang.String getDispName() {
        return dispName;
    }


    /**
     * Sets the dispName value for this NameType.
     * 
     * @param dispName
     */
    public void setDispName(java.lang.String dispName) {
        this.dispName = dispName;
    }


    /**
     * Gets the uniqueName value for this NameType.
     * 
     * @return uniqueName
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this NameType.
     * 
     * @param uniqueName
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameType)) return false;
        NameType other = (NameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.classCDE==null && other.getClassCDE()==null) || 
             (this.classCDE!=null &&
              this.classCDE.equals(other.getClassCDE()))) &&
            ((this.dispName==null && other.getDispName()==null) || 
             (this.dispName!=null &&
              this.dispName.equals(other.getDispName()))) &&
            ((this.uniqueName==null && other.getUniqueName()==null) || 
             (this.uniqueName!=null &&
              this.uniqueName.equals(other.getUniqueName())));
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
        if (getClassCDE() != null) {
            _hashCode += getClassCDE().hashCode();
        }
        if (getDispName() != null) {
            _hashCode += getDispName().hashCode();
        }
        if (getUniqueName() != null) {
            _hashCode += getUniqueName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classCDE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ClassCDE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DispName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "UniqueName"));
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
