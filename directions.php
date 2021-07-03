<!--
Important Information
API key:
	
Option For Non-Handicap Doors	
	<option value="Math and Computer Science, E Main St, Edmond, OK 73034">Math and Computer Science Building</option>
Option For Handicap Doors - Note that Google's Documentation LIED about using LatLng Objects. Use exact coordinates as follows:
	<option value=35.654385723413604,-97.4727779330929>Math and Computer Science Building</option>
	
-->
<!DOCTYPE html>
<html>
  <head>
    <title>Maps FX()</title>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>
    <style type="text/css">
      /** 
	   * Always set the map height explicitly to define the size of the div
       * element that contains the map. 
	   */
      #map {
        height: 100%;
      }

      /**
	   * Optional: Makes the sample page fill the window. 
	   */
      html,
      body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
     /**
	  * This removes the warning box that Directions API shows when navigating with something other than driving mode.
	  */
      .warnbox-content,.adp-warnbox{
        visibility: hidden;
	height: 0;
	width: 0;
	}

      #floating-panel {
        position: absolute;
        top: 10px;
        left: 25%;
        z-index: 5;
        background-color: #fff;
        padding: 5px;
        border: 1px solid #999;
        text-align: center;
        font-family: "Roboto", "sans-serif";
        line-height: 30px;
        padding-left: 10px;
      }

      #right-panel {
        font-family: "Roboto", "sans-serif";
        line-height: 30px;
        padding-left: 10px;
      }

      #right-panel select,
      #right-panel input {
        font-size: 15px;
      }

      #right-panel select {
        width: 100%;
      }

      #right-panel i {
        font-size: 12px;
      }

      #right-panel {
        height: 100%;
        float: right;
        width: 390px;
        overflow: auto;
      }

      #map {
        margin-right: 400px;
      }

      #floating-panel {
        background: #fff;
        padding: 5px;
        font-size: 14px;
        font-family: Arial;
        border: 1px solid #ccc;
        box-shadow: 0 2px 2px rgba(33, 33, 33, 0.4);
        display: none;
      }

      @media print {
        #map {
          height: 500px;
          margin: 0;
        }

        #right-panel {
          float: none;
          width: auto;
        }
      }
    </style>
<!-- imports JQuery functionality for making AJAX calls -->
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script>
	

      function initMap() {
        const directionsRenderer = new google.maps.DirectionsRenderer();
        const directionsService = new google.maps.DirectionsService();
        const map = new google.maps.Map(document.getElementById("map"), {
          zoom: 17,
          center: {lat: 35.65443017453625, lng: -97.47142235686297 },
        });
        directionsRenderer.setMap(map);
        directionsRenderer.setPanel(document.getElementById("right-panel"));
        const control = document.getElementById("floating-panel");
        control.style.display = "block";
        map.controls[google.maps.ControlPosition.TOP_CENTER].push(control);

        const onChangeHandler = function () {
          calculateAndDisplayRoute(directionsService, directionsRenderer);
        };
	   /**
		* Listeners for both dropdown lists.
		*/
        document
          .getElementById("start")
          .addEventListener("change", onChangeHandler);
        document
          .getElementById("end")
          .addEventListener("change", onChangeHandler);
      }
    

      function calculateAndDisplayRoute(directionsService, directionsRenderer) {
	     
	     
	      const start = document.getElementById("start").value;
	      const end = document.getElementById("end").value;
	      var mode;
		 /**
		  * AJAX call that gets the data from mode.txt and sets it as data inside of the get's success function.
		  * This restricts the locality of var mode, but it is fine since we call Directions API inside of the function.
		  */
	      jQuery.get('mode.txt',function(data){
	      var obj = JSON.parse(data);
	      mode = obj.mode;
	   /**
		* Directions API call.
		*/
	  	directionsService.route(
	        {
	            origin: start,
	            destination: end,
	            travelMode: google.maps.TravelMode[mode],
	        },
	        (response, status) => {
	            if (status === "OK") {
	                directionsRenderer.setDirections(response);
	            } else {
	                window.alert("Directions request failed due to " + status);
	              }
	        });
	      
	      });
      }      
    </script>
  </head>
  <body>
    <div id="floating-panel">
      <strong>Start:</strong>	  
	 <?php
	/**
	 * This reads <select><option> HTML from file and stitches it back into directions.php so that we have dropdown lists.
	 */
	  $filename = 'data.txt';
		$eachlines = file($filename, FILE_IGNORE_NEW_LINES);//create an array
		echo '<select id="start">';
		foreach($eachlines as $lines){
			echo "<option {$lines}</option>";
			}
		echo '</select>';
		?>
      <br />
      <strong>End:</strong>     
	  <?php
	/**
	 * This reads <select><option> HTML from file and stitches it back into directions.php so that we have dropdown lists.
	 */
	  $filename = 'data.txt';
		$eachlines = file($filename, FILE_IGNORE_NEW_LINES);//create an array
		echo '<select id="end">';
		foreach($eachlines as $lines){
		echo "<option {$lines}</option>";
		}
		echo '</select>';
		?>
    </div>
    <div id="right-panel"></div>
    <div id="map"></div>

    <!-- Async script executes immediately and must be after any DOM elements used in callback. -->
    <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDV6S9NCcJw-5uc59bfxmN3Zs2Kl0zd3X4&callback=initMap&libraries=&v=weekly"
      async
    ></script>
  </body>
</html>
