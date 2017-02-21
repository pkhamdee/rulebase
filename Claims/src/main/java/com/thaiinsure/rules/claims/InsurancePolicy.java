package com.thaiinsure.rules.claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InsurancePolicy implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.util.Date startDate;

   private java.util.Date expiryDate;

   private java.lang.String customerId;

   private java.lang.String termConditionDescription;

   private java.lang.String policyNumber;

   private java.lang.String applicationId;

   private java.util.List<com.thaiinsure.rules.claims.Coverage> coverage;

   public InsurancePolicy()
   {
   }

   public java.util.Date getStartDate()
   {
      return this.startDate;
   }

   public void setStartDate(java.util.Date startDate)
   {
      this.startDate = startDate;
   }

   public java.util.Date getExpiryDate()
   {
      return this.expiryDate;
   }

   public void setExpiryDate(java.util.Date expiryDate)
   {
      this.expiryDate = expiryDate;
   }

   public java.lang.String getCustomerId()
   {
      return this.customerId;
   }

   public void setCustomerId(java.lang.String customerId)
   {
      this.customerId = customerId;
   }

   public java.lang.String getTermConditionDescription()
   {
      return this.termConditionDescription;
   }

   public void setTermConditionDescription(
         java.lang.String termConditionDescription)
   {
      this.termConditionDescription = termConditionDescription;
   }

   public java.lang.String getPolicyNumber()
   {
      return this.policyNumber;
   }

   public void setPolicyNumber(java.lang.String policyNumber)
   {
      this.policyNumber = policyNumber;
   }

   public java.lang.String getApplicationId()
   {
      return this.applicationId;
   }

   public void setApplicationId(java.lang.String applicationId)
   {
      this.applicationId = applicationId;
   }

   public java.util.List<com.thaiinsure.rules.claims.Coverage> getCoverage()
   {
      return this.coverage;
   }

   public void setCoverage(
         java.util.List<com.thaiinsure.rules.claims.Coverage> coverage)
   {
      this.coverage = coverage;
   }

   public InsurancePolicy(java.util.Date startDate, java.util.Date expiryDate,
         java.lang.String customerId, java.lang.String termConditionDescription,
         java.lang.String policyNumber, java.lang.String applicationId,
         java.util.List<com.thaiinsure.rules.claims.Coverage> coverage)
   {
      this.startDate = startDate;
      this.expiryDate = expiryDate;
      this.customerId = customerId;
      this.termConditionDescription = termConditionDescription;
      this.policyNumber = policyNumber;
      this.applicationId = applicationId;
      this.coverage = coverage;
   }

}