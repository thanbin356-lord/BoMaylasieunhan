/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.code;

/**
 *
 * @author Admin
 */
public class Equipment {
    private String EquipID, name, stat;
    private Float quant;

    public Equipment() {
    }

    public Equipment(String EquipID, String name, String stat, float quant) {
        this.EquipID = EquipID;
        this.name = name;
        this.stat = stat;
        this.quant = quant;
    }
    public String getEquipID() {
        return EquipID;
    }

    public void setEquipID(String studentID) {
        this.EquipID = EquipID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public float getQuant() {
        return quant;
    }

    public void setQuant(float quant) {
        this.quant = quant;
    }



            
    
}

    

