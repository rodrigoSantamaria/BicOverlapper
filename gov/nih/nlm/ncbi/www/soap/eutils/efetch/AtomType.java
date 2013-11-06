/**
 * AtomType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AtomType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_idType atom_id;

    private java.lang.String atom_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_iupacCodeType atom_iupacCode;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_elementType atom_element;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_ionizableProtonType atom_ionizableProton;

    public AtomType() {
    }

    public AtomType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_idType atom_id,
           java.lang.String atom_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_iupacCodeType atom_iupacCode,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_elementType atom_element,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_ionizableProtonType atom_ionizableProton) {
           this.atom_id = atom_id;
           this.atom_name = atom_name;
           this.atom_iupacCode = atom_iupacCode;
           this.atom_element = atom_element;
           this.atom_ionizableProton = atom_ionizableProton;
    }


    /**
     * Gets the atom_id value for this AtomType.
     * 
     * @return atom_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_idType getAtom_id() {
        return atom_id;
    }


    /**
     * Sets the atom_id value for this AtomType.
     * 
     * @param atom_id
     */
    public void setAtom_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_idType atom_id) {
        this.atom_id = atom_id;
    }


    /**
     * Gets the atom_name value for this AtomType.
     * 
     * @return atom_name
     */
    public java.lang.String getAtom_name() {
        return atom_name;
    }


    /**
     * Sets the atom_name value for this AtomType.
     * 
     * @param atom_name
     */
    public void setAtom_name(java.lang.String atom_name) {
        this.atom_name = atom_name;
    }


    /**
     * Gets the atom_iupacCode value for this AtomType.
     * 
     * @return atom_iupacCode
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_iupacCodeType getAtom_iupacCode() {
        return atom_iupacCode;
    }


    /**
     * Sets the atom_iupacCode value for this AtomType.
     * 
     * @param atom_iupacCode
     */
    public void setAtom_iupacCode(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_iupacCodeType atom_iupacCode) {
        this.atom_iupacCode = atom_iupacCode;
    }


    /**
     * Gets the atom_element value for this AtomType.
     * 
     * @return atom_element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_elementType getAtom_element() {
        return atom_element;
    }


    /**
     * Sets the atom_element value for this AtomType.
     * 
     * @param atom_element
     */
    public void setAtom_element(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_elementType atom_element) {
        this.atom_element = atom_element;
    }


    /**
     * Gets the atom_ionizableProton value for this AtomType.
     * 
     * @return atom_ionizableProton
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_ionizableProtonType getAtom_ionizableProton() {
        return atom_ionizableProton;
    }


    /**
     * Sets the atom_ionizableProton value for this AtomType.
     * 
     * @param atom_ionizableProton
     */
    public void setAtom_ionizableProton(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Atom_ionizableProtonType atom_ionizableProton) {
        this.atom_ionizableProton = atom_ionizableProton;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtomType)) return false;
        AtomType other = (AtomType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atom_id==null && other.getAtom_id()==null) || 
             (this.atom_id!=null &&
              this.atom_id.equals(other.getAtom_id()))) &&
            ((this.atom_name==null && other.getAtom_name()==null) || 
             (this.atom_name!=null &&
              this.atom_name.equals(other.getAtom_name()))) &&
            ((this.atom_iupacCode==null && other.getAtom_iupacCode()==null) || 
             (this.atom_iupacCode!=null &&
              this.atom_iupacCode.equals(other.getAtom_iupacCode()))) &&
            ((this.atom_element==null && other.getAtom_element()==null) || 
             (this.atom_element!=null &&
              this.atom_element.equals(other.getAtom_element()))) &&
            ((this.atom_ionizableProton==null && other.getAtom_ionizableProton()==null) || 
             (this.atom_ionizableProton!=null &&
              this.atom_ionizableProton.equals(other.getAtom_ionizableProton())));
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
        if (getAtom_id() != null) {
            _hashCode += getAtom_id().hashCode();
        }
        if (getAtom_name() != null) {
            _hashCode += getAtom_name().hashCode();
        }
        if (getAtom_iupacCode() != null) {
            _hashCode += getAtom_iupacCode().hashCode();
        }
        if (getAtom_element() != null) {
            _hashCode += getAtom_element().hashCode();
        }
        if (getAtom_ionizableProton() != null) {
            _hashCode += getAtom_ionizableProton().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtomType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AtomType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atom_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atom_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atom_iupacCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom_iupac-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom_iupac-codeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atom_element");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom_element"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom_elementType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atom_ionizableProton");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom_ionizable-proton"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atom_ionizable-protonType"));
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
