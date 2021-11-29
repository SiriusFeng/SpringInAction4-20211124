package com.study.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisc cd  = new BlankDisc();
        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Brand");
        cd.setArtist("The Beatles");

        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Pepper's Lonely Hearts Club Brand");
        tracks.add("With a Little Help From My Friends");
        tracks.add("Luck in the Sky with Diamonds");
        tracks.add("Getting better");
        tracks.add("Fixing a hole");

        cd .setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
