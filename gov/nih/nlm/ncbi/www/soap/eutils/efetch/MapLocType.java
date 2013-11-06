/**
 * MapLocType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MapLocType  implements java.io.Serializable {
    private java.lang.String mapLoc_asnFrom;

    private java.lang.String mapLoc_asnTo;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapLoc_locTypeType mapLoc_locType;

    private java.lang.String mapLoc_alnQuality;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapLoc_orientType mapLoc_orient;

    private java.lang.String mapLoc_physMapStr;

    private java.lang.String mapLoc_physMapInt;

    private java.lang.String mapLoc_leftFlankNeighborPos;

    private java.lang.String mapLoc_rightFlankNeighborPos;

    private java.lang.String mapLoc_leftContigNeighborPos;

    private java.lang.String mapLoc_rightContigNeighborPos;

    private java.lang.String mapLoc_numberOfMismatches;

    private java.lang.String mapLoc_numberOfDeletions;

    private java.lang.String mapLoc_numberOfInsertions;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapLoc_fxnSetType mapLoc_fxnSet;

    public MapLocType() {
    }

    public MapLocType(
           java.lang.String mapLoc_asnFrom,
           java.lang.String mapLoc_asnTo,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapLoc_locTypeType mapLoc_locType,
           java.lang.String mapLoc_alnQuality,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapLoc_orientType mapLoc_orient,
           java.lang.String mapLoc_physMapStr,
           java.lang.String mapLoc_physMapInt,
           java.lang.String mapLoc_leftFlankNeighborPos,
           java.lang.String mapLoc_rightFlankNeighborPos,
           java.lang.String mapLoc_leftContigNeighborPos,
           java.lang.String mapLoc_rightContigNeighborPos,
           java.lang.String mapLoc_numberOfMismatches,
           java.lang.String mapLoc_numberOfDeletions,
           java.lang.String mapLoc_numberOfInsertions,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapLoc_fxnSetType mapLoc_fxnSet) {
           this.mapLoc_asnFrom = mapLoc_asnFrom;
           this.mapLoc_asnTo = mapLoc_asnTo;
           this.mapLoc_locType = mapLoc_locType;
           this.mapLoc_alnQuality = mapLoc_alnQuality;
           this.mapLoc_orient = mapLoc_orient;
           this.mapLoc_physMapStr = mapLoc_physMapStr;
           this.mapLoc_physMapInt = mapLoc_physMapInt;
           this.mapLoc_leftFlankNeighborPos = mapLoc_leftFlankNeighborPos;
           this.mapLoc_rightFlankNeighborPos = mapLoc_rightFlankNeighborPos;
           this.mapLoc_leftContigNeighborPos = mapLoc_leftContigNeighborPos;
           this.mapLoc_rightContigNeighborPos = mapLoc_rightContigNeighborPos;
           this.mapLoc_numberOfMismatches = mapLoc_numberOfMismatches;
           this.mapLoc_numberOfDeletions = mapLoc_numberOfDeletions;
           this.mapLoc_numberOfInsertions = mapLoc_numberOfInsertions;
           this.mapLoc_fxnSet = mapLoc_fxnSet;
    }


    /**
     * Gets the mapLoc_asnFrom value for this MapLocType.
     * 
     * @return mapLoc_asnFrom
     */
    public java.lang.String getMapLoc_asnFrom() {
        return mapLoc_asnFrom;
    }


    /**
     * Sets the mapLoc_asnFrom value for this MapLocType.
     * 
     * @param mapLoc_asnFrom
     */
    public void setMapLoc_asnFrom(java.lang.String mapLoc_asnFrom) {
        this.mapLoc_asnFrom = mapLoc_asnFrom;
    }


    /**
     * Gets the mapLoc_asnTo value for this MapLocType.
     * 
     * @return mapLoc_asnTo
     */
    public java.lang.String getMapLoc_asnTo() {
        return mapLoc_asnTo;
    }


    /**
     * Sets the mapLoc_asnTo value for this MapLocType.
     * 
     * @param mapLoc_asnTo
     */
    public void setMapLoc_asnTo(java.lang.String mapLoc_asnTo) {
        this.mapLoc_asnTo = mapLoc_asnTo;
    }


    /**
     * Gets the mapLoc_locType value for this MapLocType.
     * 
     * @return mapLoc_locType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapLoc_locTypeType getMapLoc_locType() {
        return mapLoc_locType;
    }


    /**
     * Sets the mapLoc_locType value for this MapLocType.
     * 
     * @param mapLoc_locType
     */
    public void setMapLoc_locType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapLoc_locTypeType mapLoc_locType) {
        this.mapLoc_locType = mapLoc_locType;
    }


    /**
     * Gets the mapLoc_alnQuality value for this MapLocType.
     * 
     * @return mapLoc_alnQuality
     */
    public java.lang.String getMapLoc_alnQuality() {
        return mapLoc_alnQuality;
    }


    /**
     * Sets the mapLoc_alnQuality value for this MapLocType.
     * 
     * @param mapLoc_alnQuality
     */
    public void setMapLoc_alnQuality(java.lang.String mapLoc_alnQuality) {
        this.mapLoc_alnQuality = mapLoc_alnQuality;
    }


    /**
     * Gets the mapLoc_orient value for this MapLocType.
     * 
     * @return mapLoc_orient
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapLoc_orientType getMapLoc_orient() {
        return mapLoc_orient;
    }


    /**
     * Sets the mapLoc_orient value for this MapLocType.
     * 
     * @param mapLoc_orient
     */
    public void setMapLoc_orient(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapLoc_orientType mapLoc_orient) {
        this.mapLoc_orient = mapLoc_orient;
    }


    /**
     * Gets the mapLoc_physMapStr value for this MapLocType.
     * 
     * @return mapLoc_physMapStr
     */
    public java.lang.String getMapLoc_physMapStr() {
        return mapLoc_physMapStr;
    }


    /**
     * Sets the mapLoc_physMapStr value for this MapLocType.
     * 
     * @param mapLoc_physMapStr
     */
    public void setMapLoc_physMapStr(java.lang.String mapLoc_physMapStr) {
        this.mapLoc_physMapStr = mapLoc_physMapStr;
    }


    /**
     * Gets the mapLoc_physMapInt value for this MapLocType.
     * 
     * @return mapLoc_physMapInt
     */
    public java.lang.String getMapLoc_physMapInt() {
        return mapLoc_physMapInt;
    }


    /**
     * Sets the mapLoc_physMapInt value for this MapLocType.
     * 
     * @param mapLoc_physMapInt
     */
    public void setMapLoc_physMapInt(java.lang.String mapLoc_physMapInt) {
        this.mapLoc_physMapInt = mapLoc_physMapInt;
    }


    /**
     * Gets the mapLoc_leftFlankNeighborPos value for this MapLocType.
     * 
     * @return mapLoc_leftFlankNeighborPos
     */
    public java.lang.String getMapLoc_leftFlankNeighborPos() {
        return mapLoc_leftFlankNeighborPos;
    }


    /**
     * Sets the mapLoc_leftFlankNeighborPos value for this MapLocType.
     * 
     * @param mapLoc_leftFlankNeighborPos
     */
    public void setMapLoc_leftFlankNeighborPos(java.lang.String mapLoc_leftFlankNeighborPos) {
        this.mapLoc_leftFlankNeighborPos = mapLoc_leftFlankNeighborPos;
    }


    /**
     * Gets the mapLoc_rightFlankNeighborPos value for this MapLocType.
     * 
     * @return mapLoc_rightFlankNeighborPos
     */
    public java.lang.String getMapLoc_rightFlankNeighborPos() {
        return mapLoc_rightFlankNeighborPos;
    }


    /**
     * Sets the mapLoc_rightFlankNeighborPos value for this MapLocType.
     * 
     * @param mapLoc_rightFlankNeighborPos
     */
    public void setMapLoc_rightFlankNeighborPos(java.lang.String mapLoc_rightFlankNeighborPos) {
        this.mapLoc_rightFlankNeighborPos = mapLoc_rightFlankNeighborPos;
    }


    /**
     * Gets the mapLoc_leftContigNeighborPos value for this MapLocType.
     * 
     * @return mapLoc_leftContigNeighborPos
     */
    public java.lang.String getMapLoc_leftContigNeighborPos() {
        return mapLoc_leftContigNeighborPos;
    }


    /**
     * Sets the mapLoc_leftContigNeighborPos value for this MapLocType.
     * 
     * @param mapLoc_leftContigNeighborPos
     */
    public void setMapLoc_leftContigNeighborPos(java.lang.String mapLoc_leftContigNeighborPos) {
        this.mapLoc_leftContigNeighborPos = mapLoc_leftContigNeighborPos;
    }


    /**
     * Gets the mapLoc_rightContigNeighborPos value for this MapLocType.
     * 
     * @return mapLoc_rightContigNeighborPos
     */
    public java.lang.String getMapLoc_rightContigNeighborPos() {
        return mapLoc_rightContigNeighborPos;
    }


    /**
     * Sets the mapLoc_rightContigNeighborPos value for this MapLocType.
     * 
     * @param mapLoc_rightContigNeighborPos
     */
    public void setMapLoc_rightContigNeighborPos(java.lang.String mapLoc_rightContigNeighborPos) {
        this.mapLoc_rightContigNeighborPos = mapLoc_rightContigNeighborPos;
    }


    /**
     * Gets the mapLoc_numberOfMismatches value for this MapLocType.
     * 
     * @return mapLoc_numberOfMismatches
     */
    public java.lang.String getMapLoc_numberOfMismatches() {
        return mapLoc_numberOfMismatches;
    }


    /**
     * Sets the mapLoc_numberOfMismatches value for this MapLocType.
     * 
     * @param mapLoc_numberOfMismatches
     */
    public void setMapLoc_numberOfMismatches(java.lang.String mapLoc_numberOfMismatches) {
        this.mapLoc_numberOfMismatches = mapLoc_numberOfMismatches;
    }


    /**
     * Gets the mapLoc_numberOfDeletions value for this MapLocType.
     * 
     * @return mapLoc_numberOfDeletions
     */
    public java.lang.String getMapLoc_numberOfDeletions() {
        return mapLoc_numberOfDeletions;
    }


    /**
     * Sets the mapLoc_numberOfDeletions value for this MapLocType.
     * 
     * @param mapLoc_numberOfDeletions
     */
    public void setMapLoc_numberOfDeletions(java.lang.String mapLoc_numberOfDeletions) {
        this.mapLoc_numberOfDeletions = mapLoc_numberOfDeletions;
    }


    /**
     * Gets the mapLoc_numberOfInsertions value for this MapLocType.
     * 
     * @return mapLoc_numberOfInsertions
     */
    public java.lang.String getMapLoc_numberOfInsertions() {
        return mapLoc_numberOfInsertions;
    }


    /**
     * Sets the mapLoc_numberOfInsertions value for this MapLocType.
     * 
     * @param mapLoc_numberOfInsertions
     */
    public void setMapLoc_numberOfInsertions(java.lang.String mapLoc_numberOfInsertions) {
        this.mapLoc_numberOfInsertions = mapLoc_numberOfInsertions;
    }


    /**
     * Gets the mapLoc_fxnSet value for this MapLocType.
     * 
     * @return mapLoc_fxnSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapLoc_fxnSetType getMapLoc_fxnSet() {
        return mapLoc_fxnSet;
    }


    /**
     * Sets the mapLoc_fxnSet value for this MapLocType.
     * 
     * @param mapLoc_fxnSet
     */
    public void setMapLoc_fxnSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MapLoc_fxnSetType mapLoc_fxnSet) {
        this.mapLoc_fxnSet = mapLoc_fxnSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapLocType)) return false;
        MapLocType other = (MapLocType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mapLoc_asnFrom==null && other.getMapLoc_asnFrom()==null) || 
             (this.mapLoc_asnFrom!=null &&
              this.mapLoc_asnFrom.equals(other.getMapLoc_asnFrom()))) &&
            ((this.mapLoc_asnTo==null && other.getMapLoc_asnTo()==null) || 
             (this.mapLoc_asnTo!=null &&
              this.mapLoc_asnTo.equals(other.getMapLoc_asnTo()))) &&
            ((this.mapLoc_locType==null && other.getMapLoc_locType()==null) || 
             (this.mapLoc_locType!=null &&
              this.mapLoc_locType.equals(other.getMapLoc_locType()))) &&
            ((this.mapLoc_alnQuality==null && other.getMapLoc_alnQuality()==null) || 
             (this.mapLoc_alnQuality!=null &&
              this.mapLoc_alnQuality.equals(other.getMapLoc_alnQuality()))) &&
            ((this.mapLoc_orient==null && other.getMapLoc_orient()==null) || 
             (this.mapLoc_orient!=null &&
              this.mapLoc_orient.equals(other.getMapLoc_orient()))) &&
            ((this.mapLoc_physMapStr==null && other.getMapLoc_physMapStr()==null) || 
             (this.mapLoc_physMapStr!=null &&
              this.mapLoc_physMapStr.equals(other.getMapLoc_physMapStr()))) &&
            ((this.mapLoc_physMapInt==null && other.getMapLoc_physMapInt()==null) || 
             (this.mapLoc_physMapInt!=null &&
              this.mapLoc_physMapInt.equals(other.getMapLoc_physMapInt()))) &&
            ((this.mapLoc_leftFlankNeighborPos==null && other.getMapLoc_leftFlankNeighborPos()==null) || 
             (this.mapLoc_leftFlankNeighborPos!=null &&
              this.mapLoc_leftFlankNeighborPos.equals(other.getMapLoc_leftFlankNeighborPos()))) &&
            ((this.mapLoc_rightFlankNeighborPos==null && other.getMapLoc_rightFlankNeighborPos()==null) || 
             (this.mapLoc_rightFlankNeighborPos!=null &&
              this.mapLoc_rightFlankNeighborPos.equals(other.getMapLoc_rightFlankNeighborPos()))) &&
            ((this.mapLoc_leftContigNeighborPos==null && other.getMapLoc_leftContigNeighborPos()==null) || 
             (this.mapLoc_leftContigNeighborPos!=null &&
              this.mapLoc_leftContigNeighborPos.equals(other.getMapLoc_leftContigNeighborPos()))) &&
            ((this.mapLoc_rightContigNeighborPos==null && other.getMapLoc_rightContigNeighborPos()==null) || 
             (this.mapLoc_rightContigNeighborPos!=null &&
              this.mapLoc_rightContigNeighborPos.equals(other.getMapLoc_rightContigNeighborPos()))) &&
            ((this.mapLoc_numberOfMismatches==null && other.getMapLoc_numberOfMismatches()==null) || 
             (this.mapLoc_numberOfMismatches!=null &&
              this.mapLoc_numberOfMismatches.equals(other.getMapLoc_numberOfMismatches()))) &&
            ((this.mapLoc_numberOfDeletions==null && other.getMapLoc_numberOfDeletions()==null) || 
             (this.mapLoc_numberOfDeletions!=null &&
              this.mapLoc_numberOfDeletions.equals(other.getMapLoc_numberOfDeletions()))) &&
            ((this.mapLoc_numberOfInsertions==null && other.getMapLoc_numberOfInsertions()==null) || 
             (this.mapLoc_numberOfInsertions!=null &&
              this.mapLoc_numberOfInsertions.equals(other.getMapLoc_numberOfInsertions()))) &&
            ((this.mapLoc_fxnSet==null && other.getMapLoc_fxnSet()==null) || 
             (this.mapLoc_fxnSet!=null &&
              this.mapLoc_fxnSet.equals(other.getMapLoc_fxnSet())));
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
        if (getMapLoc_asnFrom() != null) {
            _hashCode += getMapLoc_asnFrom().hashCode();
        }
        if (getMapLoc_asnTo() != null) {
            _hashCode += getMapLoc_asnTo().hashCode();
        }
        if (getMapLoc_locType() != null) {
            _hashCode += getMapLoc_locType().hashCode();
        }
        if (getMapLoc_alnQuality() != null) {
            _hashCode += getMapLoc_alnQuality().hashCode();
        }
        if (getMapLoc_orient() != null) {
            _hashCode += getMapLoc_orient().hashCode();
        }
        if (getMapLoc_physMapStr() != null) {
            _hashCode += getMapLoc_physMapStr().hashCode();
        }
        if (getMapLoc_physMapInt() != null) {
            _hashCode += getMapLoc_physMapInt().hashCode();
        }
        if (getMapLoc_leftFlankNeighborPos() != null) {
            _hashCode += getMapLoc_leftFlankNeighborPos().hashCode();
        }
        if (getMapLoc_rightFlankNeighborPos() != null) {
            _hashCode += getMapLoc_rightFlankNeighborPos().hashCode();
        }
        if (getMapLoc_leftContigNeighborPos() != null) {
            _hashCode += getMapLoc_leftContigNeighborPos().hashCode();
        }
        if (getMapLoc_rightContigNeighborPos() != null) {
            _hashCode += getMapLoc_rightContigNeighborPos().hashCode();
        }
        if (getMapLoc_numberOfMismatches() != null) {
            _hashCode += getMapLoc_numberOfMismatches().hashCode();
        }
        if (getMapLoc_numberOfDeletions() != null) {
            _hashCode += getMapLoc_numberOfDeletions().hashCode();
        }
        if (getMapLoc_numberOfInsertions() != null) {
            _hashCode += getMapLoc_numberOfInsertions().hashCode();
        }
        if (getMapLoc_fxnSet() != null) {
            _hashCode += getMapLoc_fxnSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MapLocType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLocType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_asnFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_asnFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_asnTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_asnTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_locType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_locType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_locTypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_alnQuality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_alnQuality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_orient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_orient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_orientType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_physMapStr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_physMapStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_physMapInt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_physMapInt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_leftFlankNeighborPos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_leftFlankNeighborPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_rightFlankNeighborPos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_rightFlankNeighborPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_leftContigNeighborPos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_leftContigNeighborPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_rightContigNeighborPos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_rightContigNeighborPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_numberOfMismatches");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_numberOfMismatches"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_numberOfDeletions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_numberOfDeletions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_numberOfInsertions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_numberOfInsertions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapLoc_fxnSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_fxnSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MapLoc_fxnSetType"));
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
