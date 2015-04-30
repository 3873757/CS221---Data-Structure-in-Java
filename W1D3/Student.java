/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
class Student {

    private int id;
    private String name;
    private int mark;

    public Student(int id, String name, int mark) {
        this.id = id;
        this.mark = mark;
        this.name = name;
    }

    public void displayStudent() {

        System.out.print("  StdID: " + id);
        System.out.print(",  StdNAME: " + name);
        System.out.println(",  Mark: " + mark);
    }

    public int getid() {
        return id;
    }

    public int getmark() {
        return mark;
    }
}
