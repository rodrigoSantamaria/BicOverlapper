/**
 * Blast4GetProgramsReplyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetProgramsReplyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ProgramInfoType[] blast4ProgramInfo;

    public Blast4GetProgramsReplyType() {
    }

    public Blast4GetProgramsReplyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ProgramInfoType[] blast4ProgramInfo) {
           this.blast4ProgramInfo = blast4ProgramInfo;
    }


    /**
     * Gets the blast4ProgramInfo value for this Blast4GetProgramsReplyType.
     * 
     * @return blast4ProgramInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ProgramInfoType[] getBlast4ProgramInfo() {
        return blast4ProgramInfo;
    }


    /**
     * Sets the blast4ProgramInfo value for this Blast4GetProgramsReplyType.
     * 
     * @param blast4ProgramInfo
     */
    public void setBlast4ProgramInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ProgramInfoType[] blast4ProgramInfo) {
        this.blast4ProgramInfo = blast4ProgramInfo;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ProgramInfoType getBlast4ProgramInfo(int i) {
        return this.blast4ProgramInfo[i];
    }

    public void setBlast4ProgramInfo(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ProgramInfoType _value) {
        this.blast4ProgramInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetProgramsReplyType)) return false;
        Blast4GetProgramsReplyType other = (Blast4GetProgramsReplyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4ProgramInfo==null && other.getBlast4ProgramInfo()==null) || 
             (this.blast4ProgramInfo!=null &&
              java.util.Arrays.equals(this.blast4ProgramInfo, other.getBlast4ProgramInfo())));
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
        if (getBlast4ProgramInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlast4ProgramInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlast4ProgramInfo(), i);
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
        new org.apache.axis.description.TypeDesc(Blast4GetProgramsReplyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-programs-replyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4ProgramInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-program-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-program-infoType"));
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
