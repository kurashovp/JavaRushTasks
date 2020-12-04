package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("task2002", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Имя");
            user.setLastName("Фамилия");
            user.setBirthDate(new Date());
            user.setMale(false);
            user.setCountry(User.Country.OTHER);
            javaRush.users.add(user);

            User user1 = new User();
            user1.setFirstName("Юзер1");
            user1.setLastName("Юзерский");
            user1.setBirthDate(new Date());
            user1.setMale(true);
            user1.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user1);

            User user2 = new User();
            user2.setFirstName("Усер2");
            user2.setLastName("Иванов");
            user2.setBirthDate(new Date(1));
            user2.setMale(true);
            user2.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user2);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println("loadedObject.equals(javaRush) = " + loadedObject.equals(javaRush));
            loadedObject.save(System.out);

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter pw = new PrintWriter(outputStream);
            pw.println(users != null);
            if (users != null) {
                pw.println(users.size());
                for (User u: users) {
                    pw.println(u.getFirstName());
                    pw.println(u.getLastName());
                    pw.println(u.getBirthDate().getTime());
                    pw.println(u.isMale());
                    pw.println(u.getCountry());
                }
            }
            pw.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            boolean isUsers = Boolean.parseBoolean(br.readLine());
            if (isUsers) {
                int userCount = Integer.parseInt(br.readLine());
                for (int i = 0; i < userCount; i++) {
                    User user = new User();
                    user.setFirstName(br.readLine());
                    user.setLastName(br.readLine());
                    user.setBirthDate(new Date(Long.parseLong(br.readLine())));
                    user.setMale(Boolean.parseBoolean(br.readLine()));
                    user.setCountry(User.Country.valueOf(br.readLine()));
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
