/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.enums;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author PROPIETARIO
 */
public enum TransactionType {
    @SerializedName("1")
    DEPOSIT, 
    @SerializedName("2")
    WITHDRAWALS;
    
    
    
    public Object getType() {    
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
