package utbm.tx52.atoms_visualiser.utils;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anthony on 16/06/16.
 */
public class StatsElement {
    private SimpleStringProperty description;
    private SimpleStringProperty value;

    public StatsElement(String description, String value) {
        this.description = new SimpleStringProperty(description);
        this.value = new SimpleStringProperty(value);
    }

    public SimpleStringProperty descriptionProperty() {
        if (description == null) {
            description = new SimpleStringProperty(this, "description");
        }
        return description;
    }

    public SimpleStringProperty valueProperty() {
        if (value == null) {
            value = new SimpleStringProperty(this, "value");
        }
        return value;
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(String fDescription) {
        description.set(fDescription);
    }

    public String getValue() {
        return value.get();
    }

    public void setValue(String fValue) {
        value.set(fValue);
    }

    public String globalGetter(String attr) {
        String val = "";
        switch (attr) {
            case "value":
                val = getValue();
                break;
            case "description":
                val = getDescription();
                break;
            default:
                break;
        }
        return val;
    }
}
