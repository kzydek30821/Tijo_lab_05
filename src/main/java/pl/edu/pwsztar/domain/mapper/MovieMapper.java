package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.service.serviceImpl.Converter;

@Component
public class MovieMapper {

    public Movie mapToEntity(CreateMovieDto createMovieDto) {
        Converter<CreateMovieDto,Movie> mapToEntityConverter = (CreateMovieDto) -> {
            Movie movie = new Movie();

            movie.setImage(createMovieDto.getImage());
            movie.setTitle(createMovieDto.getTitle());
            movie.setYear(createMovieDto.getYear());
            return movie;
        };
        return mapToEntityConverter.convert(createMovieDto);
    }
}
