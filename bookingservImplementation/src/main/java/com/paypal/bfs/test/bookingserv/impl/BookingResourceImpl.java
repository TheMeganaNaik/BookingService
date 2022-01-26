package com.paypal.bfs.test.bookingserv.impl;

import com.paypal.bfs.test.bookingserv.Repository.BookingRepository;
import com.paypal.bfs.test.bookingserv.api.BookingResource;
import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookingResourceImpl implements BookingResource {

    @Autowired
    private BookingService bookingService;

    static final String MSG_NO_ENTRY = "No Entries present";
    static final String MSG_MISSING_ENTRY = "Mandatory field(s) not entered";

 /*   @Override
    public ResponseEntity<Booking> create(Booking booking) {
        return null;
    }

    @Override
    public ResponseEntity<Booking> getAll() {
        return null;
    } */

    @Override
    @PostMapping(value = "/v1/bfs/booking", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Booking> create(@RequestBody Booking booking) {
        Booking createBooking = bookingService.create(booking);
        try {
            return new ResponseEntity<>(createBooking, HttpStatus.CREATED);
        }
        catch (RuntimeException e) {
            return new ResponseEntity(MSG_MISSING_ENTRY, HttpStatus.BAD_REQUEST);
        }

    }

    @Override
    @GetMapping(value = "/v1/bfs/booking", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Booking>> getAll() {
        List<Booking> bookingList = bookingService.getAllBookings();
        try {
            return new ResponseEntity<>(bookingList, HttpStatus.OK);
        }
        catch (RuntimeException e) {
            return new ResponseEntity(MSG_NO_ENTRY, HttpStatus.NOT_FOUND);
        }
    }
}
