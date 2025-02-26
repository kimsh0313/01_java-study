package com.younggalee.section02.list.dto;

public class Music implements Comparable <Music>{
    private String title;
    private String artist;

    public Music() {
    }

    public Music(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }

    @Override
    public int compareTo(Music o) {
        // Collections.sort 메소드 수행시 내부적으로 Music객체간에 비교할때 호출되는 메소드
        // 즉, m1.compareTo(m2) 와 같이 호출됨
        // 이때 양수가 반환될 경우 두 객체의 순서가 변경되게 되어있음
//        return

        return artist.compareTo(o.artist);
                // 놓쳤다.......

    }
}
