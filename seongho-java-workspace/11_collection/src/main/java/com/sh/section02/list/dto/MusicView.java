package com.sh.section02.list.dto;

import java.util.List;
import java.util.Scanner;

public class MusicView {
    Scanner sc = new Scanner(System.in);
    MusicController mc = new MusicController();
    public void mainMenu(){


        System.out.println("1 신규곡추가");
        System.out.println("2 곡전체조최");
        System.out.println("3 특정곡삭제");
        System.out.println("4 특정곡수정");
        System.out.println("5 특정곡검색");
        System.out.println("6 가수명 곡검색");
        System.out.println("7 특정 곡 수 검색");
        System.out.println("0 종료");
        System.out.println("메뉴선택");
        int menu = sc.nextInt();
        sc.nextLine();
        switch (menu){
            case 1:inputMusic();
                break;
            case 2: selectMusic();
                break;
            case 3: removeMusic();
                break;
            case 4: modifyMusic();
                break;
            case 5: searchMusic();
                break;
            case 6: searchArtist();
                break;
            case 7: searchCount();
                break;
            case 0:
                System.out.println("종료");
                break;
            default:
                System.out.println("잘못선택 바보");
        }

    }
    public void inputMusic(){
        System.out.println("곡추가");
        System.out.println("제목:");
        String title = sc.nextLine();
        System.out.println("가수:");
        String artist = sc.nextLine();

        //사용자가 입력한 곡명과 가수명을 넘기면서 곡추가 요청 봰기
//        >Controller 측 메소드 호출

        boolean result = mc.insertMusic(title, artist);
        if (result){
            System.out.println("곡추가 성공");
        }else {
            System.out.println("실패~");
        }





    }
    public void selectMusic(){
        System.out.println("전체 곡");
        List<Music> list = mc.selectMusicList();

        if (list.isEmpty()){//비었을때
            System.out.println("곡없음");
        }else {//아닐때
            for (Music m :list){
                System.out.println(m);
            }
        }
    }
    public void removeMusic(){
        System.out.println("곡 삭제");
        System.out.println("곡 명:");
        String title = sc.nextLine();

        mc.deleteMusic(title);
        int result = mc.deleteMusic(title);
        if (result>0){
            System.out.println("삭제!");
        }else {
            System.out.println("삭제 실패!");
        }
    }
    public void modifyMusic(){
        System.out.println("곡수정");
        System.out.println("곡 이름: ");
        String title = sc.nextLine();
        System.out.println("노래 수정: ");
        String uptitle = sc.nextLine();
        System.out.println("가수명 수정: ");
        String upArtist = sc.nextLine();

        int result = mc.updateMusic(title,uptitle,upArtist);

        if (result!=0) {
            System.out.println("수정됨");
        }else {
            System.out.println("바보");
        }
    }
    public void searchMusic(){
        System.out.println("곡 검색");
        System.out.print("검색할 곡(키워드 가능): ");
        String keyword = sc.nextLine();
        
        List<Music> searchList = mc.searchMusicbykeyword(keyword);
        if (searchList.isEmpty()){
            System.out.println("멍청이");
        }else {
            for (Music m :searchList){
                System.out.println(m);
            }
        }
    
    }
    public void searchArtist(){
        System.out.println("가수명:");
        String musicArtist = sc.nextLine();
        List<String> searchAts = mc.searchArtistMusic(musicArtist);

        if (searchAts.isEmpty()){
            System.out.println("멍청이");
        }else {
            for (String m :searchAts){
                System.out.println(m);
            }
        }
    }
    public void searchCount(){
        System.out.println("곡명: ");
        String keyword = sc.nextLine();
        
       int count= mc.selectCountByKeyword(keyword);
        System.out.println(count+"개");
    }
}
