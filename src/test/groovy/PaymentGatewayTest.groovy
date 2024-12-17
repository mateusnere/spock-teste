import io.github.mateusnere.intro_spock.gateway.PaymentGateway
import spock.lang.Specification

class PaymentGatewayTest extends Specification {

    def paymentGateway = Mock(PaymentGateway)

    def "should make payment successfully"() {
        given:
            paymentGateway.makePayment(20 as BigDecimal) >> true

        when:
            def result = paymentGateway.makePayment(20 as BigDecimal)

        then:
            result == true
    }

    def "should make payment with any arguments"() {
        given:
            paymentGateway.makePayment(_ as BigDecimal) >> true

        when:
            def result = paymentGateway.makePayment(99.99 as BigDecimal)

        then:
            result == true
    }

    def "should make payment accordingly the list we provide in given section"() {
        given:
            paymentGateway.makePayment(_ as BigDecimal) >>> [true, true, false, true]

        when:
        def result = paymentGateway.makePayment(10.25 as BigDecimal)

        then:
        result == true
    }
}
