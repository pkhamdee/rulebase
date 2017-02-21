package com.thaiinsure.rules.claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Claim implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer claimAmount;
   private java.util.Date dateOfClaim;

   @org.kie.api.definition.type.Description("e.g. approved, rejected")
   private java.lang.String claimStatus;

   @org.kie.api.definition.type.Description("fk")
   private String customerId;

   private java.lang.String damageType;

   private java.lang.Integer claimId;

   private java.lang.Integer incidentId;

   private java.lang.String agreementId;

   public Claim()
   {
   }

   public java.lang.Integer getClaimAmount()
   {
      return this.claimAmount;
   }

   public void setClaimAmount(java.lang.Integer claimAmount)
   {
      this.claimAmount = claimAmount;
   }

   public java.util.Date getDateOfClaim()
   {
      return this.dateOfClaim;
   }

   public void setDateOfClaim(java.util.Date dateOfClaim)
   {
      this.dateOfClaim = dateOfClaim;
   }

   public java.lang.String getClaimStatus()
   {
      return this.claimStatus;
   }

   public void setClaimStatus(java.lang.String claimStatus)
   {
      this.claimStatus = claimStatus;
   }

   public java.lang.String getDamageType()
   {
      return this.damageType;
   }

   public void setDamageType(java.lang.String damageType)
   {
      this.damageType = damageType;
   }

   public java.lang.Integer getClaimId()
   {
      return this.claimId;
   }

   public void setClaimId(java.lang.Integer claimId)
   {
      this.claimId = claimId;
   }

   public java.lang.Integer getIncidentId()
   {
      return this.incidentId;
   }

   public void setIncidentId(java.lang.Integer incidentId)
   {
      this.incidentId = incidentId;
   }

   public java.lang.String getCustomerId()
   {
      return this.customerId;
   }

   public void setCustomerId(java.lang.String customerId)
   {
      this.customerId = customerId;
   }

   public java.lang.String getAgreementId()
   {
      return this.agreementId;
   }

   public void setAgreementId(java.lang.String agreementId)
   {
      this.agreementId = agreementId;
   }

   public Claim(java.lang.Integer claimAmount, java.util.Date dateOfClaim,
         java.lang.String claimStatus, java.lang.String customerId,
         java.lang.String damageType, java.lang.Integer claimId,
         java.lang.Integer incidentId, java.lang.String agreementId)
   {
      this.claimAmount = claimAmount;
      this.dateOfClaim = dateOfClaim;
      this.claimStatus = claimStatus;
      this.customerId = customerId;
      this.damageType = damageType;
      this.claimId = claimId;
      this.incidentId = incidentId;
      this.agreementId = agreementId;
   }

}