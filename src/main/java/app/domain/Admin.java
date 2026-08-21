package app.domain;

public class Admin extends Person{

     private String role;
     private String area;


     public Admin() {
        super();
     }

    public Admin(Integer id, String name, String lastName, String email, String phone, String password, boolean state, String role, String area) {
        super(id, name, lastName, email, phone, password, state);
        this.role = role;
        this.area = area;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void create() {
        super.create();
    }

    @Override
    public void selectAll() {
        super.selectAll();
    }

    @Override
    public void selectById(int id) {
        super.selectById(id);
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void delete(int id) {
        super.delete(id);
    }
}
