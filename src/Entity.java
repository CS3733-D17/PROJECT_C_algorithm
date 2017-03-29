import java.util.Date;

/**
 * Created by paluro on 3/24/17.
 */
public class Entity {

    public static enum BeverageType
    {
        WINE,
        BEER,
        DISTILLED;
    }


    String submitter;
    String reciever;
    Date date;
    BeverageType type;
    String ID;
    int taken;


    public Entity(String submitter, String reciever, Date date, BeverageType type, String ID) {
        this.submitter = submitter;
        this.reciever = reciever;
        this.date = date;
        this.type = type;
        this.ID = ID;
    }

    public String getSubmitter() {
        return submitter;
    }

    public String getReciever() {
        return reciever;
    }

    public Date getDate() {
        return date;
    }

    public BeverageType getType() {
        return type;
    }

    public String getID() {
        return ID;
    }
}
