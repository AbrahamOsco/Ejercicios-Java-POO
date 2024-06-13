package EjercicioAlgoMail;

public class Usuario{
    private String codigoDeSeguridad;
    private String nombreDeUsuario;

    private String contraseña;

    public Usuario(String nombreDeUsuario, String contraseña) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.contraseña = contraseña;
        this.codigoDeSeguridad = "0";
    }

    public Usuario(String nombreDeUsuario, String contraseña, String codigoDeSeguridad) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.contraseña = contraseña;
        this.codigoDeSeguridad = codigoDeSeguridad;
    }

    public boolean iniciarSeccion(AutenticacionSimple autenticacionSimple) {
        return autenticacionSimple.autenticar(nombreDeUsuario, contraseña);
    }

}
