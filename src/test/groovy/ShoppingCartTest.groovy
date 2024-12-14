import io.github.mateusnere.intro_spock.model.ShoppingCart
import spock.lang.Specification

class ShoppingCartTest extends Specification {
    def "verify multiple properties of a ShoppingCart"() {
        given:
        ShoppingCart cart = new ShoppingCart()
        cart.addItem("Banana", 3)
        cart.addItem("Apple", 2)

        expect:
        with(cart) {
            totalItems == 5
            totalPrice == 10.0
            items.contains("Banana")
            items.contains("Apple")
        }
    }
}
