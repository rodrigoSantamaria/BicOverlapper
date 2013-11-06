/**
 * PublicationInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PublicationInfoType  implements java.io.Serializable {
    private java.lang.String country;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PlaceCodeType placeCode;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ImprintType_nlmc[] imprint;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PlaceType[] place;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherType[] publisher;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateIssuedType[] dateIssued;

    private java.lang.String projectedPublicationDate;

    private java.lang.String publicationFirstYear;

    private java.lang.String publicationEndYear;

    private java.lang.String edition;

    private java.lang.String[] datesOfSerialPublication;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FrequencyType[] frequency;

    public PublicationInfoType() {
    }

    public PublicationInfoType(
           java.lang.String country,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PlaceCodeType placeCode,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ImprintType_nlmc[] imprint,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PlaceType[] place,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherType[] publisher,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateIssuedType[] dateIssued,
           java.lang.String projectedPublicationDate,
           java.lang.String publicationFirstYear,
           java.lang.String publicationEndYear,
           java.lang.String edition,
           java.lang.String[] datesOfSerialPublication,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FrequencyType[] frequency) {
           this.country = country;
           this.placeCode = placeCode;
           this.imprint = imprint;
           this.place = place;
           this.publisher = publisher;
           this.dateIssued = dateIssued;
           this.projectedPublicationDate = projectedPublicationDate;
           this.publicationFirstYear = publicationFirstYear;
           this.publicationEndYear = publicationEndYear;
           this.edition = edition;
           this.datesOfSerialPublication = datesOfSerialPublication;
           this.frequency = frequency;
    }


    /**
     * Gets the country value for this PublicationInfoType.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this PublicationInfoType.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the placeCode value for this PublicationInfoType.
     * 
     * @return placeCode
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PlaceCodeType getPlaceCode() {
        return placeCode;
    }


    /**
     * Sets the placeCode value for this PublicationInfoType.
     * 
     * @param placeCode
     */
    public void setPlaceCode(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PlaceCodeType placeCode) {
        this.placeCode = placeCode;
    }


    /**
     * Gets the imprint value for this PublicationInfoType.
     * 
     * @return imprint
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ImprintType_nlmc[] getImprint() {
        return imprint;
    }


    /**
     * Sets the imprint value for this PublicationInfoType.
     * 
     * @param imprint
     */
    public void setImprint(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ImprintType_nlmc[] imprint) {
        this.imprint = imprint;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ImprintType_nlmc getImprint(int i) {
        return this.imprint[i];
    }

    public void setImprint(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ImprintType_nlmc _value) {
        this.imprint[i] = _value;
    }


    /**
     * Gets the place value for this PublicationInfoType.
     * 
     * @return place
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PlaceType[] getPlace() {
        return place;
    }


    /**
     * Sets the place value for this PublicationInfoType.
     * 
     * @param place
     */
    public void setPlace(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PlaceType[] place) {
        this.place = place;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PlaceType getPlace(int i) {
        return this.place[i];
    }

    public void setPlace(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PlaceType _value) {
        this.place[i] = _value;
    }


    /**
     * Gets the publisher value for this PublicationInfoType.
     * 
     * @return publisher
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherType[] getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this PublicationInfoType.
     * 
     * @param publisher
     */
    public void setPublisher(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherType[] publisher) {
        this.publisher = publisher;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherType getPublisher(int i) {
        return this.publisher[i];
    }

    public void setPublisher(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherType _value) {
        this.publisher[i] = _value;
    }


    /**
     * Gets the dateIssued value for this PublicationInfoType.
     * 
     * @return dateIssued
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateIssuedType[] getDateIssued() {
        return dateIssued;
    }


    /**
     * Sets the dateIssued value for this PublicationInfoType.
     * 
     * @param dateIssued
     */
    public void setDateIssued(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateIssuedType[] dateIssued) {
        this.dateIssued = dateIssued;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateIssuedType getDateIssued(int i) {
        return this.dateIssued[i];
    }

    public void setDateIssued(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.DateIssuedType _value) {
        this.dateIssued[i] = _value;
    }


    /**
     * Gets the projectedPublicationDate value for this PublicationInfoType.
     * 
     * @return projectedPublicationDate
     */
    public java.lang.String getProjectedPublicationDate() {
        return projectedPublicationDate;
    }


    /**
     * Sets the projectedPublicationDate value for this PublicationInfoType.
     * 
     * @param projectedPublicationDate
     */
    public void setProjectedPublicationDate(java.lang.String projectedPublicationDate) {
        this.projectedPublicationDate = projectedPublicationDate;
    }


    /**
     * Gets the publicationFirstYear value for this PublicationInfoType.
     * 
     * @return publicationFirstYear
     */
    public java.lang.String getPublicationFirstYear() {
        return publicationFirstYear;
    }


    /**
     * Sets the publicationFirstYear value for this PublicationInfoType.
     * 
     * @param publicationFirstYear
     */
    public void setPublicationFirstYear(java.lang.String publicationFirstYear) {
        this.publicationFirstYear = publicationFirstYear;
    }


    /**
     * Gets the publicationEndYear value for this PublicationInfoType.
     * 
     * @return publicationEndYear
     */
    public java.lang.String getPublicationEndYear() {
        return publicationEndYear;
    }


    /**
     * Sets the publicationEndYear value for this PublicationInfoType.
     * 
     * @param publicationEndYear
     */
    public void setPublicationEndYear(java.lang.String publicationEndYear) {
        this.publicationEndYear = publicationEndYear;
    }


    /**
     * Gets the edition value for this PublicationInfoType.
     * 
     * @return edition
     */
    public java.lang.String getEdition() {
        return edition;
    }


    /**
     * Sets the edition value for this PublicationInfoType.
     * 
     * @param edition
     */
    public void setEdition(java.lang.String edition) {
        this.edition = edition;
    }


    /**
     * Gets the datesOfSerialPublication value for this PublicationInfoType.
     * 
     * @return datesOfSerialPublication
     */
    public java.lang.String[] getDatesOfSerialPublication() {
        return datesOfSerialPublication;
    }


    /**
     * Sets the datesOfSerialPublication value for this PublicationInfoType.
     * 
     * @param datesOfSerialPublication
     */
    public void setDatesOfSerialPublication(java.lang.String[] datesOfSerialPublication) {
        this.datesOfSerialPublication = datesOfSerialPublication;
    }

    public java.lang.String getDatesOfSerialPublication(int i) {
        return this.datesOfSerialPublication[i];
    }

    public void setDatesOfSerialPublication(int i, java.lang.String _value) {
        this.datesOfSerialPublication[i] = _value;
    }


    /**
     * Gets the frequency value for this PublicationInfoType.
     * 
     * @return frequency
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FrequencyType[] getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this PublicationInfoType.
     * 
     * @param frequency
     */
    public void setFrequency(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FrequencyType[] frequency) {
        this.frequency = frequency;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FrequencyType getFrequency(int i) {
        return this.frequency[i];
    }

    public void setFrequency(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.FrequencyType _value) {
        this.frequency[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublicationInfoType)) return false;
        PublicationInfoType other = (PublicationInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.placeCode==null && other.getPlaceCode()==null) || 
             (this.placeCode!=null &&
              this.placeCode.equals(other.getPlaceCode()))) &&
            ((this.imprint==null && other.getImprint()==null) || 
             (this.imprint!=null &&
              java.util.Arrays.equals(this.imprint, other.getImprint()))) &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              java.util.Arrays.equals(this.place, other.getPlace()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              java.util.Arrays.equals(this.publisher, other.getPublisher()))) &&
            ((this.dateIssued==null && other.getDateIssued()==null) || 
             (this.dateIssued!=null &&
              java.util.Arrays.equals(this.dateIssued, other.getDateIssued()))) &&
            ((this.projectedPublicationDate==null && other.getProjectedPublicationDate()==null) || 
             (this.projectedPublicationDate!=null &&
              this.projectedPublicationDate.equals(other.getProjectedPublicationDate()))) &&
            ((this.publicationFirstYear==null && other.getPublicationFirstYear()==null) || 
             (this.publicationFirstYear!=null &&
              this.publicationFirstYear.equals(other.getPublicationFirstYear()))) &&
            ((this.publicationEndYear==null && other.getPublicationEndYear()==null) || 
             (this.publicationEndYear!=null &&
              this.publicationEndYear.equals(other.getPublicationEndYear()))) &&
            ((this.edition==null && other.getEdition()==null) || 
             (this.edition!=null &&
              this.edition.equals(other.getEdition()))) &&
            ((this.datesOfSerialPublication==null && other.getDatesOfSerialPublication()==null) || 
             (this.datesOfSerialPublication!=null &&
              java.util.Arrays.equals(this.datesOfSerialPublication, other.getDatesOfSerialPublication()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              java.util.Arrays.equals(this.frequency, other.getFrequency())));
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPlaceCode() != null) {
            _hashCode += getPlaceCode().hashCode();
        }
        if (getImprint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImprint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImprint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlace() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlace());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlace(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPublisher() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublisher());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublisher(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateIssued() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateIssued());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateIssued(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectedPublicationDate() != null) {
            _hashCode += getProjectedPublicationDate().hashCode();
        }
        if (getPublicationFirstYear() != null) {
            _hashCode += getPublicationFirstYear().hashCode();
        }
        if (getPublicationEndYear() != null) {
            _hashCode += getPublicationEndYear().hashCode();
        }
        if (getEdition() != null) {
            _hashCode += getEdition().hashCode();
        }
        if (getDatesOfSerialPublication() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatesOfSerialPublication());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatesOfSerialPublication(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFrequency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFrequency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFrequency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublicationInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PublicationInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PlaceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PlaceCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imprint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Imprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ImprintType_nlmc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PlaceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PublisherType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateIssued");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateIssued"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateIssuedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedPublicationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ProjectedPublicationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationFirstYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PublicationFirstYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationEndYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PublicationEndYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Edition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datesOfSerialPublication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DatesOfSerialPublication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DatesOfSerialPublication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FrequencyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
