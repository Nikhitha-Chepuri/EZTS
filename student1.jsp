<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Info</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    
    </head>
    <body>
        <nav class="bg.primary">
            <label for="Brand" class="navbar-brand">
                Student Management System
            </label>
        </nav>

        <div class="container">
            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>ID</th>
                        <th>Student_Name</th>
                        <th>Student_Gender</th>
                        <th>Student_Email</th>
                        <th>Student_Phone no</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tr>
                    <td>001</td>
                    <td>Nikhitha Chepuri</td>
                    <td>Female</td>
                    <td>Nikhitha@gmail.com</td>
                    <td>9654321780</td>
                    <td>
                        <button class="btn btn-warning"><i class="bi bi-pencil"></i></button>
                        <button class="btn btn-danger"><i class="bi bi-trash3"></i></button>
                    </td>
                </tr>
                <tr>
                    <td>002</td>
                    <td>Nithin Chepuri</td>
                    <td>Male</td>
                    <td>Nithin@gmail.com</td>
                    <td>9654765780</td>
                    <td>
                        <button class="btn btn-warning"><i class="bi bi-pencil"></i></button>
                        <button class="btn btn-danger"><i class="bi bi-trash3"></i></button>
                    </td>
                </tr>
                <tr>
                    <td>003</td>
                    <td>Ashok Chepuri</td>
                    <td>Male</td>
                    <td>Ashok@gmail.com</td>
                    <td>9654321456</td>
                    <td>
                        <button class="btn btn-warning"><i class="bi bi-pencil"></i></button>
                        <button class="btn btn-danger"><i class="bi bi-trash3"></i></button>
                    </td>
                </tr>
                <tr>
                    <td>004</td>
                    <td>Anitha Chepuri</td>
                    <td>Female</td>
                    <td>Anitha@gmail.com</td>
                    <td>9654324567</td>
                    <td>
                        <button class="btn btn-warning"><i class="bi bi-pencil"></i></button>
                        <button class="btn btn-danger"><i class="bi bi-trash3"></i></button>
                    </td>
                </tr>
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>