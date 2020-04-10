package com.bridgelabz.abstraction.file_repo_example;

/**
 * Interface which handles our basing works and also throws custom exceptions and also
 * Checks for stuffs which need to be closed like db connections etc.
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-10
 * @See {@link AutoCloseable} for closing stuffs
 * @See {@link RepositoryException} custom Exception
 */
public interface ClientEngageRepository extends AutoCloseable {
//    AutoClosable interface handles all closing stuff like closing db connections , etc.

    int NO_ID = 0;

    void add( ClientEngagement clientEngagement ) throws RepositoryException;

    void remove( ClientEngagement clientEngagement ) throws RepositoryException;

    Iterable<ClientEngagement> find( FindBy find ) throws RepositoryException;
}
