<?php
header('Content-Type: application/json');
header('Access-Control-Allow-Origin: *');
header('Access-Control-Allow-Methods: POST');
header('Access-Control-Allow-Headers: Access-Control-Allow-Headers,Content-Type, Access-Control-Allow-Methods, Authorization, X-Requested-With');

$Room_no = $_POST['Room_id'];
$No_of_beds = $_POST['Count_of_beds'];

include "config.php";
$sql = "INSERT INTO Room(id, 'Count_of_beds VALUES ('{$bus_no}', '{ $No_of_beds  }’;

if(mysqli_query($conn, $sql)){
print( 'Record Inserted Successfully.');
}
else{
echo 'Record Not Inserted.';
}
?>



