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
                new Mahasiswa("A001", "Andi"),
                new Mahasiswa("A002", "Budi"),
                new Mahasiswa("A003", "Cici"),
                new Mahasiswa("A004", "Dedi"),
                new Mahasiswa("A005", "Eka"),
                new Mahasiswa("A006", "Fina"),
                new Mahasiswa("A007", "Gita"),
                new Mahasiswa("A008", "Hadi"),
                new Mahasiswa("A009", "Intan"),
                new Mahasiswa("A010", "Joko")
        );
    }
}
