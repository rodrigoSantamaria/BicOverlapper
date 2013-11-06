/**
 * PhysicalDescriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PhysicalDescriptionType  implements java.io.Serializable {
    private java.lang.String[] form;

    private java.lang.String[] extent;

    private java.lang.String runtime;

    private java.lang.String chapterPgn;

    public PhysicalDescriptionType() {
    }

    public PhysicalDescriptionType(
           java.lang.String[] form,
           java.lang.String[] extent,
           java.lang.String runtime,
           java.lang.String chapterPgn) {
           this.form = form;
           this.extent = extent;
           this.runtime = runtime;
           this.chapterPgn = chapterPgn;
    }


    /**
     * Gets the form value for this PhysicalDescriptionType.
     * 
     * @return form
     */
    public java.lang.String[] getForm() {
        return form;
    }


    /**
     * Sets the form value for this PhysicalDescriptionType.
     * 
     * @param form
     */
    public void setForm(java.lang.String[] form) {
        this.form = form;
    }

    public java.lang.String getForm(int i) {
        return this.form[i];
    }

    public void setForm(int i, java.lang.String _value) {
        this.form[i] = _value;
    }


    /**
     * Gets the extent value for this PhysicalDescriptionType.
     * 
     * @return extent
     */
    public java.lang.String[] getExtent() {
        return extent;
    }


    /**
     * Sets the extent value for this PhysicalDescriptionType.
     * 
     * @param extent
     */
    public void setExtent(java.lang.String[] extent) {
        this.extent = extent;
    }

    public java.lang.String getExtent(int i) {
        return this.extent[i];
    }

    public void setExtent(int i, java.lang.String _value) {
        this.extent[i] = _value;
    }


    /**
     * Gets the runtime value for this PhysicalDescriptionType.
     * 
     * @return runtime
     */
    public java.lang.String getRuntime() {
        return runtime;
    }


    /**
     * Sets the runtime value for this PhysicalDescriptionType.
     * 
     * @param runtime
     */
    public void setRuntime(java.lang.String runtime) {
        this.runtime = runtime;
    }


    /**
     * Gets the chapterPgn value for this PhysicalDescriptionType.
     * 
     * @return chapterPgn
     */
    public java.lang.String getChapterPgn() {
        return chapterPgn;
    }


    /**
     * Sets the chapterPgn value for this PhysicalDescriptionType.
     * 
     * @param chapterPgn
     */
    public void setChapterPgn(java.lang.String chapterPgn) {
        this.chapterPgn = chapterPgn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhysicalDescriptionType)) return false;
        PhysicalDescriptionType other = (PhysicalDescriptionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.form==null && other.getForm()==null) || 
             (this.form!=null &&
              java.util.Arrays.equals(this.form, other.getForm()))) &&
            ((this.extent==null && other.getExtent()==null) || 
             (this.extent!=null &&
              java.util.Arrays.equals(this.extent, other.getExtent()))) &&
            ((this.runtime==null && other.getRuntime()==null) || 
             (this.runtime!=null &&
              this.runtime.equals(other.getRuntime()))) &&
            ((this.chapterPgn==null && other.getChapterPgn()==null) || 
             (this.chapterPgn!=null &&
              this.chapterPgn.equals(other.getChapterPgn())));
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
        if (getForm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRuntime() != null) {
            _hashCode += getRuntime().hashCode();
        }
        if (getChapterPgn() != null) {
            _hashCode += getChapterPgn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhysicalDescriptionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PhysicalDescriptionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("form");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Form"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Form"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Extent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Extent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runtime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Runtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chapterPgn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ChapterPgn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
