package app.domain;

public class User extends Person{

    private String city;
    private String preferences;

    public User() {
        super();
    }

    public User(Integer id, String name, String lastName, String email, String phone, String password, boolean state, String city, String preferences) {
        super(id, name, lastName, email, phone, password, state);
        this.city = city;
        this.preferences = preferences;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    @Override
    public void create() {
        super.create();
    }

    @Override
    public void selectById(int id) {
        super.selectById(id);
    }


    @Override
    public void update() {
        super.update();
    }

    public void addPreferences(String preference){

    }



}
