package clases;

public class Aula 
{	
	int aula;
	int alarma = 0; //ON = true, OFF = false
	int calefactor = 0; //ON = true, OFF = false
	
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
