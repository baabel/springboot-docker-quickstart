package com.equifax.syntheticid.controller;

/**
 * Created by brian.aabel on 2/6/2019.
 */

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.equifax.syntheticid.resource.Alert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.ApiParam;

@Configuration
@RestController
@RequestMapping("/v1/")
public class SyntheticIdBaseController {

    private static final Logger log = LoggerFactory.getLogger(SyntheticIdBaseController.class);

    @PostMapping(value = "/alerts", produces={"application/json"})
    public Alert getSyntheticIdFlags(
            @ApiParam(value = "The oauth access token. The value is in the format: Bearer access_token_value", required = true)
            @RequestHeader(value = "Authorization", required = false) String authorization,
            @ApiParam(value = "The request that be passed from clients", required = true)
            @Valid @RequestBody String payload, HttpServletRequest request) {
        log.debug("Enter");
        Alert alert = new Alert();
        return alert;
    }
}
