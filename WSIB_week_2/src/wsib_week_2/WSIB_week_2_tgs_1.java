/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wsib_week_2;

/**
 *
 * @author ACER
 */
public class WSIB_week_2_tgs_1 {
    public String StudentName;
    public int StudentID;
    public String StudentStatus;

    public void ProfileStudent() {
        StudentName = "Lisa Palombo";
        StudentID = 123456789;
        StudentStatus = "Active";

        System.out.println("Student Name:" + StudentName);
        System.out.println("Student ID: " + StudentID);
        System.out.println("Student Status: " + StudentStatus);
    }

    public void main(String[] args) {
        ProfileStudent();
    }

}
