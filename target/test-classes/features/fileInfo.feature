Feature: To get the file information

  @Test01
  Scenario: To display file names
    Given Directory contains list of files
    When I retrieve files names information

  @Test01
  Scenario: To display file Mimetypes
    Given Directory contains list of files
    When I retrieve files mime information

  @Test01
  Scenario: To display file extensions
    Given Directory contains list of files
    When I retrieve files extensions information

  @Test01
  Scenario: To display file size
    Given Directory contains list of files
    When I retrieve files size information
