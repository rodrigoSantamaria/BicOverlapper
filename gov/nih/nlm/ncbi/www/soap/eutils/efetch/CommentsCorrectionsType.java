/**
 * CommentsCorrectionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CommentsCorrectionsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentOnType[] commentOn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentInType[] commentIn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ErratumInType[] erratumIn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ErratumForType[] erratumFor;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RepublishedFromType[] republishedFrom;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RepublishedInType[] republishedIn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RetractionOfType[] retractionOf;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RetractionInType[] retractionIn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateInType[] updateIn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateOfType[] updateOf;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SummaryForPatientsInType[] summaryForPatientsIn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OriginalReportInType[] originalReportIn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReprintOfType[] reprintOf;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReprintInType[] reprintIn;

    public CommentsCorrectionsType() {
    }

    public CommentsCorrectionsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentOnType[] commentOn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentInType[] commentIn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ErratumInType[] erratumIn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ErratumForType[] erratumFor,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RepublishedFromType[] republishedFrom,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RepublishedInType[] republishedIn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RetractionOfType[] retractionOf,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RetractionInType[] retractionIn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateInType[] updateIn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateOfType[] updateOf,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SummaryForPatientsInType[] summaryForPatientsIn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.OriginalReportInType[] originalReportIn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReprintOfType[] reprintOf,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReprintInType[] reprintIn) {
           this.commentOn = commentOn;
           this.commentIn = commentIn;
           this.erratumIn = erratumIn;
           this.erratumFor = erratumFor;
           this.republishedFrom = republishedFrom;
           this.republishedIn = republishedIn;
           this.retractionOf = retractionOf;
           this.retractionIn = retractionIn;
           this.updateIn = updateIn;
           this.updateOf = updateOf;
           this.summaryForPatientsIn = summaryForPatientsIn;
           this.originalReportIn = originalReportIn;
           this.reprintOf = reprintOf;
           this.reprintIn = reprintIn;
    }


    /**
     * Gets the commentOn value for this CommentsCorrectionsType.
     * 
     * @return commentOn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentOnType[] getCommentOn() {
        return commentOn;
    }


    /**
     * Sets the commentOn value for this CommentsCorrectionsType.
     * 
     * @param commentOn
     */
    public void setCommentOn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentOnType[] commentOn) {
        this.commentOn = commentOn;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentOnType getCommentOn(int i) {
        return this.commentOn[i];
    }

    public void setCommentOn(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentOnType _value) {
        this.commentOn[i] = _value;
    }


    /**
     * Gets the commentIn value for this CommentsCorrectionsType.
     * 
     * @return commentIn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentInType[] getCommentIn() {
        return commentIn;
    }


    /**
     * Sets the commentIn value for this CommentsCorrectionsType.
     * 
     * @param commentIn
     */
    public void setCommentIn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentInType[] commentIn) {
        this.commentIn = commentIn;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentInType getCommentIn(int i) {
        return this.commentIn[i];
    }

    public void setCommentIn(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CommentInType _value) {
        this.commentIn[i] = _value;
    }


    /**
     * Gets the erratumIn value for this CommentsCorrectionsType.
     * 
     * @return erratumIn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ErratumInType[] getErratumIn() {
        return erratumIn;
    }


    /**
     * Sets the erratumIn value for this CommentsCorrectionsType.
     * 
     * @param erratumIn
     */
    public void setErratumIn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ErratumInType[] erratumIn) {
        this.erratumIn = erratumIn;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ErratumInType getErratumIn(int i) {
        return this.erratumIn[i];
    }

    public void setErratumIn(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ErratumInType _value) {
        this.erratumIn[i] = _value;
    }


    /**
     * Gets the erratumFor value for this CommentsCorrectionsType.
     * 
     * @return erratumFor
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ErratumForType[] getErratumFor() {
        return erratumFor;
    }


    /**
     * Sets the erratumFor value for this CommentsCorrectionsType.
     * 
     * @param erratumFor
     */
    public void setErratumFor(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ErratumForType[] erratumFor) {
        this.erratumFor = erratumFor;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ErratumForType getErratumFor(int i) {
        return this.erratumFor[i];
    }

    public void setErratumFor(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ErratumForType _value) {
        this.erratumFor[i] = _value;
    }


    /**
     * Gets the republishedFrom value for this CommentsCorrectionsType.
     * 
     * @return republishedFrom
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RepublishedFromType[] getRepublishedFrom() {
        return republishedFrom;
    }


    /**
     * Sets the republishedFrom value for this CommentsCorrectionsType.
     * 
     * @param republishedFrom
     */
    public void setRepublishedFrom(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RepublishedFromType[] republishedFrom) {
        this.republishedFrom = republishedFrom;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RepublishedFromType getRepublishedFrom(int i) {
        return this.republishedFrom[i];
    }

    public void setRepublishedFrom(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.RepublishedFromType _value) {
        this.republishedFrom[i] = _value;
    }


    /**
     * Gets the republishedIn value for this CommentsCorrectionsType.
     * 
     * @return republishedIn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RepublishedInType[] getRepublishedIn() {
        return republishedIn;
    }


    /**
     * Sets the republishedIn value for this CommentsCorrectionsType.
     * 
     * @param republishedIn
     */
    public void setRepublishedIn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RepublishedInType[] republishedIn) {
        this.republishedIn = republishedIn;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RepublishedInType getRepublishedIn(int i) {
        return this.republishedIn[i];
    }

    public void setRepublishedIn(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.RepublishedInType _value) {
        this.republishedIn[i] = _value;
    }


    /**
     * Gets the retractionOf value for this CommentsCorrectionsType.
     * 
     * @return retractionOf
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RetractionOfType[] getRetractionOf() {
        return retractionOf;
    }


    /**
     * Sets the retractionOf value for this CommentsCorrectionsType.
     * 
     * @param retractionOf
     */
    public void setRetractionOf(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RetractionOfType[] retractionOf) {
        this.retractionOf = retractionOf;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RetractionOfType getRetractionOf(int i) {
        return this.retractionOf[i];
    }

    public void setRetractionOf(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.RetractionOfType _value) {
        this.retractionOf[i] = _value;
    }


    /**
     * Gets the retractionIn value for this CommentsCorrectionsType.
     * 
     * @return retractionIn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RetractionInType[] getRetractionIn() {
        return retractionIn;
    }


    /**
     * Sets the retractionIn value for this CommentsCorrectionsType.
     * 
     * @param retractionIn
     */
    public void setRetractionIn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RetractionInType[] retractionIn) {
        this.retractionIn = retractionIn;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RetractionInType getRetractionIn(int i) {
        return this.retractionIn[i];
    }

    public void setRetractionIn(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.RetractionInType _value) {
        this.retractionIn[i] = _value;
    }


    /**
     * Gets the updateIn value for this CommentsCorrectionsType.
     * 
     * @return updateIn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateInType[] getUpdateIn() {
        return updateIn;
    }


    /**
     * Sets the updateIn value for this CommentsCorrectionsType.
     * 
     * @param updateIn
     */
    public void setUpdateIn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateInType[] updateIn) {
        this.updateIn = updateIn;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateInType getUpdateIn(int i) {
        return this.updateIn[i];
    }

    public void setUpdateIn(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateInType _value) {
        this.updateIn[i] = _value;
    }


    /**
     * Gets the updateOf value for this CommentsCorrectionsType.
     * 
     * @return updateOf
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateOfType[] getUpdateOf() {
        return updateOf;
    }


    /**
     * Sets the updateOf value for this CommentsCorrectionsType.
     * 
     * @param updateOf
     */
    public void setUpdateOf(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateOfType[] updateOf) {
        this.updateOf = updateOf;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateOfType getUpdateOf(int i) {
        return this.updateOf[i];
    }

    public void setUpdateOf(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.UpdateOfType _value) {
        this.updateOf[i] = _value;
    }


    /**
     * Gets the summaryForPatientsIn value for this CommentsCorrectionsType.
     * 
     * @return summaryForPatientsIn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SummaryForPatientsInType[] getSummaryForPatientsIn() {
        return summaryForPatientsIn;
    }


    /**
     * Sets the summaryForPatientsIn value for this CommentsCorrectionsType.
     * 
     * @param summaryForPatientsIn
     */
    public void setSummaryForPatientsIn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SummaryForPatientsInType[] summaryForPatientsIn) {
        this.summaryForPatientsIn = summaryForPatientsIn;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SummaryForPatientsInType getSummaryForPatientsIn(int i) {
        return this.summaryForPatientsIn[i];
    }

    public void setSummaryForPatientsIn(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SummaryForPatientsInType _value) {
        this.summaryForPatientsIn[i] = _value;
    }


    /**
     * Gets the originalReportIn value for this CommentsCorrectionsType.
     * 
     * @return originalReportIn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OriginalReportInType[] getOriginalReportIn() {
        return originalReportIn;
    }


    /**
     * Sets the originalReportIn value for this CommentsCorrectionsType.
     * 
     * @param originalReportIn
     */
    public void setOriginalReportIn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OriginalReportInType[] originalReportIn) {
        this.originalReportIn = originalReportIn;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OriginalReportInType getOriginalReportIn(int i) {
        return this.originalReportIn[i];
    }

    public void setOriginalReportIn(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.OriginalReportInType _value) {
        this.originalReportIn[i] = _value;
    }


    /**
     * Gets the reprintOf value for this CommentsCorrectionsType.
     * 
     * @return reprintOf
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReprintOfType[] getReprintOf() {
        return reprintOf;
    }


    /**
     * Sets the reprintOf value for this CommentsCorrectionsType.
     * 
     * @param reprintOf
     */
    public void setReprintOf(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReprintOfType[] reprintOf) {
        this.reprintOf = reprintOf;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReprintOfType getReprintOf(int i) {
        return this.reprintOf[i];
    }

    public void setReprintOf(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReprintOfType _value) {
        this.reprintOf[i] = _value;
    }


    /**
     * Gets the reprintIn value for this CommentsCorrectionsType.
     * 
     * @return reprintIn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReprintInType[] getReprintIn() {
        return reprintIn;
    }


    /**
     * Sets the reprintIn value for this CommentsCorrectionsType.
     * 
     * @param reprintIn
     */
    public void setReprintIn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReprintInType[] reprintIn) {
        this.reprintIn = reprintIn;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReprintInType getReprintIn(int i) {
        return this.reprintIn[i];
    }

    public void setReprintIn(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ReprintInType _value) {
        this.reprintIn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommentsCorrectionsType)) return false;
        CommentsCorrectionsType other = (CommentsCorrectionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commentOn==null && other.getCommentOn()==null) || 
             (this.commentOn!=null &&
              java.util.Arrays.equals(this.commentOn, other.getCommentOn()))) &&
            ((this.commentIn==null && other.getCommentIn()==null) || 
             (this.commentIn!=null &&
              java.util.Arrays.equals(this.commentIn, other.getCommentIn()))) &&
            ((this.erratumIn==null && other.getErratumIn()==null) || 
             (this.erratumIn!=null &&
              java.util.Arrays.equals(this.erratumIn, other.getErratumIn()))) &&
            ((this.erratumFor==null && other.getErratumFor()==null) || 
             (this.erratumFor!=null &&
              java.util.Arrays.equals(this.erratumFor, other.getErratumFor()))) &&
            ((this.republishedFrom==null && other.getRepublishedFrom()==null) || 
             (this.republishedFrom!=null &&
              java.util.Arrays.equals(this.republishedFrom, other.getRepublishedFrom()))) &&
            ((this.republishedIn==null && other.getRepublishedIn()==null) || 
             (this.republishedIn!=null &&
              java.util.Arrays.equals(this.republishedIn, other.getRepublishedIn()))) &&
            ((this.retractionOf==null && other.getRetractionOf()==null) || 
             (this.retractionOf!=null &&
              java.util.Arrays.equals(this.retractionOf, other.getRetractionOf()))) &&
            ((this.retractionIn==null && other.getRetractionIn()==null) || 
             (this.retractionIn!=null &&
              java.util.Arrays.equals(this.retractionIn, other.getRetractionIn()))) &&
            ((this.updateIn==null && other.getUpdateIn()==null) || 
             (this.updateIn!=null &&
              java.util.Arrays.equals(this.updateIn, other.getUpdateIn()))) &&
            ((this.updateOf==null && other.getUpdateOf()==null) || 
             (this.updateOf!=null &&
              java.util.Arrays.equals(this.updateOf, other.getUpdateOf()))) &&
            ((this.summaryForPatientsIn==null && other.getSummaryForPatientsIn()==null) || 
             (this.summaryForPatientsIn!=null &&
              java.util.Arrays.equals(this.summaryForPatientsIn, other.getSummaryForPatientsIn()))) &&
            ((this.originalReportIn==null && other.getOriginalReportIn()==null) || 
             (this.originalReportIn!=null &&
              java.util.Arrays.equals(this.originalReportIn, other.getOriginalReportIn()))) &&
            ((this.reprintOf==null && other.getReprintOf()==null) || 
             (this.reprintOf!=null &&
              java.util.Arrays.equals(this.reprintOf, other.getReprintOf()))) &&
            ((this.reprintIn==null && other.getReprintIn()==null) || 
             (this.reprintIn!=null &&
              java.util.Arrays.equals(this.reprintIn, other.getReprintIn())));
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
        if (getCommentOn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommentOn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommentOn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommentIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommentIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommentIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErratumIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErratumIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErratumIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErratumFor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErratumFor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErratumFor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRepublishedFrom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepublishedFrom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepublishedFrom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRepublishedIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepublishedIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepublishedIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRetractionOf() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRetractionOf());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRetractionOf(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRetractionIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRetractionIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRetractionIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUpdateIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpdateIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpdateIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUpdateOf() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpdateOf());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpdateOf(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSummaryForPatientsIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSummaryForPatientsIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSummaryForPatientsIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOriginalReportIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOriginalReportIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOriginalReportIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReprintOf() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReprintOf());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReprintOf(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReprintIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReprintIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReprintIn(), i);
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
        new org.apache.axis.description.TypeDesc(CommentsCorrectionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CommentsCorrectionsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CommentOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CommentOnType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CommentIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CommentInType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erratumIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ErratumIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ErratumInType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erratumFor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ErratumFor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ErratumForType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("republishedFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RepublishedFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RepublishedFromType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("republishedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RepublishedIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RepublishedInType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retractionOf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RetractionOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RetractionOfType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retractionIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RetractionIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RetractionInType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "UpdateIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "UpdateInType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateOf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "UpdateOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "UpdateOfType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryForPatientsIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SummaryForPatientsIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SummaryForPatientsInType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalReportIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OriginalReportIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OriginalReportInType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reprintOf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ReprintOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ReprintOfType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reprintIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ReprintIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ReprintInType"));
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
