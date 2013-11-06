/**
 * BiostrucScriptStepType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucScriptStepType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_stepIdType biostrucScriptStep_stepId;

    private java.lang.String biostrucScriptStep_stepName;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_featureDoType biostrucScriptStep_featureDo;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_cameraMoveType biostrucScriptStep_cameraMove;

    private java.lang.String biostrucScriptStep_pause;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_waiteventType biostrucScriptStep_waitevent;

    private java.lang.String biostrucScriptStep_extra;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_jumpType biostrucScriptStep_jump;

    public BiostrucScriptStepType() {
    }

    public BiostrucScriptStepType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_stepIdType biostrucScriptStep_stepId,
           java.lang.String biostrucScriptStep_stepName,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_featureDoType biostrucScriptStep_featureDo,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_cameraMoveType biostrucScriptStep_cameraMove,
           java.lang.String biostrucScriptStep_pause,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_waiteventType biostrucScriptStep_waitevent,
           java.lang.String biostrucScriptStep_extra,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_jumpType biostrucScriptStep_jump) {
           this.biostrucScriptStep_stepId = biostrucScriptStep_stepId;
           this.biostrucScriptStep_stepName = biostrucScriptStep_stepName;
           this.biostrucScriptStep_featureDo = biostrucScriptStep_featureDo;
           this.biostrucScriptStep_cameraMove = biostrucScriptStep_cameraMove;
           this.biostrucScriptStep_pause = biostrucScriptStep_pause;
           this.biostrucScriptStep_waitevent = biostrucScriptStep_waitevent;
           this.biostrucScriptStep_extra = biostrucScriptStep_extra;
           this.biostrucScriptStep_jump = biostrucScriptStep_jump;
    }


    /**
     * Gets the biostrucScriptStep_stepId value for this BiostrucScriptStepType.
     * 
     * @return biostrucScriptStep_stepId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_stepIdType getBiostrucScriptStep_stepId() {
        return biostrucScriptStep_stepId;
    }


    /**
     * Sets the biostrucScriptStep_stepId value for this BiostrucScriptStepType.
     * 
     * @param biostrucScriptStep_stepId
     */
    public void setBiostrucScriptStep_stepId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_stepIdType biostrucScriptStep_stepId) {
        this.biostrucScriptStep_stepId = biostrucScriptStep_stepId;
    }


    /**
     * Gets the biostrucScriptStep_stepName value for this BiostrucScriptStepType.
     * 
     * @return biostrucScriptStep_stepName
     */
    public java.lang.String getBiostrucScriptStep_stepName() {
        return biostrucScriptStep_stepName;
    }


    /**
     * Sets the biostrucScriptStep_stepName value for this BiostrucScriptStepType.
     * 
     * @param biostrucScriptStep_stepName
     */
    public void setBiostrucScriptStep_stepName(java.lang.String biostrucScriptStep_stepName) {
        this.biostrucScriptStep_stepName = biostrucScriptStep_stepName;
    }


    /**
     * Gets the biostrucScriptStep_featureDo value for this BiostrucScriptStepType.
     * 
     * @return biostrucScriptStep_featureDo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_featureDoType getBiostrucScriptStep_featureDo() {
        return biostrucScriptStep_featureDo;
    }


    /**
     * Sets the biostrucScriptStep_featureDo value for this BiostrucScriptStepType.
     * 
     * @param biostrucScriptStep_featureDo
     */
    public void setBiostrucScriptStep_featureDo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_featureDoType biostrucScriptStep_featureDo) {
        this.biostrucScriptStep_featureDo = biostrucScriptStep_featureDo;
    }


    /**
     * Gets the biostrucScriptStep_cameraMove value for this BiostrucScriptStepType.
     * 
     * @return biostrucScriptStep_cameraMove
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_cameraMoveType getBiostrucScriptStep_cameraMove() {
        return biostrucScriptStep_cameraMove;
    }


    /**
     * Sets the biostrucScriptStep_cameraMove value for this BiostrucScriptStepType.
     * 
     * @param biostrucScriptStep_cameraMove
     */
    public void setBiostrucScriptStep_cameraMove(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_cameraMoveType biostrucScriptStep_cameraMove) {
        this.biostrucScriptStep_cameraMove = biostrucScriptStep_cameraMove;
    }


    /**
     * Gets the biostrucScriptStep_pause value for this BiostrucScriptStepType.
     * 
     * @return biostrucScriptStep_pause
     */
    public java.lang.String getBiostrucScriptStep_pause() {
        return biostrucScriptStep_pause;
    }


    /**
     * Sets the biostrucScriptStep_pause value for this BiostrucScriptStepType.
     * 
     * @param biostrucScriptStep_pause
     */
    public void setBiostrucScriptStep_pause(java.lang.String biostrucScriptStep_pause) {
        this.biostrucScriptStep_pause = biostrucScriptStep_pause;
    }


    /**
     * Gets the biostrucScriptStep_waitevent value for this BiostrucScriptStepType.
     * 
     * @return biostrucScriptStep_waitevent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_waiteventType getBiostrucScriptStep_waitevent() {
        return biostrucScriptStep_waitevent;
    }


    /**
     * Sets the biostrucScriptStep_waitevent value for this BiostrucScriptStepType.
     * 
     * @param biostrucScriptStep_waitevent
     */
    public void setBiostrucScriptStep_waitevent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_waiteventType biostrucScriptStep_waitevent) {
        this.biostrucScriptStep_waitevent = biostrucScriptStep_waitevent;
    }


    /**
     * Gets the biostrucScriptStep_extra value for this BiostrucScriptStepType.
     * 
     * @return biostrucScriptStep_extra
     */
    public java.lang.String getBiostrucScriptStep_extra() {
        return biostrucScriptStep_extra;
    }


    /**
     * Sets the biostrucScriptStep_extra value for this BiostrucScriptStepType.
     * 
     * @param biostrucScriptStep_extra
     */
    public void setBiostrucScriptStep_extra(java.lang.String biostrucScriptStep_extra) {
        this.biostrucScriptStep_extra = biostrucScriptStep_extra;
    }


    /**
     * Gets the biostrucScriptStep_jump value for this BiostrucScriptStepType.
     * 
     * @return biostrucScriptStep_jump
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_jumpType getBiostrucScriptStep_jump() {
        return biostrucScriptStep_jump;
    }


    /**
     * Sets the biostrucScriptStep_jump value for this BiostrucScriptStepType.
     * 
     * @param biostrucScriptStep_jump
     */
    public void setBiostrucScriptStep_jump(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucScriptStep_jumpType biostrucScriptStep_jump) {
        this.biostrucScriptStep_jump = biostrucScriptStep_jump;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucScriptStepType)) return false;
        BiostrucScriptStepType other = (BiostrucScriptStepType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucScriptStep_stepId==null && other.getBiostrucScriptStep_stepId()==null) || 
             (this.biostrucScriptStep_stepId!=null &&
              this.biostrucScriptStep_stepId.equals(other.getBiostrucScriptStep_stepId()))) &&
            ((this.biostrucScriptStep_stepName==null && other.getBiostrucScriptStep_stepName()==null) || 
             (this.biostrucScriptStep_stepName!=null &&
              this.biostrucScriptStep_stepName.equals(other.getBiostrucScriptStep_stepName()))) &&
            ((this.biostrucScriptStep_featureDo==null && other.getBiostrucScriptStep_featureDo()==null) || 
             (this.biostrucScriptStep_featureDo!=null &&
              this.biostrucScriptStep_featureDo.equals(other.getBiostrucScriptStep_featureDo()))) &&
            ((this.biostrucScriptStep_cameraMove==null && other.getBiostrucScriptStep_cameraMove()==null) || 
             (this.biostrucScriptStep_cameraMove!=null &&
              this.biostrucScriptStep_cameraMove.equals(other.getBiostrucScriptStep_cameraMove()))) &&
            ((this.biostrucScriptStep_pause==null && other.getBiostrucScriptStep_pause()==null) || 
             (this.biostrucScriptStep_pause!=null &&
              this.biostrucScriptStep_pause.equals(other.getBiostrucScriptStep_pause()))) &&
            ((this.biostrucScriptStep_waitevent==null && other.getBiostrucScriptStep_waitevent()==null) || 
             (this.biostrucScriptStep_waitevent!=null &&
              this.biostrucScriptStep_waitevent.equals(other.getBiostrucScriptStep_waitevent()))) &&
            ((this.biostrucScriptStep_extra==null && other.getBiostrucScriptStep_extra()==null) || 
             (this.biostrucScriptStep_extra!=null &&
              this.biostrucScriptStep_extra.equals(other.getBiostrucScriptStep_extra()))) &&
            ((this.biostrucScriptStep_jump==null && other.getBiostrucScriptStep_jump()==null) || 
             (this.biostrucScriptStep_jump!=null &&
              this.biostrucScriptStep_jump.equals(other.getBiostrucScriptStep_jump())));
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
        if (getBiostrucScriptStep_stepId() != null) {
            _hashCode += getBiostrucScriptStep_stepId().hashCode();
        }
        if (getBiostrucScriptStep_stepName() != null) {
            _hashCode += getBiostrucScriptStep_stepName().hashCode();
        }
        if (getBiostrucScriptStep_featureDo() != null) {
            _hashCode += getBiostrucScriptStep_featureDo().hashCode();
        }
        if (getBiostrucScriptStep_cameraMove() != null) {
            _hashCode += getBiostrucScriptStep_cameraMove().hashCode();
        }
        if (getBiostrucScriptStep_pause() != null) {
            _hashCode += getBiostrucScriptStep_pause().hashCode();
        }
        if (getBiostrucScriptStep_waitevent() != null) {
            _hashCode += getBiostrucScriptStep_waitevent().hashCode();
        }
        if (getBiostrucScriptStep_extra() != null) {
            _hashCode += getBiostrucScriptStep_extra().hashCode();
        }
        if (getBiostrucScriptStep_jump() != null) {
            _hashCode += getBiostrucScriptStep_jump().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucScriptStepType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-stepType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucScriptStep_stepId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_step-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_step-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucScriptStep_stepName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_step-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucScriptStep_featureDo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_feature-do"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_feature-doType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucScriptStep_cameraMove");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_camera-move"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_camera-moveType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucScriptStep_pause");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_pause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucScriptStep_waitevent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_waitevent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_waiteventType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucScriptStep_extra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_extra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucScriptStep_jump");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_jump"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-script-step_jumpType"));
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
