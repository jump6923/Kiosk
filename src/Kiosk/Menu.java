package Kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    protected String name;
    protected String description;
    public Menu() {
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setName(String name) {
        this.name = name;
    }
}
