package controle;

import controle.abstractfactory.Destino;

public interface CalculadoraFreteControle {
	
	void calcularFrete(int altura, int largura, int profundidade, int peso, Destino destino);

	void addObservador(Observador observador);

	void setTipoFrete(String tipoFrete);

	void setTipoEncomenda(String tipoEncomenda);
}
