package com.bankonit.creditcheck;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class CreditcheckBase {
    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new CreditCheckController());
    }
}
