package clases;

public class Aula 
{	
	int aula;
	boolean alarma = false; //ON = true, OFF = false
	boolean calefactor = false; //ON = true, OFF = false
	
	public Aula(int aula) 
	{
		this.aula = aula;
	}

	public int getNombreAula() 
	{
		return aula;
	}
	
	public boolean getCalefactor() 
	{
		return calefactor;
	}
}
