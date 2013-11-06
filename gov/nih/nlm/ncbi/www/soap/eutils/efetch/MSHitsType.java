/**
 * MSHitsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSHitsType  implements java.io.Serializable {
    private java.lang.String MSHits_evalue;

    private java.lang.String MSHits_pvalue;

    private java.lang.String MSHits_charge;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHits_pephitsType MSHits_pephits;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHits_mzhitsType MSHits_mzhits;

    private java.lang.String MSHits_pepstring;

    private java.lang.String MSHits_mass;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHits_modsType MSHits_mods;

    private java.lang.String MSHits_pepstart;

    private java.lang.String MSHits_pepstop;

    private java.lang.String MSHits_protlength;

    private java.lang.String MSHits_theomass;

    private java.lang.String MSHits_oid;

    public MSHitsType() {
    }

    public MSHitsType(
           java.lang.String MSHits_evalue,
           java.lang.String MSHits_pvalue,
           java.lang.String MSHits_charge,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHits_pephitsType MSHits_pephits,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHits_mzhitsType MSHits_mzhits,
           java.lang.String MSHits_pepstring,
           java.lang.String MSHits_mass,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHits_modsType MSHits_mods,
           java.lang.String MSHits_pepstart,
           java.lang.String MSHits_pepstop,
           java.lang.String MSHits_protlength,
           java.lang.String MSHits_theomass,
           java.lang.String MSHits_oid) {
           this.MSHits_evalue = MSHits_evalue;
           this.MSHits_pvalue = MSHits_pvalue;
           this.MSHits_charge = MSHits_charge;
           this.MSHits_pephits = MSHits_pephits;
           this.MSHits_mzhits = MSHits_mzhits;
           this.MSHits_pepstring = MSHits_pepstring;
           this.MSHits_mass = MSHits_mass;
           this.MSHits_mods = MSHits_mods;
           this.MSHits_pepstart = MSHits_pepstart;
           this.MSHits_pepstop = MSHits_pepstop;
           this.MSHits_protlength = MSHits_protlength;
           this.MSHits_theomass = MSHits_theomass;
           this.MSHits_oid = MSHits_oid;
    }


    /**
     * Gets the MSHits_evalue value for this MSHitsType.
     * 
     * @return MSHits_evalue
     */
    public java.lang.String getMSHits_evalue() {
        return MSHits_evalue;
    }


    /**
     * Sets the MSHits_evalue value for this MSHitsType.
     * 
     * @param MSHits_evalue
     */
    public void setMSHits_evalue(java.lang.String MSHits_evalue) {
        this.MSHits_evalue = MSHits_evalue;
    }


    /**
     * Gets the MSHits_pvalue value for this MSHitsType.
     * 
     * @return MSHits_pvalue
     */
    public java.lang.String getMSHits_pvalue() {
        return MSHits_pvalue;
    }


    /**
     * Sets the MSHits_pvalue value for this MSHitsType.
     * 
     * @param MSHits_pvalue
     */
    public void setMSHits_pvalue(java.lang.String MSHits_pvalue) {
        this.MSHits_pvalue = MSHits_pvalue;
    }


    /**
     * Gets the MSHits_charge value for this MSHitsType.
     * 
     * @return MSHits_charge
     */
    public java.lang.String getMSHits_charge() {
        return MSHits_charge;
    }


    /**
     * Sets the MSHits_charge value for this MSHitsType.
     * 
     * @param MSHits_charge
     */
    public void setMSHits_charge(java.lang.String MSHits_charge) {
        this.MSHits_charge = MSHits_charge;
    }


    /**
     * Gets the MSHits_pephits value for this MSHitsType.
     * 
     * @return MSHits_pephits
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHits_pephitsType getMSHits_pephits() {
        return MSHits_pephits;
    }


    /**
     * Sets the MSHits_pephits value for this MSHitsType.
     * 
     * @param MSHits_pephits
     */
    public void setMSHits_pephits(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHits_pephitsType MSHits_pephits) {
        this.MSHits_pephits = MSHits_pephits;
    }


    /**
     * Gets the MSHits_mzhits value for this MSHitsType.
     * 
     * @return MSHits_mzhits
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHits_mzhitsType getMSHits_mzhits() {
        return MSHits_mzhits;
    }


    /**
     * Sets the MSHits_mzhits value for this MSHitsType.
     * 
     * @param MSHits_mzhits
     */
    public void setMSHits_mzhits(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHits_mzhitsType MSHits_mzhits) {
        this.MSHits_mzhits = MSHits_mzhits;
    }


    /**
     * Gets the MSHits_pepstring value for this MSHitsType.
     * 
     * @return MSHits_pepstring
     */
    public java.lang.String getMSHits_pepstring() {
        return MSHits_pepstring;
    }


    /**
     * Sets the MSHits_pepstring value for this MSHitsType.
     * 
     * @param MSHits_pepstring
     */
    public void setMSHits_pepstring(java.lang.String MSHits_pepstring) {
        this.MSHits_pepstring = MSHits_pepstring;
    }


    /**
     * Gets the MSHits_mass value for this MSHitsType.
     * 
     * @return MSHits_mass
     */
    public java.lang.String getMSHits_mass() {
        return MSHits_mass;
    }


    /**
     * Sets the MSHits_mass value for this MSHitsType.
     * 
     * @param MSHits_mass
     */
    public void setMSHits_mass(java.lang.String MSHits_mass) {
        this.MSHits_mass = MSHits_mass;
    }


    /**
     * Gets the MSHits_mods value for this MSHitsType.
     * 
     * @return MSHits_mods
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHits_modsType getMSHits_mods() {
        return MSHits_mods;
    }


    /**
     * Sets the MSHits_mods value for this MSHitsType.
     * 
     * @param MSHits_mods
     */
    public void setMSHits_mods(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSHits_modsType MSHits_mods) {
        this.MSHits_mods = MSHits_mods;
    }


    /**
     * Gets the MSHits_pepstart value for this MSHitsType.
     * 
     * @return MSHits_pepstart
     */
    public java.lang.String getMSHits_pepstart() {
        return MSHits_pepstart;
    }


    /**
     * Sets the MSHits_pepstart value for this MSHitsType.
     * 
     * @param MSHits_pepstart
     */
    public void setMSHits_pepstart(java.lang.String MSHits_pepstart) {
        this.MSHits_pepstart = MSHits_pepstart;
    }


    /**
     * Gets the MSHits_pepstop value for this MSHitsType.
     * 
     * @return MSHits_pepstop
     */
    public java.lang.String getMSHits_pepstop() {
        return MSHits_pepstop;
    }


    /**
     * Sets the MSHits_pepstop value for this MSHitsType.
     * 
     * @param MSHits_pepstop
     */
    public void setMSHits_pepstop(java.lang.String MSHits_pepstop) {
        this.MSHits_pepstop = MSHits_pepstop;
    }


    /**
     * Gets the MSHits_protlength value for this MSHitsType.
     * 
     * @return MSHits_protlength
     */
    public java.lang.String getMSHits_protlength() {
        return MSHits_protlength;
    }


    /**
     * Sets the MSHits_protlength value for this MSHitsType.
     * 
     * @param MSHits_protlength
     */
    public void setMSHits_protlength(java.lang.String MSHits_protlength) {
        this.MSHits_protlength = MSHits_protlength;
    }


    /**
     * Gets the MSHits_theomass value for this MSHitsType.
     * 
     * @return MSHits_theomass
     */
    public java.lang.String getMSHits_theomass() {
        return MSHits_theomass;
    }


    /**
     * Sets the MSHits_theomass value for this MSHitsType.
     * 
     * @param MSHits_theomass
     */
    public void setMSHits_theomass(java.lang.String MSHits_theomass) {
        this.MSHits_theomass = MSHits_theomass;
    }


    /**
     * Gets the MSHits_oid value for this MSHitsType.
     * 
     * @return MSHits_oid
     */
    public java.lang.String getMSHits_oid() {
        return MSHits_oid;
    }


    /**
     * Sets the MSHits_oid value for this MSHitsType.
     * 
     * @param MSHits_oid
     */
    public void setMSHits_oid(java.lang.String MSHits_oid) {
        this.MSHits_oid = MSHits_oid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSHitsType)) return false;
        MSHitsType other = (MSHitsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSHits_evalue==null && other.getMSHits_evalue()==null) || 
             (this.MSHits_evalue!=null &&
              this.MSHits_evalue.equals(other.getMSHits_evalue()))) &&
            ((this.MSHits_pvalue==null && other.getMSHits_pvalue()==null) || 
             (this.MSHits_pvalue!=null &&
              this.MSHits_pvalue.equals(other.getMSHits_pvalue()))) &&
            ((this.MSHits_charge==null && other.getMSHits_charge()==null) || 
             (this.MSHits_charge!=null &&
              this.MSHits_charge.equals(other.getMSHits_charge()))) &&
            ((this.MSHits_pephits==null && other.getMSHits_pephits()==null) || 
             (this.MSHits_pephits!=null &&
              this.MSHits_pephits.equals(other.getMSHits_pephits()))) &&
            ((this.MSHits_mzhits==null && other.getMSHits_mzhits()==null) || 
             (this.MSHits_mzhits!=null &&
              this.MSHits_mzhits.equals(other.getMSHits_mzhits()))) &&
            ((this.MSHits_pepstring==null && other.getMSHits_pepstring()==null) || 
             (this.MSHits_pepstring!=null &&
              this.MSHits_pepstring.equals(other.getMSHits_pepstring()))) &&
            ((this.MSHits_mass==null && other.getMSHits_mass()==null) || 
             (this.MSHits_mass!=null &&
              this.MSHits_mass.equals(other.getMSHits_mass()))) &&
            ((this.MSHits_mods==null && other.getMSHits_mods()==null) || 
             (this.MSHits_mods!=null &&
              this.MSHits_mods.equals(other.getMSHits_mods()))) &&
            ((this.MSHits_pepstart==null && other.getMSHits_pepstart()==null) || 
             (this.MSHits_pepstart!=null &&
              this.MSHits_pepstart.equals(other.getMSHits_pepstart()))) &&
            ((this.MSHits_pepstop==null && other.getMSHits_pepstop()==null) || 
             (this.MSHits_pepstop!=null &&
              this.MSHits_pepstop.equals(other.getMSHits_pepstop()))) &&
            ((this.MSHits_protlength==null && other.getMSHits_protlength()==null) || 
             (this.MSHits_protlength!=null &&
              this.MSHits_protlength.equals(other.getMSHits_protlength()))) &&
            ((this.MSHits_theomass==null && other.getMSHits_theomass()==null) || 
             (this.MSHits_theomass!=null &&
              this.MSHits_theomass.equals(other.getMSHits_theomass()))) &&
            ((this.MSHits_oid==null && other.getMSHits_oid()==null) || 
             (this.MSHits_oid!=null &&
              this.MSHits_oid.equals(other.getMSHits_oid())));
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
        if (getMSHits_evalue() != null) {
            _hashCode += getMSHits_evalue().hashCode();
        }
        if (getMSHits_pvalue() != null) {
            _hashCode += getMSHits_pvalue().hashCode();
        }
        if (getMSHits_charge() != null) {
            _hashCode += getMSHits_charge().hashCode();
        }
        if (getMSHits_pephits() != null) {
            _hashCode += getMSHits_pephits().hashCode();
        }
        if (getMSHits_mzhits() != null) {
            _hashCode += getMSHits_mzhits().hashCode();
        }
        if (getMSHits_pepstring() != null) {
            _hashCode += getMSHits_pepstring().hashCode();
        }
        if (getMSHits_mass() != null) {
            _hashCode += getMSHits_mass().hashCode();
        }
        if (getMSHits_mods() != null) {
            _hashCode += getMSHits_mods().hashCode();
        }
        if (getMSHits_pepstart() != null) {
            _hashCode += getMSHits_pepstart().hashCode();
        }
        if (getMSHits_pepstop() != null) {
            _hashCode += getMSHits_pepstop().hashCode();
        }
        if (getMSHits_protlength() != null) {
            _hashCode += getMSHits_protlength().hashCode();
        }
        if (getMSHits_theomass() != null) {
            _hashCode += getMSHits_theomass().hashCode();
        }
        if (getMSHits_oid() != null) {
            _hashCode += getMSHits_oid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSHitsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_evalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_evalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_pvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_pvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_pephits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_pephits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_pephitsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_mzhits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_mzhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_mzhitsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_pepstring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_pepstring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_mass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_mass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_mods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_mods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_modsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_pepstart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_pepstart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_pepstop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_pepstop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_protlength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_protlength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_theomass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_theomass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHits_oid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHits_oid"));
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
