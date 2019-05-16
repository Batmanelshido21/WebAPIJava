package entity;

import entity.Llave;
import entity.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-13T17:30:22")
@StaticMetamodel(Boveda.class)
public class Boveda_ { 

    public static volatile CollectionAttribute<Boveda, Llave> llaveCollection;
    public static volatile SingularAttribute<Boveda, String> nombreBoveda;
    public static volatile SingularAttribute<Boveda, Integer> cantidadLlaves;
    public static volatile SingularAttribute<Boveda, Integer> idBoveda;
    public static volatile SingularAttribute<Boveda, Usuario> username;

}