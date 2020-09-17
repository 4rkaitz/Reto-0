package clases;

public class Principal {

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
		
	}
	
}
