package com.example.restPrueba.Controllers;

import com.example.restPrueba.Entities.Persona;
import com.example.restPrueba.Services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{
}
