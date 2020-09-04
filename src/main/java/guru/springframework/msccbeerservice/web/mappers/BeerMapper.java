package guru.springframework.msccbeerservice.web.mappers;

import guru.springframework.msccbeerservice.domain.Beer;
import guru.springframework.msccbeerservice.web.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDTO beerToBeerDTO(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);

}
