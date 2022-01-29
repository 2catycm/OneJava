package cn.edu.sustech.onejava.exception;

public class TargetJavaFileNotFoundException extends RuntimeException{
    public TargetJavaFileNotFoundException() {
        super();
    }
    public TargetJavaFileNotFoundException(String message) {
        super(message);
    }
}
