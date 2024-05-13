package narendra.java.designpatterns.builder;

public class Student {

    private String name;
    private String batch;
    private double psp;
    private int age;
    private int gradeYear;
    private String phone;

   /* public Student(String name, String batch, double psp, int age, int gradeYear, String phone) {
        this.name = name;
        this.batch = batch;
        this.psp = psp;
        this.age = age;
        this.gradeYear = gradeYear;
        this.phone = phone;
    } */

    public Student(Builder b){
        if(b.getAge() > 100){
            throw new RuntimeException();
        }
        this.name = b.getName();
        this.batch = b.getBatch();
        this.psp = b.getPsp();
        this.age = b.getAge();
        this.gradeYear = b.getGradeYear();
        this.phone = b.getPhone();
    }

     static class Builder {

        private String name;
        private String batch;
        private double psp;
        private int age;
        private int gradeYear;
        private String phone;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradeYear() {
            return gradeYear;
        }

        public Builder setGradeYear(int gradeYear) {
            this.gradeYear = gradeYear;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

}
