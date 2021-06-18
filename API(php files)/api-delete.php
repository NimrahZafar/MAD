<?php
header('Content-Type: application/json');
header('Access-Control-Allow-Origin: *');
header('Access-Control-Allow-Methods: DELETE');
header('Access-Control-Allow-Headers: Access-Control-Allow-Headers,Content-Type, Access-Control-Allow-Methods, Authorization, X-Requested-With');

$ Room_no  = $_POST[''];
include "config.php";
$sql = "DELETE FROM Room WHERE Room_no='{$Rooom_no }'";
if(mysqli_query($conn, $sql)){
    echo "Record Deleted";
}else{
 echo "Record Not Deleted";
} 

?>

