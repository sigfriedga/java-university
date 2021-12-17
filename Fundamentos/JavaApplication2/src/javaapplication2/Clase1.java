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
public class Clase1 {
    
    private int numero;
  private ClaseDTO dto;

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public ClaseDTO getDto() {
    return dto;
  }

  public void setDto(ClaseDTO dto) {
    this.dto = dto;
  }

  @Override
  public String toString() {
    return "Clase1{" +
        "numero=" + numero +
        ", dto=" + dto +
        '}';
  }
    
}
