package BackEnd;

import BackEnd.User;
import BackEnd.CLASS;
import FrontEnd.GymSystem;
import java.util.ArrayList;

public class Trainer extends User {

    private ArrayList<CLASS> classes = new ArrayList<CLASS>();

    public Trainer() {
    }

    public Trainer(int id, String name) {
        super(id, name);
    }

    public ArrayList<CLASS> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<CLASS> classes) {
        this.classes = classes;
    }



    public String createClass(int classId) {
        for (int i = 0; i < GymSystem.classesAr.size(); i++) {
            CLASS Temp = GymSystem.classesAr.get(i);

            if (Temp.getId() == classId) {
                //check that the class dose not have a trainer
                if (Temp.getTrainer() == null) {
                    Temp.setTrainer(this);
                    classes.add(Temp);
                    return Temp.getName() + " Class is added secussfuly";
                } else {
                    return Temp.getName() + " Class is already assigned to Trainer";
                }

            }
        }
        return "";
    }

    public String cancelClass(int classId) {
        for (int i = 0; i < classes.size(); i++) {
            CLASS Temp = classes.get(i);
            if (Temp.getId() == classId) {

                Temp.Cancel();
                classes.remove(i);
                return Temp.getName() + " Class is Canceled successfully";
            }
        }

        return "This course is not Assigned to you";
    }

    public String ToDatabase() {
        //ID Name   #classesAr #Id1 #Id2 #Id......
        String Result = getId() + " " + getName() + " " + classes.size() + " ";
        for (int i = 0; i < classes.size(); i++) {
            Result += classes.get(i).getId() + " ";
        }
        return Result;
    }

    @Override
    public String toString() {
        return getName() + " " + getId();
    }

}
