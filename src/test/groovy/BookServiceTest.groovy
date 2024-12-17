import io.github.mateusnere.intro_spock.model.Book
import io.github.mateusnere.intro_spock.repository.BookRepository
import io.github.mateusnere.intro_spock.service.BookService
import spock.lang.Specification
import spock.lang.Subject

class BookServiceTest extends Specification{

    def "should retrieve book details and verify method calls"() {

        given:
            def bookRepository = Mock(BookRepository) {
                findById(1L) >> Optional.of(new Book("Effective Java", "Joshua Bloch"))
                findById(2L) >> Optional.ofNullable(null)
            }
//            bookRepository.findById(1L) >> new Book("Effective Java", "Joshua Bloch")

            @Subject
            def bookService = new BookService(bookRepository)

        when:
            def book = bookService.getBookDetails(1L)
            def unknownBook = bookService.getBookDetails(2L)

        then:
            book.getName() == "Effective Java"
            unknownBook == null
    }

}
