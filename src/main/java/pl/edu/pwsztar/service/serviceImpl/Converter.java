package pl.edu.pwsztar.service.serviceImpl;

@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}
