package com.github.iidaha.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Client
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-04T11:06:55.649Z")

public class Client   {
  @JsonProperty("client_no")
  private Integer clientNo = null;

  @JsonProperty("client_charge_last_name")
  private String clientChargeLastName = null;

  @JsonProperty("client_charge_first_name")
  private String clientChargeFirstName = null;

  public Client clientNo(Integer clientNo) {
    this.clientNo = clientNo;
    return this;
  }

   /**
   * Get clientNo
   * @return clientNo
  **/
  @ApiModelProperty(value = "")


  public Integer getClientNo() {
    return clientNo;
  }

  public void setClientNo(Integer clientNo) {
    this.clientNo = clientNo;
  }

  public Client clientChargeLastName(String clientChargeLastName) {
    this.clientChargeLastName = clientChargeLastName;
    return this;
  }

   /**
   * 顧客担当者氏名（名字）
   * @return clientChargeLastName
  **/
  @ApiModelProperty(value = "顧客担当者氏名（名字）")

 @Size(max=150)
  public String getClientChargeLastName() {
    return clientChargeLastName;
  }

  public void setClientChargeLastName(String clientChargeLastName) {
    this.clientChargeLastName = clientChargeLastName;
  }

  public Client clientChargeFirstName(String clientChargeFirstName) {
    this.clientChargeFirstName = clientChargeFirstName;
    return this;
  }

   /**
   * 顧客担当者氏名（名前）
   * @return clientChargeFirstName
  **/
  @ApiModelProperty(value = "顧客担当者氏名（名前）")

 @Size(max=150)
  public String getClientChargeFirstName() {
    return clientChargeFirstName;
  }

  public void setClientChargeFirstName(String clientChargeFirstName) {
    this.clientChargeFirstName = clientChargeFirstName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.clientNo, client.clientNo) &&
        Objects.equals(this.clientChargeLastName, client.clientChargeLastName) &&
        Objects.equals(this.clientChargeFirstName, client.clientChargeFirstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientNo, clientChargeLastName, clientChargeFirstName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("    clientNo: ").append(toIndentedString(clientNo)).append("\n");
    sb.append("    clientChargeLastName: ").append(toIndentedString(clientChargeLastName)).append("\n");
    sb.append("    clientChargeFirstName: ").append(toIndentedString(clientChargeFirstName)).append("\n");
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

