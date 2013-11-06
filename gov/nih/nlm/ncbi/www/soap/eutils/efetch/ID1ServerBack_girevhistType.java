/**
 * ID1ServerBack_girevhistType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID1ServerBack_girevhistType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqHistType[] ID1SeqHist;

    public ID1ServerBack_girevhistType() {
    }

    public ID1ServerBack_girevhistType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqHistType[] ID1SeqHist) {
           this.ID1SeqHist = ID1SeqHist;
    }


    /**
     * Gets the ID1SeqHist value for this ID1ServerBack_girevhistType.
     * 
     * @return ID1SeqHist
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqHistType[] getID1SeqHist() {
        return ID1SeqHist;
    }


    /**
     * Sets the ID1SeqHist value for this ID1ServerBack_girevhistType.
     * 
     * @param ID1SeqHist
     */
    public void setID1SeqHist(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqHistType[] ID1SeqHist) {
        this.ID1SeqHist = ID1SeqHist;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqHistType getID1SeqHist(int i) {
        return this.ID1SeqHist[i];
    }

    public void setID1SeqHist(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqHistType _value) {
        this.ID1SeqHist[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID1ServerBack_girevhistType)) return false;
        ID1ServerBack_girevhistType other = (ID1ServerBack_girevhistType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID1SeqHist==null && other.getID1SeqHist()==null) || 
             (this.ID1SeqHist!=null &&
              java.util.Arrays.equals(this.ID1SeqHist, other.getID1SeqHist())));
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
        if (getID1SeqHist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID1SeqHist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID1SeqHist(), i);
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
        new org.apache.axis.description.TypeDesc(ID1ServerBack_girevhistType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-back_girevhistType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID1SeqHist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1Seq-hist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1Seq-histType"));
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
