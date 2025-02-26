package com.younggalee.section02.list.controller;

import com.younggalee.section02.list.comparator.AscendingTitle;
import com.younggalee.section02.list.comparator.DescendingTitle;
import com.younggalee.section02.list.dto.Music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 사용자의 요청 처리해주는 클래스
public class MusicController {

    private List<Music> list = new ArrayList<>();
    { //  초기화블럭 ********************
        list.add(new Music("aaa", "1"));
        list.add(new Music("bbb", "2"));
        list.add(new Music("ccc", "3"));
    }

    /**
     * 신규 곡 추가 요청 처리
     * @param title     새로이 추가할 곡의 곡명
     * @param artist    새로이 추가할 곡의 가수명
     * @return          성공여부(T/F)
     */
    public boolean insertMusic(String title, String artist){
        boolean result = list.add(new Music(title, artist));
        return result; // view아니니까 여기서 출력하면 안됨
    }

    public List<Music> selectMusic(){
        return list;
    }

    public int deleteMusic(String title){
        int result = 0;
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getTitle().equals(title)){
                list.remove(i);
                result ++;
                break;

            }
        }
        return result;
    }

    public int updateMusic(String title, String upTitle, String upArtist){
        int result = 0;
        for (Music m : list){
            if (m.getTitle().equals(title)){
                m.setTitle(upTitle);
                m.setArtist(upArtist);
                result ++ ;
            }
        }
        return result;
    }


    public List<Music> selectMusicByKeyword(String keyword){
        // 검색된 Music객체를 차곡차곡 담을 searchList
        List<Music> searchList = new ArrayList<>();

        for (Music m : list) {
            if (m.getTitle().contains(keyword)) {
                searchList.add(m);
            }
        }
        return searchList;
    }

    public List<Music> searchArtist(String artist){
        List<Music> searchList = new ArrayList<>();

        for (Music m : list) {
            if (m.getArtist().contains(artist)) {
                searchList.add(m);
            }
        }
        return searchList;
    }

    public int numMusicList(String title){
        int count = 0;
        for(Music m : list){
            if (m.getTitle().contains(title)){
                count++;
            }
        }
        return count;
    }

    public List<Music> sortMusic(int menu) {
    /*
    Collections.sort(리스트)
     : 리스트 내의 요소간에 비교시 요소 클래스에 정의되어있는 compareTo 메소드 동작
    Collections.srt(리스트, comparator 객체)
     : 리스트 내의 요소간에 비교시 Comparator 클래스에 정의되어있는 comepare 메소드 동작
    리스트.sort(Comparator 객체)
     : 리스트 내의 요소간에 비교시 Comparator 클래스에 정의되어있는 comepare 메소드 동작

    // 복사본 리스트 만들기
 */
        List<Music> sortList = new ArrayList<>();

        sortList.addAll(list); // 복제

        if (menu == 1) {
            Collections.sort(sortList);
        } else if (menu == 2) {
            sortList.sort(new Comparator<Music>() {
                @Override
                public int compare(Music o1, Music o2) {
                    return o2.getArtist().compareTo(o1.getArtist());
                }
            });
        } else if (menu == 3) {
//            sortList.sort(new AscendingTitle());
        } else {
//            sortList.sort(new DescendingTitle());
        }

        return sortList;
    }

}
