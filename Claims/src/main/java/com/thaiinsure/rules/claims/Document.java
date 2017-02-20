package com.thaiinsure.rules.claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Document implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Description("e.g. prescription or bill")
   private java.lang.String documentType;
   private java.util.Date createDate;
   private java.lang.String documentDescription;

   public Document()
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

   public java.lang.String getDocumentDescription()
   {
      return this.documentDescription;
   }

   public void setDocumentDescription(java.lang.String documentDescription)
   {
      this.documentDescription = documentDescription;
   }

   public Document(java.lang.String documentType, java.util.Date createDate,
         java.lang.String documentDescription)
   {
      this.documentType = documentType;
      this.createDate = createDate;
      this.documentDescription = documentDescription;
   }

}