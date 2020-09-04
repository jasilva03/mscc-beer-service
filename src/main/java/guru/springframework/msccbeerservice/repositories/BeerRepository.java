package guru.springframework.msccbeerservice.repositories;

import guru.springframework.msccbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {



}
