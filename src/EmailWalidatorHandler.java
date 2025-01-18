public class EmailWalidatorHandler extends WalidatorHandler {
    private Walidator<String> walidator = new EmailWalidatorProxy();

    @Override
    public void handleRequest(User user) throws WalidatorException {
        String email = user.getEmail();
        walidator.walidacja(email);
        super.handleRequest(user);
    }
}
