abstract class WalidatorHandler {
    protected WalidatorHandler successor;

    public void setSuccessor(WalidatorHandler successor) {
        this.successor = successor;
    }

    void handleRequest(User user) throws WalidatorException {
        if(successor != null) {
            successor.handleRequest(user);
        }
    }
}
