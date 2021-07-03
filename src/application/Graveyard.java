package application;

/**
 * This is literally just a recycle bin for all the old code. Before anything is
 * deleted, it is added here incase it is needed again. This also acts as an
 * imformal record of the progress of the code.
 */
public class Graveyard {

}
//------------------------------------------------------------------------------------------------------------------------------
// List of coordinates
/*
 * List<Coordinate<Double, Double>> foodToRest = new
 * ArrayList<Coordinate<Double, Double>>(); foodToRest.add(new
 * Coordinate(35.655440816168024, -97.4710129835098)); foodToRest.add(new
 * Coordinate(35.65558376233889, -97.47087314500595)); foodToRest.add(new
 * Coordinate(35.65533818799013, -97.47074458380084)); foodToRest.add(new
 * Coordinate(35.65508344962147, -97.47083480219041)); foodToRest.add(new
 * Coordinate(35.65463862773892, -97.47083137918331)); foodToRest.add(new
 * Coordinate(35.65439017390655, -97.47107277798787)); foodToRest.add(new
 * Coordinate(35.65425504956798, -97.47130613016564)); foodToRest.add(new
 * Coordinate(35.65427902325761, -97.47166286395462)); foodToRest.add(new
 * Coordinate(35.6543967121752, -97.47188548729663)); foodToRest.add(new
 * Coordinate(35.65461029532339, -97.47195522472906)); foodToRest.add(new
 * Coordinate(35.65544718705349, -97.47196863577376));
 */
//------------------------------------------------------------------------------------------------------------------------------
// List coordinates that make up a handmade route
/*
 * List<Coordinate<Double, Double>> foodToPark = new
 * ArrayList<Coordinate<Double, Double>>(); foodToPark.add(new
 * Coordinate(35.655440816168024, -97.4710129835098)); foodToPark.add(new
 * Coordinate(35.65558376233889, -97.47087314500595)); foodToPark.add(new
 * Coordinate(35.65533818799013, -97.47074458380084)); foodToPark.add(new
 * Coordinate(35.65508344962147, -97.47083480219041)); foodToPark.add(new
 * Coordinate(35.65463862773892, -97.47083137918331)); foodToPark.add(new
 * Coordinate(35.65463642058763, -97.46923012134897));
 */
//------------------------------------------------------------------------------------------------------------------------------
// List of Buildings
/*
 * List<Waypoint> buildingList = new ArrayList<Waypoint>(); buildingList.add(new
 * Waypoint("Food", foodToRest.get(0))); buildingList.add(new Waypoint("Rest",
 * foodToRest.get(foodToRest.size() - 1))); buildingList.add(new
 * Waypoint("Park", foodToPark.get(foodToPark.size() - 1)));
 */
//------------------------------------------------------------------------------------------------------------------------------
// list so user can choose a building to navigate to
/* ObservableList<String> choices = FXCollections.observableArrayList(); */
//------------------------------------------------------------------------------------------------------------------------------		
// populates the list of choices
/*
 * for (int i = 0; i <= buildingList.size() - 1; i++) {
 * choices.add(buildingList.get(i).getName()); }
 */
//------------------------------------------------------------------------------------------------------------------------------
// Another way to write single lines to file
/*
 * try (FileOutputStream writer = new FileOutputStream("data.txt");) {
 * writer.write(("").getBytes()); writer.close(); } catch (IOException e) {
 * System.out.println("error on delete to data.txt"); }
 * 
 * // writes the path to the input file
 * 
 * try (FileWriter fw = new FileWriter("data.txt", true); BufferedWriter bw =
 * new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
 * out.println("data"); // System.out.println(obj); // fw.close(); //
 * bw.close(); out.close(); } catch (IOException e) {
 * System.out.println("error on write to data.txt"); }
 */
//------------------------------------------------------------------------------------------------------------------------------
// debugging relative work path for project
// System.out.println(new java.io.File("").getAbsolutePath());
//------------------------------------------------------------------------------------------------------------------------------
// Combo Boxes
/*
 * final ComboBox start = new ComboBox(choices); // From box
 * start.setPromptText("From"); final ComboBox end = new ComboBox(choices); //
 * To box end.setPromptText("To");
 */
//------------------------------------------------------------------------------------------------------------------------------		
// List of Routes
/*
 * List<Route> routes = new ArrayList<Route>(); routes.add(new Route(foodToRest,
 * foodToRest.get(0), foodToRest.get(foodToRest.size() - 1))); routes.add(new
 * Route(foodToPark, foodToPark.get(0), foodToPark.get(foodToPark.size() - 1)));
 */
// System.out.println(foodToPark.get(foodToPark.size() - 1).getLong());
//------------------------------------------------------------------------------------------------------------------------------
// old button for handmade route navigation with Roads API
/*
 * btn5.setOnAction(new EventHandler<ActionEvent>() {
 * 
 * @Override public void handle(ActionEvent event) {
 * 
 * // System.out.println(start.getValue()); // System.out.println(route.path());
 * 
 * if (start.getValue() == buildingList.get(0).getName() && end.getValue() ==
 * buildingList.get(1).getName()) { sendRoute(routes.get(0));
 * System.out.println(routes.get(0).path()); } if (start.getValue() ==
 * buildingList.get(0).getName() && end.getValue() ==
 * buildingList.get(2).getName()) { sendRoute(routes.get(1));
 * System.out.println(routes.get(1).path()); } } });
 */
//------------------------------------------------------------------------------------------------------------------------------
// old VBox for combobox nav system
// VBox nav = new VBox();
// nav.getChildren().addAll(start, end, btn5/* , comboBox *//* ,textNamePrice
// */);
// grid.add(nav, 1, 0);
// Scene sceneMap = new Scene(grid, 800, 500);
// Scene sceneMap = new Scene(map, 800, 500);
// stage.setScene(sceneNav);
//------------------------------------------------------------------------------------------------------------------------------
//old List of buildings and write to file
// writeToFile(buildList);
/*
 * String[] buildList = {
 * "value=35.654385723413604,-97.4727779330929>Math and Computer Science Building"
 * , "value=" + "'Nigh University Center, Edmond, OK 73034'" + ">Nigh Center" };
 */
//------------------------------------------------------------------------------------------------------------------------------
// old send route and write to text from Main
// change this for boolean toggle data write
/*
 * public void sendRoute(Route route) { JSONObject obj = new JSONObject();
 * obj.put("route", new String(route.path())); // deletes the contents of the
 * input file prior to writing path try (FileOutputStream writer = new
 * FileOutputStream("data.txt");) { writer.write(("").getBytes());
 * writer.close(); } catch (IOException e) {
 * System.out.println("error on delete to data.txt"); } // writes the path to
 * the input file try (FileWriter fw = new FileWriter("data.txt", true);
 * BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new
 * PrintWriter(bw)) { out.println(obj); // System.out.println(obj); //
 * fw.close(); // bw.close(); out.close(); } catch (IOException e) {
 * System.out.println("error on write to data.txt"); } }
 * 
 * private void writeToFile(String[] buildList) throws IOException { File fout =
 * new File("data.txt"); FileOutputStream fos = new FileOutputStream(fout);
 * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos)); for (int
 * i = 0; i < buildList.length; i++) { bw.write(buildList[i]); bw.newLine(); }
 * 
 * bw.close(); }
 */
//------------------------------------------------------------------------------------------------------------------------------
//Button Event Handlers
/*
 * btn1.setOnAction(new EventHandler<ActionEvent>() {
 * 
 * @Override public void handle(ActionEvent event) {
 * engine.load("https://comsc.uco.edu/~jf024/directions.php"); }
 * 
 * }); btn4.setOnAction(new EventHandler<ActionEvent>() {
 * 
 * @Override public void handle(ActionEvent event) { // deletes the contents of
 * the input file prior to writing path try (FileOutputStream writer = new
 * FileOutputStream("data.txt");) { writer.write(("").getBytes());
 * writer.close(); } catch (IOException e) {
 * System.out.println("error on delete to data.txt"); } engine.reload(); } });
 */
//------------------------------------------------------------------------------------------------------------------------------
/*
 * File fout = new File("bool.txt"); FileOutputStream fos = new
 * FileOutputStream(fout); BufferedWriter bw = new BufferedWriter(new
 * OutputStreamWriter(fos));
 * 
 * bw.write("");
 * 
 * bw.close();
 */