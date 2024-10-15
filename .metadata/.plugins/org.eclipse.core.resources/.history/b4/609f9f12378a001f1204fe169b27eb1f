<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${pagina.getTitulo()}</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header text-center">
                        <h3>Login</h3>
                    </div>
                    <div class="card-body">
                    <p><font color="red">${error}</font></p>
                        <!-- Formulario de Login -->
                        <form action="login" method="POST">
                            <!-- Nombre de Usuario -->
                            <div class="form-group">
                                <label for="nombre">Username</label>
                                <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Enter your nombre" required>
                            </div>
                            
                            <!-- Contraseña -->
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input type="password" class="form-control" id="password" name="password" placeholder="Enter your password" required>
                            </div>
                            
                            <!-- Botón de Iniciar Sesión -->
                            <button type="submit" class="btn btn-primary btn-block" value="Login">Login</button>
                        </form>
                    </div>
                    
                    <!-- Card Footer con opción de Registro -->
                    <div class="card-footer text-center">
                        <small>Don't have an account?</small> <a href="registro" class="btn btn-link">Sign Up</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS y dependencias -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>