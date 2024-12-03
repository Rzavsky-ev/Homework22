package pro.sry.Homework22.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pro.sry.Homework22.eception.InvalidInputException;


@Service
public class ServiceImpl implements ServiceHW22 {

    //имя
    private String firstName;

    //фамилия
    private String lastName;

    @Override
    public void setFirstName(String firstName) {
        if (!StringUtils.isAlpha(firstName)) {
            throw new InvalidInputException();
        }
        this.firstName = StringUtils.capitalize(firstName.toLowerCase());
    }

    @Override
    public void setLastName(String lastName) {
        if (!StringUtils.isAlpha(lastName)) {
            throw new InvalidInputException();
        }
        this.lastName = StringUtils.capitalize(lastName.toLowerCase());
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return getLastName() + " " + getFirstName();
    }

}
