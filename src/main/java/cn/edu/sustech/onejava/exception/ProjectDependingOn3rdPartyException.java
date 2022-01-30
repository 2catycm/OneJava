package cn.edu.sustech.onejava.exception;

/**
 * If the project we are analyzing depends on 3rd party jar like "Apache Common Lang" or "Postgresql JDBC", this exception should be thrown.
 */
public class ProjectDependingOn3rdPartyException extends RuntimeException{
    public ProjectDependingOn3rdPartyException(String message) {
        super(message);
    }
}
