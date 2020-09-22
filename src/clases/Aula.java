package clases;

public class Aula 
{	
	int aula;
	int alarma = 0; //ON = 1, OFF = 0
	int calefactor = 0; //ON = 1, OFF = 0
	
	public Aula(int aula) 
	{
		this.aula = aula;
	}

	public int getNombreAula() 
	{
		return aula;
	}
	
	public int getCalefactor() 
	{
		return calefactor;
	}
}
