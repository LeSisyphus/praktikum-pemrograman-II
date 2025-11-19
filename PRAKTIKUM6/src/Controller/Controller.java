package Controller;

import Model.Mahasiswa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    @FXML
    private TableView<Mahasiswa> tableMahasiswa;

    @FXML
    private TableColumn<Mahasiswa, String> colNim;

    @FXML
    private TableColumn<Mahasiswa, String> colNama;

    @FXML
    public void initialize() {

        colNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));

        tableMahasiswa.setItems(getDataMahasiswa());
    }

    private ObservableList<Mahasiswa> getDataMahasiswa() {
        return FXCollections.observableArrayList(
                new Mahasiswa("2410817210003", "Muhammad Maulana Azhari"),
                new Mahasiswa("2410817210001", "Abe Santoso"),
                new Mahasiswa("241081710001", "Joko Widodo"),
                new Mahasiswa("2410817310004", "Donald Trump"),
                new Mahasiswa("241081710002", "Jaya Mas"),
                new Mahasiswa("2410817210015", "Gatot Subroto"),
                new Mahasiswa("241081720019", "Anies Baswedan"),
                new Mahasiswa("241081730018", "Fufufafa"),
                new Mahasiswa("241081720024", "Aditya Rahman"),
                new Mahasiswa("241081710022", "Farid Rahmadi")
        );
    }
}
