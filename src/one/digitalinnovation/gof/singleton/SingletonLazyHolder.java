package one.digitalinnovation.gof.singleton;


/**
 * Singleton "lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 *
 * @author dgleyramos1
 * */
public class SingletonLazyHolder {

    private static class InstanciaHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanciaHolder.instancia;
    }
}
