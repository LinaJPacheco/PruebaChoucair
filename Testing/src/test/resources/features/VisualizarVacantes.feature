

Feature: VisualizarEmpleosDisponiblesDeChoucairPaginaMagneto
  Yo como usuario
  quiero  ingresar a la pagina de magneto
  para visualizar los empleos disponibles de choucair

  Scenario: View choucair jobs
    Given the user is on the choucair website

    When user selects the job option

    And click on the go to job portal button

    And open magnetos website

    And click on the option know our vacancies

    Then the user will be able to view offers