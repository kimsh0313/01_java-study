package com.sh.section04.map.run;

import com.sh.section04.map.dto.Snack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application2  {
    public static void main(String[] args) {
        Map<String, Snack> map = new HashMap<>();

        // put(K key, V value)
        map.put("다이제", new Snack("초코",20000));
        map.put("칸쵸", new Snack("딸기",30000));
        map.put("새우깡", new Snack("사과",40000));
        map.put("포테이토칩", new Snack("사과",40000));

        System.out.println(map);
        Snack s = map.get("다이제");
        System.out.println(s);

        //size()
        System.out.println(map.size());

        //replace(K key, V value)
        map.replace("포테이토칩",new Snack("겁나짠맛",10000));
        System.out.println(map);

        //remove(Object)
        map.remove("포테이토칩");
        System.out.println(map);

        /*
        순회해보기
        방법1 key set()
        2 entry set()
         */
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        Set<String> keySet = map.keySet();
//        for (String key :keySet){
//            System.out.println(key +" "+ map.get(key));
//        }
        Iterator<String> itKey = keySet.iterator();
        while (itKey.hasNext()){
            String key = itKey.next();
            Snack value = map.get(key);
            System.out.println(key+" "+value);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        Set<Map.Entry<String, Snack>> entrySet =map.entrySet();
//        for (Map.Entry<String,Snack> entry:entrySet){
//            System.out.println(entry.getKey() +" "+entry.getValue());
//        }
        Iterator<Map.Entry<String, Snack>> itEntry = entrySet.iterator();
        while(itEntry.hasNext()){
            Map.Entry<String, Snack> entry =itEntry.next();
            System.out.println(entry.getKey() +" "+entry.getValue());
        }
    }
}
