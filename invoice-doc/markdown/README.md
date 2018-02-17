# Invoice API Specification


<a name="overview"></a>
## Overview
Invoice API Interface Specification


### Version information
*Version* : 1.0.0


### URI scheme
*Host* : localhost




<a name="paths"></a>
## Paths

<a name="invoices-post"></a>
### Create new Invoice
```
POST /invoices
```


#### Description
Create new a single invoice


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**invoice**  <br>*optional*|Invoice detail to update|[invoice](#invoices-post-invoice)|

<a name="invoices-post-invoice"></a>
**invoice**

|Name|Description|Schema|
|---|---|---|
|**client_no**  <br>*required*|Client number  <br>**Minimum value (exclusive)** : `0`  <br>**Example** : `0`|integer (int32)|
|**detail**  <br>*required*|**Example** : `"[invoicedetail](#invoicedetail)"`|[InvoiceDetail](#invoicedetail)|
|**user_id**  <br>*required*|User ID  <br>**Maximal length** : `30`  <br>**Example** : `"string"`|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|successful operation|[Invoice](#invoice)|
|**400**|Bad reauest|[Error](#error)|


#### Consumes

* `application/json`


#### Produces

* `application/json`


#### Tags

* invoices


#### Example HTTP request

##### Request path
```
/invoices
```


##### Request body
```json
{
  "user_id" : "string",
  "client_no" : 0,
  "detail" : {
    "invoice_create_date" : "string",
    "invoice_title" : "string",
    "invoice_start_date" : "string",
    "invoice_end_date" : "string",
    "invoice_note" : "string"
  }
}
```


#### Example HTTP response

##### Response 200
```json
{
  "invoice_no" : 0,
  "invoice_status" : { },
  "amount" : {
    "invoice_amt" : 0,
    "tax_amt" : 0
  },
  "detail" : {
    "invoice_create_date" : "string",
    "invoice_title" : "string",
    "invoice_start_date" : "string",
    "invoice_end_date" : "string",
    "invoice_note" : "string"
  },
  "client" : {
    "client_no" : { },
    "client_charge_last_name" : "string",
    "client_charge_first_name" : "string"
  },
  "property" : "object"
}
```


##### Response 400
```json
{
  "code" : "string",
  "message" : "string"
}
```


<a name="invoices-get"></a>
### Get invoice list
```
GET /invoices
```


#### Description
Return invoice list


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|successful operation|< [Invoice](#invoice) > array|


#### Produces

* `application/json`


#### Tags

* invoices


#### Example HTTP request

##### Request path
```
/invoices
```


#### Example HTTP response

##### Response 200
```json
[ {
  "invoice_no" : 0,
  "invoice_status" : { },
  "amount" : {
    "invoice_amt" : 0,
    "tax_amt" : 0
  },
  "detail" : {
    "invoice_create_date" : "string",
    "invoice_title" : "string",
    "invoice_start_date" : "string",
    "invoice_end_date" : "string",
    "invoice_note" : "string"
  },
  "client" : {
    "client_no" : { },
    "client_charge_last_name" : "string",
    "client_charge_first_name" : "string"
  },
  "property" : "object"
} ]
```


<a name="invoices-invoice_no-get"></a>
### Finds invoice by ID
```
GET /invoices/{invoice_no}
```


#### Description
Return a single invoice


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**invoice_no**  <br>*required*|Invoce number|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|successful operation|[Invoice](#invoice)|
|**400**|Bad reauest|[Error](#error)|


#### Produces

* `application/json`


#### Tags

* invoices


#### Example HTTP request

##### Request path
```
/invoices/0
```


#### Example HTTP response

##### Response 200
```json
{
  "invoice_no" : 0,
  "invoice_status" : { },
  "amount" : {
    "invoice_amt" : 0,
    "tax_amt" : 0
  },
  "detail" : {
    "invoice_create_date" : "string",
    "invoice_title" : "string",
    "invoice_start_date" : "string",
    "invoice_end_date" : "string",
    "invoice_note" : "string"
  },
  "client" : {
    "client_no" : { },
    "client_charge_last_name" : "string",
    "client_charge_first_name" : "string"
  },
  "property" : "object"
}
```


##### Response 400
```json
{
  "code" : "string",
  "message" : "string"
}
```


<a name="invoices-invoice_no-patch"></a>
### Update invoice
```
PATCH /invoices/{invoice_no}
```


#### Description
Update a single invoice


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**invoice_no**  <br>*required*|Invoce number|integer (int32)|
|**Query**|**status**  <br>*optional*|Invoce status|string|
|**Body**|**invoice**  <br>*optional*|Invoice detail to update|[invoice](#invoices-invoice_no-patch-invoice)|

<a name="invoices-invoice_no-patch-invoice"></a>
**invoice**

|Name|Description|Schema|
|---|---|---|
|**client_no**  <br>*required*|Client number  <br>**Minimum value (exclusive)** : `0`  <br>**Example** : `0`|integer (int32)|
|**detail**  <br>*required*|**Example** : `"[invoicedetail](#invoicedetail)"`|[InvoiceDetail](#invoicedetail)|
|**user_id**  <br>*required*|User ID  <br>**Maximal length** : `30`  <br>**Example** : `"string"`|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|successful operation|[Invoice](#invoice)|
|**400**|Bad reauest|[Error](#error)|


#### Consumes

* `application/json`


#### Produces

* `application/json`


#### Tags

* invoices


#### Example HTTP request

##### Request path
```
/invoices/0
```


##### Request query
```json
{
  "status" : "string"
}
```


##### Request body
```json
{
  "user_id" : "string",
  "client_no" : 0,
  "detail" : {
    "invoice_create_date" : "string",
    "invoice_title" : "string",
    "invoice_start_date" : "string",
    "invoice_end_date" : "string",
    "invoice_note" : "string"
  }
}
```


#### Example HTTP response

##### Response 200
```json
{
  "invoice_no" : 0,
  "invoice_status" : { },
  "amount" : {
    "invoice_amt" : 0,
    "tax_amt" : 0
  },
  "detail" : {
    "invoice_create_date" : "string",
    "invoice_title" : "string",
    "invoice_start_date" : "string",
    "invoice_end_date" : "string",
    "invoice_note" : "string"
  },
  "client" : {
    "client_no" : { },
    "client_charge_last_name" : "string",
    "client_charge_first_name" : "string"
  },
  "property" : "object"
}
```


##### Response 400
```json
{
  "code" : "string",
  "message" : "string"
}
```




<a name="definitions"></a>
## Definitions

<a name="client"></a>
### Client

|Name|Description|Schema|
|---|---|---|
|**client_charge_first_name**  <br>*optional*|顧客担当者氏名（名前）  <br>**Maximal length** : `150`  <br>**Example** : `"string"`|string|
|**client_charge_last_name**  <br>*optional*|顧客担当者氏名（名字）  <br>**Maximal length** : `150`  <br>**Example** : `"string"`|string|
|**client_no**  <br>*optional*|**Example** : `"[clientnumber](#clientnumber)"`|[ClientNumber](#clientnumber)|


<a name="clientnumber"></a>
### ClientNumber
顧客管理番号

*Type* : integer (int32)


<a name="error"></a>
### Error

|Name|Description|Schema|
|---|---|---|
|**code**  <br>*required*|**Example** : `"string"`|string|
|**message**  <br>*required*|**Example** : `"string"`|string|


<a name="invoice"></a>
### Invoice

|Name|Description|Schema|
|---|---|---|
|**amount**  <br>*optional*|**Example** : `"[invoiceamount](#invoiceamount)"`|[InvoiceAmount](#invoiceamount)|
|**client**  <br>*optional*|**Example** : `"[client](#client)"`|[Client](#client)|
|**detail**  <br>*optional*|**Example** : `"[invoicedetail](#invoicedetail)"`|[InvoiceDetail](#invoicedetail)|
|**invoice_no**  <br>*optional*|請求書管理番号  <br>**Minimum value (exclusive)** : `0`  <br>**Example** : `0`|integer (int32)|
|**invoice_status**  <br>*optional*|**Example** : `"[invoicestatus](#invoicestatus)"`|[InvoiceStatus](#invoicestatus)|
|**property**  <br>*optional*|**Example** : `"object"`|[property](#invoice-property)|

<a name="invoice-property"></a>
**property**

|Name|Description|Schema|
|---|---|---|
|**create_datetime**  <br>*optional*|登録日時  <br>**Example** : `"string"`|string (date-time)|
|**create_user**  <br>*optional*|登録ユーザID  <br>**Maximal length** : `30`  <br>**Example** : `"string"`|string|
|**update_datetime**  <br>*optional*|更新日時  <br>**Example** : `"string"`|string (date-time)|
|**update_user**  <br>*optional*|更新ユーザID  <br>**Maximal length** : `30`  <br>**Example** : `"string"`|string|


<a name="invoiceamount"></a>
### InvoiceAmount

|Name|Description|Schema|
|---|---|---|
|**invoice_amt**  <br>*optional*|請求金額  <br>**Minimum value (exclusive)** : `0`  <br>**Example** : `0`|integer (int32)|
|**tax_amt**  <br>*optional*|消費税  <br>**Minimum value** : `0`  <br>**Example** : `0`|integer (int32)|


<a name="invoicedetail"></a>
### InvoiceDetail

|Name|Description|Schema|
|---|---|---|
|**invoice_create_date**  <br>*optional*|請求書作成日  <br>**Example** : `"string"`|string (date)|
|**invoice_end_date**  <br>*optional*|請求期間終了日  <br>**Example** : `"string"`|string (date)|
|**invoice_note**  <br>*optional*|備考  <br>**Maximal length** : `3000`  <br>**Example** : `"string"`|string|
|**invoice_start_date**  <br>*optional*|請求期間開始日  <br>**Example** : `"string"`|string (date)|
|**invoice_title**  <br>*optional*|請求書件名  <br>**Maximal length** : `300`  <br>**Example** : `"string"`|string|


<a name="invoicestatus"></a>
### InvoiceStatus
請求状態:
[ new: 新規作成, sent: 送付済, paid: 入金確認済, countermand: 廃棄 ]

*Type* : enum (new, sent, paid, countermand)





