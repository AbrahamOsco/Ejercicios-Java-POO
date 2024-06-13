package EjercicioAlgoMail;

import java.util.HashMap;

public class AutenticacionSimple {
    private HashMap<String, String> registroUsuarios;

    public AutenticacionSimple(){
        registroUsuarios = new HashMap<>();
        registroUsuarios.put("Ricardo123", "abcd123" );
    }

    public boolean autenticar(String nombreDeUsuario, String contraseniaUsuario) {
        String posibleContraseña = registroUsuarios.get(nombreDeUsuario);
        if ( posibleContraseña == null ){
            return false;
        }
        return (posibleContraseña == contraseniaUsuario);
    }
        
    /*
    public boolean iniciarSeccion(Usuario usuario) {
        String posiblePassword = registroUsuarios.get(usuario.getNombreUsuario());
        return posiblePassword == usuario.getPassword();
    }
     */
    
}
