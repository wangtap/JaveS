package com.lanou3g.bean;

public class Teacher {
    private long tid;
    private String name;
    private Integer age;
    private String subject;

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                '}';
    }

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (tid != teacher.tid) return false;
        if (name != null ? !name.equals(teacher.name) : teacher.name != null) return false;
        if (age != null ? !age.equals(teacher.age) : teacher.age != null) return false;
        if (subject != null ? !subject.equals(teacher.subject) : teacher.subject != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (tid ^ (tid >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        return result;
    }
}
