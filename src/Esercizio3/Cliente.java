package Esercizio3;

import java.time.LocalDate;

public class Cliente {
    private String codiceCliente;
    private String nome;
    private String email;
    private LocalDate dataIscrizione;

    public Cliente(String codiceCliente, String nome, String email, LocalDate dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    @Override
    public String toString() {
        return nome + " (" + codiceCliente + "), Email: " + email + ", Iscritto dal: " + dataIscrizione;
    }
}
