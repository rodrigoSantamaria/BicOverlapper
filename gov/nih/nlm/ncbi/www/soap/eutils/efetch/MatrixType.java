/**
 * MatrixType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MatrixType  implements java.io.Serializable {
    private java.lang.String matrix_ncolumns;

    private java.lang.String matrix_nrows;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Matrix_rowLabelsType matrix_rowLabels;

    private java.lang.String matrix_scaleFactor;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Matrix_columnsType matrix_columns;

    public MatrixType() {
    }

    public MatrixType(
           java.lang.String matrix_ncolumns,
           java.lang.String matrix_nrows,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Matrix_rowLabelsType matrix_rowLabels,
           java.lang.String matrix_scaleFactor,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Matrix_columnsType matrix_columns) {
           this.matrix_ncolumns = matrix_ncolumns;
           this.matrix_nrows = matrix_nrows;
           this.matrix_rowLabels = matrix_rowLabels;
           this.matrix_scaleFactor = matrix_scaleFactor;
           this.matrix_columns = matrix_columns;
    }


    /**
     * Gets the matrix_ncolumns value for this MatrixType.
     * 
     * @return matrix_ncolumns
     */
    public java.lang.String getMatrix_ncolumns() {
        return matrix_ncolumns;
    }


    /**
     * Sets the matrix_ncolumns value for this MatrixType.
     * 
     * @param matrix_ncolumns
     */
    public void setMatrix_ncolumns(java.lang.String matrix_ncolumns) {
        this.matrix_ncolumns = matrix_ncolumns;
    }


    /**
     * Gets the matrix_nrows value for this MatrixType.
     * 
     * @return matrix_nrows
     */
    public java.lang.String getMatrix_nrows() {
        return matrix_nrows;
    }


    /**
     * Sets the matrix_nrows value for this MatrixType.
     * 
     * @param matrix_nrows
     */
    public void setMatrix_nrows(java.lang.String matrix_nrows) {
        this.matrix_nrows = matrix_nrows;
    }


    /**
     * Gets the matrix_rowLabels value for this MatrixType.
     * 
     * @return matrix_rowLabels
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Matrix_rowLabelsType getMatrix_rowLabels() {
        return matrix_rowLabels;
    }


    /**
     * Sets the matrix_rowLabels value for this MatrixType.
     * 
     * @param matrix_rowLabels
     */
    public void setMatrix_rowLabels(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Matrix_rowLabelsType matrix_rowLabels) {
        this.matrix_rowLabels = matrix_rowLabels;
    }


    /**
     * Gets the matrix_scaleFactor value for this MatrixType.
     * 
     * @return matrix_scaleFactor
     */
    public java.lang.String getMatrix_scaleFactor() {
        return matrix_scaleFactor;
    }


    /**
     * Sets the matrix_scaleFactor value for this MatrixType.
     * 
     * @param matrix_scaleFactor
     */
    public void setMatrix_scaleFactor(java.lang.String matrix_scaleFactor) {
        this.matrix_scaleFactor = matrix_scaleFactor;
    }


    /**
     * Gets the matrix_columns value for this MatrixType.
     * 
     * @return matrix_columns
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Matrix_columnsType getMatrix_columns() {
        return matrix_columns;
    }


    /**
     * Sets the matrix_columns value for this MatrixType.
     * 
     * @param matrix_columns
     */
    public void setMatrix_columns(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Matrix_columnsType matrix_columns) {
        this.matrix_columns = matrix_columns;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatrixType)) return false;
        MatrixType other = (MatrixType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matrix_ncolumns==null && other.getMatrix_ncolumns()==null) || 
             (this.matrix_ncolumns!=null &&
              this.matrix_ncolumns.equals(other.getMatrix_ncolumns()))) &&
            ((this.matrix_nrows==null && other.getMatrix_nrows()==null) || 
             (this.matrix_nrows!=null &&
              this.matrix_nrows.equals(other.getMatrix_nrows()))) &&
            ((this.matrix_rowLabels==null && other.getMatrix_rowLabels()==null) || 
             (this.matrix_rowLabels!=null &&
              this.matrix_rowLabels.equals(other.getMatrix_rowLabels()))) &&
            ((this.matrix_scaleFactor==null && other.getMatrix_scaleFactor()==null) || 
             (this.matrix_scaleFactor!=null &&
              this.matrix_scaleFactor.equals(other.getMatrix_scaleFactor()))) &&
            ((this.matrix_columns==null && other.getMatrix_columns()==null) || 
             (this.matrix_columns!=null &&
              this.matrix_columns.equals(other.getMatrix_columns())));
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
        if (getMatrix_ncolumns() != null) {
            _hashCode += getMatrix_ncolumns().hashCode();
        }
        if (getMatrix_nrows() != null) {
            _hashCode += getMatrix_nrows().hashCode();
        }
        if (getMatrix_rowLabels() != null) {
            _hashCode += getMatrix_rowLabels().hashCode();
        }
        if (getMatrix_scaleFactor() != null) {
            _hashCode += getMatrix_scaleFactor().hashCode();
        }
        if (getMatrix_columns() != null) {
            _hashCode += getMatrix_columns().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatrixType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MatrixType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix_ncolumns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Matrix_ncolumns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix_nrows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Matrix_nrows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix_rowLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Matrix_row-labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Matrix_row-labelsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix_scaleFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Matrix_scale-factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix_columns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Matrix_columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Matrix_columnsType"));
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
