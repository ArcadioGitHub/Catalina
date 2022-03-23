Feature: Registrar user

  @SegundoEscenario
  Scenario Outline: Registro
    Given el usuario ingresa a la pagina de YourLogo
    When el usuario  hace clic en sign in
    And el usuario ingresa el correo <correo>
    And el usuario hace clic en el boton  create account
    And el usuario diligencia el formulario de registro <Name>,<LastName>,<Pass>,<AddressFirstName>,<AddressLastName>,<Company>,<AddressOne>,<City>,<PostalCode>,<HomePhone>,<MobilePhone>,<Alias>
    Then el usuario debe  ver el mensaje de bienvenida <mensaje>
    Examples:
      | correo          | Name  | LastName | Pass     | AddressFirstName | AddressLastName | Company   | AddressOne | City     | PostalCode | HomePhone | MobilePhone | Alias  | mensaje                                                                                  |
      | cat97@gmail.com | Juana | Ruiz     | Test123* | cami             | Mico            | Redvalley | Cll 50 A   | Medellin | 57987      | 4723450   | 3002887654  | juanis | Welcome to your account. Here you can manage all of your personal information and orders. |

