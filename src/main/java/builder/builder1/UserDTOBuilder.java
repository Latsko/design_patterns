package builder.builder1;

import builder.Address;

import java.time.LocalDate;

// This approach is applied in case the product has multiple different definitions
// for example it has an inheritance hierarchy

// Abstract builder
public interface UserDTOBuilder {
    //methods to build "parts" of product at a time
    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthday(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    //method to "assemble" final product
    UserDTO build();

    //(optional) method to fetch already built object
    UserDTO getUserDTO();
}

