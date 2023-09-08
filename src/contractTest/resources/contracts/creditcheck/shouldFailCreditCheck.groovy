package contracts.creditcheck

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name("credit_check_pass")
    request {
        description("""
            Represents a failed credit check
            
            given:
                client is not credit worthy
            when:
                they attempt a credit check
            then:
                the credit check will fail
            """)
        method 'GET'
        url '/credit-check/Mark'
        headers {
            contentType textPlain()
        }
    }
    response {
        status OK()
        body("BAD")
        headers {
            contentType textPlain()
        }
    }
}
