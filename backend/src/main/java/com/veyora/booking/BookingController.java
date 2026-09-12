package com.veyora.booking;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class BookingController {
  @GetMapping("/health") public Map<String,String> health(){return Map.of("status","VEYORA backend is running");}
  @GetMapping("/flights") public List<Map<String,String>> flights(@RequestParam(defaultValue="Hyderabad") String from,@RequestParam(defaultValue="Delhi") String to){
    return List.of(
      Map.of("from",from,"to",to,"departure","06:10","arrival","08:25","duration","2h 15m","price","5499"),
      Map.of("from",from,"to",to,"departure","10:40","arrival","13:00","duration","2h 20m","price","6199"),
      Map.of("from",from,"to",to,"departure","18:30","arrival","20:45","duration","2h 15m","price","5899")
    );
  }
}