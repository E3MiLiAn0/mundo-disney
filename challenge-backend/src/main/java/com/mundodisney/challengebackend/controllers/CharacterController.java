package com.mundodisney.challengebackend.controllers;

import com.mundodisney.challengebackend.entities.Character;
import com.mundodisney.challengebackend.services.CharacterServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/characters")
public class CharacterController extends BaseControllerImpl<Character,CharacterServiceImpl>{


    @GetMapping("searchName/characters")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
}
