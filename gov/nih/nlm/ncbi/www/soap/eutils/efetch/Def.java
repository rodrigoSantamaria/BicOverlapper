/**
 * Def.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Def  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.P[] p;

    private org.apache.axis.types.IDRefs rid;  // attribute

    private org.apache.axis.types.Id id;  // attribute

    public Def() {
    }

    public Def(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.P[] p,
           org.apache.axis.types.IDRefs rid,
           org.apache.axis.types.Id id) {
           this.p = p;
           this.rid = rid;
           this.id = id;
    }


    /**
     * Gets the p value for this Def.
     * 
     * @return p
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.P[] getP() {
        return p;
    }


    /**
     * Sets the p value for this Def.
     * 
     * @param p
     */
    public void setP(gov.nih.nlm.ncbi.www.soap.eutils.efetch.P[] p) {
        this.p = p;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.P getP(int i) {
        return this.p[i];
    }

    public void setP(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.P _value) {
        this.p[i] = _value;
    }


    /**
     * Gets the rid value for this Def.
     * 
     * @return rid
     */
    public org.apache.axis.types.IDRefs getRid() {
        return rid;
    }


    /**
     * Sets the rid value for this Def.
     * 
     * @param rid
     */
    public void setRid(org.apache.axis.types.IDRefs rid) {
        this.rid = rid;
    }


    /**
     * Gets the id value for this Def.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this Def.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Def)) return false;
        Def other = (Def) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.p==null && other.getP()==null) || 
             (this.p!=null &&
              java.util.Arrays.equals(this.p, other.getP()))) &&
            ((this.rid==null && other.getRid()==null) || 
             (this.rid!=null &&
              this.rid.equals(other.getRid()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRid() != null) {
            _hashCode += getRid().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Def.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">def"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "rid"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "IDREFS"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "p"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "p"));
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
