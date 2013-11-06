/**
 * MoveType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MoveType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Move_rotateType move_rotate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Move_translateType move_translate;

    public MoveType() {
    }

    public MoveType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Move_rotateType move_rotate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Move_translateType move_translate) {
           this.move_rotate = move_rotate;
           this.move_translate = move_translate;
    }


    /**
     * Gets the move_rotate value for this MoveType.
     * 
     * @return move_rotate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Move_rotateType getMove_rotate() {
        return move_rotate;
    }


    /**
     * Sets the move_rotate value for this MoveType.
     * 
     * @param move_rotate
     */
    public void setMove_rotate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Move_rotateType move_rotate) {
        this.move_rotate = move_rotate;
    }


    /**
     * Gets the move_translate value for this MoveType.
     * 
     * @return move_translate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Move_translateType getMove_translate() {
        return move_translate;
    }


    /**
     * Sets the move_translate value for this MoveType.
     * 
     * @param move_translate
     */
    public void setMove_translate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Move_translateType move_translate) {
        this.move_translate = move_translate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoveType)) return false;
        MoveType other = (MoveType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.move_rotate==null && other.getMove_rotate()==null) || 
             (this.move_rotate!=null &&
              this.move_rotate.equals(other.getMove_rotate()))) &&
            ((this.move_translate==null && other.getMove_translate()==null) || 
             (this.move_translate!=null &&
              this.move_translate.equals(other.getMove_translate())));
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
        if (getMove_rotate() != null) {
            _hashCode += getMove_rotate().hashCode();
        }
        if (getMove_translate() != null) {
            _hashCode += getMove_translate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoveType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MoveType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("move_rotate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Move_rotate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Move_rotateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("move_translate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Move_translate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Move_translateType"));
        elemField.setMinOccurs(0);
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
