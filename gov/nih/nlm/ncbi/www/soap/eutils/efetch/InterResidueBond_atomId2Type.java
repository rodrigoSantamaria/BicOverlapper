/**
 * InterResidueBond_atomId2Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class InterResidueBond_atomId2Type  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrType atomPntr;

    public InterResidueBond_atomId2Type() {
    }

    public InterResidueBond_atomId2Type(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrType atomPntr) {
           this.atomPntr = atomPntr;
    }


    /**
     * Gets the atomPntr value for this InterResidueBond_atomId2Type.
     * 
     * @return atomPntr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrType getAtomPntr() {
        return atomPntr;
    }


    /**
     * Sets the atomPntr value for this InterResidueBond_atomId2Type.
     * 
     * @param atomPntr
     */
    public void setAtomPntr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomPntrType atomPntr) {
        this.atomPntr = atomPntr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterResidueBond_atomId2Type)) return false;
        InterResidueBond_atomId2Type other = (InterResidueBond_atomId2Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atomPntr==null && other.getAtomPntr()==null) || 
             (this.atomPntr!=null &&
              this.atomPntr.equals(other.getAtomPntr())));
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
        if (getAtomPntr() != null) {
            _hashCode += getAtomPntr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterResidueBond_atomId2Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Inter-residue-bond_atom-id-2Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomPntr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrType"));
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
