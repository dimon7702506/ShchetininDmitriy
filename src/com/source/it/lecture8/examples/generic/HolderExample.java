package com.source.it.lecture8.examples.generic;

public class HolderExample {
    public static void main(String[] args) {
        StringHolder sh = new StringHolder();
        sh.setValue("123");

        String value = sh.getValue();
        System.out.println(value);

        ObjectHolder oh = new ObjectHolder();

        oh.setValue("123");
        oh.setValue(new Exception("Exception during excution"));

        Object value1 = oh.getValue();

        if (value1 instanceof String) {
            String result = (String) value1;
            System.out.println(result);
        }

    }
}
