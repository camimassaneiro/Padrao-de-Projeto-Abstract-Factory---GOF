package controle.abstractfactory;

public abstract class AbstractFreteFactory {
	
	public abstract Encomenda prepararEncomendaExpresso() throws Exception;
	
	public abstract Encomenda prepararEncomendaNormal() throws Exception;
	
}
