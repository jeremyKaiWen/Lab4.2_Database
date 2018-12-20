package my.edu.tarc.lab42_database;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "user")
public class User {
    @PrimaryKey
    @NonNull
    private String phone;

    // @ Optional : @ColumnInfo(name = "firstName")
    private String firstName;

    private String lastName;

    public User(){
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;

    }
}
