package com.github.iidaha.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InvoiceAmount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-04T11:06:55.649Z")

public class InvoiceAmount   {
  @JsonProperty("invoice_amt")
  private Integer invoiceAmt = null;

  @JsonProperty("tax_amt")
  private Integer taxAmt = null;

  public InvoiceAmount invoiceAmt(Integer invoiceAmt) {
    this.invoiceAmt = invoiceAmt;
    return this;
  }

   /**
   * 請求金額
   * minimum: 0
   * @return invoiceAmt
  **/
  @ApiModelProperty(value = "請求金額")

 @Min(0)
  public Integer getInvoiceAmt() {
    return invoiceAmt;
  }

  public void setInvoiceAmt(Integer invoiceAmt) {
    this.invoiceAmt = invoiceAmt;
  }

  public InvoiceAmount taxAmt(Integer taxAmt) {
    this.taxAmt = taxAmt;
    return this;
  }

   /**
   * 消費税
   * minimum: 0
   * @return taxAmt
  **/
  @ApiModelProperty(value = "消費税")

 @Min(0)
  public Integer getTaxAmt() {
    return taxAmt;
  }

  public void setTaxAmt(Integer taxAmt) {
    this.taxAmt = taxAmt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceAmount invoiceAmount = (InvoiceAmount) o;
    return Objects.equals(this.invoiceAmt, invoiceAmount.invoiceAmt) &&
        Objects.equals(this.taxAmt, invoiceAmount.taxAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceAmt, taxAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceAmount {\n");
    
    sb.append("    invoiceAmt: ").append(toIndentedString(invoiceAmt)).append("\n");
    sb.append("    taxAmt: ").append(toIndentedString(taxAmt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

