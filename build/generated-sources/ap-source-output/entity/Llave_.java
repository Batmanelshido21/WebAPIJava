package entity;

import entity.Boveda;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-13T17:30:22")
@StaticMetamodel(Llave.class)
public class Llave_ { 

    public static volatile SingularAttribute<Llave, String> nombrellave;
    public static volatile SingularAttribute<Llave, byte[]> password;
    public static volatile SingularAttribute<Llave, Boveda> idBoveda;
    public static volatile SingularAttribute<Llave, String> url;
    public static volatile SingularAttribute<Llave, String> username;

}