/**
 * ResidueGraph_atomsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResidueGraph_atomsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomType[] atom;

    public ResidueGraph_atomsType() {
    }

    public ResidueGraph_atomsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomType[] atom) {
           this.atom = atom;
    }


    /**
     * Gets the atom value for this ResidueGraph_atomsType.
     * 
     * @return atom
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomType[] getAtom() {
        return atom;
    }


    /**
     * Sets the atom value for this ResidueGraph_atomsType.
     * 
     * @param atom
     */
    public void setAtom(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomType[] atom) {
        this.atom = atom;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomType getAtom(int i) {
        return this.atom[i];
    }

    public void setAtom(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomType _value) {
        this.atom[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResidueGraph_atomsType)) return false;
        ResidueGraph_atomsType other = (ResidueGraph_atomsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atom==null && other.getAtom()==null) || 
             (this.atom!=null &&
              java.util.Arrays.equals(this.atom, other.getAtom())));
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
        if (getAtom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAtom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAtom(), i);
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
        new org.apache.axis.description.TypeDesc(ResidueGraph_atomsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph_atomsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AtomType"));
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
