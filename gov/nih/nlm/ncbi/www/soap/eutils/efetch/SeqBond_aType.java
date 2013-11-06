/**
 * SeqBond_aType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqBond_aType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPointType seqPoint;

    public SeqBond_aType() {
    }

    public SeqBond_aType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPointType seqPoint) {
           this.seqPoint = seqPoint;
    }


    /**
     * Gets the seqPoint value for this SeqBond_aType.
     * 
     * @return seqPoint
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPointType getSeqPoint() {
        return seqPoint;
    }


    /**
     * Sets the seqPoint value for this SeqBond_aType.
     * 
     * @param seqPoint
     */
    public void setSeqPoint(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPointType seqPoint) {
        this.seqPoint = seqPoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqBond_aType)) return false;
        SeqBond_aType other = (SeqBond_aType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqPoint==null && other.getSeqPoint()==null) || 
             (this.seqPoint!=null &&
              this.seqPoint.equals(other.getSeqPoint())));
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
        if (getSeqPoint() != null) {
            _hashCode += getSeqPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqBond_aType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-bond_aType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-pointType"));
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
