package com.example.ac2.entity.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.ac2.entity.Curso;
import com.example.ac2.entity.Nota;

import java.util.ArrayList;
import java.util.List;

class CursoTest {

    @Test
    void curso_deveSerCriadoComParametrosCorretos() {
        List<Nota> notas = new ArrayList<>();
        Curso curso = new Curso("Matemática", notas);

        assertEquals("Matemática", curso.getNome());
        assertEquals(notas, curso.getNotas());
    }

    @Test
    void adicionarNota_deveAdicionarNotaALista() {
        List<Nota> notas = new ArrayList<>();
        Curso curso = new Curso("Matemática", notas);
        Nota novaNota = new Nota(10.0);

        curso.adicionarNota(novaNota);

        assertEquals(1, curso.getNotas().size());
        assertEquals(novaNota, curso.getNotas().get(0));
    }

    @Test
    void equals_e_hashCode_devemFuncionarCorretamente() {
        List<Nota> notas = new ArrayList<>();
        Curso curso1 = new Curso("Matemática", notas);
        Curso curso2 = new Curso("Matemática", notas);

        assertEquals(curso1, curso2);
        assertEquals(curso1.hashCode(), curso2.hashCode());
    }
}