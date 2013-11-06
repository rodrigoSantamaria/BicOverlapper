/**
 * ComponentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ComponentType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Component_componentTypeType component_componentType;

    private java.lang.String component_ctgId;

    private java.lang.String component_accession;

    private java.lang.String component_name;

    private java.lang.String component_chromosome;

    private java.lang.String component_start;

    private java.lang.String component_end;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Component_orientationType component_orientation;

    private java.lang.String component_gi;

    private java.lang.String component_groupTerm;

    private java.lang.String component_contigLabel;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Component_mapLocType component_mapLoc;

    public ComponentType() {
    }

    public ComponentType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Component_componentTypeType component_componentType,
           java.lang.String component_ctgId,
           java.lang.String component_accession,
           java.lang.String component_name,
           java.lang.String component_chromosome,
           java.lang.String component_start,
           java.lang.String component_end,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Component_orientationType component_orientation,
           java.lang.String component_gi,
           java.lang.String component_groupTerm,
           java.lang.String component_contigLabel,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Component_mapLocType component_mapLoc) {
           this.component_componentType = component_componentType;
           this.component_ctgId = component_ctgId;
           this.component_accession = component_accession;
           this.component_name = component_name;
           this.component_chromosome = component_chromosome;
           this.component_start = component_start;
           this.component_end = component_end;
           this.component_orientation = component_orientation;
           this.component_gi = component_gi;
           this.component_groupTerm = component_groupTerm;
           this.component_contigLabel = component_contigLabel;
           this.component_mapLoc = component_mapLoc;
    }


    /**
     * Gets the component_componentType value for this ComponentType.
     * 
     * @return component_componentType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Component_componentTypeType getComponent_componentType() {
        return component_componentType;
    }


    /**
     * Sets the component_componentType value for this ComponentType.
     * 
     * @param component_componentType
     */
    public void setComponent_componentType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Component_componentTypeType component_componentType) {
        this.component_componentType = component_componentType;
    }


    /**
     * Gets the component_ctgId value for this ComponentType.
     * 
     * @return component_ctgId
     */
    public java.lang.String getComponent_ctgId() {
        return component_ctgId;
    }


    /**
     * Sets the component_ctgId value for this ComponentType.
     * 
     * @param component_ctgId
     */
    public void setComponent_ctgId(java.lang.String component_ctgId) {
        this.component_ctgId = component_ctgId;
    }


    /**
     * Gets the component_accession value for this ComponentType.
     * 
     * @return component_accession
     */
    public java.lang.String getComponent_accession() {
        return component_accession;
    }


    /**
     * Sets the component_accession value for this ComponentType.
     * 
     * @param component_accession
     */
    public void setComponent_accession(java.lang.String component_accession) {
        this.component_accession = component_accession;
    }


    /**
     * Gets the component_name value for this ComponentType.
     * 
     * @return component_name
     */
    public java.lang.String getComponent_name() {
        return component_name;
    }


    /**
     * Sets the component_name value for this ComponentType.
     * 
     * @param component_name
     */
    public void setComponent_name(java.lang.String component_name) {
        this.component_name = component_name;
    }


    /**
     * Gets the component_chromosome value for this ComponentType.
     * 
     * @return component_chromosome
     */
    public java.lang.String getComponent_chromosome() {
        return component_chromosome;
    }


    /**
     * Sets the component_chromosome value for this ComponentType.
     * 
     * @param component_chromosome
     */
    public void setComponent_chromosome(java.lang.String component_chromosome) {
        this.component_chromosome = component_chromosome;
    }


    /**
     * Gets the component_start value for this ComponentType.
     * 
     * @return component_start
     */
    public java.lang.String getComponent_start() {
        return component_start;
    }


    /**
     * Sets the component_start value for this ComponentType.
     * 
     * @param component_start
     */
    public void setComponent_start(java.lang.String component_start) {
        this.component_start = component_start;
    }


    /**
     * Gets the component_end value for this ComponentType.
     * 
     * @return component_end
     */
    public java.lang.String getComponent_end() {
        return component_end;
    }


    /**
     * Sets the component_end value for this ComponentType.
     * 
     * @param component_end
     */
    public void setComponent_end(java.lang.String component_end) {
        this.component_end = component_end;
    }


    /**
     * Gets the component_orientation value for this ComponentType.
     * 
     * @return component_orientation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Component_orientationType getComponent_orientation() {
        return component_orientation;
    }


    /**
     * Sets the component_orientation value for this ComponentType.
     * 
     * @param component_orientation
     */
    public void setComponent_orientation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Component_orientationType component_orientation) {
        this.component_orientation = component_orientation;
    }


    /**
     * Gets the component_gi value for this ComponentType.
     * 
     * @return component_gi
     */
    public java.lang.String getComponent_gi() {
        return component_gi;
    }


    /**
     * Sets the component_gi value for this ComponentType.
     * 
     * @param component_gi
     */
    public void setComponent_gi(java.lang.String component_gi) {
        this.component_gi = component_gi;
    }


    /**
     * Gets the component_groupTerm value for this ComponentType.
     * 
     * @return component_groupTerm
     */
    public java.lang.String getComponent_groupTerm() {
        return component_groupTerm;
    }


    /**
     * Sets the component_groupTerm value for this ComponentType.
     * 
     * @param component_groupTerm
     */
    public void setComponent_groupTerm(java.lang.String component_groupTerm) {
        this.component_groupTerm = component_groupTerm;
    }


    /**
     * Gets the component_contigLabel value for this ComponentType.
     * 
     * @return component_contigLabel
     */
    public java.lang.String getComponent_contigLabel() {
        return component_contigLabel;
    }


    /**
     * Sets the component_contigLabel value for this ComponentType.
     * 
     * @param component_contigLabel
     */
    public void setComponent_contigLabel(java.lang.String component_contigLabel) {
        this.component_contigLabel = component_contigLabel;
    }


    /**
     * Gets the component_mapLoc value for this ComponentType.
     * 
     * @return component_mapLoc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Component_mapLocType getComponent_mapLoc() {
        return component_mapLoc;
    }


    /**
     * Sets the component_mapLoc value for this ComponentType.
     * 
     * @param component_mapLoc
     */
    public void setComponent_mapLoc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Component_mapLocType component_mapLoc) {
        this.component_mapLoc = component_mapLoc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComponentType)) return false;
        ComponentType other = (ComponentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.component_componentType==null && other.getComponent_componentType()==null) || 
             (this.component_componentType!=null &&
              this.component_componentType.equals(other.getComponent_componentType()))) &&
            ((this.component_ctgId==null && other.getComponent_ctgId()==null) || 
             (this.component_ctgId!=null &&
              this.component_ctgId.equals(other.getComponent_ctgId()))) &&
            ((this.component_accession==null && other.getComponent_accession()==null) || 
             (this.component_accession!=null &&
              this.component_accession.equals(other.getComponent_accession()))) &&
            ((this.component_name==null && other.getComponent_name()==null) || 
             (this.component_name!=null &&
              this.component_name.equals(other.getComponent_name()))) &&
            ((this.component_chromosome==null && other.getComponent_chromosome()==null) || 
             (this.component_chromosome!=null &&
              this.component_chromosome.equals(other.getComponent_chromosome()))) &&
            ((this.component_start==null && other.getComponent_start()==null) || 
             (this.component_start!=null &&
              this.component_start.equals(other.getComponent_start()))) &&
            ((this.component_end==null && other.getComponent_end()==null) || 
             (this.component_end!=null &&
              this.component_end.equals(other.getComponent_end()))) &&
            ((this.component_orientation==null && other.getComponent_orientation()==null) || 
             (this.component_orientation!=null &&
              this.component_orientation.equals(other.getComponent_orientation()))) &&
            ((this.component_gi==null && other.getComponent_gi()==null) || 
             (this.component_gi!=null &&
              this.component_gi.equals(other.getComponent_gi()))) &&
            ((this.component_groupTerm==null && other.getComponent_groupTerm()==null) || 
             (this.component_groupTerm!=null &&
              this.component_groupTerm.equals(other.getComponent_groupTerm()))) &&
            ((this.component_contigLabel==null && other.getComponent_contigLabel()==null) || 
             (this.component_contigLabel!=null &&
              this.component_contigLabel.equals(other.getComponent_contigLabel()))) &&
            ((this.component_mapLoc==null && other.getComponent_mapLoc()==null) || 
             (this.component_mapLoc!=null &&
              this.component_mapLoc.equals(other.getComponent_mapLoc())));
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
        if (getComponent_componentType() != null) {
            _hashCode += getComponent_componentType().hashCode();
        }
        if (getComponent_ctgId() != null) {
            _hashCode += getComponent_ctgId().hashCode();
        }
        if (getComponent_accession() != null) {
            _hashCode += getComponent_accession().hashCode();
        }
        if (getComponent_name() != null) {
            _hashCode += getComponent_name().hashCode();
        }
        if (getComponent_chromosome() != null) {
            _hashCode += getComponent_chromosome().hashCode();
        }
        if (getComponent_start() != null) {
            _hashCode += getComponent_start().hashCode();
        }
        if (getComponent_end() != null) {
            _hashCode += getComponent_end().hashCode();
        }
        if (getComponent_orientation() != null) {
            _hashCode += getComponent_orientation().hashCode();
        }
        if (getComponent_gi() != null) {
            _hashCode += getComponent_gi().hashCode();
        }
        if (getComponent_groupTerm() != null) {
            _hashCode += getComponent_groupTerm().hashCode();
        }
        if (getComponent_contigLabel() != null) {
            _hashCode += getComponent_contigLabel().hashCode();
        }
        if (getComponent_mapLoc() != null) {
            _hashCode += getComponent_mapLoc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComponentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ComponentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component_componentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_componentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_componentTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component_ctgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_ctgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component_accession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_accession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component_chromosome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_chromosome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component_end");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component_orientation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_orientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_orientationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component_gi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component_groupTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_groupTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component_contigLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_contigLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component_mapLoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_mapLoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Component_mapLocType"));
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
