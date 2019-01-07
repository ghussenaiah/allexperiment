<!DOCTYPE html>
<html lang="en">
<head>
<title>Twitter</title>
<meta charset="utf-8">
<meta name="format-detection" content="telephone=no" />
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico" />
<link rel="stylesheet" href="css/contact-form.css">
<link rel="stylesheet" href="css/style.css">
<script src="js/jquery.js"></script>
<script src="js/jquery-migrate-1.1.1.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/script.js"></script> 
<script src="js/superfish.js"></script>
<script src="js/jquery.equalheights.js"></script>
<script src="js/jquery.mobilemenu.js"></script>
<script src="js/tmStickUp.js"></script>
<script src="js/jquery.ui.totop.js"></script>
<script src="js/TMForm.js"></script>
<script src="js/modal.js"></script>
<script>
 $(window).load(function(){
  $().UItoTop({ easingType: 'easeOutQuart' });
  $('#stuck_container').tmStickUp({});  
 }); 
</script>
<!--[if lt IE 8]>
 <div style=' clear: both; text-align:center; position: relative;'>
   <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
     <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
   </a>
</div>
<![endif]-->
<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<link rel="stylesheet" media="screen" href="css/ie.css">
<![endif]-->
</head>
<body>
<!--==============================
              header
=================================-->
<header>
  <div class="container">
    <div class="row">
      <div class="grid_12 rel">
          <br/>
          <h1 style="color: black; font-size: 50px;" >Real-Time Detection of Traffic From Twitter Stream Analysis

        </h1>
      </div>
    </div>
  </div>
  <section id="stuck_container">
  <!--==============================
              Stuck menu
  =================================-->
    <div class="container">
      <div class="row">
        <div class="grid_12 ">
          <div class="navigation ">
            <nav>
             <ul class="sf-menu">
               <li ><a href="welcome_user.jsp">Twitts</a></li>
               <li class="current" ><a href="twitts.jsp">New Tweet</a></li>
               <li><a href="friends.jsp">Add Friends</a></li>
               <li><a href="friendlist.jsp">Friend list</a></li>
                     <li><a href="index0.jsp">Log Out</a></li>
                </ul>
            </nav>
<!--            <div class="clear"></div>-->
          </div>       
<!--         <div class="clear"></div>  -->
        </div>
     </div> 
    </div> 
  </section>
</header>
 
<!--=====================
          Content
======================-->
<section id="content">
  <div class="container">
    <div class="row">
      <div class="grid_12">
        
          
          <h3 style="text-align: center; ">New Tweet </h3> <img src=" images/twitter.png" width="80" height="80" alt="pix" />
        <form id="contact-form1" action="twitts"   > 
<!--                  <div class="contact-form-loader"></div>-->
                  <fieldset>
                   
                   
                      <label class="message">
                          <textarea style="height: 150px;" name="twitts" placeholder="What's happening?" required="" ></textarea>
                    
                    </label>
                  
                      <br/>
                       <br/>
                        <br/>
                          <br/>
                       <br/>
                     
                 
                   
                    
                      
                 <div>    
                         <button  style="margin-right: 00px;" class="btn" type="submit">Tweet</button>  <button  style="margin-right: 993px;" class="btn" type="reset">Clear</button>
                    </div>
                  </fieldset> 

                </form>
        
        

            
            
            
            <br/>
            
            <br/>
            
            <br/>
            
            <br/>
            
            <br/>
            
            <br/>
            
            <br/>
            
       
      </div>
    </div>
  </div>
 
</section>
<!--==============================
              footer
=================================-->
<footer id="footer">
  <div class="container">
    <div class="row">
      <div class="grid_12"> 
        <div class="copyright">  <a href="#"></a>
          <div class="sub-copy"> <a href="#" rel="nofollow"></a></div>
        </div>
      </div>
    </div>
  </div>  
</footer>
<a href="#" id="toTop" class="fa fa-chevron-up"></a>
</body>
</html>