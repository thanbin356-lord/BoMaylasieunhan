/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.code;

/**
 *
 * @author zkuro
 */
public class Student {
    private String studentID, name, bang, cancuoc, address, phonenumber;

    public Student() {
    }

    public Student(String studentID, String name, String cancuoc, String address, String phonenumber ) {
        this.studentID = studentID;
        this.name = name;
        this.cancuoc = cancuoc;
        this.address = address;
    }
    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBang() {
        return bang;
    }

    public void setBang(String bang) {
        this.bang = bang;
    }
    
    public String getCancuoc() {
        return cancuoc;
    }

    public void setCancuoc(String cancuoc) {
        this.cancuoc = cancuoc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }


            
    
}
