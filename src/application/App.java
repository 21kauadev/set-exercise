package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Set<Integer> usersId = new HashSet<>();

        System.out.print("How many students for course A? ");
        int studentsForCourseA = sc.nextInt();

        for (int i = 0; i < studentsForCourseA; i++) {
            int id = sc.nextInt();
            usersId.add(id);
        }

        System.out.print("How many students for course B? ");
        int studentsForCourseB = sc.nextInt();

        for (int i = 0; i < studentsForCourseB; i++) {
            int id = sc.nextInt();
            usersId.add(id);

        }

        System.out.print("How many students for course C? ");
        int studentsForCourseC = sc.nextInt();

        for (int i = 0; i < studentsForCourseC; i++) {
            int id = sc.nextInt();
            usersId.add(id);
        }

        // como o set não permite duplicatas, aqui terei certeza de que adicionarei
        // somente o número certo de instâncias de users.
        for (Integer id : usersId) {
            new User(id);
        }

        System.out.println("Total students: ");
        System.out.println(usersId.size());

        sc.close();
    }
}
