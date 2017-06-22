package com.source.it.lecture11.examples.serialization;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class DataOutputExample {
    private static final String FILE = "/Users/kblyumkin/Projects/AprilLectures/resources/user.bin";

    public static void main(String[] args) throws IOException {

        User user = new User();
        user.setName("John");
        user.setLastName("Black");
        user.setBirthday(new int[]{5, 5, 1998});
        user.setAddress(new Address("main", 100, "Kiev"));

        writeUser(user);

        User userFromFile = readUser();
        System.out.println(userFromFile);
    }


    private static User readUser() throws IOException {
        File file = new File(FILE);
        InputStream is = new BufferedInputStream(
                new GZIPInputStream(
                    new FileInputStream(file)));
        DataInput input = new DataInputStream(is);
        User result = new User();
        result.setName(input.readUTF());
        result.setLastName(input.readUTF());
        int[] birthday = new int[input.readInt()];
        for (int index = 0; index < birthday.length; index++) {
            birthday[index] = input.readInt();
        }
        result.setBirthday(birthday);
        Address address =
                new Address(input.readUTF(), input.readInt(), input.readUTF());

        result.setAddress(address);
        is.close();
        return result;
    }

    private static void writeUser(User user) throws IOException {
        File file = new File(FILE);

        OutputStream os = new BufferedOutputStream(
                new GZIPOutputStream(
                        new FileOutputStream(file)));

        DataOutput output = new DataOutputStream(os);

        output.writeUTF(user.getName());
        output.writeUTF(user.getLastName());
        output.writeInt(user.getBirthday().length);

        for (int elem : user.getBirthday()) {
            output.writeInt(elem);
        }
        Address address = user.getAddress();
        output.writeUTF(address.getStreet());
        output.writeInt(address.getApt());
        output.writeUTF(address.getCity());
        os.flush();
        os.close();
    }
}
