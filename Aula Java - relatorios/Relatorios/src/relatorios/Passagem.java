/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package relatorios;

import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Passagem {
    
    public static void Combo(String a) throws SQLException{
        
        
        Mes mes = new Mes();
        mes.Mesteste(a);
        mes.setVisible(true);
    }
}
