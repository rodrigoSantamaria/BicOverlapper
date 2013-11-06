/**
 * CoreBlockType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CoreBlockType  implements java.io.Serializable {
    private java.lang.String coreBlock_start;

    private java.lang.String coreBlock_stop;

    private java.lang.String coreBlock_minstart;

    private java.lang.String coreBlock_maxstop;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreBlock_propertyType coreBlock_property;

    public CoreBlockType() {
    }

    public CoreBlockType(
           java.lang.String coreBlock_start,
           java.lang.String coreBlock_stop,
           java.lang.String coreBlock_minstart,
           java.lang.String coreBlock_maxstop,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreBlock_propertyType coreBlock_property) {
           this.coreBlock_start = coreBlock_start;
           this.coreBlock_stop = coreBlock_stop;
           this.coreBlock_minstart = coreBlock_minstart;
           this.coreBlock_maxstop = coreBlock_maxstop;
           this.coreBlock_property = coreBlock_property;
    }


    /**
     * Gets the coreBlock_start value for this CoreBlockType.
     * 
     * @return coreBlock_start
     */
    public java.lang.String getCoreBlock_start() {
        return coreBlock_start;
    }


    /**
     * Sets the coreBlock_start value for this CoreBlockType.
     * 
     * @param coreBlock_start
     */
    public void setCoreBlock_start(java.lang.String coreBlock_start) {
        this.coreBlock_start = coreBlock_start;
    }


    /**
     * Gets the coreBlock_stop value for this CoreBlockType.
     * 
     * @return coreBlock_stop
     */
    public java.lang.String getCoreBlock_stop() {
        return coreBlock_stop;
    }


    /**
     * Sets the coreBlock_stop value for this CoreBlockType.
     * 
     * @param coreBlock_stop
     */
    public void setCoreBlock_stop(java.lang.String coreBlock_stop) {
        this.coreBlock_stop = coreBlock_stop;
    }


    /**
     * Gets the coreBlock_minstart value for this CoreBlockType.
     * 
     * @return coreBlock_minstart
     */
    public java.lang.String getCoreBlock_minstart() {
        return coreBlock_minstart;
    }


    /**
     * Sets the coreBlock_minstart value for this CoreBlockType.
     * 
     * @param coreBlock_minstart
     */
    public void setCoreBlock_minstart(java.lang.String coreBlock_minstart) {
        this.coreBlock_minstart = coreBlock_minstart;
    }


    /**
     * Gets the coreBlock_maxstop value for this CoreBlockType.
     * 
     * @return coreBlock_maxstop
     */
    public java.lang.String getCoreBlock_maxstop() {
        return coreBlock_maxstop;
    }


    /**
     * Sets the coreBlock_maxstop value for this CoreBlockType.
     * 
     * @param coreBlock_maxstop
     */
    public void setCoreBlock_maxstop(java.lang.String coreBlock_maxstop) {
        this.coreBlock_maxstop = coreBlock_maxstop;
    }


    /**
     * Gets the coreBlock_property value for this CoreBlockType.
     * 
     * @return coreBlock_property
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreBlock_propertyType getCoreBlock_property() {
        return coreBlock_property;
    }


    /**
     * Sets the coreBlock_property value for this CoreBlockType.
     * 
     * @param coreBlock_property
     */
    public void setCoreBlock_property(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreBlock_propertyType coreBlock_property) {
        this.coreBlock_property = coreBlock_property;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoreBlockType)) return false;
        CoreBlockType other = (CoreBlockType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coreBlock_start==null && other.getCoreBlock_start()==null) || 
             (this.coreBlock_start!=null &&
              this.coreBlock_start.equals(other.getCoreBlock_start()))) &&
            ((this.coreBlock_stop==null && other.getCoreBlock_stop()==null) || 
             (this.coreBlock_stop!=null &&
              this.coreBlock_stop.equals(other.getCoreBlock_stop()))) &&
            ((this.coreBlock_minstart==null && other.getCoreBlock_minstart()==null) || 
             (this.coreBlock_minstart!=null &&
              this.coreBlock_minstart.equals(other.getCoreBlock_minstart()))) &&
            ((this.coreBlock_maxstop==null && other.getCoreBlock_maxstop()==null) || 
             (this.coreBlock_maxstop!=null &&
              this.coreBlock_maxstop.equals(other.getCoreBlock_maxstop()))) &&
            ((this.coreBlock_property==null && other.getCoreBlock_property()==null) || 
             (this.coreBlock_property!=null &&
              this.coreBlock_property.equals(other.getCoreBlock_property())));
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
        if (getCoreBlock_start() != null) {
            _hashCode += getCoreBlock_start().hashCode();
        }
        if (getCoreBlock_stop() != null) {
            _hashCode += getCoreBlock_stop().hashCode();
        }
        if (getCoreBlock_minstart() != null) {
            _hashCode += getCoreBlock_minstart().hashCode();
        }
        if (getCoreBlock_maxstop() != null) {
            _hashCode += getCoreBlock_maxstop().hashCode();
        }
        if (getCoreBlock_property() != null) {
            _hashCode += getCoreBlock_property().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CoreBlockType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreBlockType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreBlock_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreBlock_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreBlock_stop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreBlock_stop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreBlock_minstart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreBlock_minstart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreBlock_maxstop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreBlock_maxstop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreBlock_property");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreBlock_property"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreBlock_propertyType"));
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
