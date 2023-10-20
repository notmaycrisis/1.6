package ch.makery.address.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */
public class Person {

    private final StringProperty firstName;
    private final StringProperty lastName;
    private final IntegerProperty stockID;
    private final IntegerProperty bondID;

    /**
     * Default constructor.
     */
    public Person() {
        this(null, null);
    }

    /**
     * Constructor with some initial data.
     * 
     * @param firstName
     * @param lastName
     */
    public Person(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);

        
        this.stockID = new SimpleIntegerProperty(1234);
        this.bondID = new SimpleIntegerProperty(5678);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public int getstockID() {
        return stockID.get();
    }

    public void setstockID(int stockID) {
        this.stockID.set(stockID);
    }

    public IntegerProperty stockIDProperty() {
        return stockID;
    }

    public int getbondID() {
        return bondID.get();
    }

    public void setbondID(int bondID) {
        this.bondID.set(bondID);
    }

    public IntegerProperty bondIDProperty() {
        return bondID;
    }

}