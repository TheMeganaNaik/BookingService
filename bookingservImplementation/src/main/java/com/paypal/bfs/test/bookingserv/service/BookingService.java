package com.paypal.bfs.test.bookingserv.service;

import com.paypal.bfs.test.bookingserv.Repository.BookingRepository;
import com.paypal.bfs.test.bookingserv.api.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingrepository;

    // Retrieve all rows from table and populate list with objects

    public List getAllBookings() {
        return bookingrepository.findAll();
    }

    // Create a new booking

    public Booking create(Booking booking) {
        return bookingrepository.save(booking);
    }

}
