package univs.edu.consulta;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import univs.edu.cliente.Cliente;
import univs.edu.dentista.Dentista;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Consulta.class)
public abstract class Consulta_ {

	public static volatile SingularAttribute<Consulta, Cliente> cliente;
	public static volatile SingularAttribute<Consulta, Date> data;
	public static volatile SingularAttribute<Consulta, Integer> horario;
	public static volatile SingularAttribute<Consulta, String> tipoConsulta;
	public static volatile SingularAttribute<Consulta, Integer> valor;
	public static volatile SingularAttribute<Consulta, Dentista> dentista;
	public static volatile SingularAttribute<Consulta, Integer> idConsulta;
	public static volatile SingularAttribute<Consulta, String> status;

}

