package section01.controller;

import section01.dto.Desktop;
import section01.dto.Electronic;
import section01.dto.NoteBook;

import java.util.Arrays;

//다형성 적용 후
public class ElectronicManager2 {
    private Electronic[] electronics = new Electronic[3];
    private int count = 0;

    //자식타입만 의존하지 않게.
    public void insert(Electronic electronic) {
        electronics[count++] = electronic;
    }

    /**
     * 레퍼런스타입을 Electronic으로 받던가, 형변환을 하고 자식으로 받는다
     */
    public Electronic select(int index) {
        return electronics[index];
    }

    public Electronic[] getElectronics() {
        return Arrays.copyOf(electronics, count);
    }

}
