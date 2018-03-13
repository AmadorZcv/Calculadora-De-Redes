/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcderedes;

import InterfaceConverter.Converter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class BinToDecimal implements InterfaceConverter.Converter {

    @Override
    public String converter(String[] ipDividido) {
        int ip;
//        String temp = "";
//        String retorno = "";
//        int r=0;
//        for (String string : ipDividido) {
//            ip = Integer.parseInt(string, 2);
//            temp = Integer.toString(ip, 10);
//            retorno += temp;
//            if(r<3){
//                r++;
//                retorno += ".";
//            }
//        }
        String ipCerto="";
        for (String string : ipDividido) {
            ip = Integer.parseInt(string, 2);
            ipCerto=ipCerto + ip + ".";
        }
        return ipCerto.substring(0,ipCerto.length()-1);
    }
    
}
