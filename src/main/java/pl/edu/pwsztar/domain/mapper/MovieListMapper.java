package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.service.serviceImpl.Converter;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieListMapper {

    public List<MovieDto> mapToDto(List<Movie> movies) {
        Converter<Movie,MovieDto> mapConverter = (Movie movie) -> {

            MovieDto movieDto = new MovieDto();

            movieDto.setMovieId(movie.getMovieId());
            movieDto.setTitle(movie.getTitle());
            movieDto.setImage(movie.getImage());
            movieDto.setYear(movie.getYear());

            return movieDto;
        };
        List<MovieDto> moviesDto = movies
                .stream()
                .map(mapConverter::convert)
                .collect(Collectors.toList());

        return moviesDto;
    }
}
