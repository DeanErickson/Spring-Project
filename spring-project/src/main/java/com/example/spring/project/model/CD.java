package com.example.spring.project.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class CD {

        private String title;
        private String artist;

       @Id
        private UUID id = UUID.randomUUID();


        public CD(String title, String artist, UUID id) {
            this.title = title;
            this.artist = artist;
            this.id = id;
        }

    public CD(String title, String artist) {
                this(title, artist, UUID.randomUUID());


    }

    public CD() {

    }


        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;

        }

        public UUID getId() {
            return id;
        }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CD{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", id=" + id +
                '}';
    }
}




