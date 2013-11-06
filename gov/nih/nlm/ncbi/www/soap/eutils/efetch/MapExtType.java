/**
 * MapExtType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MapExtType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatType[] seqFeat;

    public MapExtType() {
    }

    public MapExtType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatType[] seqFeat) {
           this.seqFeat = seqFeat;
    }


    /**
     * Gets the seqFeat value for this MapExtType.
     * 
     * @return seqFeat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatType[] getSeqFeat() {
        return seqFeat;
    }


    /**
     * Sets the seqFeat value for this MapExtType.
     * 
     * @param seqFeat
     */
    public void setSeqFeat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatType[] seqFeat) {
        this.seqFeat = seqFeat;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatType getSeqFeat(int i) {
        return this.seqFeat[i];
    }

    public void setSeqFeat(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatType _value) {
        this.seqFeat[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapExtType)) return false;
        MapExtType other = (MapExtType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqFeat==null && other.getSeqFeat()==null) || 
             (this.seqFeat!=null &&
              java.util.Arrays.equals(this.seqFeat, other.getSeqFeat())));
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
        if (getSeqFeat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqFeat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqFeat(), i);
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
        new org.apache.axis.description.TypeDesc(MapExtType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Map-extType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-feat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-featType"));
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
