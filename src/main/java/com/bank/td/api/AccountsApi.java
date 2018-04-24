package com.bank.td.api;

import com.bank.td.model.Address1;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-04-24T10:13:55.034Z")

@Api(value = "accounts", description = "the accounts API")
public interface AccountsApi {

    @ApiOperation(value = "Create An Account", notes = "Add Account", response = Void.class, tags={ "1_0_0", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/accounts",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> 2(

@ApiParam(value = "Account holder name"  ) @RequestBody String name

,

@ApiParam(value = "Account Type"  ) @RequestBody String type

,

@ApiParam(value = "Account Holder Address"  ) @RequestBody Address1 address

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
