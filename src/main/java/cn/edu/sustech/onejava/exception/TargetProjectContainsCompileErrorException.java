package cn.edu.sustech.onejava.exception;

public class TargetProjectContainsCompileErrorException extends RuntimeException{
    public TargetProjectContainsCompileErrorException() {
        super();
    }
    public TargetProjectContainsCompileErrorException(String message) {
        super(message);
    }
}
