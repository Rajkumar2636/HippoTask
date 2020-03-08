@alltest @regression
Feature: Hippo Video Creation Flow

@Signup
Scenario: SignUp with random mail
Given Go to this URL "https://www.hippovideo.io"
And Click on Sign Up button and enter valid email and password in that field
And Then Click on Business plan
And Then Select Personalized marketing campaigns to boost conversions.Then click on Next button
And Enter First Name,Company Name and Phone number
Then click on Get Started button it will redirect to inside product

@personalizeVideo
Scenario: Create Video and Personalize
Given Go to this URL "https://www.hippovideo.io"
And Create the video using Stock Images
And Personalize the video that created
And Send the video through mail
Then Verify the video in mail