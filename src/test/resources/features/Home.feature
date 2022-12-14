Feature: Retail Home Page

  Background: 
    Given User is on retail website
    When User click on All section

  # Scenario 11
  @verShopByDepTest
  Scenario: Verify Shop by Department sidebar
    #Given User is on retail website
    #When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  # Scenario 12
  @depItemOptionTest
  Scenario Outline: Verify department sidebar options
    #Given User is on retail website
    #When User click on All section
    And User on <Electronics>
    Then below options are present in department
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      #| Computers   | Accessories                    | Networking               |
      #| Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      #| Sports      | Athletic Clothing              | Exercise & Fitness       |
      #| Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |
