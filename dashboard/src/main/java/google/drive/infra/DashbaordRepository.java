package google.drive.infra;

import google.drive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="dashbaords", path="dashbaords")
public interface DashbaordRepository extends PagingAndSortingRepository<Dashbaord, Long> {

    

    
}
