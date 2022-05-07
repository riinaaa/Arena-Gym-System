package FrontEnd;
import BackEnd.Membership;
import BackEnd.Trainer;
import BackEnd.Member;
import BackEnd.CLASS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class GymSystem {

    public static ArrayList<Trainer> trainersAr = new ArrayList<Trainer>();
    public static ArrayList<Member> membersAr = new ArrayList<Member>();
    public static ArrayList<CLASS> classesAr = new ArrayList<CLASS>();
    public static Member member;
    public static Trainer trainer;

    public static void main(String[] args) throws IOException {
        LoadData();
        run();
        SaveData();      
        
    }

    public static void run() {
        new LOGsign().setVisible(true);
    }

    private static void LoadData() throws FileNotFoundException {

        Scanner input = new Scanner(new File("classes.txt"));
        while (input.hasNext()) {
            classesAr.add(new CLASS(input.nextInt(), input.next(), input.next().charAt(0)));
        }

        input = new Scanner(new File("trainers.txt"));
        while (input.hasNext()) {
            Trainer trainer = new Trainer(input.nextInt(), input.next());
            int numberofclasses = input.nextInt();
            for (int i = 0; i < numberofclasses; i++) {
                trainer.createClass(input.nextInt());
            }
            trainersAr.add(trainer);
        }
        input = new Scanner(new File("members.txt"));

        while (input.hasNext()) {

            Member member = new Member(input.nextInt(), input.next(), new Date(input.nextLong()),
                     new Membership(input.nextInt(), new Date(input.nextLong())));
            int numberofclasses = input.nextInt();
            for (int i = 0; i < numberofclasses; i++) {
                member.bookClass(input.nextInt());
            }
            membersAr.add(member);
        }

        input.close();

        //To change body of generated methods, choose Tools | Templates.*/
    }

    public static void SaveData()  {
        PrintWriter printer = null;
        try {
            printer = new PrintWriter("classes.txt");
            for (int i = 0; i < classesAr.size(); i++) {
                printer.println(classesAr.get(i).ToDatabase());
            }   printer.close();
            printer = new PrintWriter("trainers.txt");
            for (int i = 0; i < trainersAr.size(); i++) {
                printer.println(trainersAr.get(i).ToDatabase());
            }   printer.close();
            printer = new PrintWriter("members.txt");
            for (int i = 0; i < membersAr.size(); i++) {
                printer.println(membersAr.get(i).ToDatabase());
            }   printer.close();
        } catch (FileNotFoundException ex) {
        } 
    }
}
