package com.github.iidaha.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.github.iidaha.model.Client;
import com.github.iidaha.model.InvoiceAmount;
import com.github.iidaha.model.InvoiceDetail;
import com.github.iidaha.model.InvoiceProperty;
import com.github.iidaha.model.InvoiceStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Invoice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-18T22:57:48.981Z")

public class Invoice   {
  @JsonProperty("invoice_no")
  private Integer invoiceNo = null;

  @JsonProperty("invoice_status")
  private InvoiceStatus invoiceStatus = null;

  @JsonProperty("amount")
  private InvoiceAmount amount = null;

  @JsonProperty("detail")
  private InvoiceDetail detail = null;

  @JsonProperty("client")
  private Client client = null;

  @JsonProperty("property")
  private InvoiceProperty property = null;

  public Invoice invoiceNo(Integer invoiceNo) {
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * 請求書管理番号
   * minimum: 0
   * @return invoiceNo
  **/
  @ApiModelProperty(value = "請求書管理番号")

 @Min(0)
  public Integer getInvoiceNo() {
    return invoiceNo;
  }

  public void setInvoiceNo(Integer invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  public Invoice invoiceStatus(InvoiceStatus invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
    return this;
  }

   /**
   * Get invoiceStatus
   * @return invoiceStatus
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InvoiceStatus getInvoiceStatus() {
    return invoiceStatus;
  }

  public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }

  public Invoice amount(InvoiceAmount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InvoiceAmount getAmount() {
    return amount;
  }

  public void setAmount(InvoiceAmount amount) {
    this.amount = amount;
  }

  public Invoice detail(InvoiceDetail detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InvoiceDetail getDetail() {
    return detail;
  }

  public void setDetail(InvoiceDetail detail) {
    this.detail = detail;
  }

  public Invoice client(Client client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Invoice property(InvoiceProperty property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InvoiceProperty getProperty() {
    return property;
  }

  public void setProperty(InvoiceProperty property) {
    this.property = property;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.invoiceNo, invoice.invoiceNo) &&
        Objects.equals(this.invoiceStatus, invoice.invoiceStatus) &&
        Objects.equals(this.amount, invoice.amount) &&
        Objects.equals(this.detail, invoice.detail) &&
        Objects.equals(this.client, invoice.client) &&
        Objects.equals(this.property, invoice.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNo, invoiceStatus, amount, detail, client, property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");

    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

