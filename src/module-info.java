module Alamut_Test {
	requires javafx.controls;
	requires javafx.web;
	requires java.desktop;
	requires javafx.base;
	requires javafx.graphics;
	requires json.simple;
	requires jsch;

	opens application to javafx.graphics, javafx.fxml;
}
