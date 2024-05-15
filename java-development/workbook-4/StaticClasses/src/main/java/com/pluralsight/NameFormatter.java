package com.pluralsight;

public class NameFormatter {

    public static String format(String firstName, String lastName){
        return lastName + ", " + firstName;


    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        StringBuilder sb = new StringBuilder();
        sb.append(lastName).append(", ");
        if (!prefix.isEmpty()) {
            sb.append(prefix).append(" ");
        }
        sb.append(firstName).append(" ");
        if (!middleName.isEmpty()) {
            sb.append(middleName).append(" ");
        }
        if (!suffix.isEmpty()) {
            sb.append(suffix).append(" ");
        }

        return sb.toString();

    }

    public static String format(String fullName) {
        String[] parts = fullName.split("\\s+");
        String prefix = parts[0];
        String firstName = parts[1];
        String middleName = parts[2];
        String lastName = parts[3];
        String suffix = parts[4];

        return fullName;

    }


}
