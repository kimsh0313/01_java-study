package com.younggalee.section02.list.comparator;

import com.younggalee.section02.list.dto.Music;

public class AscendingTitle implements Comparable<Music> {

    @Override
    public int compareTo(Music o1) {
        return 0; // o1.getTitle();
    }
}
