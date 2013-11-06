/**
 * ChemGraphPntrs_atomsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ChemGraphPntrs_atomsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrsType atomPntrs;

    public ChemGraphPntrs_atomsType() {
    }

    public ChemGraphPntrs_atomsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrsType atomPntrs) {
           this.atomPntrs = atomPntrs;
    }


    /**
     * Gets the atomPntrs value for this ChemGraphPntrs_atomsType.
     * 
     * @return atomPntrs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrsType getAtomPntrs() {
        return atomPntrs;
    }


    /**
     * Sets the atomPntrs value for this ChemGraphPntrs_atomsType.
     * 
     * @param atomPntrs
     */
    public void setAtomPntrs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrsType atomPntrs) {
        this.atomPntrs = atomPntrs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChemGraphPntrs_atomsType)) return false;
        ChemGraphPntrs_atomsType other = (ChemGraphPntrs_atomsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atomPntrs==null && other.getAtomPntrs()==null) || 
             (this.atomPntrs!=null &&
              this.atomPntrs.equals(other.getAtomPntrs())));
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
        if (getAtomPntrs() != null) {
            _hashCode += getAtomPntrs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChemGraphPntrs_atomsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-pntrs_atomsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomPntrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrsType"));
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
