class Student {
    private int roll;
    private String name;
    private double sal;

    public void setData(int r, String n, double s) {
        roll = r;
        name = n;
        sal = s;
    }

    public void showData() {
        System.out.println("Roll-" + roll);
        System.out.println("Name-" + name);
        System.out.println("Salary-" + sal);
    }
}

class UseStudent {
    public static void main(String[] args) {
        Student s;
        s = new Student();
        s.setData(10,"Avinash",4125.58);
        s.showData();
        System.out.println();
         p = new Student();
        p.setData(15,"Deepak",4455.58);
        p.showData();
    }
}
