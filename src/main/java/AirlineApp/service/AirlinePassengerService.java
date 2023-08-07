package AirlineApp.service;

import AirlineApp.data.models.Passenger;
import AirlineApp.data.models.User;
import AirlineApp.data.repositories.PassengerRepository;
import AirlineApp.data.repositories.UserRepository;
import AirlineApp.dtos.request.RegisterPassengerRequest;
import AirlineApp.dtos.response.RegisterPassengerResponse;
import AirlineApp.util.AppUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class AirlinePassengerService implements PassengerService {

    private final PassengerRepository passengerRepository;
    private final UserRepository userRepository;

    public RegisterPassengerResponse registerPassenger(RegisterPassengerRequest registerPassengerRequest){
        Passenger passenger = new Passenger();
        User user = AppUtils.userMapper (registerPassengerRequest);
        passenger.setUser(user);
        userRepository.save(user);
        passengerRepository.save(passenger);
        RegisterPassengerResponse registerPassengerResponse = new RegisterPassengerResponse();
        registerPassengerResponse.setMessage("You successfully registered");
        return registerPassengerResponse;
    }



}
