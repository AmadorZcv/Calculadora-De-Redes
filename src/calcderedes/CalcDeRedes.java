/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcderedes;

import InterfaceConverter.Converter;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class CalcDeRedes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String ipInteiro;
        Scanner scan = new Scanner(System.in);

        //System.out.println("Digite o IP que deseja converter para binário:");
        //ipInteiro = scan.nextLine();
        ipInteiro = "192.168.0.1";
        //Substitui . por ;
        ipInteiro = ipInteiro.replace(".", ";");
        //Separa a String ip em partes
        String[] ipDividido = ipInteiro.split(";");

        Converter converter = new DecimalToBin();
        ipInteiro = ipInteiro.replace(";", ".");
        System.out.printf("\n" + ipInteiro + " = " + converter.converter(ipDividido) + "\n");
        //transforma em binario
        ipInteiro = converter.converter(ipDividido);
        IpBinario ipBinario = new IpBinario();
        ipBinario.setIp(ipInteiro);
        System.out.println("O ip de Rede é " + ipBinario.toRede(4));
        System.out.println("O ip de BroadCast é " + ipBinario.toBroadCast(4));
        System.out.println("O ip de Host1 é " + ipBinario.toHost1(4));
        System.out.println("O ip de HostN é " + ipBinario.toHostN(4));
    }

}
