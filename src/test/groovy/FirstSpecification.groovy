import spock.lang.Specification

class FirstSpecification extends Specification {

    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }

    def "two plus two should equal four"() {
        given:
            int left = 2
            int right = 2

        when:
            int result = left + right

        then:
            result == 4
    }

    def "should be able to remove from list"() {
        given:
            def list = [5, 1, 2, 3]

        when:
            list.remove(0)

        then:
            list == [1, 2, 3]
    }

    def "should get an index out of bounds when removing a non-existent item"() {
        given:
         def list = [0, 1, 2]

        when:
            list.remove(10)

        then:
            thrown(IndexOutOfBoundsException)
            list.size() == 3
    }

//    Using datatables
    def "numbers to the power of two"(int a, int b, int c) {
        expect:
            Math.pow(a, b) == c

        where:
            a | b | c
            1 | 2 | 1
            2 | 2 | 4
            3 | 2 | 9
    }
}
