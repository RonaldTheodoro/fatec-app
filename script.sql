CREATE TABLE client (
    id_client INT NOT NULL PRIMARY KEY,
    name_client VARCHAR(100) NOT NULL,
    address_client VARCHAR(100) NOT NULL,
    phone_client VARCHAR(100) NOT NULL
);


CREATE TABLE part (
    id_part INT NOT NULL PRIMARY KEY,
    name_part VARCHAR(100) NOT NULL,
    model_part VARCHAR(100) NOT NULL,
    value_part DECINAL(7, 2) NOT NULL
);


CREATE TABLE vehicle (
    id_vehicle INT NOT NULL PRIMARY KEY,
    brand_vehicle VARCHAR(100) NOT NULL,
    model_vehicle VARCHAR(100) NOT NULL,
    year_vehicle INT NOT NULL,
    category_vehicle VARCHAR(100) NOT NULL,
    color_vehicle VARCHAR(100) NOT NULL,
    value_vehicle DECINAL(7, 2) NOT NULL
);