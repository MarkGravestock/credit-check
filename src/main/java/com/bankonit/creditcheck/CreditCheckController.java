package com.bankonit.creditcheck;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class CreditCheckController {

    @GetMapping("/credit-check/{fullName}")
    ResponseEntity<String> getLoanApplication(@PathVariable("fullName") String fullName) {
        var status = switch (fullName) {
            case "Mark G" -> "BAD";
            default -> "GOOD";
        };

        return ok(status);
    }
}
