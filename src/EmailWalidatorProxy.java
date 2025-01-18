import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailWalidatorProxy implements Walidator<String>{
    private static final Pattern EMAIL = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");

    @Override
    public void walidacja(String email) throws WalidatorException {
        Matcher matcher = EMAIL.matcher(email);
        if (!matcher.matches()) {
            throw new WalidatorException("Email nie przeszedl walidacji");
        }
    }
}
