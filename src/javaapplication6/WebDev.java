/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author MYWINDOWS
 */
public class WebDev extends InputData implements Calculate{

    public WebDev(String name, int write, int code, int interv){
        super(name,write,code,interv);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWrite(int write) {
        this.write = write;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setInterv(int interv) {
        this.interv = interv;
    }
    
    @Override
    public double finalScore() {
        return (0.4*super.write)+(0.35*super.code)+(0.25*super.interv);
    }

}
