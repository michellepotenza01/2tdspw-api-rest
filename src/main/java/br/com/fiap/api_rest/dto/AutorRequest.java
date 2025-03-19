package br.com.fiap.api_rest.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AutorRequest(
        @NotBlank(message = "O título não pode ser nulo ou vazio")
        @Size(min = 3, max = 254, message = "O título deve ter entre 3 e 254 caracteres")
        private String autor;
        ) {
}
