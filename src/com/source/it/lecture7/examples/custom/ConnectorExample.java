package com.source.it.lecture7.examples.custom;

public class ConnectorExample {
    public static void main(String[] args) {
        VirtualConnector connector = new VirtualConnector();

        /*try (VirtualConnector connector = new VirtualConnector()) {
            System.out.println(connector.read());
            System.out.println(connector.read());
            System.out.println(connector.read());
            System.out.println(connector.read());
            System.out.println(connector.read());
        } catch (CustomException ce) {
            //ce.printStackTrace();
        }*/

        try {
            System.out.println(connector.read());
            System.out.println(connector.read());
            System.out.println(connector.read());
            System.out.println(connector.read());
            System.out.println(connector.read());
        } catch (CustomException ce) {
            //ce.printStackTrace();
        } finally {
            try {
                connector.close();
            } catch (CustomException e) {

            }
        }
    }
}
