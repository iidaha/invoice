package com.github.iidaha.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 請求状態: [ new: 新規作成, sent: 送付済, paid: 入金確認済, countermand: 廃棄 ]
 */
public enum InvoiceStatus {
  
  NEW("new"),
  
  SENT("sent"),
  
  PAID("paid"),
  
  COUNTERMAND("countermand");

  private String value;

  InvoiceStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static InvoiceStatus fromValue(String text) {
    for (InvoiceStatus b : InvoiceStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

