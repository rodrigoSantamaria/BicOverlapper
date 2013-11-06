/**
 * ImpFeatType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ImpFeatType  implements java.io.Serializable {
    private java.lang.String impFeat_key;

    private java.lang.String impFeat_loc;

    private java.lang.String impFeat_descr;

    public ImpFeatType() {
    }

    public ImpFeatType(
           java.lang.String impFeat_key,
           java.lang.String impFeat_loc,
           java.lang.String impFeat_descr) {
           this.impFeat_key = impFeat_key;
           this.impFeat_loc = impFeat_loc;
           this.impFeat_descr = impFeat_descr;
    }


    /**
     * Gets the impFeat_key value for this ImpFeatType.
     * 
     * @return impFeat_key
     */
    public java.lang.String getImpFeat_key() {
        return impFeat_key;
    }


    /**
     * Sets the impFeat_key value for this ImpFeatType.
     * 
     * @param impFeat_key
     */
    public void setImpFeat_key(java.lang.String impFeat_key) {
        this.impFeat_key = impFeat_key;
    }


    /**
     * Gets the impFeat_loc value for this ImpFeatType.
     * 
     * @return impFeat_loc
     */
    public java.lang.String getImpFeat_loc() {
        return impFeat_loc;
    }


    /**
     * Sets the impFeat_loc value for this ImpFeatType.
     * 
     * @param impFeat_loc
     */
    public void setImpFeat_loc(java.lang.String impFeat_loc) {
        this.impFeat_loc = impFeat_loc;
    }


    /**
     * Gets the impFeat_descr value for this ImpFeatType.
     * 
     * @return impFeat_descr
     */
    public java.lang.String getImpFeat_descr() {
        return impFeat_descr;
    }


    /**
     * Sets the impFeat_descr value for this ImpFeatType.
     * 
     * @param impFeat_descr
     */
    public void setImpFeat_descr(java.lang.String impFeat_descr) {
        this.impFeat_descr = impFeat_descr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImpFeatType)) return false;
        ImpFeatType other = (ImpFeatType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.impFeat_key==null && other.getImpFeat_key()==null) || 
             (this.impFeat_key!=null &&
              this.impFeat_key.equals(other.getImpFeat_key()))) &&
            ((this.impFeat_loc==null && other.getImpFeat_loc()==null) || 
             (this.impFeat_loc!=null &&
              this.impFeat_loc.equals(other.getImpFeat_loc()))) &&
            ((this.impFeat_descr==null && other.getImpFeat_descr()==null) || 
             (this.impFeat_descr!=null &&
              this.impFeat_descr.equals(other.getImpFeat_descr())));
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
        if (getImpFeat_key() != null) {
            _hashCode += getImpFeat_key().hashCode();
        }
        if (getImpFeat_loc() != null) {
            _hashCode += getImpFeat_loc().hashCode();
        }
        if (getImpFeat_descr() != null) {
            _hashCode += getImpFeat_descr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImpFeatType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imp-featType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impFeat_key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imp-feat_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impFeat_loc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imp-feat_loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impFeat_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imp-feat_descr"));
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
