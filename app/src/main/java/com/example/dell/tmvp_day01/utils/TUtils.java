package com.example.dell.tmvp_day01.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TUtils {

    private static Type genericSuperclass;

    public static <T>T getT(Object o, int i){
        genericSuperclass = o.getClass().getGenericSuperclass();
        try {
            return ((Class<T>)(((ParameterizedType)genericSuperclass).getActualTypeArguments()[i])).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
