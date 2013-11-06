/**
 * ResiduePntrs_intervalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResiduePntrs_intervalType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntrType[] residueIntervalPntr;

    public ResiduePntrs_intervalType() {
    }

    public ResiduePntrs_intervalType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntrType[] residueIntervalPntr) {
           this.residueIntervalPntr = residueIntervalPntr;
    }


    /**
     * Gets the residueIntervalPntr value for this ResiduePntrs_intervalType.
     * 
     * @return residueIntervalPntr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntrType[] getResidueIntervalPntr() {
        return residueIntervalPntr;
    }


    /**
     * Sets the residueIntervalPntr value for this ResiduePntrs_intervalType.
     * 
     * @param residueIntervalPntr
     */
    public void setResidueIntervalPntr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntrType[] residueIntervalPntr) {
        this.residueIntervalPntr = residueIntervalPntr;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntrType getResidueIntervalPntr(int i) {
        return this.residueIntervalPntr[i];
    }

    public void setResidueIntervalPntr(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueIntervalPntrType _value) {
        this.residueIntervalPntr[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResiduePntrs_intervalType)) return false;
        ResiduePntrs_intervalType other = (ResiduePntrs_intervalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.residueIntervalPntr==null && other.getResidueIntervalPntr()==null) || 
             (this.residueIntervalPntr!=null &&
              java.util.Arrays.equals(this.residueIntervalPntr, other.getResidueIntervalPntr())));
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
        if (getResidueIntervalPntr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResidueIntervalPntr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResidueIntervalPntr(), i);
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
        new org.apache.axis.description.TypeDesc(ResiduePntrs_intervalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-pntrs_intervalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueIntervalPntr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-interval-pntr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-interval-pntrType"));
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
