package clases;

public class Aula 
{	
	int aula;
	boolean alarma = false;
	boolean calefactor = false;

	public Aula(int aula) 
	{
		this.aula = aula;
	}

	public int getNombreAula() 
	{
		return aula;
	}
	
	public boolean getCalefactor() {
		return calefactor;
	}
}
