package br.edu.fateczl.pilhaInt;

public class PilhaInt 
{
	No topo;
	
	public PilhaInt() 
	{
		topo = null;
	}
	
	public boolean isEmpty()
	{
		if (topo == null)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void push (int e)
	{
		No elemento = new No();
		elemento.dado = e;
		
		if (isEmpty())
		{
			topo = elemento;
		}
		else 
		{
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	public int pop() throws Exception
	{
		if (isEmpty())
		{
			throw new Exception ("Não há elementos para desempilhar");
		}
		
		int val = topo.dado;
		topo = topo.proximo;
		
		return val;
	}
	
	public int top() throws Exception
	{
		if (isEmpty())
		{
			throw new Exception ("Não há elementos para desempilhar");
		}
		return topo.dado;
	}
	
	public int size()
	{
		int cont = 0;
		
		if (!isEmpty())
		{
			No auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null)
			{
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
	}
}
