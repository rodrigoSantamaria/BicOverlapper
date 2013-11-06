/**
 * BiostrucType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_idType biostruc_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_descrType biostruc_descr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_chemicalGraphType biostruc_chemicalGraph;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_featuresType biostruc_features;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_modelType biostruc_model;

    public BiostrucType() {
    }

    public BiostrucType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_idType biostruc_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_descrType biostruc_descr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_chemicalGraphType biostruc_chemicalGraph,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_featuresType biostruc_features,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_modelType biostruc_model) {
           this.biostruc_id = biostruc_id;
           this.biostruc_descr = biostruc_descr;
           this.biostruc_chemicalGraph = biostruc_chemicalGraph;
           this.biostruc_features = biostruc_features;
           this.biostruc_model = biostruc_model;
    }


    /**
     * Gets the biostruc_id value for this BiostrucType.
     * 
     * @return biostruc_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_idType getBiostruc_id() {
        return biostruc_id;
    }


    /**
     * Sets the biostruc_id value for this BiostrucType.
     * 
     * @param biostruc_id
     */
    public void setBiostruc_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_idType biostruc_id) {
        this.biostruc_id = biostruc_id;
    }


    /**
     * Gets the biostruc_descr value for this BiostrucType.
     * 
     * @return biostruc_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_descrType getBiostruc_descr() {
        return biostruc_descr;
    }


    /**
     * Sets the biostruc_descr value for this BiostrucType.
     * 
     * @param biostruc_descr
     */
    public void setBiostruc_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_descrType biostruc_descr) {
        this.biostruc_descr = biostruc_descr;
    }


    /**
     * Gets the biostruc_chemicalGraph value for this BiostrucType.
     * 
     * @return biostruc_chemicalGraph
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_chemicalGraphType getBiostruc_chemicalGraph() {
        return biostruc_chemicalGraph;
    }


    /**
     * Sets the biostruc_chemicalGraph value for this BiostrucType.
     * 
     * @param biostruc_chemicalGraph
     */
    public void setBiostruc_chemicalGraph(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_chemicalGraphType biostruc_chemicalGraph) {
        this.biostruc_chemicalGraph = biostruc_chemicalGraph;
    }


    /**
     * Gets the biostruc_features value for this BiostrucType.
     * 
     * @return biostruc_features
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_featuresType getBiostruc_features() {
        return biostruc_features;
    }


    /**
     * Sets the biostruc_features value for this BiostrucType.
     * 
     * @param biostruc_features
     */
    public void setBiostruc_features(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_featuresType biostruc_features) {
        this.biostruc_features = biostruc_features;
    }


    /**
     * Gets the biostruc_model value for this BiostrucType.
     * 
     * @return biostruc_model
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_modelType getBiostruc_model() {
        return biostruc_model;
    }


    /**
     * Sets the biostruc_model value for this BiostrucType.
     * 
     * @param biostruc_model
     */
    public void setBiostruc_model(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Biostruc_modelType biostruc_model) {
        this.biostruc_model = biostruc_model;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucType)) return false;
        BiostrucType other = (BiostrucType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostruc_id==null && other.getBiostruc_id()==null) || 
             (this.biostruc_id!=null &&
              this.biostruc_id.equals(other.getBiostruc_id()))) &&
            ((this.biostruc_descr==null && other.getBiostruc_descr()==null) || 
             (this.biostruc_descr!=null &&
              this.biostruc_descr.equals(other.getBiostruc_descr()))) &&
            ((this.biostruc_chemicalGraph==null && other.getBiostruc_chemicalGraph()==null) || 
             (this.biostruc_chemicalGraph!=null &&
              this.biostruc_chemicalGraph.equals(other.getBiostruc_chemicalGraph()))) &&
            ((this.biostruc_features==null && other.getBiostruc_features()==null) || 
             (this.biostruc_features!=null &&
              this.biostruc_features.equals(other.getBiostruc_features()))) &&
            ((this.biostruc_model==null && other.getBiostruc_model()==null) || 
             (this.biostruc_model!=null &&
              this.biostruc_model.equals(other.getBiostruc_model())));
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
        if (getBiostruc_id() != null) {
            _hashCode += getBiostruc_id().hashCode();
        }
        if (getBiostruc_descr() != null) {
            _hashCode += getBiostruc_descr().hashCode();
        }
        if (getBiostruc_chemicalGraph() != null) {
            _hashCode += getBiostruc_chemicalGraph().hashCode();
        }
        if (getBiostruc_features() != null) {
            _hashCode += getBiostruc_features().hashCode();
        }
        if (getBiostruc_model() != null) {
            _hashCode += getBiostruc_model().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BiostrucType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostruc_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostruc_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc_descrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostruc_chemicalGraph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc_chemical-graph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc_chemical-graphType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostruc_features");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc_features"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc_featuresType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostruc_model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc_model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc_modelType"));
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
