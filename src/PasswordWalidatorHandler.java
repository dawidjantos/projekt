public class PasswordWalidatorHandler extends WalidatorHandler {
    private Walidator<String> walidator = new PasswordWalidatorProxy();

    @Override
    public void handleRequest(User user) throws WalidatorException{
        String password = user.getPassword();
        walidator.walidacja(password);
        super.handleRequest(user);
    }
}
