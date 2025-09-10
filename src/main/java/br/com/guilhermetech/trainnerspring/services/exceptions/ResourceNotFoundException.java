package br.com.guilhermetech.trainnerspring.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Object id){
        super("Resource not found with id " + id);
    }
}
