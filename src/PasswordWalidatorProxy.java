public class PasswordWalidatorProxy implements Walidator<String> {
    @Override
    public void walidacja(String password) throws WalidatorException {
        if (password.length() < 8 ||
                !password.matches(".*[A-Z].*") ||
                !password.matches(".*[a-z].*") ||
                !password.matches(".*\\d.*") ||
                !password.matches(".*[!@#$%^&*()].*")) {
                    throw new WalidatorException("Hasło musi składać się z conajmniej 8 znaków, zawierac małe i wielkie litery, cufry oraz znaki specialne.");
        }
    }
}
