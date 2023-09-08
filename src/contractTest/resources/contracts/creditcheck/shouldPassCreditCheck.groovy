package contracts.creditcheck

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name("credit_check_fail")
    request {
            description("""
Represents a successful credit check

given:
	client is credit worthy
when:
	they attempt a credit check
then:
	the credit check will pass
""")
            method 'GET'
            url '/credit-check/Brad'
            headers {
                contentType textPlain()
            }
        }
        response {
            status OK()
            body("GOOD")
            headers {
                contentType textPlain()
            }
        }
    }
