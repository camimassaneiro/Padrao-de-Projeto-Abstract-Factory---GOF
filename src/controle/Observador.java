package controle;

public interface Observador {

	void tipoFreteSetado();

	void msgErro(String message);

	void tipoEncomendaSetado();

	void notificarPrecoCalculado(double preco);

}
