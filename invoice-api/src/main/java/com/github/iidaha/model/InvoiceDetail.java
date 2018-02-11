package com.github.iidaha.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InvoiceDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-04T11:06:55.649Z")

public class InvoiceDetail   {
  @JsonProperty("invoice_create_date")
  private LocalDate invoiceCreateDate = null;

  @JsonProperty("invoice_title")
  private String invoiceTitle = null;

  @JsonProperty("invoice_start_date")
  private LocalDate invoiceStartDate = null;

  @JsonProperty("invoice_end_date")
  private LocalDate invoiceEndDate = null;

  @JsonProperty("invoice_note")
  private String invoiceNote = null;

  public InvoiceDetail invoiceCreateDate(LocalDate invoiceCreateDate) {
    this.invoiceCreateDate = invoiceCreateDate;
    return this;
  }

   /**
   * 請求書作成日
   * @return invoiceCreateDate
  **/
  @ApiModelProperty(value = "請求書作成日")

  @Valid

  public LocalDate getInvoiceCreateDate() {
    return invoiceCreateDate;
  }

  public void setInvoiceCreateDate(LocalDate invoiceCreateDate) {
    this.invoiceCreateDate = invoiceCreateDate;
  }

  public InvoiceDetail invoiceTitle(String invoiceTitle) {
    this.invoiceTitle = invoiceTitle;
    return this;
  }

   /**
   * 請求書件名
   * @return invoiceTitle
  **/
  @ApiModelProperty(value = "請求書件名")

 @Size(max=300)
  public String getInvoiceTitle() {
    return invoiceTitle;
  }

  public void setInvoiceTitle(String invoiceTitle) {
    this.invoiceTitle = invoiceTitle;
  }

  public InvoiceDetail invoiceStartDate(LocalDate invoiceStartDate) {
    this.invoiceStartDate = invoiceStartDate;
    return this;
  }

   /**
   * 請求期間開始日
   * @return invoiceStartDate
  **/
  @ApiModelProperty(value = "請求期間開始日")

  @Valid

  public LocalDate getInvoiceStartDate() {
    return invoiceStartDate;
  }

  public void setInvoiceStartDate(LocalDate invoiceStartDate) {
    this.invoiceStartDate = invoiceStartDate;
  }

  public InvoiceDetail invoiceEndDate(LocalDate invoiceEndDate) {
    this.invoiceEndDate = invoiceEndDate;
    return this;
  }

   /**
   * 請求期間終了日
   * @return invoiceEndDate
  **/
  @ApiModelProperty(value = "請求期間終了日")

  @Valid

  public LocalDate getInvoiceEndDate() {
    return invoiceEndDate;
  }

  public void setInvoiceEndDate(LocalDate invoiceEndDate) {
    this.invoiceEndDate = invoiceEndDate;
  }

  public InvoiceDetail invoiceNote(String invoiceNote) {
    this.invoiceNote = invoiceNote;
    return this;
  }

   /**
   * 備考
   * @return invoiceNote
  **/
  @ApiModelProperty(value = "備考")

 @Size(max=3000)
  public String getInvoiceNote() {
    return invoiceNote;
  }

  public void setInvoiceNote(String invoiceNote) {
    this.invoiceNote = invoiceNote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetail invoiceDetail = (InvoiceDetail) o;
    return Objects.equals(this.invoiceCreateDate, invoiceDetail.invoiceCreateDate) &&
        Objects.equals(this.invoiceTitle, invoiceDetail.invoiceTitle) &&
        Objects.equals(this.invoiceStartDate, invoiceDetail.invoiceStartDate) &&
        Objects.equals(this.invoiceEndDate, invoiceDetail.invoiceEndDate) &&
        Objects.equals(this.invoiceNote, invoiceDetail.invoiceNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceCreateDate, invoiceTitle, invoiceStartDate, invoiceEndDate, invoiceNote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetail {\n");
    
    sb.append("    invoiceCreateDate: ").append(toIndentedString(invoiceCreateDate)).append("\n");
    sb.append("    invoiceTitle: ").append(toIndentedString(invoiceTitle)).append("\n");
    sb.append("    invoiceStartDate: ").append(toIndentedString(invoiceStartDate)).append("\n");
    sb.append("    invoiceEndDate: ").append(toIndentedString(invoiceEndDate)).append("\n");
    sb.append("    invoiceNote: ").append(toIndentedString(invoiceNote)).append("\n");
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

