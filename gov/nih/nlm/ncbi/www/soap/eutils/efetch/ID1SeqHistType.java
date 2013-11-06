/**
 * ID1SeqHistType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID1SeqHistType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqHist_histType ID1SeqHist_hist;

    public ID1SeqHistType() {
    }

    public ID1SeqHistType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqHist_histType ID1SeqHist_hist) {
           this.ID1SeqHist_hist = ID1SeqHist_hist;
    }


    /**
     * Gets the ID1SeqHist_hist value for this ID1SeqHistType.
     * 
     * @return ID1SeqHist_hist
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqHist_histType getID1SeqHist_hist() {
        return ID1SeqHist_hist;
    }


    /**
     * Sets the ID1SeqHist_hist value for this ID1SeqHistType.
     * 
     * @param ID1SeqHist_hist
     */
    public void setID1SeqHist_hist(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqHist_histType ID1SeqHist_hist) {
        this.ID1SeqHist_hist = ID1SeqHist_hist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID1SeqHistType)) return false;
        ID1SeqHistType other = (ID1SeqHistType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID1SeqHist_hist==null && other.getID1SeqHist_hist()==null) || 
             (this.ID1SeqHist_hist!=null &&
              this.ID1SeqHist_hist.equals(other.getID1SeqHist_hist())));
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
        if (getID1SeqHist_hist() != null) {
            _hashCode += getID1SeqHist_hist().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID1SeqHistType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1Seq-histType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID1SeqHist_hist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1Seq-hist_hist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1Seq-hist_histType"));
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
