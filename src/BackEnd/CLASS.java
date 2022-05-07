package BackEnd;

import java.util.ArrayList;

public class CLASS {

    private int id;
    private String name;
    private final int capacity = 15;
    private char period;
    private Trainer trainer;
    private ArrayList<Member> members=new ArrayList<>();

    public CLASS() {
       
    }

    public CLASS(int id,String name,char period) {
        this.id = id;
        this.name=name;
        this.period = period;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    
    public String getPeriod() {
        return (period+"M").trim();
    }

    public void setPeriod(char period) {
        this.period = period;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "CLASS{" + "id=" + id + ", name=" + name +", capacity=" + capacity + ", period=" + period + ", trainer=" + trainer + ", members=" + members + '}';
    }
    
    public String ToDatabase(){
        //ID Name period
        return id+" "+name+" "+period;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CLASS other = (CLASS) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    boolean isFull() {
        return members.size()==capacity;
    }

    void Cancel() {
        for (Member member : members) {
            member.getClasses().remove(this);  
        }
        trainer=null;
        members.clear();
    }
        

}
