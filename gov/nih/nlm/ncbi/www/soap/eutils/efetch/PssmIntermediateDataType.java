/**
 * PssmIntermediateDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PssmIntermediateDataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateData_resFreqsPerPosType pssmIntermediateData_resFreqsPerPos;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateData_weightedResFreqsPerPosType pssmIntermediateData_weightedResFreqsPerPos;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateData_freqRatiosType pssmIntermediateData_freqRatios;

    public PssmIntermediateDataType() {
    }

    public PssmIntermediateDataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateData_resFreqsPerPosType pssmIntermediateData_resFreqsPerPos,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateData_weightedResFreqsPerPosType pssmIntermediateData_weightedResFreqsPerPos,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateData_freqRatiosType pssmIntermediateData_freqRatios) {
           this.pssmIntermediateData_resFreqsPerPos = pssmIntermediateData_resFreqsPerPos;
           this.pssmIntermediateData_weightedResFreqsPerPos = pssmIntermediateData_weightedResFreqsPerPos;
           this.pssmIntermediateData_freqRatios = pssmIntermediateData_freqRatios;
    }


    /**
     * Gets the pssmIntermediateData_resFreqsPerPos value for this PssmIntermediateDataType.
     * 
     * @return pssmIntermediateData_resFreqsPerPos
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateData_resFreqsPerPosType getPssmIntermediateData_resFreqsPerPos() {
        return pssmIntermediateData_resFreqsPerPos;
    }


    /**
     * Sets the pssmIntermediateData_resFreqsPerPos value for this PssmIntermediateDataType.
     * 
     * @param pssmIntermediateData_resFreqsPerPos
     */
    public void setPssmIntermediateData_resFreqsPerPos(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateData_resFreqsPerPosType pssmIntermediateData_resFreqsPerPos) {
        this.pssmIntermediateData_resFreqsPerPos = pssmIntermediateData_resFreqsPerPos;
    }


    /**
     * Gets the pssmIntermediateData_weightedResFreqsPerPos value for this PssmIntermediateDataType.
     * 
     * @return pssmIntermediateData_weightedResFreqsPerPos
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateData_weightedResFreqsPerPosType getPssmIntermediateData_weightedResFreqsPerPos() {
        return pssmIntermediateData_weightedResFreqsPerPos;
    }


    /**
     * Sets the pssmIntermediateData_weightedResFreqsPerPos value for this PssmIntermediateDataType.
     * 
     * @param pssmIntermediateData_weightedResFreqsPerPos
     */
    public void setPssmIntermediateData_weightedResFreqsPerPos(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateData_weightedResFreqsPerPosType pssmIntermediateData_weightedResFreqsPerPos) {
        this.pssmIntermediateData_weightedResFreqsPerPos = pssmIntermediateData_weightedResFreqsPerPos;
    }


    /**
     * Gets the pssmIntermediateData_freqRatios value for this PssmIntermediateDataType.
     * 
     * @return pssmIntermediateData_freqRatios
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateData_freqRatiosType getPssmIntermediateData_freqRatios() {
        return pssmIntermediateData_freqRatios;
    }


    /**
     * Sets the pssmIntermediateData_freqRatios value for this PssmIntermediateDataType.
     * 
     * @param pssmIntermediateData_freqRatios
     */
    public void setPssmIntermediateData_freqRatios(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateData_freqRatiosType pssmIntermediateData_freqRatios) {
        this.pssmIntermediateData_freqRatios = pssmIntermediateData_freqRatios;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssmIntermediateDataType)) return false;
        PssmIntermediateDataType other = (PssmIntermediateDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssmIntermediateData_resFreqsPerPos==null && other.getPssmIntermediateData_resFreqsPerPos()==null) || 
             (this.pssmIntermediateData_resFreqsPerPos!=null &&
              this.pssmIntermediateData_resFreqsPerPos.equals(other.getPssmIntermediateData_resFreqsPerPos()))) &&
            ((this.pssmIntermediateData_weightedResFreqsPerPos==null && other.getPssmIntermediateData_weightedResFreqsPerPos()==null) || 
             (this.pssmIntermediateData_weightedResFreqsPerPos!=null &&
              this.pssmIntermediateData_weightedResFreqsPerPos.equals(other.getPssmIntermediateData_weightedResFreqsPerPos()))) &&
            ((this.pssmIntermediateData_freqRatios==null && other.getPssmIntermediateData_freqRatios()==null) || 
             (this.pssmIntermediateData_freqRatios!=null &&
              this.pssmIntermediateData_freqRatios.equals(other.getPssmIntermediateData_freqRatios())));
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
        if (getPssmIntermediateData_resFreqsPerPos() != null) {
            _hashCode += getPssmIntermediateData_resFreqsPerPos().hashCode();
        }
        if (getPssmIntermediateData_weightedResFreqsPerPos() != null) {
            _hashCode += getPssmIntermediateData_weightedResFreqsPerPos().hashCode();
        }
        if (getPssmIntermediateData_freqRatios() != null) {
            _hashCode += getPssmIntermediateData_freqRatios().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssmIntermediateDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmIntermediateDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmIntermediateData_resFreqsPerPos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmIntermediateData_resFreqsPerPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmIntermediateData_resFreqsPerPosType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmIntermediateData_weightedResFreqsPerPos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmIntermediateData_weightedResFreqsPerPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmIntermediateData_weightedResFreqsPerPosType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmIntermediateData_freqRatios");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmIntermediateData_freqRatios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmIntermediateData_freqRatiosType"));
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
