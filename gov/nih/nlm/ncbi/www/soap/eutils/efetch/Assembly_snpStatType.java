/**
 * Assembly_snpStatType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Assembly_snpStatType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_snpStat_mapWeightType assembly_snpStat_mapWeight;

    private java.lang.String assembly_snpStat_chromCount;

    private java.lang.String assembly_snpStat_placedContigCount;

    private java.lang.String assembly_snpStat_unplacedContigCount;

    private java.lang.String assembly_snpStat_seqlocCount;

    private java.lang.String assembly_snpStat_hapCount;

    public Assembly_snpStatType() {
    }

    public Assembly_snpStatType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_snpStat_mapWeightType assembly_snpStat_mapWeight,
           java.lang.String assembly_snpStat_chromCount,
           java.lang.String assembly_snpStat_placedContigCount,
           java.lang.String assembly_snpStat_unplacedContigCount,
           java.lang.String assembly_snpStat_seqlocCount,
           java.lang.String assembly_snpStat_hapCount) {
           this.assembly_snpStat_mapWeight = assembly_snpStat_mapWeight;
           this.assembly_snpStat_chromCount = assembly_snpStat_chromCount;
           this.assembly_snpStat_placedContigCount = assembly_snpStat_placedContigCount;
           this.assembly_snpStat_unplacedContigCount = assembly_snpStat_unplacedContigCount;
           this.assembly_snpStat_seqlocCount = assembly_snpStat_seqlocCount;
           this.assembly_snpStat_hapCount = assembly_snpStat_hapCount;
    }


    /**
     * Gets the assembly_snpStat_mapWeight value for this Assembly_snpStatType.
     * 
     * @return assembly_snpStat_mapWeight
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_snpStat_mapWeightType getAssembly_snpStat_mapWeight() {
        return assembly_snpStat_mapWeight;
    }


    /**
     * Sets the assembly_snpStat_mapWeight value for this Assembly_snpStatType.
     * 
     * @param assembly_snpStat_mapWeight
     */
    public void setAssembly_snpStat_mapWeight(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_snpStat_mapWeightType assembly_snpStat_mapWeight) {
        this.assembly_snpStat_mapWeight = assembly_snpStat_mapWeight;
    }


    /**
     * Gets the assembly_snpStat_chromCount value for this Assembly_snpStatType.
     * 
     * @return assembly_snpStat_chromCount
     */
    public java.lang.String getAssembly_snpStat_chromCount() {
        return assembly_snpStat_chromCount;
    }


    /**
     * Sets the assembly_snpStat_chromCount value for this Assembly_snpStatType.
     * 
     * @param assembly_snpStat_chromCount
     */
    public void setAssembly_snpStat_chromCount(java.lang.String assembly_snpStat_chromCount) {
        this.assembly_snpStat_chromCount = assembly_snpStat_chromCount;
    }


    /**
     * Gets the assembly_snpStat_placedContigCount value for this Assembly_snpStatType.
     * 
     * @return assembly_snpStat_placedContigCount
     */
    public java.lang.String getAssembly_snpStat_placedContigCount() {
        return assembly_snpStat_placedContigCount;
    }


    /**
     * Sets the assembly_snpStat_placedContigCount value for this Assembly_snpStatType.
     * 
     * @param assembly_snpStat_placedContigCount
     */
    public void setAssembly_snpStat_placedContigCount(java.lang.String assembly_snpStat_placedContigCount) {
        this.assembly_snpStat_placedContigCount = assembly_snpStat_placedContigCount;
    }


    /**
     * Gets the assembly_snpStat_unplacedContigCount value for this Assembly_snpStatType.
     * 
     * @return assembly_snpStat_unplacedContigCount
     */
    public java.lang.String getAssembly_snpStat_unplacedContigCount() {
        return assembly_snpStat_unplacedContigCount;
    }


    /**
     * Sets the assembly_snpStat_unplacedContigCount value for this Assembly_snpStatType.
     * 
     * @param assembly_snpStat_unplacedContigCount
     */
    public void setAssembly_snpStat_unplacedContigCount(java.lang.String assembly_snpStat_unplacedContigCount) {
        this.assembly_snpStat_unplacedContigCount = assembly_snpStat_unplacedContigCount;
    }


    /**
     * Gets the assembly_snpStat_seqlocCount value for this Assembly_snpStatType.
     * 
     * @return assembly_snpStat_seqlocCount
     */
    public java.lang.String getAssembly_snpStat_seqlocCount() {
        return assembly_snpStat_seqlocCount;
    }


    /**
     * Sets the assembly_snpStat_seqlocCount value for this Assembly_snpStatType.
     * 
     * @param assembly_snpStat_seqlocCount
     */
    public void setAssembly_snpStat_seqlocCount(java.lang.String assembly_snpStat_seqlocCount) {
        this.assembly_snpStat_seqlocCount = assembly_snpStat_seqlocCount;
    }


    /**
     * Gets the assembly_snpStat_hapCount value for this Assembly_snpStatType.
     * 
     * @return assembly_snpStat_hapCount
     */
    public java.lang.String getAssembly_snpStat_hapCount() {
        return assembly_snpStat_hapCount;
    }


    /**
     * Sets the assembly_snpStat_hapCount value for this Assembly_snpStatType.
     * 
     * @param assembly_snpStat_hapCount
     */
    public void setAssembly_snpStat_hapCount(java.lang.String assembly_snpStat_hapCount) {
        this.assembly_snpStat_hapCount = assembly_snpStat_hapCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Assembly_snpStatType)) return false;
        Assembly_snpStatType other = (Assembly_snpStatType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assembly_snpStat_mapWeight==null && other.getAssembly_snpStat_mapWeight()==null) || 
             (this.assembly_snpStat_mapWeight!=null &&
              this.assembly_snpStat_mapWeight.equals(other.getAssembly_snpStat_mapWeight()))) &&
            ((this.assembly_snpStat_chromCount==null && other.getAssembly_snpStat_chromCount()==null) || 
             (this.assembly_snpStat_chromCount!=null &&
              this.assembly_snpStat_chromCount.equals(other.getAssembly_snpStat_chromCount()))) &&
            ((this.assembly_snpStat_placedContigCount==null && other.getAssembly_snpStat_placedContigCount()==null) || 
             (this.assembly_snpStat_placedContigCount!=null &&
              this.assembly_snpStat_placedContigCount.equals(other.getAssembly_snpStat_placedContigCount()))) &&
            ((this.assembly_snpStat_unplacedContigCount==null && other.getAssembly_snpStat_unplacedContigCount()==null) || 
             (this.assembly_snpStat_unplacedContigCount!=null &&
              this.assembly_snpStat_unplacedContigCount.equals(other.getAssembly_snpStat_unplacedContigCount()))) &&
            ((this.assembly_snpStat_seqlocCount==null && other.getAssembly_snpStat_seqlocCount()==null) || 
             (this.assembly_snpStat_seqlocCount!=null &&
              this.assembly_snpStat_seqlocCount.equals(other.getAssembly_snpStat_seqlocCount()))) &&
            ((this.assembly_snpStat_hapCount==null && other.getAssembly_snpStat_hapCount()==null) || 
             (this.assembly_snpStat_hapCount!=null &&
              this.assembly_snpStat_hapCount.equals(other.getAssembly_snpStat_hapCount())));
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
        if (getAssembly_snpStat_mapWeight() != null) {
            _hashCode += getAssembly_snpStat_mapWeight().hashCode();
        }
        if (getAssembly_snpStat_chromCount() != null) {
            _hashCode += getAssembly_snpStat_chromCount().hashCode();
        }
        if (getAssembly_snpStat_placedContigCount() != null) {
            _hashCode += getAssembly_snpStat_placedContigCount().hashCode();
        }
        if (getAssembly_snpStat_unplacedContigCount() != null) {
            _hashCode += getAssembly_snpStat_unplacedContigCount().hashCode();
        }
        if (getAssembly_snpStat_seqlocCount() != null) {
            _hashCode += getAssembly_snpStat_seqlocCount().hashCode();
        }
        if (getAssembly_snpStat_hapCount() != null) {
            _hashCode += getAssembly_snpStat_hapCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Assembly_snpStatType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_snpStatType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_snpStat_mapWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_snpStat_mapWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_snpStat_mapWeightType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_snpStat_chromCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_snpStat_chromCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_snpStat_placedContigCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_snpStat_placedContigCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_snpStat_unplacedContigCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_snpStat_unplacedContigCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_snpStat_seqlocCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_snpStat_seqlocCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_snpStat_hapCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_snpStat_hapCount"));
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
