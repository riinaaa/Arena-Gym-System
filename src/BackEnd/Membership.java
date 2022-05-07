package BackEnd;

import java.text.SimpleDateFormat;
import java.util.*;

public class Membership {

    private int membershipType; //3 6 12
    private Date membershipStartDate;
    public SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Membership(int membershipType, Date membershipStartDate) {
        this.membershipType = membershipType;
        this.membershipStartDate = membershipStartDate;
    }

    public Membership() {
    }

    public int getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(int membershipType) {
        this.membershipType = membershipType;
    }

    public Date getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(Date membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }

    // this method will calculate the membership expiry date
    public Date calculateExpiryDate() {
        double totalMonths = 2.62974383e9 * membershipType;
        Date endDate = new Date((long) (membershipStartDate.getTime() + totalMonths));
        return endDate;
    }

    public boolean validMemberShip() {
        double totalMonths = 2.62974383e9 * membershipType;
        
        Date endDate = new Date((long) (membershipStartDate.getTime() + totalMonths));
        Date now = new Date();
        return endDate.compareTo(now) > 0;

    }
    public Date CalculateEndDate() {
        double totalMonths = 2.62974383e9 * membershipType;
        Date endDate = new Date((long) (membershipStartDate.getTime() + totalMonths));
        return endDate;

    }

    //this method to create new subscription
    public void renew(int type) {
            this.membershipType = type;
            this.membershipStartDate = new Date();

    }

}
