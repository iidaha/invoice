package com.github.iidaha.api;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.github.iidaha.model.Error;
import com.github.iidaha.model.Invoice;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-04T11:06:55.649Z")

@Controller
public class InvoicesApiController implements InvoicesApi {



    public ResponseEntity<List<Invoice>> invoicesGet() {
        // do some magic!
        return new ResponseEntity<List<Invoice>>(HttpStatus.OK);
    }

    public ResponseEntity<Invoice> invoicesInvoiceNoGet(@ApiParam(value = "Invoce number",required=true ) @PathVariable("invoice_no") Integer invoiceNo) {
        // do some magic!
        return new ResponseEntity<Invoice>(HttpStatus.OK);
    }

    public ResponseEntity<Invoice> invoicesInvoiceNoPatch(@ApiParam(value = "Invoce number",required=true ) @PathVariable("invoice_no") Integer invoiceNo,
         @Size(max=30)@ApiParam(value = "Invoce status") @RequestParam(value = "status", required = false) String status,
        @ApiParam(value = "Invoice detail to update"  )  @Valid @RequestBody Invoice invoice) {
        // do some magic!
        return new ResponseEntity<Invoice>(HttpStatus.OK);
    }

    public ResponseEntity<Invoice> invoicesPost(@ApiParam(value = "Invoice detail to update"  )  @Valid @RequestBody Invoice invoice) {
        // do some magic!
        return new ResponseEntity<Invoice>(HttpStatus.OK);
    }

}
