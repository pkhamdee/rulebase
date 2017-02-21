package com.thaiinsure.rules.claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ClaimDocument implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Description("e.g. prescription or bill")
   private java.lang.String documentType;
   private java.util.Date createDate;
   private java.lang.String physicianName;

   @org.kie.api.definition.type.Description("e.g. generalPractitioner,  internish, otologist, dentist, cardiologist")
   private java.lang.String physicianCategory;

   private java.lang.Integer medicalFee;

   private java.lang.String hospitalName;

   private java.lang.String treatmentCategory;

   public ClaimDocument()
   {
   }

   public java.lang.String getDocumentType()
   {
      return this.documentType;
   }

   public void setDocumentType(java.lang.String documentType)
   {
      this.documentType = documentType;
   }

   public java.util.Date getCreateDate()
   {
      return this.createDate;
   }

   public void setCreateDate(java.util.Date createDate)
   {
      this.createDate = createDate;
   }

   public java.lang.String getPhysicianName()
   {
      return this.physicianName;
   }

   public void setPhysicianName(java.lang.String physicianName)
   {
      this.physicianName = physicianName;
   }

   public java.lang.String getPhysicianCategory()
   {
      return this.physicianCategory;
   }

   public void setPhysicianCategory(java.lang.String physicianCategory)
   {
      this.physicianCategory = physicianCategory;
   }

   public java.lang.Integer getMedicalFee()
   {
      return this.medicalFee;
   }

   public void setMedicalFee(java.lang.Integer medicalFee)
   {
      this.medicalFee = medicalFee;
   }

   public java.lang.String getHospitalName()
   {
      return this.hospitalName;
   }

   public void setHospitalName(java.lang.String hospitalName)
   {
      this.hospitalName = hospitalName;
   }

   public java.lang.String getTreatmentCategory()
   {
      return this.treatmentCategory;
   }

   public void setTreatmentCategory(java.lang.String treatmentCategory)
   {
      this.treatmentCategory = treatmentCategory;
   }

   public ClaimDocument(java.lang.String documentType, java.util.Date createDate,
         java.lang.String physicianName, java.lang.String physicianCategory,
         java.lang.Integer medicalFee, java.lang.String hospitalName,
         java.lang.String treatmentCategory)
   {
      this.documentType = documentType;
      this.createDate = createDate;
      this.physicianName = physicianName;
      this.physicianCategory = physicianCategory;
      this.medicalFee = medicalFee;
      this.hospitalName = hospitalName;
      this.treatmentCategory = treatmentCategory;
   }

}