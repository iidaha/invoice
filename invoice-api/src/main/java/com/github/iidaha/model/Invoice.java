package com.github.iidaha.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.iidaha.model.InvoiceDetail;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Invoice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-04T11:06:55.649Z")

public class Invoice   {
  @JsonProperty("user_id")
  private String userId = null;

  @JsonProperty("client_no")
  private Integer clientNo = null;

  @JsonProperty("detail")
  private InvoiceDetail detail = null;

  public Invoice userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User ID
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "User ID")
  @NotNull

 @Size(max=30)
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Invoice clientNo(Integer clientNo) {
    this.clientNo = clientNo;
    return this;
  }

   /**
   * Client number
   * minimum: 0
   * @return clientNo
  **/
  @ApiModelProperty(required = true, value = "Client number")
  @NotNull

 @Min(0)
  public Integer getClientNo() {
    return clientNo;
  }

  public void setClientNo(Integer clientNo) {
    this.clientNo = clientNo;
  }

  public Invoice detail(InvoiceDetail detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InvoiceDetail getDetail() {
    return detail;
  }

  public void setDetail(InvoiceDetail detail) {
    this.detail = detail;
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
    return Objects.equals(this.userId, invoice.userId) &&
        Objects.equals(this.clientNo, invoice.clientNo) &&
        Objects.equals(this.detail, invoice.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, clientNo, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    clientNo: ").append(toIndentedString(clientNo)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

