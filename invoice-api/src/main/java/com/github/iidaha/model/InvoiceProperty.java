package com.github.iidaha.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InvoiceProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-04T11:06:55.649Z")

public class InvoiceProperty   {
  @JsonProperty("create_user")
  private String createUser = null;

  @JsonProperty("create_datetime")
  private LocalDateTime createDatetime = null;

  @JsonProperty("update_user")
  private String updateUser = null;

  @JsonProperty("update_datetime")
  private LocalDateTime updateDatetime = null;

  public InvoiceProperty createUser(String createUser) {
    this.createUser = createUser;
    return this;
  }

   /**
   * 登録ユーザID
   * @return createUser
  **/
  @ApiModelProperty(value = "登録ユーザID")

 @Size(max=30)
  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public InvoiceProperty createDatetime(LocalDateTime createDatetime) {
    this.createDatetime = createDatetime;
    return this;
  }

   /**
   * 登録日時
   * @return createDatetime
  **/
  @ApiModelProperty(value = "登録日時")

  @Valid

  public LocalDateTime getCreateDatetime() {
    return createDatetime;
  }

  public void setCreateDatetime(LocalDateTime createDatetime) {
    this.createDatetime = createDatetime;
  }

  public InvoiceProperty updateUser(String updateUser) {
    this.updateUser = updateUser;
    return this;
  }

   /**
   * 更新ユーザID
   * @return updateUser
  **/
  @ApiModelProperty(value = "更新ユーザID")

 @Size(max=30)
  public String getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }

  public InvoiceProperty updateDatetime(LocalDateTime updateDatetime) {
    this.updateDatetime = updateDatetime;
    return this;
  }

   /**
   * 更新日時
   * @return updateDatetime
  **/
  @ApiModelProperty(value = "更新日時")

  @Valid

  public LocalDateTime getUpdateDatetime() {
    return updateDatetime;
  }

  public void setUpdateDatetime(LocalDateTime updateDatetime) {
    this.updateDatetime = updateDatetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceProperty invoiceProperty = (InvoiceProperty) o;
    return Objects.equals(this.createUser, invoiceProperty.createUser) &&
        Objects.equals(this.createDatetime, invoiceProperty.createDatetime) &&
        Objects.equals(this.updateUser, invoiceProperty.updateUser) &&
        Objects.equals(this.updateDatetime, invoiceProperty.updateDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createUser, createDatetime, updateUser, updateDatetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceProperty {\n");

    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    createDatetime: ").append(toIndentedString(createDatetime)).append("\n");
    sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
    sb.append("    updateDatetime: ").append(toIndentedString(updateDatetime)).append("\n");
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

