
package controle.abstractfactory;

/**
 *
 * @author camil
 */
public class ConcreteFactoryCorreio extends AbstractFreteFactory{

    @Override
    public Encomenda prepararEncomendaExpresso() throws Exception {
        return new EncomendaExpressoConcrete();
    }

    @Override
    public Encomenda prepararEncomendaNormal() throws Exception {
        return new EncomendaNormalConcrete();
    }
    
}
