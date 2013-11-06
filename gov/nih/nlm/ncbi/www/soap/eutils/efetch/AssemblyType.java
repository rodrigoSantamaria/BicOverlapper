/**
 * AssemblyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AssemblyType  implements java.io.Serializable {
    private java.lang.String assembly_dbSnpBuild;

    private java.lang.String assembly_genomeBuild;

    private java.lang.String assembly_groupLabel;

    private java.lang.String assembly_assemblySource;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_currentType assembly_current;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_componentType assembly_component;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_snpStatType assembly_snpStat;

    public AssemblyType() {
    }

    public AssemblyType(
           java.lang.String assembly_dbSnpBuild,
           java.lang.String assembly_genomeBuild,
           java.lang.String assembly_groupLabel,
           java.lang.String assembly_assemblySource,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_currentType assembly_current,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_componentType assembly_component,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_snpStatType assembly_snpStat) {
           this.assembly_dbSnpBuild = assembly_dbSnpBuild;
           this.assembly_genomeBuild = assembly_genomeBuild;
           this.assembly_groupLabel = assembly_groupLabel;
           this.assembly_assemblySource = assembly_assemblySource;
           this.assembly_current = assembly_current;
           this.assembly_component = assembly_component;
           this.assembly_snpStat = assembly_snpStat;
    }


    /**
     * Gets the assembly_dbSnpBuild value for this AssemblyType.
     * 
     * @return assembly_dbSnpBuild
     */
    public java.lang.String getAssembly_dbSnpBuild() {
        return assembly_dbSnpBuild;
    }


    /**
     * Sets the assembly_dbSnpBuild value for this AssemblyType.
     * 
     * @param assembly_dbSnpBuild
     */
    public void setAssembly_dbSnpBuild(java.lang.String assembly_dbSnpBuild) {
        this.assembly_dbSnpBuild = assembly_dbSnpBuild;
    }


    /**
     * Gets the assembly_genomeBuild value for this AssemblyType.
     * 
     * @return assembly_genomeBuild
     */
    public java.lang.String getAssembly_genomeBuild() {
        return assembly_genomeBuild;
    }


    /**
     * Sets the assembly_genomeBuild value for this AssemblyType.
     * 
     * @param assembly_genomeBuild
     */
    public void setAssembly_genomeBuild(java.lang.String assembly_genomeBuild) {
        this.assembly_genomeBuild = assembly_genomeBuild;
    }


    /**
     * Gets the assembly_groupLabel value for this AssemblyType.
     * 
     * @return assembly_groupLabel
     */
    public java.lang.String getAssembly_groupLabel() {
        return assembly_groupLabel;
    }


    /**
     * Sets the assembly_groupLabel value for this AssemblyType.
     * 
     * @param assembly_groupLabel
     */
    public void setAssembly_groupLabel(java.lang.String assembly_groupLabel) {
        this.assembly_groupLabel = assembly_groupLabel;
    }


    /**
     * Gets the assembly_assemblySource value for this AssemblyType.
     * 
     * @return assembly_assemblySource
     */
    public java.lang.String getAssembly_assemblySource() {
        return assembly_assemblySource;
    }


    /**
     * Sets the assembly_assemblySource value for this AssemblyType.
     * 
     * @param assembly_assemblySource
     */
    public void setAssembly_assemblySource(java.lang.String assembly_assemblySource) {
        this.assembly_assemblySource = assembly_assemblySource;
    }


    /**
     * Gets the assembly_current value for this AssemblyType.
     * 
     * @return assembly_current
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_currentType getAssembly_current() {
        return assembly_current;
    }


    /**
     * Sets the assembly_current value for this AssemblyType.
     * 
     * @param assembly_current
     */
    public void setAssembly_current(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_currentType assembly_current) {
        this.assembly_current = assembly_current;
    }


    /**
     * Gets the assembly_component value for this AssemblyType.
     * 
     * @return assembly_component
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_componentType getAssembly_component() {
        return assembly_component;
    }


    /**
     * Sets the assembly_component value for this AssemblyType.
     * 
     * @param assembly_component
     */
    public void setAssembly_component(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_componentType assembly_component) {
        this.assembly_component = assembly_component;
    }


    /**
     * Gets the assembly_snpStat value for this AssemblyType.
     * 
     * @return assembly_snpStat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_snpStatType getAssembly_snpStat() {
        return assembly_snpStat;
    }


    /**
     * Sets the assembly_snpStat value for this AssemblyType.
     * 
     * @param assembly_snpStat
     */
    public void setAssembly_snpStat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Assembly_snpStatType assembly_snpStat) {
        this.assembly_snpStat = assembly_snpStat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssemblyType)) return false;
        AssemblyType other = (AssemblyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assembly_dbSnpBuild==null && other.getAssembly_dbSnpBuild()==null) || 
             (this.assembly_dbSnpBuild!=null &&
              this.assembly_dbSnpBuild.equals(other.getAssembly_dbSnpBuild()))) &&
            ((this.assembly_genomeBuild==null && other.getAssembly_genomeBuild()==null) || 
             (this.assembly_genomeBuild!=null &&
              this.assembly_genomeBuild.equals(other.getAssembly_genomeBuild()))) &&
            ((this.assembly_groupLabel==null && other.getAssembly_groupLabel()==null) || 
             (this.assembly_groupLabel!=null &&
              this.assembly_groupLabel.equals(other.getAssembly_groupLabel()))) &&
            ((this.assembly_assemblySource==null && other.getAssembly_assemblySource()==null) || 
             (this.assembly_assemblySource!=null &&
              this.assembly_assemblySource.equals(other.getAssembly_assemblySource()))) &&
            ((this.assembly_current==null && other.getAssembly_current()==null) || 
             (this.assembly_current!=null &&
              this.assembly_current.equals(other.getAssembly_current()))) &&
            ((this.assembly_component==null && other.getAssembly_component()==null) || 
             (this.assembly_component!=null &&
              this.assembly_component.equals(other.getAssembly_component()))) &&
            ((this.assembly_snpStat==null && other.getAssembly_snpStat()==null) || 
             (this.assembly_snpStat!=null &&
              this.assembly_snpStat.equals(other.getAssembly_snpStat())));
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
        if (getAssembly_dbSnpBuild() != null) {
            _hashCode += getAssembly_dbSnpBuild().hashCode();
        }
        if (getAssembly_genomeBuild() != null) {
            _hashCode += getAssembly_genomeBuild().hashCode();
        }
        if (getAssembly_groupLabel() != null) {
            _hashCode += getAssembly_groupLabel().hashCode();
        }
        if (getAssembly_assemblySource() != null) {
            _hashCode += getAssembly_assemblySource().hashCode();
        }
        if (getAssembly_current() != null) {
            _hashCode += getAssembly_current().hashCode();
        }
        if (getAssembly_component() != null) {
            _hashCode += getAssembly_component().hashCode();
        }
        if (getAssembly_snpStat() != null) {
            _hashCode += getAssembly_snpStat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssemblyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AssemblyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_dbSnpBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_dbSnpBuild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_genomeBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_genomeBuild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_groupLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_groupLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_assemblySource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_assemblySource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_current");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_current"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_currentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_component");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_component"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_componentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly_snpStat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_snpStat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Assembly_snpStatType"));
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
