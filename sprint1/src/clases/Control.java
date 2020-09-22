package clases;

import java.sql.*;

public class Control 
{
	public static void main(String[] args) 
	{
		//Inicialización de array de alarmas (101 - 116, 201 - 216 ...)
		Aula aulas[] = new Aula[48];
		
		for(int i = 0; i < aulas.length; i++)
		{
			aulas[i].aula = i;
		}
		
		int in = 2;
		
		if(aulas[in].calefactor == 0) 
		{
			aulas[in].calefactor = 1;
		}
		else
		{
			aulas[in].calefactor = 0;
		}
			
		
		//ALARMAS
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:...","user..","pwd...");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT idAula, fechaHora FROM reto_0");  
			
			if(rs.first())
			{
				do
				{
					int activeA = rs.getInt("idAula");
					
					/*ArrayList[activeA].setBackground(new Color(255,0,0));
					 * */
				}while(rs.next());
			}
			else
			{
				int alarmas = (int) (Math.random() * 10);
				
				for(int i = 0; i < alarmas; i++)
				{
					int index = (int)(Math.random() * 49);
					
					stmt.executeUpdate("call spInsertAlarma(" + index + ")");
				}
				
				ResultSet rs1=stmt.executeQuery("SELECT idAula, fechaHora FROM reto_o");  
				
				do
				{
					int activeA = rs1.getInt("idAula");
					
					/*ArrayList[activeA].setBackground(new Color(255,0,0));
					 * */
				}while(rs1.next());
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
