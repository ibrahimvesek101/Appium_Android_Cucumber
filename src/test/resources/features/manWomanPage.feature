Feature: Man Women Page

  @Check
  Scenario: Check Companents
    Given user is on the Man Women Page
    Then should see Image on the Man Women Page
    Then should see Close Button on the Man Women Page
    Then should see Text "Sana en uygun ürünleri sunabilmemiz için bize yardımcı olur musun?" on the Man Women Page
    Then should see Man Button: "ERKEK" on the Man Women Page
    Then should see Women Button: "KADIN" on the Man Women Page

  @Navigate @ManButton
  Scenario: Check Man Button Navigate to Offer Page
    Given user is on the Man Women Page
    When click Man Button on the Man Women Page
    Then should see Offer Page

  @Navigate @WomenButton
  Scenario: Check Man Button Navigate to Offer Page
    Given user is on the Man Women Page
    When click Women Button on the Man Women Page
    Then should see Offer Page

  @CloseButton
  Scenario: Check Close Button Navigate to Offer Page
    Given user is on the Man Women Page
    When click Close Button on the Man Women Page
    Then should see Offer Page