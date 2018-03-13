/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcderedes;

import InterfaceConverter.Converter;
import java.util.Iterator;

/**
 *
 * @author lucas
 */
public class DecimalToBin implements InterfaceConverter.Converter {

    @Override
    public String converter(String[] ipDividido) {
        
        int resto, num = 0;
        int ip;
        int n = 0;
        
        int length = 0;
        
        String bin = "";
        String retorno = "";
        for (String x : ipDividido) {
            ip = Integer.parseInt(x);
            
            do{
                resto = ip%2;
                ip = ip/2;
                bin += resto;
                length = bin.length();
            }while(ip > 0);
            
            if(bin.length() < 8){
               n = 8 - bin.length();
                for (int i = 0; i < n; i++) {
                    bin += "0";
                }
            }
            StringBuffer stringbuffer = new StringBuffer(bin);
            stringbuffer.reverse();
            retorno += stringbuffer.toString();
            length = 0;
            if (num < 3){
                retorno += ".";
                bin = "";
                num ++;
            }
            
        }
        return retorno;
    }
    
}
