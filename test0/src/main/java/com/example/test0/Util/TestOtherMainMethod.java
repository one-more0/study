package com.example.test0.Util;
import static java.lang.System.out;

import java.io.File;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;


class Test   {
    public static void main(String[] args) {
        File file=new File("../../../../../../../../../../../../");
        String[] paths=file.list();
        ArrayList
        for (String s:paths)
        out.println(s);
    }
}
