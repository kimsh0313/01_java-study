package com.pch.section04.string;

public class Application4 {
    /**
     *  StringBuilder 와 StringBuffer 차이점(동기화 제공여부)
     *   - 동기화 : 하나의 자원(데이터)에 대해 여러 스레드(일의 단위)가 접근하려 할 때
     *              한 시점에 하나의 스레드만 사용할 수 있도록 하는 것
     *
     *   - StringBuilder : 동기화 제공 x = 속도가 빠름
     *   - StringBuffer  : 동기화 제공 o = 속도가 느림
     *
     *   멀티 스레드 환경(여러개의 일처리가 동시다발적으로 수행되는 환경)
     *      : 동기화가 제공되어야 안전함 ==> StringBuffer 권장됨
     *
     *   단일 스레드 환경(한 번에 하나의 일만 처리하는 환경)
     *      : 동기화가 필요없음(동기화 제공되는 도구 사용시 속도 저하) ==> StringBuilder 사용
     *
     *   주로 StringBuilder 사용하게 될 것.
     */
}
