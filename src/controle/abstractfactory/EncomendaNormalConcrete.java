package controle.abstractfactory;

/**
 *
 * @author camil
 */
public class EncomendaNormalConcrete extends Encomenda {

    private double preco;

    @Override
    public double getPreco() throws Exception {

        if (getCubagem() > 0) {
            switch (getDestino()) {
                case NORTE:
                    preco = getCubagem() * 0.03;
                    break;
                case CENTROOESTE:
                    preco = getCubagem() * 0.04;
                    break;
                case NORDESTE:
                    preco = getCubagem() * 0.02;
                case SUDESTE:
                case SUL:
                    preco = getCubagem() * 0.01;
                    break;
                case AMERICALATINA:
                    preco = getCubagem() * 0.07;
                    break;
                case AMERICADONORTE:
                    preco = getCubagem() * 0.10;
                    break;
                case EUROPA:
                    preco = getCubagem() * 0.15;
                    break;
                case AFRICA:
                    preco = getCubagem() * 0.25;
                    break;
                case ASIA:
                    preco = getCubagem() * 0.17;
                    break;
                case OCEANIA:
                    preco = getCubagem() * 0.30;
                    break;
            }
        } else {
            throw new UnsupportedOperationException("Verificar Cubagem da encomenda");
        }
        return preco;
    }
}
