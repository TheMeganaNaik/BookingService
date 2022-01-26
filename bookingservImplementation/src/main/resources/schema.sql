DROP TABLE IF EXISTS Bookings;

CREATE TABLE Bookings
(
    Id  int AUTO_INCREMENT,
    FirstName varchar(255) NOT NULL,
    LastName  varchar(255) NOT NULL,
    DateofBirth  varchar(255),
    Checkindatetime  varchar(255),
    Checkoutdatetime  varchar(255),
    TotalPrice  double,
    Deposit  int,
    Address   varchar(255),
    Line1   varchar(255),
    Line2   varchar(255),
    City      varchar(255),
    State   varchar(255),
    Zipcode   int
);
