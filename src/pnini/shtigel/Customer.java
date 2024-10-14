package pnini.shtigel;

import java.util.List;

public interface Customer {
    String getName();
    void rentVehicle(Vehicle vehicle, int days);//מתודה שמדפיסה את כלי הרכב ואת הסכום הכללי ומוסיפה את כלי הרכב הנוכחי לרשימת הרכבים
    List<Vehicle> getRentedVehicles();//מחזירה את מערך הרכבים שהשכיר לקוח זה
}
