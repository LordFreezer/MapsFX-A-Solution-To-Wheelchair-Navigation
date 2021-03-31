module Alamut_Test {
	requires javafx.controls;
	requires javafx.web;
	
	opens application to javafx.graphics, javafx.fxml;
}
