package crmsystem.exception;

/**
 * @author Savchenko on 10.03.2023
 */
public class NoEntityException extends RuntimeException {
    public NoEntityException(String messageError) {
        super(messageError);
    }
}