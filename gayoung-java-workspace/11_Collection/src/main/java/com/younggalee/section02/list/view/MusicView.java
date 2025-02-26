package com.younggalee.section02.list.view;

import com.younggalee.section02.list.controller.MusicController;
import com.younggalee.section02.list.dto.Music;

import java.util.List;
import java.util.Scanner;

public class MusicView {
    private MusicController mc = new MusicController();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        // 사용자가 보게 되는 메인 페이지  >> view에서 시작


        while(true){
            System.out.println("=======음악 관리 프로그램=========");
            System.out.println("1. 신규 곡 추가");
            System.out.println("2. 곡 전체 조회");
            System.out.println("3. 특정 곡 삭제");
            System.out.println("4. 특정 곡 수정");
            System.out.println("5. 특정 곡 검색");
            System.out.println("6. 가수명을 통해 곡명 검색");
            System.out.println("7. 해당 가수명이 포함된 곡 개수 출력");
            System.out.println("8. 곡 정렬 조회");
            System.out.println("0. 프로그램 종료");

            System.out.println(">> 메뉴선택");
            int menu = sc.nextInt();
            sc.nextLine();

            switch(menu){
                case 1: inputMusic(); break;
                case 2: selectMusic(); break;
                case 3: removeMusic(); break;
                case 4: modifyMusic(); break;
                case 5: searchMusic(); break;
                case 6: searchByArtist(); break;
                case 7: numSelectMusic(); break;
                case 8: sortMusic(); break;
                case 0:
                    System.out.println("프로그램 종요");
                default:
                    System.out.println("잘못 선택함. 재선택 ㄱㄱ");
            }
        }
    }

    //새로운 곡 추가하는 서브 화면 (case 1)
    public void inputMusic(){
        System.out.println("====신규 곡 추가====");
        System.out.println("제목입력 : ");
        String title = sc.nextLine();
        System.out.println("가수입력 : ");
        String artist = sc.nextLine();
        // 입력까지는 view에서 해야하고
        // 사용자가 입력한 곡명, 가수명을 넘기면서 "곡 추가 요청"보내기
        // >> Controller 측 메소드 호출
        boolean result = mc.insertMusic(title, artist);
        if (result) {
            System.out.println("성공적으로 곡이 추가되었습니다.");
        } else {
            System.out.println("곡 추가에 실패하였습니다. ");
        }
    }

    public void selectMusic(){
        System.out.println("\n=====전체 곡 리스트=====");

        // 전체곡 조회 요청 >> Controller 메소드 호출
        List<Music> musicList =  mc.selectMusic();

        if (musicList.isEmpty()){
            System.out.println("출력할 노래 정보가 없습니다.");
        } else{
            for(Music music : musicList){
                System.out.println(music.toString());
            }
        }

    }

    public void removeMusic(){
        System.out.println("\n ==== 특정 곡 삭제 ====");
        System.out.println("삭제하고자하는 곡명: ");
        String title = sc.nextLine();
        // 삭제 요청 보내기
        int result = mc.deleteMusic(title);

        if(result > 0){
            System.out.println("성공적으로 삭제되었습니다.");
        } else{
            System.out.println("삭제할 곡을 찾지 못했습니다. ");
        }
    }

    //곡 수정용 서브화면
    public void modifyMusic(){
        System.out.println("\n==========특정 곡 수정==========");
        System.out.print("수정하고자하는 곡명: ");
        String title = sc.nextLine();
        System.out.print("수정 내용 곡명 : ");
        String upTitle = sc.nextLine();
        System.out.print("수정 내용 가수명 : ");
        String upArtist = sc.nextLine();

        int result = mc.updateMusic(title, upTitle, upArtist);
        if(result > 0){
            System.out.println("성공적으로 수정되었습니다. ");
        } else {
            System.out.println("수정할 곡을 찾지 못했습니다.");
        }

    }

    // 곡 검색용 서브화면
    public void searchMusic(){
        System.out.println("\n ==== 특정 곡 검색 ====");
        System.out.print("검색할 곡명(키워드도 가능) : ");
        String keyword = sc.nextLine();

        List<Music> searchList = mc.selectMusicByKeyword(keyword);
        if(searchList.isEmpty()){
            System.out.println("검색결과가 없습니다. ");
        } else {
            for(Music m : searchList){
                System.out.println(m);
            }
        }
    }
    public void searchByArtist(){
        System.out.println("\n ==== 가수명을 통해 곡명 찾기 ====");
        System.out.print("검색할 가수명(키워드도 가능) : ");
        String artist = sc.nextLine();
        List<Music> artistMusic = mc.searchArtist(artist);

        if(artistMusic.isEmpty()){
            System.out.println("검색결과가 없습니다. ");
        } else {
            for(Music m : artistMusic){
                System.out.println(m);
            }
        }
    }
    public void numSelectMusic(){
        System.out.println("\n ==== 특정 곡 검색 ====");
        System.out.print("검색할 곡명(키워드도 가능) : ");
        String title = sc.nextLine();
        int num = mc.numMusicList(title);
        System.out.println(num + "개 입니다.");
    }

    public void sortMusic(){
        System.out.println("\n====== 곡 정렬 조회 ========");
        System.out.println("1. 가수명 오름차순");
        System.out.println("2. 가수명 내림차순");
        System.out.println("3. 곡명 오름차순");
        System.out.println("4. 곡명 오름차순");
        System.out.print(">> 메뉴선택 : ");
        int menu = sc.nextInt();

        List<Music> list = mc.sortMusic(menu);

        for(Music m : list){
            System.out.println(m);
        }
    }
}