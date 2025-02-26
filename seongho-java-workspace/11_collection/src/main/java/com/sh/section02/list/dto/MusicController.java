package com.sh.section02.list.dto;

import java.util.ArrayList;
import java.util.List;

public class MusicController {
    private List<Music> list = new ArrayList<>();
    {
        list.add(new Music("aadf","asdf"));
        list.add(new Music("asadf","asfdf"));
        list.add(new Music("aaddf","ashdf"));
    }

    public boolean insertMusic(String title, String artist){
        boolean result= list.add(new Music(title,artist     ));
        return result;
    }

    /**
     * 전체곡 조회 요청 처리
     * @return 전체곡 정보 담겨있는 list
     */
    public List<Music> selectMusicList(){
        return list;
    }
    public int deleteMusic(String title){

        int result = 0;
        for (int i = 0; i<list.size();i++){
            if (list.get(i).getTitle().equals(title)){
                list.remove(i);
                result++;
                break;
            }
        }
        return result;
    }
    public int updateMusic(String title,String uptitle,String upArtist){
        int result = 0;
        for (Music m :list){
            if (m.getTitle().equals(title)){
                m.setTitle(uptitle);
                m.setArtist(upArtist);
                result++;
            }
        }
        return result;
    }
    public List<Music> searchMusicbykeyword(String keyword){
        List<Music> searchList = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getTitle().contains(keyword)){
                searchList.add(list.get(i));

            }
        }
        return searchList;
    }
    public List<String> searchArtistMusic(String musicArtist){
        List<String> searchArtist = new ArrayList<>();
        for (int i =0; i< list.size();i++){
            if (list.get(i).getArtist().contains(musicArtist)){
                searchArtist.add(list.get(i).getTitle());
            }
        }
        return searchArtist;
    }
    public int selectCountByKeyword(String keyword){
        int count  =0;
        for (Music m : list){
            if (m.getTitle().contains(keyword)){
                count++;
            }
        }
        return count;
    }
}
