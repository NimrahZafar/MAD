<?php
header('Content-Type: application/json');
header('Access-Control-Allow-Origin: *');
header('Access-Control-Allow-Methods: PUT');
header('Access-Control-Allow-Headers: Access-Control-Allow-Headers,Content-Type, Access-Control-Allow-Methods, Authorization, X-Requested-With');

$Room_no = $_POST['Room_id'];
$No_of_beds = $_POST['count_of_beds];


include "config.php";
$sql = "UPDATE Rooms SET Room_no='{$Room_id }', count_of_beds='{ $No_of_beds  }’  WHERE Room_no='{$ Room_id }'";

if(mysqli_query($conn, $sql)){
  echo "Record Updated";
}else{
  echo "Record Not Updated";
}

?>

