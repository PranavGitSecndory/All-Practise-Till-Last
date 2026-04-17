<?php
include('mailer_config/mailerConfig.php');
require "DataCurlNodeApi/DataCurlNodeApiFunctions.php";

$ENDURL = "https://itbusinessplus.net/template/V3/109109-Design-2-thanks.php";


        $fields = [
        "firstname"   =>  "firstname"  , 
		"lastname"   =>  0  , 
		"Email"   =>  1  , 
	//	"Phone"   =>  2  , 
		"Company"   =>  3  , 
	//	"Address"   =>  4  , 
	//	"City"   =>  5  , 
		"country"   =>  6  , 
	//	"state"   =>  7  , 
	//	"province"   =>  8  , 
	//	"Zipcode"   =>  9  , 
		"Company_Size"   =>  10  , 
	//	"Revenue"   =>  11  , 
		"Job_title"   =>  12  , 
		"industry"   =>  19  , 
		"Job_function"   =>  14  , 
	//	"Target_Titles"=>15,
	//	"Target_Level"=>16,
	//	"cq1"   =>  15  , 
	//	"cq2"   =>  16  , 
	//	"cq3"   =>  17  , 
		"Optin"   =>  18   
        ];
        

 

$mapped_data = [];

foreach ($fields as $key => $value) {
    $mapped_data[$key] = is_numeric($value) ? $_POST["data"][$value] : $_POST[$value];
}


$camp_id = $_POST["camp_id"];
//DON'T CHANGE THIS CODE (Data Get From LP)
$URL = ($_SERVER['HTTP_REFERER']);
$firstname = $_POST["firstname"];
$temp=json_encode(   utf8_converter( array('Field Count' => count($mapped_data)) +  $mapped_data ));
$pattern = '/[a-z0-9_\-\+\.]+@[a-z0-9\-]+\.([a-z]{2,4})(?:\.[a-z]{2})?/i';
preg_match_all($pattern, $temp, $matches);
$email = array_shift($matches[0]);
//DON'T CHANGE THIS CODE END

/*-------  API CALL ------------*/
$data = array( 'camp_id' => $camp_id, 'tempdata' => $temp,  'ip_address' => getClientIp(), 'URL' => array("URL"=>$URL,"END_URL"=>$ENDURL) );
dataCurlAPI(_TGIF_, $data);



                                
$mail->From = "mailing@itbusinesstoday.com";
$mail->FromName = "ITBusinessToday";
$mail->addAddress($email, $firstname);
$mail->isHTML(true);
$mail->Subject = "Thank you for requesting a White Paper";
$mail->Body = "<table>
            <tbody>
            <tr><td>Dear&nbsp;<strong>$firstname,</strong></td></tr>
            <tr><td>&nbsp;<br></td></tr> 
            <tr><td>Thank you for requesting <strong>\"10 reasons to go paperless.\"</strong>. You can view it immediately by clicking <a href=\"https://itbusinessplus.net/template/V3/109109-Design-2.pdf\">HERE</a>!</td></tr>
            <tr><td>&nbsp;<br></td></tr> 
            <tr><td>&nbsp;<br></td></tr> 
            <tr><td>Sincerely,</td></tr> 
            <tr><td>Nina Ridgeway</td></tr> 
            <tr><td>ITBusinessToday</td></tr>
            </tbody>
        </table>";						
$mail->AltBody = "";

try {
    $mail->send();
    //echo "Message has been sent successfully";
	echo "<script>window.location.href = '$ENDURL';</script>";
} catch (Exception $e) {
    //echo "Mailer Error: " . $mail->ErrorInfo;
}




?>
