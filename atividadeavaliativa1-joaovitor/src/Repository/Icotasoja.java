package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface Icotasoja {

	
	public interface IcotasojaRepository extends JpaRepository<cotasoja,Long> {
		
	}
	
}
