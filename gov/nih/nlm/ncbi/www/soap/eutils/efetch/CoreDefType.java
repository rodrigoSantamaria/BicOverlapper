/**
 * CoreDefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CoreDefType  implements java.io.Serializable {
    private java.lang.String coreDef_nblocks;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreDef_blocksType coreDef_blocks;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreDef_loopsType coreDef_loops;

    public CoreDefType() {
    }

    public CoreDefType(
           java.lang.String coreDef_nblocks,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreDef_blocksType coreDef_blocks,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreDef_loopsType coreDef_loops) {
           this.coreDef_nblocks = coreDef_nblocks;
           this.coreDef_blocks = coreDef_blocks;
           this.coreDef_loops = coreDef_loops;
    }


    /**
     * Gets the coreDef_nblocks value for this CoreDefType.
     * 
     * @return coreDef_nblocks
     */
    public java.lang.String getCoreDef_nblocks() {
        return coreDef_nblocks;
    }


    /**
     * Sets the coreDef_nblocks value for this CoreDefType.
     * 
     * @param coreDef_nblocks
     */
    public void setCoreDef_nblocks(java.lang.String coreDef_nblocks) {
        this.coreDef_nblocks = coreDef_nblocks;
    }


    /**
     * Gets the coreDef_blocks value for this CoreDefType.
     * 
     * @return coreDef_blocks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreDef_blocksType getCoreDef_blocks() {
        return coreDef_blocks;
    }


    /**
     * Sets the coreDef_blocks value for this CoreDefType.
     * 
     * @param coreDef_blocks
     */
    public void setCoreDef_blocks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreDef_blocksType coreDef_blocks) {
        this.coreDef_blocks = coreDef_blocks;
    }


    /**
     * Gets the coreDef_loops value for this CoreDefType.
     * 
     * @return coreDef_loops
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreDef_loopsType getCoreDef_loops() {
        return coreDef_loops;
    }


    /**
     * Sets the coreDef_loops value for this CoreDefType.
     * 
     * @param coreDef_loops
     */
    public void setCoreDef_loops(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CoreDef_loopsType coreDef_loops) {
        this.coreDef_loops = coreDef_loops;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoreDefType)) return false;
        CoreDefType other = (CoreDefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coreDef_nblocks==null && other.getCoreDef_nblocks()==null) || 
             (this.coreDef_nblocks!=null &&
              this.coreDef_nblocks.equals(other.getCoreDef_nblocks()))) &&
            ((this.coreDef_blocks==null && other.getCoreDef_blocks()==null) || 
             (this.coreDef_blocks!=null &&
              this.coreDef_blocks.equals(other.getCoreDef_blocks()))) &&
            ((this.coreDef_loops==null && other.getCoreDef_loops()==null) || 
             (this.coreDef_loops!=null &&
              this.coreDef_loops.equals(other.getCoreDef_loops())));
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
        if (getCoreDef_nblocks() != null) {
            _hashCode += getCoreDef_nblocks().hashCode();
        }
        if (getCoreDef_blocks() != null) {
            _hashCode += getCoreDef_blocks().hashCode();
        }
        if (getCoreDef_loops() != null) {
            _hashCode += getCoreDef_loops().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CoreDefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreDefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreDef_nblocks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreDef_nblocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreDef_blocks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreDef_blocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreDef_blocksType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreDef_loops");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreDef_loops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CoreDef_loopsType"));
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
