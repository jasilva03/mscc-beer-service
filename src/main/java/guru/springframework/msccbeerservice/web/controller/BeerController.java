package guru.springframework.msccbeerservice.web.controller;

import guru.springframework.msccbeerservice.web.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable("beerId") UUID beerId) {

        return  new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);

    }

    @PostMapping()
    public ResponseEntity saveNewBeer(@RequestBody BeerDTO beerDTO) {

        return new ResponseEntity(HttpStatus.CREATED);

    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDTO beerDTO) {

        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
