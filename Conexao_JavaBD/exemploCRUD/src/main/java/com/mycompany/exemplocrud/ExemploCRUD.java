/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplocrud;
/**
 *
 * @author Professor
 */
public class ExemploCRUD {

    public static void main(String[] args) {
        Conexao.conectar();
        
        TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true);
    }
}
