/**
 * MSModSpecType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSModSpecType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_modType MSModSpec_mod;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_typeType MSModSpec_type;

    private java.lang.String MSModSpec_name;

    private java.lang.String MSModSpec_monomass;

    private java.lang.String MSModSpec_averagemass;

    private java.lang.String MSModSpec_n15Mass;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_residuesType MSModSpec_residues;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_neutrallossType MSModSpec_neutralloss;

    public MSModSpecType() {
    }

    public MSModSpecType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_modType MSModSpec_mod,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_typeType MSModSpec_type,
           java.lang.String MSModSpec_name,
           java.lang.String MSModSpec_monomass,
           java.lang.String MSModSpec_averagemass,
           java.lang.String MSModSpec_n15Mass,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_residuesType MSModSpec_residues,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_neutrallossType MSModSpec_neutralloss) {
           this.MSModSpec_mod = MSModSpec_mod;
           this.MSModSpec_type = MSModSpec_type;
           this.MSModSpec_name = MSModSpec_name;
           this.MSModSpec_monomass = MSModSpec_monomass;
           this.MSModSpec_averagemass = MSModSpec_averagemass;
           this.MSModSpec_n15Mass = MSModSpec_n15Mass;
           this.MSModSpec_residues = MSModSpec_residues;
           this.MSModSpec_neutralloss = MSModSpec_neutralloss;
    }


    /**
     * Gets the MSModSpec_mod value for this MSModSpecType.
     * 
     * @return MSModSpec_mod
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_modType getMSModSpec_mod() {
        return MSModSpec_mod;
    }


    /**
     * Sets the MSModSpec_mod value for this MSModSpecType.
     * 
     * @param MSModSpec_mod
     */
    public void setMSModSpec_mod(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_modType MSModSpec_mod) {
        this.MSModSpec_mod = MSModSpec_mod;
    }


    /**
     * Gets the MSModSpec_type value for this MSModSpecType.
     * 
     * @return MSModSpec_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_typeType getMSModSpec_type() {
        return MSModSpec_type;
    }


    /**
     * Sets the MSModSpec_type value for this MSModSpecType.
     * 
     * @param MSModSpec_type
     */
    public void setMSModSpec_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_typeType MSModSpec_type) {
        this.MSModSpec_type = MSModSpec_type;
    }


    /**
     * Gets the MSModSpec_name value for this MSModSpecType.
     * 
     * @return MSModSpec_name
     */
    public java.lang.String getMSModSpec_name() {
        return MSModSpec_name;
    }


    /**
     * Sets the MSModSpec_name value for this MSModSpecType.
     * 
     * @param MSModSpec_name
     */
    public void setMSModSpec_name(java.lang.String MSModSpec_name) {
        this.MSModSpec_name = MSModSpec_name;
    }


    /**
     * Gets the MSModSpec_monomass value for this MSModSpecType.
     * 
     * @return MSModSpec_monomass
     */
    public java.lang.String getMSModSpec_monomass() {
        return MSModSpec_monomass;
    }


    /**
     * Sets the MSModSpec_monomass value for this MSModSpecType.
     * 
     * @param MSModSpec_monomass
     */
    public void setMSModSpec_monomass(java.lang.String MSModSpec_monomass) {
        this.MSModSpec_monomass = MSModSpec_monomass;
    }


    /**
     * Gets the MSModSpec_averagemass value for this MSModSpecType.
     * 
     * @return MSModSpec_averagemass
     */
    public java.lang.String getMSModSpec_averagemass() {
        return MSModSpec_averagemass;
    }


    /**
     * Sets the MSModSpec_averagemass value for this MSModSpecType.
     * 
     * @param MSModSpec_averagemass
     */
    public void setMSModSpec_averagemass(java.lang.String MSModSpec_averagemass) {
        this.MSModSpec_averagemass = MSModSpec_averagemass;
    }


    /**
     * Gets the MSModSpec_n15Mass value for this MSModSpecType.
     * 
     * @return MSModSpec_n15Mass
     */
    public java.lang.String getMSModSpec_n15Mass() {
        return MSModSpec_n15Mass;
    }


    /**
     * Sets the MSModSpec_n15Mass value for this MSModSpecType.
     * 
     * @param MSModSpec_n15Mass
     */
    public void setMSModSpec_n15Mass(java.lang.String MSModSpec_n15Mass) {
        this.MSModSpec_n15Mass = MSModSpec_n15Mass;
    }


    /**
     * Gets the MSModSpec_residues value for this MSModSpecType.
     * 
     * @return MSModSpec_residues
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_residuesType getMSModSpec_residues() {
        return MSModSpec_residues;
    }


    /**
     * Sets the MSModSpec_residues value for this MSModSpecType.
     * 
     * @param MSModSpec_residues
     */
    public void setMSModSpec_residues(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_residuesType MSModSpec_residues) {
        this.MSModSpec_residues = MSModSpec_residues;
    }


    /**
     * Gets the MSModSpec_neutralloss value for this MSModSpecType.
     * 
     * @return MSModSpec_neutralloss
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_neutrallossType getMSModSpec_neutralloss() {
        return MSModSpec_neutralloss;
    }


    /**
     * Sets the MSModSpec_neutralloss value for this MSModSpecType.
     * 
     * @param MSModSpec_neutralloss
     */
    public void setMSModSpec_neutralloss(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSModSpec_neutrallossType MSModSpec_neutralloss) {
        this.MSModSpec_neutralloss = MSModSpec_neutralloss;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSModSpecType)) return false;
        MSModSpecType other = (MSModSpecType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSModSpec_mod==null && other.getMSModSpec_mod()==null) || 
             (this.MSModSpec_mod!=null &&
              this.MSModSpec_mod.equals(other.getMSModSpec_mod()))) &&
            ((this.MSModSpec_type==null && other.getMSModSpec_type()==null) || 
             (this.MSModSpec_type!=null &&
              this.MSModSpec_type.equals(other.getMSModSpec_type()))) &&
            ((this.MSModSpec_name==null && other.getMSModSpec_name()==null) || 
             (this.MSModSpec_name!=null &&
              this.MSModSpec_name.equals(other.getMSModSpec_name()))) &&
            ((this.MSModSpec_monomass==null && other.getMSModSpec_monomass()==null) || 
             (this.MSModSpec_monomass!=null &&
              this.MSModSpec_monomass.equals(other.getMSModSpec_monomass()))) &&
            ((this.MSModSpec_averagemass==null && other.getMSModSpec_averagemass()==null) || 
             (this.MSModSpec_averagemass!=null &&
              this.MSModSpec_averagemass.equals(other.getMSModSpec_averagemass()))) &&
            ((this.MSModSpec_n15Mass==null && other.getMSModSpec_n15Mass()==null) || 
             (this.MSModSpec_n15Mass!=null &&
              this.MSModSpec_n15Mass.equals(other.getMSModSpec_n15Mass()))) &&
            ((this.MSModSpec_residues==null && other.getMSModSpec_residues()==null) || 
             (this.MSModSpec_residues!=null &&
              this.MSModSpec_residues.equals(other.getMSModSpec_residues()))) &&
            ((this.MSModSpec_neutralloss==null && other.getMSModSpec_neutralloss()==null) || 
             (this.MSModSpec_neutralloss!=null &&
              this.MSModSpec_neutralloss.equals(other.getMSModSpec_neutralloss())));
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
        if (getMSModSpec_mod() != null) {
            _hashCode += getMSModSpec_mod().hashCode();
        }
        if (getMSModSpec_type() != null) {
            _hashCode += getMSModSpec_type().hashCode();
        }
        if (getMSModSpec_name() != null) {
            _hashCode += getMSModSpec_name().hashCode();
        }
        if (getMSModSpec_monomass() != null) {
            _hashCode += getMSModSpec_monomass().hashCode();
        }
        if (getMSModSpec_averagemass() != null) {
            _hashCode += getMSModSpec_averagemass().hashCode();
        }
        if (getMSModSpec_n15Mass() != null) {
            _hashCode += getMSModSpec_n15Mass().hashCode();
        }
        if (getMSModSpec_residues() != null) {
            _hashCode += getMSModSpec_residues().hashCode();
        }
        if (getMSModSpec_neutralloss() != null) {
            _hashCode += getMSModSpec_neutralloss().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSModSpecType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpecType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModSpec_mod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_mod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_modType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModSpec_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModSpec_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModSpec_monomass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_monomass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModSpec_averagemass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_averagemass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModSpec_n15Mass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_n15mass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModSpec_residues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_residues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_residuesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSModSpec_neutralloss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_neutralloss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSModSpec_neutrallossType"));
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
