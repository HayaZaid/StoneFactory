/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ad;

/**
 *
 * @author hp
 */
public class customer {
    private int ID;
  private String name;
  private String Phone;
  private String Address;
  private double Total;
  private double Paid;

    public customer() {
    }

    public customer(int ID, String name, String Phone, String Address, double Total, double Paid) {
        this.ID = ID;
        this.name = name;
        this.Phone = Phone;
        this.Address = Address;
        this.Total = Total;
        this.Paid = Paid;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getAddress() {
        return Address;
    }

    public double getTotal() {
        return Total;
    }

    public double getPaid() {
        return Paid;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public void setPaid(double Paid) {
        this.Paid = Paid;
    }

    public customer(int ID, String name, double Total, double Paid) {
        this.ID = ID;
        this.name = name;
        this.Total = Total;
        this.Paid = Paid;
    }

    @Override
    public String toString() {
        return "customer{" + "ID=" + ID + ", name=" + name + ", Total=" + Total + ", Paid=" + Paid + '}';
    }
    

    
   

  
}
