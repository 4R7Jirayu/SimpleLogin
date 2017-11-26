<?php
    include ("condb.php"); 

    $name = $_POST["name"];
    $email = $_POST["email"];
    $username = $_POST["username"];
    $password = $_POST["password"];

    $statement = mysqli_prepare($con, "INSERT INTO user (name, username, password, email) VALUES (?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "ssss", $name, $username, MD5($password), $email);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>
