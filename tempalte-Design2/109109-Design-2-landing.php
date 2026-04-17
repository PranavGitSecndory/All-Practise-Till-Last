<?php
   $email=$_GET['e'];
   $emailencoded=base64_encode($email);
   $emailstr="https://api.anteriad.com/track/pixel?c=NTczNTg=&p=Njc=&ev=1&e=".$emailencoded;
   ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />

        <!-- ASSET TITLE -->
        <title>Generative AI is Reshaping Government Operations for a Smarter Future</title>

        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.5/dist/jquery.validate.min.js"></script>
        <style type="text/css">
			@import url("https://fonts.googleapis.com/css2?family=Noto+Sans&display=swap");

			* {
				text-decoration: none;
				font-family: "Noto Sans", sans-serif;
			}
			a {
				color: #0066b2;
			}

			.btn-primary1 {
				color: #ffffff;
				background-color: #954535;
				border: none;
				text-align: center;
				padding-bottom: 10px;
				margin-right: 10px;
				font-size: 18px;
			}
				
			table.leadForm {
				width: 100%;
				border-collapse: collapse; /* so we can control cellspacing in a practical way */
			}
			table.leadForm th,
			table.leadForm td {
				color: #000000;
				padding:5px  0px;
				text-align: left;
				font: normal 13px/21px "Noto Sans", sans-serif;
                font-size:12px;
			}
		 
			table.leadForm select {
				border-radius: 2px;
				width: 100%;
				 
				border: 1px solid #ccc;
				padding: 5px;
			}
			table.leadForm input[type="text"],
			input[type="email"],input[type="number"] {
				border-radius: 2px;
				width: 150px;
				height: 22px;
				border: 1px solid #ccc;
				font: normal 12px/22px "Noto Sans", sans-serif;
				color: #111;
				padding: 5px;
			}

            input[type="text"]:focus,
			input[type="email"]:focus,
            input[type="number"]:focus,
            select:focus {
                
                outline: 0;
                box-shadow: 0 0 0 0.2rem rgb(0 123 255 / 25%);
            }


            	table.leadForm input[type="text"]:disabled,
			input[type="email"]:disabled,input[type="number"]:disabled {
			background-color: #D3D3D3;
			}

            
            input:read-only{
			background-color: #D3D3D3;
			}

            select.readonly{
                appearance: none;
                background-color: #D3D3D3;
            }
           
            
			input.submit {
				background: url("https://itbusinessplus.net/template/V3/download-button-new.png") left top no-repeat;
				cursor: pointer;
				height: 39px;
				width: 160px;
				border: 0px solid #000;
			}
			.formbg {
				-webkit-border-radius: 10px;
				-moz-border-radius: 10px;
				border-radius: 20px;
				padding: 10px;
				text-align: right;
			}
			body {
				background-repeat: repeat;
				margin-top: 0px;
			}


            .thumbnail{
                width:270px;
                border: 1px solid #e5e5e5; 
                
                border-radius: 5px;
            }
            .landing_abstract{
                font-size: 13px;
				line-height: 1.5;
				color: #414141;
            
            }

			.abstract p,
			.abstract ul ,
            .abstract ol {
				font-size: 14px;
				line-height: 1.5;
				color: #414141;
			}

			ul li {
				padding-bottom: 12px;
			}
            ol li {
				padding-bottom: 12px;
			}

			table {
				border-spacing: 0px;
			}

        

			label.error {
				display: block;
				color:red;
                font-size:12px;
			}

			[type="checkbox"].error {
				outline: 2px solid #c00;
			}


            .radio-option{
            display:flex;
            gap:4px;
            align-items: flex-start;
            margin-top: 6px;
            }

                .radio-option{
            display:flex;
            gap:4px;
            align-items: flex-start;
            margin-top: 6px;
            }

            

            .radio-option > span{
            margin:0;
            padding:0;
            font-size:11px;
            color:#1a1a1a;
            }

            .radio-option > p{
            font-size:11px;
            }

            .form-group p{
                margin:0;
                padding:0;
                font-size:12px;
                color:#444;

            }





             .speaker{
                font-size: 14px;
                color: #414141;
                margin-bottom:7px;
                 border-collapse: separate; /* allow spacing between cell borders */
                border-spacing: 0 5px; /* NOTE: syntax is <horizontal value> <vertical value> */
            }

            .speaker-heading{
                font-size: 15px;
                color: #414141;
                font-weight:bold;
                padding-bottom:9px;
            }

            .speaker-image{

                width:40px;
                height:40px;
                padding-right:12px;

            }
            .speaker-image img{
                width:100%;
            }

            .speaker-name{
                font-weight:bold;
            }

            .speaker-details{
                font-size:13px;
            }


          


            .cta{

                background-color:#0066b2;    
                width:auto; color: white;  border-radius:8px; 
                padding:10px 20px;
                margin-right: 0px;
                margin-top:10px;
                cursor:pointer;
            }

            /* Chrome, Safari, Edge, Opera */
            input::-webkit-outer-spin-button,
            input::-webkit-inner-spin-button {
            -webkit-appearance: none;
            margin: 0;
            }

            /* Firefox */
            input[type=number] {
            -moz-appearance: textfield;
            }

           .hide{display:none;} 


               .abstract p , .abstract ul{
                 font-size: 14px;
                line-height: 1.5;
                color: #414141;
            }


            .footer p{
                            font-size: 11px;
            }
        </style>

        <script>
        $( document ).ready(function() {
	
		   
		   jQuery.validator.addMethod(
    "email",
    function(value, element) {
        // Regular expression for email validation
        return /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/.test(value);
    },
    "Please enter a valid email address."
);
		   
		});
		
		
		$().ready(function() {
		// validate the comment form when it is submitted
			$("#id3f").validate(
			
			{ // initialize the plugin
       
					errorPlacement: function (error, element) {
						if (element.attr("type") == "radio") {
							error.appendTo(element.closest(".check-group"));
						} else if (element.attr("type") == "checkbox") {
							error.appendTo(element.closest(".check-group"));
						} else {
							error.appendTo($(element).parent());
						} 
					
					},
					 submitHandler: function (form) {
						//console.log("Submitted!");
						//alert("Submit");
						form.submit();
					}
			}
	
			);
		}
		);

        </script>

        <script>
            new Image().src = "https://api.anteriad.com/track/pixel?c=NTczNTg=&p=Njc=&ev=1&e=<Base64 encrypted email>";
        </script>

        <noscript> <img height="1" width="1" style="display: none;" alt="" src="https://api.anteriad.com/track/pixel?c=NTczNTg=&p=Njc=&ev=1&e=<Base64 encrypted email>" /></noscript>
    </head>
    <body style="background-color: #e8ecee;">
        <table
            align="center"
            style="
                border-top: 10px solid #0066b2;
                border-bottom: 10px solid #0066b2;
                width: 700px;
                margin: 3% auto;
                border-radius: 7px;

                box-shadow: 0 2.8px 2.2px rgb(0 0 0 / 3%), 0 6.7px 5.3px rgb(0 0 0 / 5%), 0 12.5px 10px rgb(0 0 0 / 6%), 0 22.3px 17.9px rgb(0 0 0 / 7%), 0 41.8px 33.4px rgb(0 0 0 / 9%), 0 100px 80px rgb(0 0 0 / 12%);
            "
        >
            <tbody style="background-color: white;">
                <tr>
                    <td class="header" style="background-color: white;">
                        <table width="100%" style="padding: 0% 2%; border-bottom: 1px solid rgb(192, 192, 192);">
                            <tbody>
                                <tr style="background-color: white;">
                                    <!-- LOGO -->
                                    <td height="88" valign="middle" style="">
                                        <img src="https://itbusinessplus.net/template/V3/IT-BUSINESS-TODAY-COLOUR-1.png" alt="It Business Today" width="150" style="" />
                                    </td>
                                    <td width="234" align="right">
                                        <span style="font-size: 13px;color: #0066b2;">Sponsored by</span><br />
                                        <img class="splogo land" src="https://itbusinessplus.net/template/V3/57358-Iron-Mountain-CPL-1-Iron-mountn-logo.png" alt="Logo"  style="width:160px; margin-top: 10px; margin-bottom: 6px;" />
                                  
                                   
                                    </td>

                                    <!-- LOGO -->
                                </tr>
                            </tbody>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td style="background: #fff; padding: 0.8% 3%;">
                        <table width="100%">
                            <tbody>
                                <tr>
                                    <td colspan="2"><h1 style="font-size: 20px;font-weight:normal; color: #0066b2;margin-top:10px;margin-bottom:15px;padding-left:0px;">10 reasons to go paperless</h1></td>
                                </tr>

                                <tr>
                                    <td width="53%" height="auto" align="left" valign="top" style="">
                                        
                                        <div style="padding-right:3%;">
                                          

                                            
        <div class="img" align="center">
            <img   src="https://itbusinessplus.net/template/V3/109109-Design-2.png"  class="thumbnail"  alt="thumbnail" />                          
        </div>
        <div class="landing_abstract" >
           <div align="center"><div class="sub" data-key="0.4056007893367666" align="center" style="background-color: #e2ebf3;margin-top: 30px; display: flex;padding: 10px;width: 250px;align-items: center;">
            <p style="text-align: left; margin-top: 10px;">Please fill this form to get immediate access to this exclusive resource.</p>
            <div><img src="https://itbusinessplus.net/template/V3/Arrow-pr.png" alt="Arrow" style="width: 50px;  "></div>
            </div>
            </div>

           

            
        </div>
       


                                        
                                        </div>
                                    </td>
                                    <td rowspan="2" width="47%" valign="top" align="left">
                                        <div class="formbg" style="box-shadow: 0px 0px 1px 1px #0066b2;">
                                            <!-- FORM -->
                                            <form id="id3f" action="https://itbusinessplus.net/template/V3/109109-Design-2-sendemail.php?e=<?echo $emailencoded;?>" method="post">
                                                <div style="display: none;">
                                                    <img src="https://api.anteriad.com/track/pixel?c=NTczNTg=&p=Njc=&ev=1&e=" style="display: none;" />
                                                </div>

                                                <!--XXX ... DON'T CHANGE THIS CODE ... XXX-->
                                                <input type="hidden" name="action" id="action" value="insert" />
                                                <input type="hidden" name="camp_id" id="camp_id" value="109109-Design-2" />
                                                <input type="hidden" name="Pixel_link" id="Pixel_link" value="https://api.anteriad.com/track/pixel?c=NTczNTg=&p=Njc=&ev=1&e=" />
                                                <!--XXX ... DON'T CHANGE THIS CODE ... XXX-->

                                                <div></div>
                                                <table class="leadForm" width="102%" colspan="2">
                                                    <tbody>
														
                <tr class="form-group firstname-holder">
                    <th width="47%">
                        
         <label for="firstname">
                   <span title="Required Field">First Name</span>
                   <span class="mandatory" style="color:red">*</span>
               </label>

                    </th>
                    <td width="53%">
                         <input type="text" name="firstname" required      id="firstname" value="" >
               
                    </td>
                </tr>
        
                <tr class="form-group lastname-holder">
                    <th width="47%">
                        
         <label for="lastname">
                   <span title="Required Field">Last Name</span>
                   <span class="mandatory" style="color:red">*</span>
               </label>

                    </th>
                    <td width="53%">
                         <input type="text" name="data[0]" required      id="lastname" value="" >
               
                    </td>
                </tr>
        
                <tr class="form-group Email-holder">
                    <th width="47%">
                        
         <label for="Email">
                   <span title="Required Field">Email Address</span>
                   <span class="mandatory" style="color:red">*</span>
               </label>

                    </th>
                    <td width="53%">
                         <input type="email" name="data[1]" required      id="Email" value="" >
               
                    </td>
                </tr>
        
              
        
                <tr class="form-group Company-holder">
                    <th width="47%">
                        
         <label for="Company">
                   <span title="Required Field">Company</span>
                   <span class="mandatory" style="color:red">*</span>
               </label>

                    </th>
                    <td width="53%">
                         <input type="text" name="data[3]" required      id="Company" value="" >
               
                    </td>
                </tr>
				
                        <tr class="form-group Job_title-holder">
                    <th width="47%">
                        
         <label for="Job_title">
                   <span title="Required Field">Title</span>
                   <span class="mandatory" style="color:red">*</span>
               </label>

                    </th>
                    <td width="53%">
                         <input type="text" name="data[12]" required      id="Job_title" value="" >
               
                    </td>
                </tr>
				
				
				
           
                <tr class="form-group country-holder">
                    <th width="47%">
                        
                        <label for="country">
                            <span title="Required Field">Country</span>
                            <span class="mandatory" style="color:red">*</span>
                
                        </label>
        
                    </th>
                    <td width="53%">
                         <select name="data[6]" required id="country"  class=" "   >
        
          
        <option value="United States" >United States</option>

        </select>
                    </td>
                </tr>
        
                
        
            
        
            
        
                <tr class="form-group Company_Size-holder">
                    <th width="47%">
                        
                        <label for="Company_Size">
                            <span title="Required Field">Target Employee Range</span>
                            <span class="mandatory" style="color:red">*</span>
                
                        </label>
        
                    </th>
                    <td width="53%">
                         <select name="data[10]" required id="Company_Size"  class=" "   >
        
          
        
          <option value="" >Choose One</option><option value="1 to 50">1 to 50</option><option value="1,001 to 5,000">1,001 to 5,000</option><option value="10,001 to 20,000">10,001 to 20,000</option><option value="101 to 250">101 to 250</option><option value="20,001+">20,001+</option><option value="251 to 500">251 to 500</option><option value="5,001 to 10,000">5,001 to 10,000</option><option value="501 to 1,000">501 to 1,000</option><option value="51 to 100">51 to 100</option>

        </select>
                    </td>
                </tr>
        
               

        
                <tr class="form-group Country-holder">
                    <th width="47%">
                        
                        <label for="Country">
                            <span title="Required Field">Industry</span>
                            
                
                        </label>
        
                    </th>
                    <td width="53%">
                         <select name="data[19]"  id="industry"  class=" "   >
        
          
        
         <option value="" >Choose One</option><option value="Banking">Banking</option><option value="Education">Education</option><option value="Energy, Mining, Utilities">Energy, Mining, Utilities</option><option value="Finance">Finance</option><option value="Government (Federal)">Government (Federal)</option><option value="Government (State or Local)">Government (State or Local)</option><option value="Healthcare">Healthcare</option><option value="Insurance">Insurance</option><option value="Legal">Legal</option><option value="Management Services">Management Services</option><option value="Manufacturing">Manufacturing</option><option value="Media and Advertising">Media and Advertising</option><option value="Other">Other</option><option value="Pharma and Biotech">Pharma and Biotech</option><option value="Real Estate">Real Estate</option><option value="Retail and Wholesale">Retail and Wholesale</option><option value="Software and Technology">Software and Technology</option><option value="Telecommunication">Telecommunication</option><option value="Tourism and Leisure">Tourism and Leisure</option><option value="Transport, Logistics and Posta">Transport, Logistics and Posta</option>

        </select>
                    </td>
                </tr>
        
                <tr class="form-group Job_function-holder">
                    <th width="47%">
                        
                        <label for="Job_function">
                            <span title="Required Field">Job Function</span>
                            <span class="mandatory" style="color:red">*</span>
                     
                        </label>
        
                    </th>
                    <td width="53%">
                         <select name="data[14]" required id="Job_function"  class=" "   >
        
          
        
          <option value="" >Choose One</option><option value="Accounting">Accounting</option><option value="Compliance Management">Compliance Management</option><option value="Facilities">Facilities</option><option value="Finance">Finance</option><option value="Human Resources">Human Resources</option><option value="Legal">Legal</option><option value="Operations">Operations</option><option value="Other">Other</option><option value="Records Management">Records Management</option>
        </select>
                    </td>
                </tr>
        
		
		
                                          
<tr class="form-group cq1-holder">
<td colspan="2">
       <div>Do you have any digital transformation initiatives within the next three months?<span style="color: red;">*</span></div>
       <div class="check-group">
       
       <label class="radio-option">
           <input type="radio"   name="data[18]" value="Yes" required     >
           <span>Yes</span>
       </label>
       
       <label class="radio-option">
           <input type="radio"   name="data[18]" value="No" required     >
           <span>No</span>
       </label>
       
       </div>
</td>
</tr>

								   
       <tr class="form-group Optin-holder">
       <th colspan="2">
       <div class="check-group">
        <label class="radio-option">
          
            <span>By submitting this form, I agree that The ITBusinessToday and its partner, Iron Mountain, may process my data in the manner described in<a href="https://itbusinesstoday.com/data-protection" > The ITBusinessToday Privacy Statement</a> and <a href="https://www.ironmountain.com/utility/legal/privacy-policy" >Iron Mountain's Privacy Notice.</a></span>
        </label>
       </div>
       </th>
       </tr>
	   
	    <tr class="form-group Optin-holder">
       <th colspan="2">
       <div class="check-group">
        <label class="radio-option">
          
            <span>If you agreed to receive marketing emails from Iron Mountain but subsequently change your mind, you may opt out of Iron Mountain communication at any time <a href="https://www.ironmountain.com/utility/forms/opt-out-form?localize=false">here.</a></span>
        </label>
       </div>
       </th>
       </tr>
       
    <tr class="form-group cta_button-holder">
    <td colspan='2' align="center" style="text-align:center;">
        <button type="submit" class="btn btn-primary1 cta"> Download Now</button>
    </td>
    </tr>
           

       
        <script>

        
        const stateHolder=document.querySelector(".state-holder")
        const provinceHolder=document.querySelector(".province-holder")

        stateHolder.classList.add("hide"); 
        provinceHolder.classList.add("hide"); 

        document.getElementById("country").addEventListener("input", function() {
        var country = this.value;
        var stateField = document.getElementById("state");
        var provincesField = document.getElementById("province");
        stateField.value = "";
        provincesField.value = "";
        

        if (country === "United States") {
            stateField.required = true;
            provincesField.required = false;
            stateHolder.classList.remove("hide"); 
            provinceHolder.classList.add("hide"); 
        } else if (country === "Canada") {
            stateField.required = false;
            provincesField.required = true;
            stateHolder.classList.add("hide"); 
            provinceHolder.classList.remove("hide"); 
        } else {
            stateField.required = false;
            provincesField.required = false;
            stateHolder.classList.add("hide"); 
            provinceHolder.classList.add("hide"); 
        }

        // Set focus back to the country field
        this.focus();
    });
        </script>
        
       
                                                    </tbody>
                                                </table>
                                            </form>
                                        </div>
                                    </td>
                                </tr>
                                <!--<tr>
                                    <td valign="top" align="left" style="padding-right: 2%;">
                                    
									
									
									

                    
                                    </td>
                                </tr>-->
                            </tbody>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td height="50" align="center" style="border-top: 1px solid rgb(192, 192, 192); background-color: #ffff;">
                        <div align="center" class="footer"  style="padding-top: 1%; padding-bottom: 1%; font-size: 11px;">
                          <p><a href="https://itbusinessplus.net/template/V3/unsubscribed.html" style="">Unsubscribe</a> | <a href="https://itbusinesstoday.com/us-privacy-policy/">Privacy Policy</a><br /> Copyright &#169; 2025 XDBS Corporation <br /> Hawthorne, CA 90250 USA<br /> 3501, Jack Northorp Ave, Ste C3873<br /></p>
                        </div>
                    </td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
