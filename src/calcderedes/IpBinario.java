/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcderedes;

import InterfaceConverter.Converter;

/**
 *
 * @author Aluno
 */
public class IpBinario {

    private String ip;

    public String toRede(int mascara) {
        String ipInteiro = this.ip;
        ipInteiro = ipInteiro.replace(".", ";");
        //Separa a String ip em partes
        String[] ipDividido = ipInteiro.split(";");
        String ipJunto = "";
        for (String string : ipDividido) {
            ipJunto = ipJunto + string;
        }
        String ipFrente = ipJunto.substring(mascara - 1, ipJunto.length());
        String ipAtras = ipJunto.substring(0, mascara - 1);
        ipFrente = ipFrente.replace("1", "0");
        String ipTodo = ipAtras + ipFrente;
        ipDividido[0] = ipTodo.substring(0, 8);
        ipDividido[1] = ipTodo.substring(8, 16);
        ipDividido[2] = ipTodo.substring(16, 24);
        ipDividido[3] = ipTodo.substring(24);
        Converter converter = new BinToDecimal();
        return converter.converter(ipDividido);
    }

    public IpBinario(String ip) {
        this.ip = ip;
    }

    public String toBroadCast(int mascara) {
        String ipInteiro = this.ip;
        ipInteiro = ipInteiro.replace(".", ";");
        //Separa a String ip em partes
        String[] ipDividido = ipInteiro.split(";");
        String ipJunto = "";
        for (String string : ipDividido) {
            ipJunto = ipJunto + string;
        }
        String ipFrente = ipJunto.substring(mascara, ipJunto.length());
        String ipAtras = ipJunto.substring(0, mascara);
        ipFrente = ipFrente.replace("0", "1");
        String ipTodo = ipAtras + ipFrente;
        ipDividido[0] = ipTodo.substring(0, 8);
        ipDividido[1] = ipTodo.substring(8, 16);
        ipDividido[2] = ipTodo.substring(16, 24);
        ipDividido[3] = ipTodo.substring(24);
        Converter converter = new BinToDecimal();
        return converter.converter(ipDividido);
    }

    public IpBinario() {
    }

    public String toHost1(int mascara) {
        String ipInteiro = this.ip;
        ipInteiro = ipInteiro.replace(".", ";");
        //Separa a String ip em partes
        String[] ipDividido = ipInteiro.split(";");
        String ipJunto = "";
        for (String string : ipDividido) {
            ipJunto = ipJunto + string;
        }
        String ipFrente = ipJunto.substring(mascara, ipJunto.length());
        String ipAtras = ipJunto.substring(0, mascara);
        ipFrente = ipFrente.replace("1", "0");
        String ipTodo = ipAtras + ipFrente;
        ipDividido[0] = ipTodo.substring(0, 8);
        ipDividido[1] = ipTodo.substring(8, 16);
        ipDividido[2] = ipTodo.substring(16, 24);
        ipDividido[3] = ipTodo.substring(24,ipTodo.length()-1) + "1";
        Converter converter = new BinToDecimal();
        return converter.converter(ipDividido);
    }

    public String toHostN(int mascara) {
        String ipInteiro = this.ip;
        ipInteiro = ipInteiro.replace(".", ";");
        //Separa a String ip em partes
        String[] ipDividido = ipInteiro.split(";");
        String ipJunto = "";
        for (String string : ipDividido) {
            ipJunto = ipJunto + string;
        }
        String ipFrente = ipJunto.substring(mascara, ipJunto.length());
        String ipAtras = ipJunto.substring(0, mascara);
        ipFrente = ipFrente.replace("0", "1");
        String ipTodo = ipAtras + ipFrente;
        ipDividido[0] = ipTodo.substring(0, 8);
        ipDividido[1] = ipTodo.substring(8, 16);
        ipDividido[2] = ipTodo.substring(16, 24);
        ipDividido[3] = ipTodo.substring(24,ipTodo.length()-1) + "0";
        Converter converter = new BinToDecimal();
        return converter.converter(ipDividido);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

}
