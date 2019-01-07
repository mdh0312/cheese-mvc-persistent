package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

public class AddMenuItemForm {
    private Menu menu;
    private Iterable<Cheese> cheeses;

    @NotNull(message = "Menu Id can't be empty")
    private int menuId;

    @NotNull(message = "Cheese Id can't be empty")
    private int cheeseId;

    public AddMenuItemForm() {
    }

    public AddMenuItemForm(Menu menu, Iterable<Cheese> cheeses) {
        this.menu = menu;
        this.cheeses = cheeses;
    }

    public int getMenuId() {

        return menuId;
    }

    public void setMenuId(int newMenuId) {

        this.menuId = newMenuId;
    }

    public int getCheeseId() {

        return cheeseId;
    }

    public void setCheeseId(int newCheeseId) {

        this.cheeseId = newCheeseId;
    }

    public Menu getMenu() {

        return menu;
    }

    public void setMenu(Menu newMenu) {

        this.menu = newMenu;
    }

    public Iterable<Cheese> getCheeses() {

        return cheeses;
    }

    public void setCheeses(Iterable<Cheese> newCheeses) {

        this.cheeses = newCheeses;
    }
}