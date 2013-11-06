/**
 * ResourceInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResourceInfoType  implements java.io.Serializable {
    private java.lang.String typeOfResource;

    private java.lang.String issuance;

    private java.lang.String[] resourceUnit;

    public ResourceInfoType() {
    }

    public ResourceInfoType(
           java.lang.String typeOfResource,
           java.lang.String issuance,
           java.lang.String[] resourceUnit) {
           this.typeOfResource = typeOfResource;
           this.issuance = issuance;
           this.resourceUnit = resourceUnit;
    }


    /**
     * Gets the typeOfResource value for this ResourceInfoType.
     * 
     * @return typeOfResource
     */
    public java.lang.String getTypeOfResource() {
        return typeOfResource;
    }


    /**
     * Sets the typeOfResource value for this ResourceInfoType.
     * 
     * @param typeOfResource
     */
    public void setTypeOfResource(java.lang.String typeOfResource) {
        this.typeOfResource = typeOfResource;
    }


    /**
     * Gets the issuance value for this ResourceInfoType.
     * 
     * @return issuance
     */
    public java.lang.String getIssuance() {
        return issuance;
    }


    /**
     * Sets the issuance value for this ResourceInfoType.
     * 
     * @param issuance
     */
    public void setIssuance(java.lang.String issuance) {
        this.issuance = issuance;
    }


    /**
     * Gets the resourceUnit value for this ResourceInfoType.
     * 
     * @return resourceUnit
     */
    public java.lang.String[] getResourceUnit() {
        return resourceUnit;
    }


    /**
     * Sets the resourceUnit value for this ResourceInfoType.
     * 
     * @param resourceUnit
     */
    public void setResourceUnit(java.lang.String[] resourceUnit) {
        this.resourceUnit = resourceUnit;
    }

    public java.lang.String getResourceUnit(int i) {
        return this.resourceUnit[i];
    }

    public void setResourceUnit(int i, java.lang.String _value) {
        this.resourceUnit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceInfoType)) return false;
        ResourceInfoType other = (ResourceInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.typeOfResource==null && other.getTypeOfResource()==null) || 
             (this.typeOfResource!=null &&
              this.typeOfResource.equals(other.getTypeOfResource()))) &&
            ((this.issuance==null && other.getIssuance()==null) || 
             (this.issuance!=null &&
              this.issuance.equals(other.getIssuance()))) &&
            ((this.resourceUnit==null && other.getResourceUnit()==null) || 
             (this.resourceUnit!=null &&
              java.util.Arrays.equals(this.resourceUnit, other.getResourceUnit())));
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
        if (getTypeOfResource() != null) {
            _hashCode += getTypeOfResource().hashCode();
        }
        if (getIssuance() != null) {
            _hashCode += getIssuance().hashCode();
        }
        if (getResourceUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceUnit(), i);
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
        new org.apache.axis.description.TypeDesc(ResourceInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ResourceInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfResource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TypeOfResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Issuance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ResourceUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ResourceUnit"));
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
