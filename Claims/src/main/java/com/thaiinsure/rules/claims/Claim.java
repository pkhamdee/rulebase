package com.thaiinsure.rules.claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Claim implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer claimAmount;
   private java.util.Date dateOfClaim;

   private java.lang.Integer claimPaid;

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

   public java.lang.Integer getClaimPaid()
   {
      return this.claimPaid;
   }

   public void setClaimPaid(java.lang.Integer claimPaid)
   {
      this.claimPaid = claimPaid;
   }

   public Claim(java.lang.Integer claimAmount, java.util.Date dateOfClaim,
         java.lang.Integer claimPaid)
   {
      this.claimAmount = claimAmount;
      this.dateOfClaim = dateOfClaim;
      this.claimPaid = claimPaid;
   }

}