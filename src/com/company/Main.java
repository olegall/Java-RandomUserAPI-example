package com.company;

import com.jcraft.jsch.Session;


public class Main {
    public static void main(String[] args) {
        Users users = new Users(110);
        users.populate();
        for (User user : users.get()) {
            System.out.print("Имя: " + user.getFirstName().replace("\"", "") + "    " +
                    "Фамилия: " + user.getLastName().replace("\"", "") + "\n");
        }

        System.out.print("--------------------------------------------------------------------------------------------------------------\n");
        int userNum = 10;
        System.out.print("Имя: " + users.get().get(10).getFirstName().replace("\"", "") + "\n" +
                "Фамилия: " + users.get().get(userNum).getLastName().replace("\"", "") + "\n" +
                "E-mail: " + users.get().get(userNum).getContacts().getEmail().replace("\"", "") + "\n" +
                "Телефон: " + users.get().get(userNum).getContacts().getPhone().replace("\"", "") + "\n" +
                "Национальность: " + users.get().get(userNum).getNationality().replace("\"", "") + "\n" +
                "Место жительства: " +
                "штат " + users.get().get(userNum).getContacts().getAddress().getState().replace("\"", "") + ", " +
                "город " + users.get().get(userNum).getContacts().getAddress().getCity().replace("\"", "") + ", " +
                "улица " + users.get().get(userNum).getContacts().getAddress().getStreet().replace("\"", "") + "\n" +
                "Картинка: " +
                "превью " + users.get().get(userNum).getPicture().getThumbnail() + ", " +
                "средняя " + users.get().get(userNum).getPicture().getLarge());
    }
}
