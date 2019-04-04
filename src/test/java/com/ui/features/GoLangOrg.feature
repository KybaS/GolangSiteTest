@smoke
Feature: Functionality of golang.org site

  Scenario Outline: As a user I want navigate to the blog, find and open the 'Using Go Modules' article
  and seeing main paragraphs
    Given open home page
    And navigate to the Blog
    When find by visible text the "Using Go Modules" article and open it
    Then check important paragraph "<text>"

    Examples:
      | text                                          |
      | Introduction                                  |
      | Creating a new module                         |
      | Adding a dependency on a new major version    |
      | Upgrading a dependency to a new major version |