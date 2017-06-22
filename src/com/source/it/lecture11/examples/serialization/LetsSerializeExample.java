package com.source.it.lecture11.examples.serialization;

import java.io.*;

public class LetsSerializeExample {
    private static final String FILE = "/Users/kblyumkin/Projects/AprilLectures/resources/user.serialize";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.setName("John");
        user.setLastName("Black");
        user.setBirthday(new int[]{05, 05, 1998});
        user.setAddress(new Address("Main", 100, "Kiev"));
        /*User newUser = copy(user);*/
        user.setName("Peter");
        user.getBirthday()[0] = 0;
/*
        System.out.println(newUser);
        System.out.println(user);*/

        write(user);

        User copy = read();
        System.out.println(copy);
    }

    private static <T extends Serializable> T copy(T origin)
            throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutput oos = new ObjectOutputStream(baos);
        oos.writeObject(origin);

        oos.flush();
        oos.close();

        byte[] data = baos.toByteArray();
        //System.out.println(new String(data));
        ObjectInput objectInput = new ObjectInputStream(
                new ByteArrayInputStream(data));

        return (T) objectInput.readObject();
    }

    private static <T extends Serializable> void write(T object) throws IOException {
        OutputStream os = new FileOutputStream(FILE);
        try (ObjectOutput oo = new ObjectOutputStream(os)) {
            oo.writeObject(object);
            oo.flush();
        }
    }

    private static <T extends Serializable> T read() throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(FILE);
        try (ObjectInput oi = new ObjectInputStream(is);) {
            return (T) oi.readObject();
        }
    }
}
