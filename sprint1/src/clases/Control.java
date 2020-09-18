package clases;

import java.sql.*;

public class Control 
{
	public static void main(String[] args) 
	{
		//Inicialización de array de alarmas (101 - 116, 201 - 216 ...)
		Aula aula[][] = new Aula[3][16];
		
		for(int i = 0; i < aula.length; i++)
			for(int y = 0; y < aula[i].length; y++)
			{
				aula[i][y] = new Aula((i + 1) * 100 + y + 1);
			}
		
		//Activación random de alarmas
//		int numAlarmas = (int) ((Math.random() * 20 + 1));
//		
//		for(int i = numAlarmas; i >= 0; i--)
//		{
//			int planta = (int)((Math.random() * 3 + 1));
//			int classRoom = (int)((Math.random() * 16 + 1));
//			
//			aula[planta][classRoom].alarma = true;
//		}
		
		//
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:...","user..","pwd...");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("call ...");  
			
			for(int i = 0; i < 3; i++)
			{
				int index = (int)(Math.random() * 48);
				
				rs.absolute(index);
				
				int classRoom = rs.getInt("aula"); 
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
