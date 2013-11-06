/**
 * PCConformerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCConformerType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_xType PCConformer_x;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_yType PCConformer_y;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_zType PCConformer_z;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_styleType PCConformer_style;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_dataType PCConformer_data;

    public PCConformerType() {
    }

    public PCConformerType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_xType PCConformer_x,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_yType PCConformer_y,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_zType PCConformer_z,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_styleType PCConformer_style,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_dataType PCConformer_data) {
           this.PCConformer_x = PCConformer_x;
           this.PCConformer_y = PCConformer_y;
           this.PCConformer_z = PCConformer_z;
           this.PCConformer_style = PCConformer_style;
           this.PCConformer_data = PCConformer_data;
    }


    /**
     * Gets the PCConformer_x value for this PCConformerType.
     * 
     * @return PCConformer_x
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_xType getPCConformer_x() {
        return PCConformer_x;
    }


    /**
     * Sets the PCConformer_x value for this PCConformerType.
     * 
     * @param PCConformer_x
     */
    public void setPCConformer_x(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_xType PCConformer_x) {
        this.PCConformer_x = PCConformer_x;
    }


    /**
     * Gets the PCConformer_y value for this PCConformerType.
     * 
     * @return PCConformer_y
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_yType getPCConformer_y() {
        return PCConformer_y;
    }


    /**
     * Sets the PCConformer_y value for this PCConformerType.
     * 
     * @param PCConformer_y
     */
    public void setPCConformer_y(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_yType PCConformer_y) {
        this.PCConformer_y = PCConformer_y;
    }


    /**
     * Gets the PCConformer_z value for this PCConformerType.
     * 
     * @return PCConformer_z
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_zType getPCConformer_z() {
        return PCConformer_z;
    }


    /**
     * Sets the PCConformer_z value for this PCConformerType.
     * 
     * @param PCConformer_z
     */
    public void setPCConformer_z(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_zType PCConformer_z) {
        this.PCConformer_z = PCConformer_z;
    }


    /**
     * Gets the PCConformer_style value for this PCConformerType.
     * 
     * @return PCConformer_style
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_styleType getPCConformer_style() {
        return PCConformer_style;
    }


    /**
     * Sets the PCConformer_style value for this PCConformerType.
     * 
     * @param PCConformer_style
     */
    public void setPCConformer_style(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_styleType PCConformer_style) {
        this.PCConformer_style = PCConformer_style;
    }


    /**
     * Gets the PCConformer_data value for this PCConformerType.
     * 
     * @return PCConformer_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_dataType getPCConformer_data() {
        return PCConformer_data;
    }


    /**
     * Sets the PCConformer_data value for this PCConformerType.
     * 
     * @param PCConformer_data
     */
    public void setPCConformer_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCConformer_dataType PCConformer_data) {
        this.PCConformer_data = PCConformer_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCConformerType)) return false;
        PCConformerType other = (PCConformerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCConformer_x==null && other.getPCConformer_x()==null) || 
             (this.PCConformer_x!=null &&
              this.PCConformer_x.equals(other.getPCConformer_x()))) &&
            ((this.PCConformer_y==null && other.getPCConformer_y()==null) || 
             (this.PCConformer_y!=null &&
              this.PCConformer_y.equals(other.getPCConformer_y()))) &&
            ((this.PCConformer_z==null && other.getPCConformer_z()==null) || 
             (this.PCConformer_z!=null &&
              this.PCConformer_z.equals(other.getPCConformer_z()))) &&
            ((this.PCConformer_style==null && other.getPCConformer_style()==null) || 
             (this.PCConformer_style!=null &&
              this.PCConformer_style.equals(other.getPCConformer_style()))) &&
            ((this.PCConformer_data==null && other.getPCConformer_data()==null) || 
             (this.PCConformer_data!=null &&
              this.PCConformer_data.equals(other.getPCConformer_data())));
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
        if (getPCConformer_x() != null) {
            _hashCode += getPCConformer_x().hashCode();
        }
        if (getPCConformer_y() != null) {
            _hashCode += getPCConformer_y().hashCode();
        }
        if (getPCConformer_z() != null) {
            _hashCode += getPCConformer_z().hashCode();
        }
        if (getPCConformer_style() != null) {
            _hashCode += getPCConformer_style().hashCode();
        }
        if (getPCConformer_data() != null) {
            _hashCode += getPCConformer_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCConformerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-ConformerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCConformer_x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_xType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCConformer_y");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_yType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCConformer_z");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_z"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_zType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCConformer_style");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_styleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCConformer_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_dataType"));
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
