package com.toker.sodaservice.web.controller;


import com.toker.sodaservice.web.model.SodaDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/soda")
public class SodaController {

    @GetMapping("/{sodaId}")
    public ResponseEntity<SodaDto> getSodaId(@PathVariable UUID id) {

        //todo impl
        return new ResponseEntity<>(SodaDto.builder().build(), HttpStatus.OK);


    }

    @PostMapping
    public ResponseEntity<SodaDto> saveNewSoda(@RequestBody SodaDto sodaDto) {
        //todo impl
        return new ResponseEntity<>(SodaDto.builder().build(), HttpStatus.CREATED);
        }


        @PutMapping("/sodaId")
        public ResponseEntity<SodaDto> updateSodaById(@PathVariable("/sodaId") UUID Id, @RequestBody SodaDto sodaDto) {

        //todo impl
        return new ResponseEntity<>(SodaDto.builder().build(), HttpStatus.OK);
        }
}
