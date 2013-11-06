/**
 * AuthorNotes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AuthorNotes  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label[] label;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Corresp corresp;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn;

    private org.apache.axis.types.Id id;  // attribute

    private org.apache.axis.types.IDRefs rid;  // attribute

    public AuthorNotes() {
    }

    public AuthorNotes(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label[] label,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Corresp corresp,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn,
           org.apache.axis.types.Id id,
           org.apache.axis.types.IDRefs rid) {
           this.label = label;
           this.title = title;
           this.corresp = corresp;
           this.fn = fn;
           this.id = id;
           this.rid = rid;
    }


    /**
     * Gets the label value for this AuthorNotes.
     * 
     * @return label
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label[] getLabel() {
        return label;
    }


    /**
     * Sets the label value for this AuthorNotes.
     * 
     * @param label
     */
    public void setLabel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label[] label) {
        this.label = label;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label getLabel(int i) {
        return this.label[i];
    }

    public void setLabel(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Label _value) {
        this.label[i] = _value;
    }


    /**
     * Gets the title value for this AuthorNotes.
     * 
     * @return title
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title getTitle() {
        return title;
    }


    /**
     * Sets the title value for this AuthorNotes.
     * 
     * @param title
     */
    public void setTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title) {
        this.title = title;
    }


    /**
     * Gets the corresp value for this AuthorNotes.
     * 
     * @return corresp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Corresp getCorresp() {
        return corresp;
    }


    /**
     * Sets the corresp value for this AuthorNotes.
     * 
     * @param corresp
     */
    public void setCorresp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Corresp corresp) {
        this.corresp = corresp;
    }


    /**
     * Gets the fn value for this AuthorNotes.
     * 
     * @return fn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn getFn() {
        return fn;
    }


    /**
     * Sets the fn value for this AuthorNotes.
     * 
     * @param fn
     */
    public void setFn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fn fn) {
        this.fn = fn;
    }


    /**
     * Gets the id value for this AuthorNotes.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this AuthorNotes.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the rid value for this AuthorNotes.
     * 
     * @return rid
     */
    public org.apache.axis.types.IDRefs getRid() {
        return rid;
    }


    /**
     * Sets the rid value for this AuthorNotes.
     * 
     * @param rid
     */
    public void setRid(org.apache.axis.types.IDRefs rid) {
        this.rid = rid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthorNotes)) return false;
        AuthorNotes other = (AuthorNotes) obj;
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
              java.util.Arrays.equals(this.label, other.getLabel()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.corresp==null && other.getCorresp()==null) || 
             (this.corresp!=null &&
              this.corresp.equals(other.getCorresp()))) &&
            ((this.fn==null && other.getFn()==null) || 
             (this.fn!=null &&
              this.fn.equals(other.getFn()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.rid==null && other.getRid()==null) || 
             (this.rid!=null &&
              this.rid.equals(other.getRid())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getCorresp() != null) {
            _hashCode += getCorresp().hashCode();
        }
        if (getFn() != null) {
            _hashCode += getFn().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getRid() != null) {
            _hashCode += getRid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthorNotes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">author-notes"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "rid"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "IDREFS"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corresp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "corresp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">corresp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "fn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">fn"));
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
