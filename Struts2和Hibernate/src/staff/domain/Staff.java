package staff.domain;

import java.sql.Date;

public class Staff {
    private int sid;
    private String sname;
    private Integer age;
    private String department;
    private Date hiredate;
    private String address;
    private String phone;

    @Override
    public String toString() {
        return "Staff{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", hiredate=" + hiredate +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        if (sid != staff.sid) return false;
        if (sname != null ? !sname.equals(staff.sname) : staff.sname != null) return false;
        if (age != null ? !age.equals(staff.age) : staff.age != null) return false;
        if (department != null ? !department.equals(staff.department) : staff.department != null) return false;
        if (hiredate != null ? !hiredate.equals(staff.hiredate) : staff.hiredate != null) return false;
        if (address != null ? !address.equals(staff.address) : staff.address != null) return false;
        if (phone != null ? !phone.equals(staff.phone) : staff.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
