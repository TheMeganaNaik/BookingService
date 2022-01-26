import com.paypal.bfs.test.bookingserv.Repository.BookingRepository;
import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.service.BookingService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookingServiceTest {

    @Autowired
    private BookingRepository bookingrepository;

    @Autowired
    private BookingService bookingService;


    @Test
    public void testCreateBooking() {
        //GIVEN
        Booking booking = new Booking();
        booking.setFirstName("Jane");
        booking.setLastName("Doe");
        booking.setDateOfBirth("12/10/1954");
        booking.getCheckinDatetime("1/10/2015 1:15 PM");
        booking.getCheckoutDatetime("1/10/2015 3:15 PM");
        booking.getTotalprice(542.1);
        booking.getDeposit(54);
        booking.getLine1("154 Hwy");
        booking.getCity("Bangalore");
        booking.getState("Karnataka");
        booking.getZipcode(12345);


        //THEN
        Booking createBooking = bookingService.create(booking);
        Assert.assertEquals("user created", booking.getId());

    }

    @Test
    public void testGetBookings() {
        //GIVEN
        Booking booking = new Booking();
        booking.setFirstName("Jane");
        booking.setLastName("Doe");
        booking.setDateOfBirth("12/10/1954");
        booking.getCheckinDatetime("1/10/2015 1:15 PM");
        booking.getCheckoutDatetime("1/10/2015 3:15 PM");
        booking.getTotalprice(542.1);
        booking.getDeposit(54);
        booking.getLine1("154 Hwy");
        booking.getCity("Bangalore");
        booking.getState("Karnataka");
        booking.getZipcode(12345);

        //THEN
        List<Booking> bookingList = bookingService.getAllBookings();
        Assert.assertEquals("success", bookingList);
    }
}
