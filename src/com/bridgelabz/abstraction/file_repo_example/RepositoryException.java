package com.bridgelabz.abstraction.file_repo_example;

/**
 * Custom exception
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-10
 */
public class RepositoryException extends RuntimeException {

    public RepositoryException( String message, Throwable cause ) {
        super( message, cause );
    }

}
