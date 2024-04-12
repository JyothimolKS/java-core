package com.learning.core.day3session1;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class PassengerRowMapper implements RowMapper<Passenger> {
    @Override
    public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
        Passenger passenger = new Passenger();
        passenger.setId(rs.getInt("Passenger_id"));
        passenger.setName(rs.getString("Passenger_name"));
        passenger.setDob(rs.getDate("Passenger_dob"));
        passenger.setPhone(rs.getString("Passenger_phone"));
        passenger.setEmail(rs.getString("Passenger_email"));
        return passenger;
    }
}