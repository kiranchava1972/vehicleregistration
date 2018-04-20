Feature: To get the file information

  Scenario:1_display file names.
    Given Directory contains list of files
    When I retrieve files names information

  Scenario:1_display file Mimetypes.
    Given Directory contains list of files
    When I retrieve files mime information

  Scenario:1_display file extensions.
    Given Directory contains list of files
    When I retrieve files exteshions information

  Scenario:1_display file size.
    Given Directory contains list of files
    When I retrieve files size information
