package BackEnd;

import BackEnd.CLASS;
import FrontEnd.GymSystem;
import java.util.ArrayList;
import java.util.Date;

public class Member extends User {

    private Date joineDte;
    private ArrayList<CLASS> classes = new ArrayList<CLASS>();
    private Membership membership;

    // Class class;
    //view Membership
    //creat Membershipe
    public Member() {
    }

    public Member(int id, String name) {
        super(id, name);
    }

    public Member(int id, String name, Date joineDte, Membership membership) {
        super(id, name);
        this.joineDte = joineDte;
        this.membership = membership;
    }

    public Date getJoineDte() {
        return joineDte;
    }

    public void setJoineDte(Date joineDte) {
        this.joineDte = joineDte;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }



    public String bookClass(int classId) {

        //check if the member is not already registerd in this class
        for (int i = 0; i < classes.size(); i++) {
            CLASS Temp = classes.get(i);
            if (Temp.getId() == classId) {
                return "You are Already registerd in "+Temp.getName()+"Class";
            }
        }

        for (int i = 0; i < GymSystem.classesAr.size(); i++) {
            CLASS Temp = GymSystem.classesAr.get(i);

            if (Temp.getId() == classId) {
                //check that the class dose not have a trainer
                if (Temp.getTrainer() != null) {
                    if(!Temp.isFull()){
                    Temp.getMembers().add(this);
                    classes.add(Temp);
                   
                    return Temp.getName()+" class is registerd secussfuly ";
                    }
                    else{
                    return Temp.getName()+"class is full";
                    }
                } else {
                    return "This class dose not have trainer yet";
                }

            }
        }
        return "";
    }
     public String cancelClassMEM(int classId) {
		for (int i = 0; i < classes.size(); i++) {
			CLASS Temp = classes.get(i);
			if (Temp.getId() == classId) {
//				classes.remove(i);
                                 classes.remove(Temp);
				return Temp.getName() + " Class is Canceled successfully";
			}
		}

		return "Class is not in your schedule";
	}


    public ArrayList<CLASS> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<CLASS> Classes) {
        this.classes = Classes;
    }

    public String ToDatabase() {
        //ID Name Date membershipType membershipStartDate #classesAr #Id1 #Id2 #Id......
        String Result = getId() + " " + getName() + " " + joineDte.getTime() + " " + getMembership().getMembershipType() + " " + getMembership().getMembershipStartDate().getTime() + " " + classes.size() + " ";
        for (int i = 0; i < classes.size(); i++) {
            Result += classes.get(i).getId() + " ";
        }
        return Result;
    }

    @Override
    public String toString() {
        return super.getName()+super.getId()+"Member{" + "joineDte=" + joineDte ;
    }

}
