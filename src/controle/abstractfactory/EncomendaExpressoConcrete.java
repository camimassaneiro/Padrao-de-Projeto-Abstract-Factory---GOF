package controle.abstractfactory;

/**
 *
 * @author camil
 */
public class EncomendaExpressoConcrete extends Encomenda {

    private boolean destinoValido;
    private double preco;

    public EncomendaExpressoConcrete() {
    }

    @Override
    public double getPreco() throws Exception {

        verificaDestinoValido();

        if (getPeso() > 0 && destinoValido == true) {

            switch (getDestino()) {
                case NORDESTE:
                case NORTE:
                    preco = getPeso() * 0.05;
                    break;
                case CENTROOESTE:
                    preco = getPeso() * 0.075;
                    break;
                case SUDESTE:
                case SUL:
                    preco = getPeso() * 0.025;
                    break;
            }
        } else {
            throw new UnsupportedOperationException("Verificar se peso é maior que 0 ou se destino é válido");
        }
        return preco;
    }

    public void verificaDestinoValido() {

        if (getDestino() == Destino.CENTROOESTE || getDestino() == Destino.NORDESTE || getDestino() == Destino.NORTE
                || getDestino() == Destino.SUDESTE || getDestino() == Destino.SUL) {
            destinoValido = true;
        }
    }

}
