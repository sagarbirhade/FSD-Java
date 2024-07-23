<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .form-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        .form-container h1 {
            text-align: center;
            margin-bottom: 20px;
        }
        .form-container div {
            margin-bottom: 15px;
        }
        .form-container label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        .form-container input {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .form-container button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
        }
        .form-container button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Register Here</h1>
        <form action="EmployeeRegister" method="post">
            
            <div>
                <label for="empid">Employee ID</label>
                <input type="text" id="empid" name="empid" required>
            </div>
            <div>
                <label for="firstname">Firstname</label>
                <input type="text" id="firstname" name="firstname" required>
            </div>
            <div>
                <label for="lastname">Lastname</label>
                <input type="text" id="lastname" name="lastname" required>
            </div>
            <div>
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div>
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
            
            <div>
                <label for="address">Address</label>
                <input type="text" id="address" name="address" required>
            </div>
        
            <div>
                <label for="contact">Contact</label>
                <input type="text" id="contact" name="contact" required>
            </div>
            <div>
                <button type="submit">Sign Up</button>
            </div>
            <div>
                <button type="reset">Reset</button>
            </div>
        </form>
    </div>
</body>
</html>
