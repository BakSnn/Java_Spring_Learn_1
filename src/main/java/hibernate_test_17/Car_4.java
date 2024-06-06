package hibernate_test_17;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car_4 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "mark")
    private String mark;
    @Column(name = "model")
    private String model;
    @Column(name = "department")
    private String department;
    @Column(name = "cost")
    private int cost;

    public Car_4() {
    }
    public Car_4(String mark, String model, String department, int cost) {
        this.mark = mark;
        this.model = model;
        this.department = department;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Car_4{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", department='" + department + '\'' +
                ", cost=" + cost +
                '}';
    }

        public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {

        this.mark = mark;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

}