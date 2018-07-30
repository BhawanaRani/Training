package com.exilant.training.ticketbooking.service;

import java.util.List;

import com.exilant.training.ticketbooking.model.Flight;
import com.exilant.training.ticketbooking.model.Passenger;

public interface BookingService {
public List<Passenger> getAllPassengers();
public  String Booking(Flight flight);
public String cancell(int ticketNumber);
public String bookMultipleTickets(List<Passenger> passengers);
}
