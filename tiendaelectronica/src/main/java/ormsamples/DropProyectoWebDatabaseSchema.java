/**
 * Licensee: daniporre(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DropProyectoWebDatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(basededatosorm.ProyectoWebPersistentManager.instance());
				basededatosorm.ProyectoWebPersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}