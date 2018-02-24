package com.github.iidaha.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.github.iidaha.model.InvoiceDetail;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InvoiceParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-18T22:57:48.981Z")

public class InvoiceParams   {
  @JsonProperty("user_id")
  private String userId = null;

  @JsonProperty("client_no")
  private Integer clientNo = null;

  @JsonProperty("detail")
  private InvoiceDetail detail = null;

  public InvoiceParams userId(String userId) {
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

  public InvoiceParams clientNo(Integer clientNo) {
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

  public InvoiceParams detail(InvoiceDetail detail) {
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
    InvoiceParams invoiceParams = (InvoiceParams) o;
    return Objects.equals(this.userId, invoiceParams.userId) &&
        Objects.equals(this.clientNo, invoiceParams.clientNo) &&
        Objects.equals(this.detail, invoiceParams.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, clientNo, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceParams {\n");

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

