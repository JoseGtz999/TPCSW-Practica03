/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.tpcsw.practica03;
import org.hibernate.SessionFactory;
/**
 *
 * @author josegtz
 */
public class TPCSWPractica03 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SessionFactory sf = HibernateUtil.getSessionFactory();
    }
}
