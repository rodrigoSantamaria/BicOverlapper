/**
 * DefItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DefItem  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Term[] term;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Def def;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x;

    private org.apache.axis.types.Id id;  // attribute

    public DefItem() {
    }

    public DefItem(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Term[] term,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Def def,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x,
           org.apache.axis.types.Id id) {
           this.label = label;
           this.term = term;
           this.def = def;
           this.x = x;
           this.id = id;
    }


    /**
     * Gets the label value for this DefItem.
     * 
     * @return label
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DefItem.
     * 
     * @param label
     */
    public void setLabel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label label) {
        this.label = label;
    }


    /**
     * Gets the term value for this DefItem.
     * 
     * @return term
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Term[] getTerm() {
        return term;
    }


    /**
     * Sets the term value for this DefItem.
     * 
     * @param term
     */
    public void setTerm(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Term[] term) {
        this.term = term;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Term getTerm(int i) {
        return this.term[i];
    }

    public void setTerm(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Term _value) {
        this.term[i] = _value;
    }


    /**
     * Gets the def value for this DefItem.
     * 
     * @return def
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Def getDef() {
        return def;
    }


    /**
     * Sets the def value for this DefItem.
     * 
     * @param def
     */
    public void setDef(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Def def) {
        this.def = def;
    }


    /**
     * Gets the x value for this DefItem.
     * 
     * @return x
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.X getX() {
        return x;
    }


    /**
     * Sets the x value for this DefItem.
     * 
     * @param x
     */
    public void setX(gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x) {
        this.x = x;
    }


    /**
     * Gets the id value for this DefItem.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this DefItem.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefItem)) return false;
        DefItem other = (DefItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.term==null && other.getTerm()==null) || 
             (this.term!=null &&
              java.util.Arrays.equals(this.term, other.getTerm()))) &&
            ((this.def==null && other.getDef()==null) || 
             (this.def!=null &&
              this.def.equals(other.getDef()))) &&
            ((this.x==null && other.getX()==null) || 
             (this.x!=null &&
              this.x.equals(other.getX()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getTerm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTerm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTerm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDef() != null) {
            _hashCode += getDef().hashCode();
        }
        if (getX() != null) {
            _hashCode += getX().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DefItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">def-item"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("term");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "term"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("def");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "def"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">def"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">x"));
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
