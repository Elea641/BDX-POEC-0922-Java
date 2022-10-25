import java.sql.Date;
import java.util.ArrayList;

public class User {

    private Date birthdate;
    private float size;
    private ArrayList<Photo> photos;
    private String adress;

    public User(Date birthdate, Float size, ArrayList<Photo> photos, String adress){
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.adress = adress;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate){
    this.birthdate = birthdate;
    }

    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos){
        this.photos = photos;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}