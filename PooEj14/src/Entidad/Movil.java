/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.

 * @author crist
 */
public class Movil {
    private String mar;
    private int pre;
    private String mod;
    private int memoR;
    private int alma;
    private int[] cod;

    public Movil() {
        this.cod = new int[7];
    }

    public Movil(String mar, int pre, String mod, int memoR, int alma, int[] cod) {
        this.mar = mar;
        this.pre = pre;
        this.mod = mod;
        this.memoR = memoR;
        this.alma = alma;
        this.cod = cod;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public int getPre() {
        return pre;
    }

    public void setPre(int pre) {
        this.pre = pre;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public int getMemoR() {
        return memoR;
    }

    public void setMemoR(int memoR) {
        this.memoR = memoR;
    }

    public int getAlma() {
        return alma;
    }

    public void setAlma(int alma) {
        this.alma = alma;
    }

    public int[] getCod() {
        return cod;
    }

    public void setCod(int[] cod) {
        this.cod = cod;
    }
    
}
