package com.proyecto.proyectocalidad.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "diccionary_word")
public class DiccionaryWordModel {

    @EmbeddedId
    private IdDiccionaryWord id_diccionary_word;


    @ManyToOne
    @MapsId("id_w")
    @JoinColumn(name = "id_w")
    private WordModel word;

    @ManyToOne
    @MapsId("id_s")
    @JoinColumn(name = "id_s")
    @JsonBackReference
    private DiccionaryModel diccionary;


    public IdDiccionaryWord getId_diccionary_word() {
        return id_diccionary_word;
    }

    public void setId_diccionary_word(IdDiccionaryWord id_orden_plato) {
        this.id_diccionary_word = id_orden_plato;
    }

    public WordModel getWord() {
        return word;
    }

    public void setWord(WordModel word) {
        this.word = word;
    }

    public DiccionaryModel getDiccionary() {
        return diccionary;
    }

    public void setDiccionary(DiccionaryModel diccionary) {
        this.diccionary = diccionary;
    }

    @Embeddable
    public static class IdDiccionaryWord implements Serializable {
        @Column(name = "id_s")
        private Long id_s;

        @Column(name = "id_w")
        private Long id_w;

        public IdDiccionaryWord() {
            // Constructor predeterminado vacío requerido por Hibernate
        }

        public IdDiccionaryWord(Long id_s, Long id_w) {
            this.id_s = id_s;
            this.id_w = id_w;
        }

        public Long getId_s() {
            return id_s;
        }

        public void setId_s(Long id_s) {
            this.id_s = id_s;
        }

        public Long getId_w() {
            return id_w;
        }

        public void setId_w(Long id_w) {
            this.id_w = id_w;
        }

        // Debes incluir getters y setters adecuados para estos campos
    }



}
