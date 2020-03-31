package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.service.serviceImpl.Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieListMapper implements Converter<List<Movie>,List<MovieDto>>{
    private MovieDto convertMovie(Movie from) {

        MovieDto movieDto = new MovieDto();
        movieDto.setMovieId(from.getMovieId());
        movieDto.setTitle(from.getTitle());
        movieDto.setImage(from.getImage());
        movieDto.setYear(from.getYear());

        return movieDto;
    }

    @Override
    public List<MovieDto> convert(List<Movie> from) {

        List<MovieDto> moviesDto = from
                .stream()
                .map(this::convertMovie)
                .collect(Collectors.toList());

        return moviesDto;
    }
}
