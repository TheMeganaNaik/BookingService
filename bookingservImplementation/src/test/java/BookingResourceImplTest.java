import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.impl.BookingResourceImpl;
import com.paypal.bfs.test.bookingserv.service.BookingService;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.junit.Assert.assertEquals;

public class BookingResourceImplTest {

    @Mock
    private BookingService mockbookingService;

    @Mock
    private BookingResourceImpl mockbookingResource;

    private static final Integer Id = 1;
    private static final String MSG_NO_ENTRY = "No Entries present";
    private static final String MSG_MISSING_ENTRY = "Mandatory field(s) not entered";
    private static final String CREATED = "Created";

    //Positive scenario for create booking
    @Test
    public void createBookingTest() {
        //GIVEN
        Booking book = new Booking();
        book.setFirstName("Jane");
        book.setLastName("Doe");
        book.setDateOfBirth("12/10/1954");
        book.getCheckinDatetime("1/10/2015 1:15 PM");
        book.getCheckoutDatetime("1/10/2015 3:15 PM");
        book.getTotalprice(542.1);
        book.getDeposit(54);
        book.getLine1("154 Hwy");
        book.getCity("Bangalore");
        book.getState("Karnataka");
        book.getZipcode(12345);

        when(mockbookingService.create(book)).thenReturn(id);

        //WHEN
        ResponseEntity<Booking> responseEntity = mockbookingResource.create(book);

        //THEN
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(CREATED, responseEntity.getBody());

        verify(mockbookingService).create(book);
        verifyNoMoreInteractions(mockbookingService);
    }

    //Negative scenario for create booking
    @Test
    public void createBookingTestBadRequest() {
        //GIVEN
        Booking book = new Booking();
        book.setFirstName("Jane");
        book.setDateOfBirth("12/10/1954");
        book.getCheckinDatetime("1/10/2015 1:15 PM");
        book.getCheckoutDatetime("1/10/2015 3:15 PM");
        book.getTotalprice(542.1);
        book.getDeposit(54);
        book.getLine1("154 Hwy");
        book.getCity("Bangalore");
        book.getState("Karnataka");
        book.getZipcode(12345);

        when(mockbookingService.create(book)).thenReturn(Id);

        //WHEN
        ResponseEntity<Booking> responseEntity = mockbookingResource.create(book);

        //THEN
        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
        assertEquals(MSG_MISSING_ENTRY, responseEntity.getBody());

        verify(mockbookingService).create(book);
        verifyNoMoreInteractions(mockbookingService);
    }

    //Positive scenario for get booking
    @Test
    public void getBookingTest() {
        //GIVEN
        Booking book = new Booking();
        book.setFirstName("Jane");
        book.setLastName("Doe");
        book.setDateOfBirth("12/10/1954");
        book.getCheckinDatetime("1/10/2015 1:15 PM");
        book.getCheckoutDatetime("1/10/2015 3:15 PM");
        book.getTotalprice(542.1);
        book.getDeposit(54);
        book.getLine1("154 Hwy");
        book.getCity("Bangalore");
        book.getState("Karnataka");
        book.getZipcode(12345);

        when(mockbookingService.getAllBookings()).thenReturn(book);

        //WHEN
        ResponseEntity<Booking> responseEntity = mockbookingResource.create(book);

        //THEN
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(CREATED, responseEntity.getBody());

        verify(mockbookingService).getAllBookings();
        verifyNoMoreInteractions(mockbookingService);
    }

    //Negative scenario for get booking
    @Test
    public void getBookingTest() {
        //GIVEN
        Booking book = new Booking();
        book.setFirstName("Jane");
        book.setLastName("Doe");
        book.setDateOfBirth("12/10/1954");
        book.getCheckinDatetime("1/10/2015 1:15 PM");
        book.getCheckoutDatetime("1/10/2015 3:15 PM");
        book.getTotalprice(542.1);
        book.getDeposit(54);
        book.getLine1("154 Hwy");
        book.getCity("Bangalore");
        book.getState("Karnataka");
        book.getZipcode(12345);

        when(mockbookingService.getAllBookings()).thenReturn(book);

        //WHEN
        ResponseEntity<Booking> responseEntity = mockbookingResource.create(book);

        //THEN
        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
        assertEquals(MSG_NO_ENTRY, responseEntity.getBody());

        verify(mockbookingService).getAllBookings();
        verifyNoMoreInteractions(mockbookingService);
    }
}
