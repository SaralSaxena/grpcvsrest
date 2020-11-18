package com.saral.api.controller;

import com.saral.api.service.GrpcSquareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("grpc")
public class GrpcServiceController {

    @Autowired
    private GrpcSquareService service;

    @GetMapping("/square/unary/{number}")
    public Flux<Object> getResponseUnary(@PathVariable int number){
        return this.service.getSquareResponseUnary(number);
    }

}
