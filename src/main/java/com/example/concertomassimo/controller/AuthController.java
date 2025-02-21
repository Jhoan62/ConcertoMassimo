package com.example.concertomassimo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/homepage")
    public String homepage() {
        return "homepage";
    }

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/auth")
    public String showLoginPage() {
        return "auth"; // mostrerà auth.html
    }

    @GetMapping("/biglietto")
    public String bigliettoAcquistato() {
        return "bigliettoAcquistato"; // mostrerà bigliettoAcquistato
    }

    @GetMapping("/contattaci")
    public String contatti() {
        return "contattaci";
    }

    @GetMapping("/form")
    public String form(Authentication authentication) {
        // Controlla se l'utente è autenticato
        if (authentication == null || !authentication.isAuthenticated()) {
            return "redirect:/auth?error=Utente non autenticato!";
        }
        // Se è autenticato, mostriamo il form
        return "form";
    }
}

