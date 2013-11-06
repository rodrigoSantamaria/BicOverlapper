/**
 * AtomPntrs_atomIdsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AtomPntrs_atomIdsType  implements java.io.Serializable {
    private java.lang.String[] atomId;

    public AtomPntrs_atomIdsType() {
    }

    public AtomPntrs_atomIdsType(
           java.lang.String[] atomId) {
           this.atomId = atomId;
    }


    /**
     * Gets the atomId value for this AtomPntrs_atomIdsType.
     * 
     * @return atomId
     */
    public java.lang.String[] getAtomId() {
        return atomId;
    }


    /**
     * Sets the atomId value for this AtomPntrs_atomIdsType.
     * 
     * @param atomId
     */
    public void setAtomId(java.lang.String[] atomId) {
        this.atomId = atomId;
    }

    public java.lang.String getAtomId(int i) {
        return this.atomId[i];
    }

    public void setAtomId(int i, java.lang.String _value) {
        this.atomId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtomPntrs_atomIdsType)) return false;
        AtomPntrs_atomIdsType other = (AtomPntrs_atomIdsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atomId==null && other.getAtomId()==null) || 
             (this.atomId!=null &&
              java.util.Arrays.equals(this.atomId, other.getAtomId())));
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
        if (getAtomId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAtomId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAtomId(), i);
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
        new org.apache.axis.description.TypeDesc(AtomPntrs_atomIdsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-pntrs_atom-idsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom-id"));
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
