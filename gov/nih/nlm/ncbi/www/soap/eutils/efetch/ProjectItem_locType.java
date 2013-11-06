/**
 * ProjectItem_locType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ProjectItem_locType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLocType[] seqLoc;

    public ProjectItem_locType() {
    }

    public ProjectItem_locType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLocType[] seqLoc) {
           this.seqLoc = seqLoc;
    }


    /**
     * Gets the seqLoc value for this ProjectItem_locType.
     * 
     * @return seqLoc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLocType[] getSeqLoc() {
        return seqLoc;
    }


    /**
     * Sets the seqLoc value for this ProjectItem_locType.
     * 
     * @param seqLoc
     */
    public void setSeqLoc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLocType[] seqLoc) {
        this.seqLoc = seqLoc;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLocType getSeqLoc(int i) {
        return this.seqLoc[i];
    }

    public void setSeqLoc(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLocType _value) {
        this.seqLoc[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectItem_locType)) return false;
        ProjectItem_locType other = (ProjectItem_locType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqLoc==null && other.getSeqLoc()==null) || 
             (this.seqLoc!=null &&
              java.util.Arrays.equals(this.seqLoc, other.getSeqLoc())));
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
        if (getSeqLoc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqLoc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqLoc(), i);
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
        new org.apache.axis.description.TypeDesc(ProjectItem_locType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Project-item_locType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqLoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-locType"));
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
