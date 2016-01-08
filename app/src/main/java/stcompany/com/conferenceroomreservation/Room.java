package stcompany.com.conferenceroomreservation;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.sql.Date;

/**
 * Created by takeshi on 16/01/01.
 */
@Table(name = "Rooms")
public class Room extends Model {

    @Column(name = "Position")
    public String position;

    @Column(name = "Date")
    public String date;

    public Room()
    {
        super();
    }

    /*
    public Item(String name, Category category) {
    super();
    this.name = name;
    this.category = category;
  }
     */

    public Room (String position, String date)
    {
        super();
        this.position = position;
        this.date = date;
    }
}
