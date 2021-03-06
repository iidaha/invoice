/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.github.iidaha.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.iidaha.model.Error;
import com.github.iidaha.model.Invoice;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-04T11:06:55.649Z")

@Api(value = "invoices", description = "the invoices API")
public interface InvoicesApi {

    @ApiOperation(value = "Get invoice list", notes = "Return invoice list", response = Invoice.class, responseContainer = "List", tags = {"invoices",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Invoice.class, responseContainer = "List")})

    @RequestMapping(value = "/invoices",
        produces = {"application/json"},
        method = RequestMethod.GET)
    ResponseEntity<List<Invoice>> invoicesGet();


    @ApiOperation(value = "Finds invoice by ID", notes = "Return a single invoice", response = Invoice.class, tags = {"invoices",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Invoice.class),
        @ApiResponse(code = 400, message = "Bad reauest", response = Error.class)})

    @RequestMapping(value = "/invoices/{invoice_no}",
        produces = {"application/json"},
        method = RequestMethod.GET)
    ResponseEntity<Invoice> invoicesInvoiceNoGet(@ApiParam(value = "Invoce number", required = true) @PathVariable("invoice_no") Integer invoiceNo);


    @CrossOrigin
    @ApiOperation(value = "Update invoice", notes = "Update a single invoice", response = Invoice.class, tags = {"invoices",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Invoice.class),
        @ApiResponse(code = 400, message = "Bad reauest", response = Error.class)})

    @RequestMapping(value = "/invoices/{invoice_no}",
        produces = {"application/json"},
        consumes = {"application/json"},
        method = RequestMethod.PATCH)
    ResponseEntity<Invoice> invoicesInvoiceNoPatch(@ApiParam(value = "Invoce number", required = true) @PathVariable("invoice_no") Integer invoiceNo,
            @Size(max = 30) @ApiParam(value = "Invoce status") @RequestParam(value = "status", required = false) String status, @ApiParam(value = "Invoice detail to update") @Valid @RequestBody Invoice invoice);


    @CrossOrigin
    @ApiOperation(value = "Create new Invoice", notes = "Create new a single invoice", response = Invoice.class, tags = {"invoices",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Invoice.class),
        @ApiResponse(code = 400, message = "Bad reauest", response = Error.class) })

    @RequestMapping(value = "/invoices",
        produces = {"application/json"},
        consumes = {"application/json"},
        method = RequestMethod.POST)
    ResponseEntity<Invoice> invoicesPost(@ApiParam(value = "Invoice detail to update") @Valid @RequestBody Invoice invoice);

}
