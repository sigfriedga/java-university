/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Sigfried
 */
public class ClaseDTO {
   private String dato1;
  private String dato2;

  public String getDato1() {
    return dato1;
  }

  public void setDato1(String dato1) {
    this.dato1 = dato1;
  }

  public String getDato2() {
    return dato2;
  }

  public void setDato2(String dato2) {
    this.dato2 = dato2;
  }

  @Override
  public String toString() {
    return "ClaseDTO{" +
        "dato1='" + dato1 + '\'' +
        ", dato2='" + dato2 + '\'' +
        '}';
  }
}
