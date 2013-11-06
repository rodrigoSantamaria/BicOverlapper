/**
 * MimSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimSet_releaseDateType mimSet_releaseDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimSet_mimEntriesType mimSet_mimEntries;

    public MimSet() {
    }

    public MimSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimSet_releaseDateType mimSet_releaseDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimSet_mimEntriesType mimSet_mimEntries) {
           this.mimSet_releaseDate = mimSet_releaseDate;
           this.mimSet_mimEntries = mimSet_mimEntries;
    }


    /**
     * Gets the mimSet_releaseDate value for this MimSet.
     * 
     * @return mimSet_releaseDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimSet_releaseDateType getMimSet_releaseDate() {
        return mimSet_releaseDate;
    }


    /**
     * Sets the mimSet_releaseDate value for this MimSet.
     * 
     * @param mimSet_releaseDate
     */
    public void setMimSet_releaseDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimSet_releaseDateType mimSet_releaseDate) {
        this.mimSet_releaseDate = mimSet_releaseDate;
    }


    /**
     * Gets the mimSet_mimEntries value for this MimSet.
     * 
     * @return mimSet_mimEntries
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimSet_mimEntriesType getMimSet_mimEntries() {
        return mimSet_mimEntries;
    }


    /**
     * Sets the mimSet_mimEntries value for this MimSet.
     * 
     * @param mimSet_mimEntries
     */
    public void setMimSet_mimEntries(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimSet_mimEntriesType mimSet_mimEntries) {
        this.mimSet_mimEntries = mimSet_mimEntries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimSet)) return false;
        MimSet other = (MimSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimSet_releaseDate==null && other.getMimSet_releaseDate()==null) || 
             (this.mimSet_releaseDate!=null &&
              this.mimSet_releaseDate.equals(other.getMimSet_releaseDate()))) &&
            ((this.mimSet_mimEntries==null && other.getMimSet_mimEntries()==null) || 
             (this.mimSet_mimEntries!=null &&
              this.mimSet_mimEntries.equals(other.getMimSet_mimEntries())));
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
        if (getMimSet_releaseDate() != null) {
            _hashCode += getMimSet_releaseDate().hashCode();
        }
        if (getMimSet_mimEntries() != null) {
            _hashCode += getMimSet_mimEntries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Mim-set"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimSet_releaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-set_releaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-set_releaseDateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimSet_mimEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-set_mimEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-set_mimEntriesType"));
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
