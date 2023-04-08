package spring.swagger.base.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import spring.swagger.base.model.ResponseType;

@RestController(value = "/spring/swagger")
@Slf4j
public class ExampleController {
	
    //@CrossOrigin Can enable cross origin if needed
    @GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "get example", response = ResponseType.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Successful call") })
    public ResponseEntity<?> get() {
        log.info("Simple get service");
            return new ResponseEntity<ResponseType>(new ResponseType(200, "Simple get service"), HttpStatus.OK);
    }

}
