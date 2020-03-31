package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.service.serviceImpl.Converter;

@Component
public class MovieMapper implements Converter<CreateMovieDto, Movie>{

    @Override
    public Movie convert(CreateMovieDto from) {
        Movie movie = new Movie();
        movie.setImage(from.getImage());
        movie.setTitle(from.getTitle());
        movie.setYear(from.getYear());
        return movie;
    }
}
